package chap03;

public class InputDataCheckNaNExaple2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          String userInput = "NaN";
          double val = Double.valueOf(userInput);
          		
		double currenBalancd = 10000.0;
		
		if(Double.isNaN(val)) {
			System.out.println("NaN이 입력되어 처리할 수 없음");
			val = 0.0;
		}
		
		currenBalancd += val;
		System.out.println(currenBalancd);
		 
		
	}

}
