package chap03;

import java.util.Scanner;

public class which2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		Scanner sc = new Scanner(System.in);
	        System.out.print("점수를 입력하시오: ");
	    	int score = sc.nextInt();
      switch (score) {
      case 100 :
    	  System.out.println("A+학점");
    	  
    	  break;
    	  
      case 90 :
    	  System.out.println("A학점");
    	  break;
      case 80 :
    	  System.out.println("B학점");
    	  break;
      case 70 :
    	  System.out.println("C학점");
    	  break;
      case 60 :
    	  System.out.println("D학점");
    	  break;
      default :
    	  System.out.println("재적");
    	  break;
      

		
	}
	}

}
