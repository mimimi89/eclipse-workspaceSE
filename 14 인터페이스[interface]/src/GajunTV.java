public class GajunTV implements GajunOnOff, GajunVolume {
	//onoff, volume 두 개의 인터페이스를 가전 티비 클래스에서 구현 

    
    
    @Override
	public void turnOn() {
		System.out.println("GajunOnOff.turnOn() spec 구현");
		System.out.println("TV.turnOn");
	}

	@Override
	public void turnOff() {
		System.out.println("GajunOnOff.turnOff() spec 구현");
		System.out.println("TV.turnOff");
		
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
	
	//4개의 기능이 추가
	public void operation1(){
    }

    public void operation2(){
    }

    public void operation3(){
    }

    public void operation4(){
    }
    

}
