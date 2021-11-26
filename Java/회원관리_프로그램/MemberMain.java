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
			System.out.println("1.회원등록|2.회원조회|3.회원탈퇴|4.종료");
			System.out.println("------------------------------");	
			System.out.print("선택> ");
	
				String select = scanner.next();			
				int pick = Integer.parseInt(select);
				
				switch(pick) {
				case 1 : MemberResist(); break; //회원등록 메서드 호출
				case 2 : searchByMember(); break;
				case 3 : leave();break;
				case 4 : exit();break finish;
				//선택을 추가할 경우
	
				
	/**			선택 없이 바로 끝낼 경우
				System.out.println("프로그램을 종료합니다.");
				System.out.close();
	*/	
				}
		}catch(NumberFormatException e) {
			System.out.println("값이 유효하지 않습니다.");
		}
			
		}
		
	}





//회원등록----------------------------------------------------------
	

	private static void MemberResist() {
		System.out.println("회원등록을 하시겠습니까? (예:y,Y/아니오:n,N)");
		System.out.print("선택> ");
		String selectYorN = scanner.next();
		
		if((selectYorN.equals("y"))||((selectYorN.equals("Y")))){
			Member member = new Member();
			
			System.out.print("이름> ");
			member.setName(scanner.next());
			System.out.print("주소> ");
			member.setAddress(scanner.next());
			System.out.print("연락처> ");
			member.setContactNumber(scanner.next());
			memberCount++;
			
			if(memberCount <= 9) {
				member.setMemberNumber("00" + memberCount);
			}
			else if(memberCount >= 10) {
				member.setMemberNumber("0"+  memberCount);
			}
			
			members.add(member);
			System.out.println("회원번호: "+member.getMemberNumber()+"입니다.");
			
//회원번호 초기화 및 회원 추가-------------
			
			}else if((selectYorN.equals("n"))||((selectYorN.equals("N")))) {
			
			System.out.println("초기화면으로 돌아갑니다.");
			
		}else {
			System.out.println("값이 유효하지 않습니다.");
		}
		
	}

//ArrayList에 저장된 memberNumber와 memberName 찾는 메서드
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
		//회원조회------------------------------------------------
	private static void searchByMember() {
		System.out.println("회원조회를 하시겠습니까? (예:y,Y/아니오:n,N)");
		System.out.print("선택> ");
		String selectYorN = scanner.next();
		
		if(((selectYorN.equals("y"))||((selectYorN.equals("Y"))))){
			System.out.println("회원번호 또는 회원명으로 조회가 가능하십니다. (1:회원번호/2:회원명)");
			System.out.println("입력> ");
			String selectOneOrTwo = scanner.next();
			
//			
			if(selectOneOrTwo.equals("1")) {
				System.out.println("회원번호를 입력해주세요.");
				System.out.print("입력> ");
				String MemberNumber = scanner.next();
				Member member = searchByMemberNumber(MemberNumber);
				if(member!=null) {
					System.out.println("회원번호: "+member.getMemberNumber());
					System.out.println("회원명: "+member.getName());
					System.out.println("회원주소: "+member.getAddress());
					System.out.println("회원연락처: "+member.getContactNumber());
				}else if(member==null){
					System.out.println("회원번호가 존재하지 않습니다.");
				}
//			
			}else if(selectOneOrTwo.equals("2")) {
				System.out.println("회원명을 입력해주세요.");
				System.out.print("입력> ");
				String MemberName = scanner.next();
				Member member = searchByMemberName(MemberName);
				if(member!=null) {
					System.out.println("회원번호: "+member.getMemberNumber());
					System.out.println("회원명: "+member.getName());
					System.out.println("회원주소: "+member.getAddress());
					System.out.println("회원연락처: "+member.getContactNumber());
				}else if(member==null){
					System.out.println("회원번호가 존재하지 않습니다.");
				}
//				
			}else {
				System.out.println("값이 유효하지 않습니다.");
			}
			
		}else if(((selectYorN.equals("n"))||((selectYorN.equals("N"))))) {
			System.out.println("초기화면으로 돌아갑니다.");
		}else {
			System.out.println("값이 유효하지 않습니다.");
		}
	}
	private static void leave() {
		System.out.println("회원탈퇴 하시겠습니까? (예:y,Y/아니오:n,N)");
		System.out.print("입력> ");
		String selectYorN = scanner.next();
		if(((selectYorN.equals("y"))||((selectYorN.equals("Y"))))) {
			System.out.println("회원번호를 입력하세요.");
			System.out.print("입력> ");
			String memberNumber= scanner.next();
			Member member = searchByMemberNumber(memberNumber);
			if(member!=null) {
				
				members.remove(member);
				System.out.println(member.getName()+" 회원님이 탈퇴되었습니다.");
			}else if(member==null){
				System.out.println("회원번호가 존재하지 않습니다.");
			}
//		
		}else if(((selectYorN.equals("n"))||((selectYorN.equals("N"))))) {
			System.out.println("초기화면으로 돌아갑니다.");

			}
//			

	}




	//종료
	private static void exit() {
		System.out.println("프로그램을 종료합니다.");
		System.out.close();
	
	}

}


