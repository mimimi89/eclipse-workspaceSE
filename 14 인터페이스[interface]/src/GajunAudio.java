
public class GajunAudio implements GajunOnOff, GajunVolume{
	
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
		// TODO Auto-generated method stub
		System.out.println("GajunAudio.volumeDown()");
		
	}

}
