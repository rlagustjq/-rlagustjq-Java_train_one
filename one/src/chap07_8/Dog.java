package chap07_8;

public class Dog extends Animal {
	public Dog() {
		this.kind = "포유류";
	}

	@Override
	public void sound() {
		// TODO Auto-generated method stub
		System.out.println("왈왈");
	}

}
