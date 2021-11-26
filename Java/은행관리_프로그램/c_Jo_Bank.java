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
		         System.out.println("1.�ű԰��°���|2.�Ա�|3.���|4.�ܾ�|5.�������|6.����");
		         System.out.println("-------------------------------------------");
		      
		         System.out.print("����> "); 
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
				System.out.println("���� �߸��Ǿ����ϴ�.");
					
			}
		}	
	}
	
		//1.�ű԰��°���
		public static void newOne() {
			System.out.println("�ű԰��¸� �����Ͻðڽ��ϱ�? Y/N");
			System.out.print("�Է�> ");
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
				System.out.print("������> ");
				owner=scn.next();
				
				
						accountArray.add(newAcc);		
						System.out.println(owner+"���� ���¹�ȣ "+newNum+"�����Ǿ����ϴ�.");
						return;
						
				
				
			}else if(yesOrNo.equals("n")){
				System.out.println("�ű԰��°����� ����ϼ̽��ϴ�.");	
				return;
			}else {
				System.out.println("���� �߸��Ǿ����ϴ�.");
				return;
			}
		}

		//2.�Ա�
		public static void deposit() {
			System.out.println("�Ա��Ͻðڽ��ϱ�? Y/N");
			System.out.print("�Է�> ");
			String yesOrNo = scn.next();
				if(yesOrNo.equals("y")) {
					System.out.print("���¹�ȣ �Է�> ");
				}else if(yesOrNo.equals("n")){
					System.out.println("�Ա��� ����ϼ̽��ϴ�.");
					return;
				}else {
					System.out.println("���� �߸��Ǿ����ϴ�.");
					return;
				}
				
	
			String ano = scn.next();
			newAccount newAcc= find(ano);
				if(newAcc==null) {
					System.out.println("���¹�ȣ�� Ʋ�Ƚ��ϴ�.");
					return;
				} 
		
			System.out.print("�Աݾ�> ");
			int dep = scn.nextInt();

			newAcc.setBalance(newAcc.getBalance()+dep);
			System.out.println("�ԱݵǾ����ϴ�."+ano+"������ ���� �ܾ��� "+newAcc.balance+"���Դϴ�.");
			

			}
		
		//3.���
		private static void withdraw() {
				System.out.println("����Ͻðڽ��ϱ�? Y/N");
				System.out.print("�Է�> ");
				String yesOrNo = scn.next();
					if(yesOrNo.equals("y")) {
						System.out.print("���¹�ȣ �Է�> ");
					}else if(yesOrNo.equals("n")){
						System.out.println("����� ����ϼ̽��ϴ�.");
						return;
					}else {
						System.out.println("���� �߸��Ǿ����ϴ�.");
						return;
					}
				String ano = scn.next();
				newAccount newAcc= find(ano);
					if(newAcc==null) {
						System.out.println("���¹�ȣ�� Ʋ�Ƚ��ϴ�.");
						return;
					} 
		
				System.out.print("��ݾ�> ");
				int wtd = scn.nextInt();
				
				newAcc.setBalance(newAcc.getBalance()-wtd);
				System.out.println("�ԱݵǾ����ϴ�."+ano+"������ ���� �ܾ��� "+newAcc.balance+"���Դϴ�.");
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

		//4.�ܾ�
		private static void balance() {
			
			System.out.println("�ܾ��� Ȯ���Ͻðڽ��ϱ�? Y/N");
			System.out.print("�Է�> ");
			String yesOrNo = scn.next();
				if(yesOrNo.equals("y")) {
					System.out.print("���¹�ȣ �Է�> ");
				}else if(yesOrNo.equals("n")){
					System.out.println("�ܾ� ��ȸ�� ����ϼ̽��ϴ�.");
					return;
				}else {
					System.out.println("���� �߸��Ǿ����ϴ�.");
					return;
				}
			
	
			String ano = scn.next();
			newAccount newAcc= find(ano);
			
				if(newAcc==null) {
					System.out.println("���¹�ȣ�� Ʋ�Ƚ��ϴ�.");
					return;
				} 
			newAcc.setBalance(newAcc.getBalance());
			System.out.println("�ԱݵǾ����ϴ�."+ano+"������ ���� �ܾ��� "+newAcc.balance+"���Դϴ�.");
			

		}
			
		
		
		
		//5.�������
		private static void goodbyeBank() {
			
			System.out.println("�����Ͻðڽ��ϱ�? Y/N");
			System.out.print("�Է�> ");
			String yesOrNo = scn.next();
				if(yesOrNo.equals("y")) {
					System.out.print("���¹�ȣ �Է�> ");
				}else if(yesOrNo.equals("n")){
					System.out.println("���������� ����ϼ̽��ϴ�.");
				}else {
					System.out.println("���� �߸��Ǿ����ϴ�.");
					return;
				}
			
			String ano = scn.next();
			newAccount newAcc= find(ano);

				if(newAcc==null) {
					System.out.println("���¹�ȣ�� Ʋ�Ƚ��ϴ�.");
				}
				
				accountArray.remove(newAcc);
					
				System.out.println("���°� ���������� �����Ǿ����ϴ�.");
				}
			
				
				
			
			
	//---------------------			
			
			
		
		
		//6.����
		public static void exit() {
			
			System.out.println("�����Ͻðڽ��ϱ�? Y/N");
			System.out.print("�Է�> ");
			String yesOrNo = scn.next();
				if(yesOrNo.equals("y")){			
					System.out.println("����Ǿ����ϴ�.");
				}else if(yesOrNo.equals("n")) {
					return;
				}else {
					System.out.println("���� �߸��Ǿ����ϴ�.");
					return;
				}
			System.out.close(); 
		}
}	