package chap03;

import java.util.Scanner;

public class which {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
	
	        
		int A = 80;
		int score = A/10;
       
        
     switch (score/10) {
	case 9 :
		System.out.println("A학점");
		break;

	case 8:
		System.out.println("B학점");
		break;
		
	case 7:
		System.out.println("C학점");
		break;
		
	case 5:
		System.out.println("D학점");
		break;
		
	case 4:
		System.out.println("F학점");
		break;
	
	default: 

		System.out.println("재적");
		break;
     } 
     
      
        		
	

}

		
	}
