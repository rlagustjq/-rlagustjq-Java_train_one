package chap03;

import java.util.Scanner;

public class Ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	 
	 Scanner sc = new Scanner(System.in);
	 System.out.println("문자를 입력하시오 :");
	 int num = sc.nextInt();
	 
	 
	 
	 
	 if(num>0 || num<10) {
		 System.out.println("숫자");
		 
	 }else {
		 System.out.println("특수문자 입니다.");
	 }
	 
	
	
	} 

}
