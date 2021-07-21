package chap10;

public class ArrayIndexOutOfBoundsException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(args.length == 2) {
		String data1 = args[0];
		String data2 = args[2];
		
		System.out.println("args[0]: " +data1);
		System.out.println("args[0]: " +data2);
		}else {
			System.out.println("[실행방법]");
			System.out.println("java ArrayIndexOutOfBoundsException");
			System.out.println("값1 값2");
			
			
		}

	}

}
