package chap07_8;

public class SmartTelevision implements RemoteControl, Searchable{
	
	private int volume;
	
	public static void main(String[] args) {
		
	}

	@Override
	public void search(String url) {
		// TODO Auto-generated method stub
		System.out.println(url + "를 검색합니다");
	}

	
	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("TV를 켭니다");
		
	}
	
	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("TV를 끕니다");
	}

	@Override
	public void setVolume(int volume) {
		// TODO Auto-generated method stub
		System.out.println("소리를 켭니다");
	}

	
}
