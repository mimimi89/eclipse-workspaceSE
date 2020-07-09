/// 그다지
public class GajunGumsa {
	
	//멤버필드
	private GajunOnOff[] gajunArray;
	
	
	//getter, setter
	public GajunOnOff[] getGajunArray() {
		return gajunArray;
	}

	public void setGajunArray(GajunOnOff[] gajunArray) {
		this.gajunArray = gajunArray;
	}
	
	//가전제품 검사 메쏘드 
	public void gumsa() {
		for (int i = 0; i < gajunArray.length; i++) {
			//배열의 길이만큼
			gajunArray[i].turnOn();
			GajunVolume tempGajun=(GajunVolume)gajunArray[i];
			tempGajun.up();
			tempGajun.down();
			gajunArray[i].turnOff();
			System.out.println("--------------");
			
			
			
		}
	}

	
}
