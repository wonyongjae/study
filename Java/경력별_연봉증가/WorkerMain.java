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
			System.out.println(" 1.������ | 2.�����ȸ | 3.��º� ���� ������ ��ȸ | 4.��� ���� 5�� ��º� ���� ��ȸ | 5.����");
			System.out.println("-----------------------------------------------------------------------------------");
		try {
			System.out.print("����> ");
			String select =scanner.next();
		
			int sel = Integer.parseInt(select);
	
			switch(sel) {
			
			case 1:	System.out.println("�������� �����ϼ̽��ϴ�.");
					workerResist(); 
					break;
			case 2:	System.out.println("�����ȸ�� �����ϼ̽��ϴ�.");
					searchWorker();
					break;
			case 3:	System.out.println("��º� ���� ������ ��ȸ�� �����ϼ̽��ϴ�.");
					increaseSalaryPercent();
					break;
			case 4:	System.out.println("��� ���� 5�� ��º� ���� ��ȸ�� �����ϼ̽��ϴ�.");
					searchSalaryFiveYears();
					break;
			case 5: System.out.println("���α׷��� ����Ǿ����ϴ�.");
					break finish;
		
			}
	}catch(NumberFormatException e) {
		System.out.println("��ȿ���� ���� ���Դϴ�.");
			}
		}

	}


	//1.������---------------------------------------------
	private static void workerResist() {
		Worker worker= new Worker();
		
					System.out.print("����> ");
					worker.setName(scanner.next());
				try{
					System.out.print("����> ");
					worker.setAge(scanner.nextInt());		
					System.out.print("���> ");
					worker.setExperience(scanner.nextInt());
					System.out.print("�Ի翬��(����:����)> ");
					worker.setStartSalary(scanner.nextInt());
				}catch(InputMismatchException a) {
					System.out.println("��ȿ���� ���� ���Դϴ�.");
					return;
				}
	//	for(int i=0;i<277;i++) {
		
		numCount++;
		if(numCount >=100){
			//�ѹ�ī��Ʈ�� 100�̶� ���ų� �� ������(�ѹ�ī��Ʈ�� 3�ڸ� �� �϶�)
			//�����ȣ�� �ѹ�ī��Ʈ�� �������ְڴ�. 
			//intŸ���� �ѹ�ī��Ʈ�� StringŸ������ ����ȯ�����ֱ� ����
			String Count = Integer.toString(numCount);
			worker.setWorkerNumber(Count);
		}else if(numCount <= 9) {
			//�ѹ�ī��Ʈ�� 9���� �۰ų� ������(�ѹ�ī��Ʈ�� 1�ڸ� �� �϶�)
			worker.setWorkerNumber("00"+numCount);
			//�����ȣ�� 00+�ѹ�ī��Ʈ�� �������ְڴ�
		} else if(numCount >= 10){
			//�ѹ�ī��Ʈ�� 10�̶� ���ų� �� ������(�ѹ�ī��Ʈ�� 2�ڸ� �� �϶�)
			worker.setWorkerNumber("0"+numCount);
			//�����ȣ�� 0+�ѹ�ī��Ʈ�� �������ְڴ�
		}

		
		
		workers.add(worker);
		//��̸���Ʈ(workers)�� �߰��ϰڴ�. ������ ����� ����(worker)��.
		System.out.println("����� ��ϵǾ����ϴ� �����ȣ "+worker.getWorkerNumber()+"�Դϴ�.");
												//����� �����߿��� ����� ��ȣ�� �������ڴ�.
		}
	//}

//������ ��---------------------------------------------	
	
//2. �����ȸ------------------------------------------------------------------------
	private static void searchWorker() {
		try {
			System.out.print("�����ȣ> ");
			String number = scanner.next();//�����ȣ�� �����ϴ�.
			Worker worker= WorkerInformation.searchWorkerInformation(workers, number); //��������� ã���ִ� �޼���� (�迭��, ���� ã�� ��)
			if(number!=null) {//ã������ ���� ã���� ���, ���� ���� null�� �ƴҰ��
				System.out.println("����: "+worker.getName());
				System.out.println("����: "+worker.getAge());
				System.out.println("���: "+worker.getExperience());
				
			}
		}	catch(NullPointerException e){
			System.out.println("��ȿ���� ���� ���Դϴ�.");
			return;
		}
	}
//�����ȸ ��----------------------------------------------------------------------
//��º� ���� ������ ��ȸ------------------------------------------------------------
	private static void increaseSalaryPercent() {
		System.out.println("---------------------------------");
		System.out.println("  	 0~6��: 11%			");
		System.out.println("  	7~10��: 	5%			");
		System.out.println("	10~20��: 3%			");
		System.out.println(" 	20���̻�: 2%			");
		System.out.println("---------------------------------");
		System.out.println("�ʱ�ȭ������ ���ư��ϴ�.");
	}
//-------------------------------------------------------------------------------
//��� ���� 5�� ��º� ���� ��ȸ---------------------------------------------------------
	private static void searchSalaryFiveYears() {

		try {
			System.out.print("�����ȣ> ");
			String number = scanner.next();//�����ȣ�� �����ϴ�.
			
		Worker worker= WorkerInformation.searchWorkerInformation(workers, number);
		if(number!=null) {		
		System.out.println(worker.getName()+"���� ���� 5�� ���� ������ :");
		int Increase=worker.getExperience();
			for(int i=1; i<=5; i++){
				Increase++;
				if(Increase < 7){	
					worker.setStartSalary((int)(worker.getStartSalary() *1.11));
					System.out.println(i+"����: "+worker.getStartSalary()+"����");
				}else if(Increase >= 7 || Increase <11){	
					worker.setStartSalary((int)(worker.getStartSalary() *1.05));
					System.out.println(i+"����: "+worker.getStartSalary()+"����");
				}else if(Increase >= 11 || Increase <= 20){
					worker.setStartSalary((int)(worker.getStartSalary() *1.03));
					System.out.println(i+"����: "+worker.getStartSalary()+"����");
				}else{	
					worker.setStartSalary((int)(worker.getStartSalary() *1.02));
					System.out.println(i+"����: "+worker.getStartSalary()+"����");
				}
		
			
		
				}
		
			}
		}catch(NullPointerException e){
			System.out.println("��ȿ���� ���� ���Դϴ�.");
			return;
//��� ���� 5�� ��º� ���� ��ȸ ��---------------------------------------------------------
		}
	}
}
