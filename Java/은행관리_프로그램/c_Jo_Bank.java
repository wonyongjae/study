package mission;

import java.util.*;
import java.util.ArrayList;
public class c_Jo_Bank {

		private static ArrayList<newAccount> accountArray = new ArrayList<>();
		private static Scanner scn = new Scanner(System.in);

		public static void main(String[] args) {
			
		boolean run = true;
			 
		while (run) {
			try{	
		         System.out.println("-------------------------------------------");
		         System.out.println("1.신규계좌개설|2.입금|3.출금|4.잔액|5.계약해지|6.종료");
		         System.out.println("-------------------------------------------");
		      
		         System.out.print("선택> "); 
		         String select = scn.next();
		         int sel= Integer.parseInt(select);
		         
		         switch(sel) {
		         	case 1:newOne(); break;
		         	case 2:deposit(); break;
		         	case 3:withdraw(); break;
		         	case 4:balance(); break;
		         	case 5:goodbyeBank(); break;
		         	case 6: exit(); break;
		         }     	
			}catch (NumberFormatException e){
				System.out.println("값이 잘못되었습니다.");
					
			}
		}	
	}
	
		//1.신규계좌개설
		public static void newOne() {
			System.out.println("신규계좌를 개설하시겠습니까? Y/N");
			System.out.print("입력> ");
			String yesOrNo = scn.next();
			String owner="";
			 int balance=0;
		     int a=(int)(Math.random()*10);
		     int b=(int)(Math.random()*10);
		     int c=(int)(Math.random()*10);
		     int d=(int)(Math.random()*10);
		     int e=(int)(Math.random()*10);
		  
		   String[] array= {"0","1","2","3","4","5","6","7","8","9"};
		   
		   String newNum =array[a]+array[b]+array[c]+array[d]+array[e];
		   
		   String ano=newNum;
		   
		   newAccount newAcc = new newAccount(ano, owner, balance);

			if(yesOrNo.equals("y")) {
				System.out.print("계좌주> ");
				owner=scn.next();
				
				
						accountArray.add(newAcc);		
						System.out.println(owner+"님의 계좌번호 "+newNum+"생성되었습니다.");
						return;
						
				
				
			}else if(yesOrNo.equals("n")){
				System.out.println("신규계좌개설을 취소하셨습니다.");	
				return;
			}else {
				System.out.println("값이 잘못되었습니다.");
				return;
			}
		}

		//2.입금
		public static void deposit() {
			System.out.println("입금하시겠습니까? Y/N");
			System.out.print("입력> ");
			String yesOrNo = scn.next();
				if(yesOrNo.equals("y")) {
					System.out.print("계좌번호 입력> ");
				}else if(yesOrNo.equals("n")){
					System.out.println("입금을 취소하셨습니다.");
					return;
				}else {
					System.out.println("값이 잘못되었습니다.");
					return;
				}
				
	
			String ano = scn.next();
			newAccount newAcc= find(ano);
				if(newAcc==null) {
					System.out.println("계좌번호가 틀렸습니다.");
					return;
				} 
		
			System.out.print("입금액> ");
			int dep = scn.nextInt();

			newAcc.setBalance(newAcc.getBalance()+dep);
			System.out.println("입금되었습니다."+ano+"계좌의 현재 잔액은 "+newAcc.balance+"원입니다.");
			

			}
		
		//3.출금
		private static void withdraw() {
				System.out.println("출금하시겠습니까? Y/N");
				System.out.print("입력> ");
				String yesOrNo = scn.next();
					if(yesOrNo.equals("y")) {
						System.out.print("계좌번호 입력> ");
					}else if(yesOrNo.equals("n")){
						System.out.println("출금을 취소하셨습니다.");
						return;
					}else {
						System.out.println("값이 잘못되었습니다.");
						return;
					}
				String ano = scn.next();
				newAccount newAcc= find(ano);
					if(newAcc==null) {
						System.out.println("계좌번호가 틀렸습니다.");
						return;
					} 
		
				System.out.print("출금액> ");
				int wtd = scn.nextInt();
				
				newAcc.setBalance(newAcc.getBalance()-wtd);
				System.out.println("입금되었습니다."+ano+"계좌의 현재 잔액은 "+newAcc.balance+"원입니다.");
				}
			
		
		//----------------------------------------------
		private static newAccount find(String ano) {
			newAccount newAcc =null;
				for(int i=0; i<accountArray.size(); i++) {

						String myAno = accountArray.get(i).getAno();
					if(myAno.equals(ano)) {
						newAcc=accountArray.get(i);
						break;
						}
					}

					
				return newAcc;
				}
			

		//------------------------------------------------

		//4.잔액
		private static void balance() {
			
			System.out.println("잔액을 확인하시겠습니까? Y/N");
			System.out.print("입력> ");
			String yesOrNo = scn.next();
				if(yesOrNo.equals("y")) {
					System.out.print("계좌번호 입력> ");
				}else if(yesOrNo.equals("n")){
					System.out.println("잔액 조회를 취소하셨습니다.");
					return;
				}else {
					System.out.println("값이 잘못되었습니다.");
					return;
				}
			
	
			String ano = scn.next();
			newAccount newAcc= find(ano);
			
				if(newAcc==null) {
					System.out.println("계좌번호가 틀렸습니다.");
					return;
				} 
			newAcc.setBalance(newAcc.getBalance());
			System.out.println("입금되었습니다."+ano+"계좌의 현재 잔액은 "+newAcc.balance+"원입니다.");
			

		}
			
		
		
		
		//5.계약해지
		private static void goodbyeBank() {
			
			System.out.println("해지하시겠습니까? Y/N");
			System.out.print("입력> ");
			String yesOrNo = scn.next();
				if(yesOrNo.equals("y")) {
					System.out.print("계좌번호 입력> ");
				}else if(yesOrNo.equals("n")){
					System.out.println("계좌해지를 취소하셨습니다.");
				}else {
					System.out.println("값이 잘못되었습니다.");
					return;
				}
			
			String ano = scn.next();
			newAccount newAcc= find(ano);

				if(newAcc==null) {
					System.out.println("계좌번호가 틀렸습니다.");
				}
				
				accountArray.remove(newAcc);
					
				System.out.println("계좌가 정상적으로 해지되었습니다.");
				}
			
				
				
			
			
	//---------------------			
			
			
		
		
		//6.종료
		public static void exit() {
			
			System.out.println("종료하시겠습니까? Y/N");
			System.out.print("입력> ");
			String yesOrNo = scn.next();
				if(yesOrNo.equals("y")){			
					System.out.println("종료되었습니다.");
				}else if(yesOrNo.equals("n")) {
					return;
				}else {
					System.out.println("값이 잘못되었습니다.");
					return;
				}
			System.out.close(); 
		}
}	