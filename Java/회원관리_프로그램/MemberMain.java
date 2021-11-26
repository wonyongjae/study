package mission;

import java.util.ArrayList;
import java.util.Scanner;


public class MemberMain {

	
static ArrayList<Member> members = new ArrayList<>();
static Scanner scanner = new Scanner(System.in);
static int memberCount;
	
	public static void main(String[] args) {
		
		
		boolean run = true;
		
	finish:while(run) {
		try{	
			System.out.println("------------------------------");
			System.out.println("1.ȸ�����|2.ȸ����ȸ|3.ȸ��Ż��|4.����");
			System.out.println("------------------------------");	
			System.out.print("����> ");
	
				String select = scanner.next();			
				int pick = Integer.parseInt(select);
				
				switch(pick) {
				case 1 : MemberResist(); break; //ȸ����� �޼��� ȣ��
				case 2 : searchByMember(); break;
				case 3 : leave();break;
				case 4 : exit();break finish;
				//������ �߰��� ���
	
				
	/**			���� ���� �ٷ� ���� ���
				System.out.println("���α׷��� �����մϴ�.");
				System.out.close();
	*/	
				}
		}catch(NumberFormatException e) {
			System.out.println("���� ��ȿ���� �ʽ��ϴ�.");
		}
			
		}
		
	}





//ȸ�����----------------------------------------------------------
	

	private static void MemberResist() {
		System.out.println("ȸ������� �Ͻðڽ��ϱ�? (��:y,Y/�ƴϿ�:n,N)");
		System.out.print("����> ");
		String selectYorN = scanner.next();
		
		if((selectYorN.equals("y"))||((selectYorN.equals("Y")))){
			Member member = new Member();
			
			System.out.print("�̸�> ");
			member.setName(scanner.next());
			System.out.print("�ּ�> ");
			member.setAddress(scanner.next());
			System.out.print("����ó> ");
			member.setContactNumber(scanner.next());
			memberCount++;
			
			if(memberCount <= 9) {
				member.setMemberNumber("00" + memberCount);
			}
			else if(memberCount >= 10) {
				member.setMemberNumber("0"+  memberCount);
			}
			
			members.add(member);
			System.out.println("ȸ����ȣ: "+member.getMemberNumber()+"�Դϴ�.");
			
//ȸ����ȣ �ʱ�ȭ �� ȸ�� �߰�-------------
			
			}else if((selectYorN.equals("n"))||((selectYorN.equals("N")))) {
			
			System.out.println("�ʱ�ȭ������ ���ư��ϴ�.");
			
		}else {
			System.out.println("���� ��ȿ���� �ʽ��ϴ�.");
		}
		
	}

//ArrayList�� ����� memberNumber�� memberName ã�� �޼���
	  static Member searchByMemberNumber(String memberNumber) {
			for(int i=0; i<members.size(); i++) {
				String searchNumber = members.get(i).getMemberNumber();
//				
				if(searchNumber.equals(memberNumber)){
					return members.get(i);
				}
				
			}
			return null;
		}
	
	 static Member searchByMemberName(String name) {
			for(int i=0; i<members.size();i++) {
				String searchName=members.get(i).getName();
				if(searchName.equals(name)) {
					return members.get(i);
				}
			}
			return null;
		
	}
		//ȸ����ȸ------------------------------------------------
	private static void searchByMember() {
		System.out.println("ȸ����ȸ�� �Ͻðڽ��ϱ�? (��:y,Y/�ƴϿ�:n,N)");
		System.out.print("����> ");
		String selectYorN = scanner.next();
		
		if(((selectYorN.equals("y"))||((selectYorN.equals("Y"))))){
			System.out.println("ȸ����ȣ �Ǵ� ȸ�������� ��ȸ�� �����Ͻʴϴ�. (1:ȸ����ȣ/2:ȸ����)");
			System.out.println("�Է�> ");
			String selectOneOrTwo = scanner.next();
			
//			
			if(selectOneOrTwo.equals("1")) {
				System.out.println("ȸ����ȣ�� �Է����ּ���.");
				System.out.print("�Է�> ");
				String MemberNumber = scanner.next();
				Member member = searchByMemberNumber(MemberNumber);
				if(member!=null) {
					System.out.println("ȸ����ȣ: "+member.getMemberNumber());
					System.out.println("ȸ����: "+member.getName());
					System.out.println("ȸ���ּ�: "+member.getAddress());
					System.out.println("ȸ������ó: "+member.getContactNumber());
				}else if(member==null){
					System.out.println("ȸ����ȣ�� �������� �ʽ��ϴ�.");
				}
//			
			}else if(selectOneOrTwo.equals("2")) {
				System.out.println("ȸ������ �Է����ּ���.");
				System.out.print("�Է�> ");
				String MemberName = scanner.next();
				Member member = searchByMemberName(MemberName);
				if(member!=null) {
					System.out.println("ȸ����ȣ: "+member.getMemberNumber());
					System.out.println("ȸ����: "+member.getName());
					System.out.println("ȸ���ּ�: "+member.getAddress());
					System.out.println("ȸ������ó: "+member.getContactNumber());
				}else if(member==null){
					System.out.println("ȸ����ȣ�� �������� �ʽ��ϴ�.");
				}
//				
			}else {
				System.out.println("���� ��ȿ���� �ʽ��ϴ�.");
			}
			
		}else if(((selectYorN.equals("n"))||((selectYorN.equals("N"))))) {
			System.out.println("�ʱ�ȭ������ ���ư��ϴ�.");
		}else {
			System.out.println("���� ��ȿ���� �ʽ��ϴ�.");
		}
	}
	private static void leave() {
		System.out.println("ȸ��Ż�� �Ͻðڽ��ϱ�? (��:y,Y/�ƴϿ�:n,N)");
		System.out.print("�Է�> ");
		String selectYorN = scanner.next();
		if(((selectYorN.equals("y"))||((selectYorN.equals("Y"))))) {
			System.out.println("ȸ����ȣ�� �Է��ϼ���.");
			System.out.print("�Է�> ");
			String memberNumber= scanner.next();
			Member member = searchByMemberNumber(memberNumber);
			if(member!=null) {
				
				members.remove(member);
				System.out.println(member.getName()+" ȸ������ Ż��Ǿ����ϴ�.");
			}else if(member==null){
				System.out.println("ȸ����ȣ�� �������� �ʽ��ϴ�.");
			}
//		
		}else if(((selectYorN.equals("n"))||((selectYorN.equals("N"))))) {
			System.out.println("�ʱ�ȭ������ ���ư��ϴ�.");

			}
//			

	}




	//����
	private static void exit() {
		System.out.println("���α׷��� �����մϴ�.");
		System.out.close();
	
	}

}


