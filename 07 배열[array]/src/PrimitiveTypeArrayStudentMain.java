
public class PrimitiveTypeArrayStudentMain {

	public static void main(String[] args) {
		System.out.println();
		System.out.println("---학생 데이타를 저장하기 위한 배열 객체의 생성과 초기화---");
		System.out.println();
		
		int[] noArray= {1,2,3,4,5,6,7,8,9,10};
		String[] nameArray= {"KIM", "LEE", "PARK", "CHOI", "GOO", "HONG", "KANG", "KWON", "JUNG", "CHO"};
		int[] korA= {34,56,12,89,91,67,88,93,76,99};
		int[] engA= {44,57,21,83,93,79,81,67,12,39};
		int[] mathA= {90,56,34,67,23,88,99,78,55,80};	//기본데이타
		
		
		int[] totA= {0,0,0,0,0,0,0,0,0,0};
		double[] avrA= {0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0};
		char[] gradeA= new char[10];
		int[] rankA= {1,1,1,1,1,1,1,1,1,1};		//초기화
		
		
		//총점, 평균, 평점
		for (int i = 0; i < noArray.length; i++) {
			totA[i]=korA[i]+engA[i]+mathA[i];
			avrA[i]=(double)totA[i]/3;
			if(avrA[i]>=90) {
				gradeA[i]='A';
			}else if(avrA[i]>=80) {
				gradeA[i]='B';
			}else if(avrA[i]>=70) {
				gradeA[i]='C';
			}else if(avrA[i]>=60) {
				gradeA[i]='D';
			}else {
				gradeA[i]='F';
			}
			
			
		}
		
		System.out.println("-----------* * * * *석차계산* * * * *-----------");
		for (int i = 0; i < rankA.length; i++) {
			for (int j = 0; j < totA.length; j++) {
				if(totA[i]<totA[j]) {
					rankA[i]++;
				}
			
			}
			
		}
		
		
		
		System.out.println();
		
		System.out.println("----------------3번 학생의 정보 출력-------------------");
		for (int i = 0; i < noArray.length; i++) {
			if(noArray[i]==3) {
				System.out.printf("%3d %5s %4d %4d %4d %5d %5.1f %2c %3d\n",
						noArray[i],
						nameArray[i],
						korA[i],
						engA[i],
						mathA[i],
						totA[i],
						avrA[i],
						gradeA[i],
						rankA[i]);
				
				break;
			}
		}
		
		System.out.println();
		
		System.out.println("-------------학점이 F인 학생 찾아서 출력---------------");
		for (int i = 0; i < gradeA.length; i++) {
			if(gradeA[i]=='F') {
				System.out.printf("%5d %5s %4d %4d %4d %5d %5.1f %2c %3d\n",
						noArray[i],
						nameArray[i],
						korA[i],
						engA[i],
						mathA[i],
						totA[i],
						avrA[i],
						gradeA[i],
						rankA[i]);
				
			}
			
		}
		
		
		
		System.out.println();
		
		System.out.println("----국어점수가 70점 이하인 학생 찾아서 출력----");
		for (int i = 0; i < korA.length; i++) {
			if(korA[i]<=70) {
				System.out.printf("%5d %5s %4d %4d %4d %5d %5.1f %2c %3d\n",
						noArray[i],
						nameArray[i],
						korA[i],
						engA[i],
						mathA[i],
						totA[i],
						avrA[i],
						gradeA[i],
						rankA[i]);
				
			}
			
		}
		
		
		
		System.out.println();
		
		System.out.println("-----------* * * * *총점순 오름차순 정렬* * * * *-----------");
		for (int i = 0; i < totA.length; i++) {
			for(int j=0;j<totA.length-1;j++) {
				if(totA[j] > totA[j+1]) {
					//총점교환
					int tempTot=totA[j];
					totA[j]=totA[j+1];
					totA[j+1]=tempTot;
					
					//학번 교환
					int tempNo=noArray[j];
					noArray[j]=noArray[j+1];
					noArray[j+1]=tempNo;
					
					//이름 교환
					String tempName=nameArray[j];
					nameArray[j]=nameArray[j+1];
					nameArray[j+1]=tempName;
					
					//국어교환
					int tempKor = korA[j];
					korA[j]=korA[j+1];
					korA[j+1]=tempKor;
					
					//영어교환
					int tempEng = engA[j];
					engA[j]=engA[j+1];
					engA[j+1]=tempEng;

					int tempMath = mathA[j];
					mathA[j]=mathA[j+1];
					mathA[j+1]=tempMath;
					
					//평균교환
					double tempAvg=avrA[j];
					avrA[j]=avrA[j+1];
					avrA[j+1]=tempAvg;
					
					//평점교환
					char tempGrade=gradeA[j];
					gradeA[j]=gradeA[j+1];
					gradeA[j+1]=tempGrade;
					
					//석차교환
					int tempRank=rankA[j];
					rankA[j]=rankA[j+1];
					rankA[j+1]=tempRank;
					
				}
			}
		}
		
		System.out.println();
		System.out.println("-----------* * * * *총점순 내림차순 정렬* * * * *-----------");
		
		
	
		
		
		System.out.println();
		
		
		System.out.println("------------------학생 성적출력-------------------");
		System.out.printf("%5s %s %s %s %s %s %s %s %s\n",
				"학번","이름","국어","영어","수학","총점","평균","평점","석차");
		System.out.println("--------------------------------------------------");
		for (int i = 0; i < noArray.length; i++) {
			System.out.printf("%5d %5s %4d %4d %4d %5d %5.1f %2c %3d\n",
					noArray[i],
					nameArray[i],
					korA[i],
					engA[i],
					mathA[i],
					totA[i],
					avrA[i],
					gradeA[i],
					rankA[i]);
			
		}
		System.out.println("--------------------------------------------------");
		
		
		

	}

}
