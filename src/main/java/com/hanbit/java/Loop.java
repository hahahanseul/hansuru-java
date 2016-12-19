package com.hanbit.java;

public class Loop {

	public static void main(String[] args) {
		
		
		/*
		 * countDown 함수를 만들어서
		 * 입력받은 숫자부터 0까지 출력하시오.
		 * 
		 * */
		
		countDown7(10);
	
	}
	
	
	//for-each 사용
	static void countDown7(int input) {
		int[] numbers = new int[input + 1]; // 0까지 찍어야하니까 input값에 1개를 더한 배열을 만듦
		
		int init= input;
		
		for (int number : numbers) {  //   타입 배열의 각값 : 배열 또는 리스트
			numbers[input - input] = input--;
			System.out.println(input--);  //이러한 for문을 for each라고 함 (무조건 길이만큼 돌아)
		}
		
		for (int number : numbers) {
			System.out.println(number);
		}
	}
	
	static void countDown6(int input) {
		int[] numbers = new int[input + 1]; // 0까지 찍어야하니까 input값에 1개를 더한 배열을 만듦
		
		for (int number : numbers) {  //   타입 배열의 각값 : 배열 또는 리스트
	
			System.out.println(input--);  //이러한 for문을 for each라고 함 (무조건 길이만큼 돌아)
		}

	}
	
	
	//재귀함수(Recursive Function) 사용
	
	static void countDown5(int input) {
		if (input < 0) {
			return;
		}
		
		System.out.println(input);
		
		countDown5(--input);   // 재귀호출
	}
	
	//while 사용(break)
	static void countDown4(int input) {
		
		while(true){
			System.out.println(input--);
	
			if (input<0) {
				break;
			}
		}
	}
	
	
	//while 사용
	static void countDown3(int input) {	
		
		while (input >= 0) {
			System.out.println(input--);
		}
	}
	
	
	//for 사용(역순)
	static void countDown(int input) {	
		
		for (int i=input;i>=0;i--) {
			System.out.println(i);	
		}		
	}
	
	//for 사용
	static void countDown2(int input) {	
		
		for (int i=0;i<=input;i++) {
			System.out.println(input-i);	
		}		
	}
	
	
	
}
