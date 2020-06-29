public class GajunTV implements GajunOnOff, GajunVolume {

    public void operation1(){
    }

    public void operation2(){
    }

    public void operation3(){
    }

    public void operation4(){
    }
    
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
	

    

}
