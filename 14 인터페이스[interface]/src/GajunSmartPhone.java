public class GajunSmartPhone implements GajunOnOff, GajunVolume {
	//onoff, volume 두 개의 인터페이스를 가전 스마트폰 클래스에서 구현 
	
	@Override
	public void turnOn() {
		System.out.println("GajunSmartPhone.turnOn()");
	}
	
	@Override
	public void turnOff() {
		System.out.println("GajunSmartPhone.turnOff()");
	}
	
	@Override
	public void up() {
		
		System.out.println("GajunAudio.volumeUp()");
	}
	
	@Override
	public void down() {
		// TODO Auto-generated method stub
		System.out.println("GajunAudio.volumeDown()");
		
	}
	
	//두 개의 기능이 추가
    public void operation1(){
    }

    public void operation2(){
    }
    
	
	

}
