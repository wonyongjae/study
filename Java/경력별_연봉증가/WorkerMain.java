package mission;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class WorkerMain {

public static ArrayList<Worker> workers = new ArrayList<>();
static Scanner scanner = new Scanner(System.in);
static int numCount=0;
	public static void main(String[] args) {
		
		boolean run = true;
		
		finish:while(run) {
			System.out.println("-----------------------------------------------------------------------------------");
			System.out.println(" 1.사원등록 | 2.사원조회 | 3.경력별 연봉 증가률 조회 | 4.사원 추후 5년 경력별 연봉 조회 | 5.종료");
			System.out.println("-----------------------------------------------------------------------------------");
		try {
			System.out.print("선택> ");
			String select =scanner.next();
		
			int sel = Integer.parseInt(select);
	
			switch(sel) {
			
			case 1:	System.out.println("사원등록을 선택하셨습니다.");
					workerResist(); 
					break;
			case 2:	System.out.println("사원조회를 선택하셨습니다.");
					searchWorker();
					break;
			case 3:	System.out.println("경력별 연봉 증가률 조회를 선택하셨습니다.");
					increaseSalaryPercent();
					break;
			case 4:	System.out.println("사원 추후 5년 경력별 연봉 조회를 선택하셨습니다.");
					searchSalaryFiveYears();
					break;
			case 5: System.out.println("프로그램이 종료되었습니다.");
					break finish;
		
			}
	}catch(NumberFormatException e) {
		System.out.println("유효하지 않은 값입니다.");
			}
		}

	}


	//1.사원등록---------------------------------------------
	private static void workerResist() {
		Worker worker= new Worker();
		
					System.out.print("성명> ");
					worker.setName(scanner.next());
				try{
					System.out.print("나이> ");
					worker.setAge(scanner.nextInt());		
					System.out.print("경력> ");
					worker.setExperience(scanner.nextInt());
					System.out.print("입사연봉(단위:만원)> ");
					worker.setStartSalary(scanner.nextInt());
				}catch(InputMismatchException a) {
					System.out.println("유효하지 않은 값입니다.");
					return;
				}
	//	for(int i=0;i<277;i++) {
		
		numCount++;
		if(numCount >=100){
			//넘버카운트가 100이랑 같거나 더 높을때(넘버카운트가 3자리 수 일때)
			//사원번호를 넘버카운트로 세팅해주겠다. 
			//int타입인 넘버카운트를 String타입으로 형변환시켜주기 위함
			String Count = Integer.toString(numCount);
			worker.setWorkerNumber(Count);
		}else if(numCount <= 9) {
			//넘버카운트가 9보다 작거나 같을때(넘버카운트가 1자리 수 일때)
			worker.setWorkerNumber("00"+numCount);
			//사원번호를 00+넘버카운트로 세팅해주겠다
		} else if(numCount >= 10){
			//넘버카운트가 10이랑 같거나 더 높을때(넘버카운트가 2자리 수 일때)
			worker.setWorkerNumber("0"+numCount);
			//사원번호를 0+넘버카운트로 세팅해주겠다
		}

		
		
		workers.add(worker);
		//어레이리스트(workers)에 추가하겠다. 저장한 사원의 정보(worker)를.
		System.out.println("사원이 등록되었습니다 사원번호 "+worker.getWorkerNumber()+"입니다.");
												//사원의 정보중에서 사원의 번호를 가져오겠다.
		}
	//}

//사원등록 끝---------------------------------------------	
	
//2. 사원조회------------------------------------------------------------------------
	private static void searchWorker() {
		try {
			System.out.print("사원번호> ");
			String number = scanner.next();//사원번호를 보냅니다.
			Worker worker= WorkerInformation.searchWorkerInformation(workers, number); //사원정보를 찾아주는 메서드로 (배열과, 내가 찾을 값)
			if(number!=null) {//찾으려던 값을 찾았을 경우, 받은 값이 null이 아닐경우
				System.out.println("성명: "+worker.getName());
				System.out.println("나이: "+worker.getAge());
				System.out.println("경력: "+worker.getExperience());
				
			}
		}	catch(NullPointerException e){
			System.out.println("유효하지 않은 값입니다.");
			return;
		}
	}
//사원조회 끝----------------------------------------------------------------------
//경력별 연봉 증가률 조회------------------------------------------------------------
	private static void increaseSalaryPercent() {
		System.out.println("---------------------------------");
		System.out.println("  	 0~6년: 11%			");
		System.out.println("  	7~10년: 	5%			");
		System.out.println("	10~20년: 3%			");
		System.out.println(" 	20년이상: 2%			");
		System.out.println("---------------------------------");
		System.out.println("초기화면으로 돌아갑니다.");
	}
//-------------------------------------------------------------------------------
//사원 추후 5년 경력별 연봉 조회---------------------------------------------------------
	private static void searchSalaryFiveYears() {

		try {
			System.out.print("사원번호> ");
			String number = scanner.next();//사원번호를 보냅니다.
			
		Worker worker= WorkerInformation.searchWorkerInformation(workers, number);
		if(number!=null) {		
		System.out.println(worker.getName()+"님의 추후 5년 예상 연봉은 :");
		int Increase=worker.getExperience();
			for(int i=1; i<=5; i++){
				Increase++;
				if(Increase < 7){	
					worker.setStartSalary((int)(worker.getStartSalary() *1.11));
					System.out.println(i+"년후: "+worker.getStartSalary()+"만원");
				}else if(Increase >= 7 || Increase <11){	
					worker.setStartSalary((int)(worker.getStartSalary() *1.05));
					System.out.println(i+"년후: "+worker.getStartSalary()+"만원");
				}else if(Increase >= 11 || Increase <= 20){
					worker.setStartSalary((int)(worker.getStartSalary() *1.03));
					System.out.println(i+"년후: "+worker.getStartSalary()+"만원");
				}else{	
					worker.setStartSalary((int)(worker.getStartSalary() *1.02));
					System.out.println(i+"년후: "+worker.getStartSalary()+"만원");
				}
		
			
		
				}
		
			}
		}catch(NullPointerException e){
			System.out.println("유효하지 않은 값입니다.");
			return;
//사원 추후 5년 경력별 연봉 조회 끝---------------------------------------------------------
		}
	}
}
