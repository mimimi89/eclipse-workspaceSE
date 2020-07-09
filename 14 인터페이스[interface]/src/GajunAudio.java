//
public class GajunAudio implements GajunOnOff, GajunVolume{
	//onoff, volume 두 개의 인터페이스를 GajunAudio 클래스에서 구현 
	
	@Override
	public void turnOn() {
		System.out.println("GajunAudio.turnOn()");
	}

	@Override
	public void turnOff() {
		System.out.println("GajunAudio.turnOff()");
		
	}
	
	@Override
	public void up() {
		
		System.out.println("GajunAudio.volumeUp()");
	}

	@Override
	public void down() {
		System.out.println("GajunAudio.volumeDown()");
		
	}

}
