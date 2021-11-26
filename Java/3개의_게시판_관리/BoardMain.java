package mission1;

import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;

public class BoardMain{
static Scanner scanner = new Scanner(System.in);
static Date date= new Date();
static SimpleDateFormat dayformat = new SimpleDateFormat("yyyy-MM-dd");
static String updateday = dayformat.format(date);
									//BoardLists�� �ּҸ� �����ؾ��ϱ� ����;
static BoardInterface<QnABoard> QnA = new BoardList<>();
static BoardInterface<FreeBoard> free= new BoardList<>();	
static BoardInterface<NoticeBoard> notice = new BoardList<>();	
static int CountQnA;
static int CountNotice;
static int CountFree;
	public static void main(String[] args) {
	finish:while(true) {
			System.out.println("-----------------------");
			System.out.println("1.�Խ��� ���� |2.����");
			System.out.println("-----------------------");
			System.out.print("����> ");
			String select = scanner.next();
			int sel = Integer.parseInt(select);
			
			switch(sel) {
			case 1:
				System.out.println("�Խ����� �����ϼ���. 1.QnABoard, 2.NoticeBoard, 3.FreeBoard");
				System.out.print("����> ");
				select = scanner.next();
				sel = Integer.parseInt(select);
				
				switch(sel) {
				case 1:
					System.out.println("QnABoard �����ϼ̽��ϴ�.");
					System.out.println("----------QnABoard-----------------------------");
					System.out.println("1.��� |2.��� | 3.�󼼺���| 4.�亯���| 5.�����޴�| 6.�ý��� ����");
					System.out.println("------------------------------------------------");
					System.out.print("����> ");
					select = scanner.next();
					sel = Integer.parseInt(select);
							if(sel==1) {
								QnA.list();
								break;
								
							}else if(sel==2) {
								QnABoard qna = new QnABoard();
								CountQnA++;
								String Count = Integer.toString(CountQnA);
								qna.setNumber(Count);
								System.out.print("������>");
								qna.setTitle(scanner.next());
								System.out.print("�ۼ���>");
								qna.setWriter(scanner.next());
								System.out.print("�۳���>");
								qna.setContent(scanner.next());
								qna.setUploadDate(updateday);
								
								QnA.upload(qna);
								
							}else if(sel==3) {	
								System.out.print("�۹�ȣ> ");
								int searchNo = scanner.nextInt();
								QnA.detail(searchNo-1);
								break;
								
							}else if(sel==4) {	
								System.out.print("�۹�ȣ> ");
								int searchNo = scanner.nextInt();
								QnABoard instanceQnA =  QnA.get(searchNo-1);
								
								System.out.print("�亯> ");
								instanceQnA.setAnswer(scanner.next());
								break;
								
							}else if(sel==5) {
								System.out.println("�ʱ�ȭ������ ���ư��ϴ�.");
								break;
								
							}else if(sel==6) { 
								System.out.println("���α׷��� �����մϴ�.");
								break finish;
							}
							
				break;
					
				case 2:
					System.out.println("NoticeBoard �����ϼ̽��ϴ�.");
					System.out.println("----------NoticeBoard-----------------------------");
					System.out.println("1.��� |2.��� | 3.�󼼺���| 4.�����޴�| 5.�ý��� ����");
					System.out.println("------------------------------------------------");
					System.out.print("����> ");
					select = scanner.next();
					sel = Integer.parseInt(select);

							if(sel==1) {
								notice.list();
								break;
								
							}else if(sel==2) {
								NoticeBoard noti = new NoticeBoard();
								CountNotice++;
								String Count = Integer.toString(CountNotice);
								noti.setNumber(Count);
								System.out.print("������>");
								noti.setTitle(scanner.next());
								noti.setWriter("������");
								System.out.print("�۳���>");
								noti.setContent(scanner.next());
								noti.setUploadDate(updateday);
								System.out.println("��������(y or n)> ");
								String YN = scanner.next();
									if(YN.equals("y")) {
										noti.setYorN(true);
									}else if(YN.equals("n")){
										noti.setYorN(false);
									}
								notice.upload(noti);
								
							}else if(sel==3) {
								System.out.print("�۹�ȣ> ");
								int searchNo = scanner.nextInt();
								notice.detail(searchNo-1);
								break;
							}else if(sel==4) {
								System.out.println("�ʱ�ȭ������ ���ư��ϴ�.");
								break;
							}else if(sel==5) { 
								System.out.println("���α׷��� �����մϴ�.");
								break finish;
							}
					break;
					
				case 3:
					System.out.println("FreeBoard �����ϼ̽��ϴ�.");
					System.out.println("----------FreeBoard-----------------------------");
					System.out.println("1.��� |2.��� | 3.�󼼺���| 4.�����޴�| 5.�ý��� ����");
					System.out.println("------------------------------------------------");
					System.out.print("����> ");
					select = scanner.next();
					sel = Integer.parseInt(select);

							if(sel==1) {
								free.list();
								break;
								
							}else if(sel==2) {
								FreeBoard fre = new FreeBoard();
								CountFree++;
								String Count = Integer.toString(CountFree);
								fre.setNumber(Count);
								System.out.print("������>");
								fre.setTitle(scanner.next());
								System.out.print("�ۼ���>");
								fre.setWriter(scanner.next());
								System.out.print("�۳���>");
								fre.setContent(scanner.next());
								fre.setUploadDate(updateday);
								
								free.upload(fre);
								
							}else if(sel==3) {
								System.out.print("�۹�ȣ> ");
								int searchNo = scanner.nextInt();
								free.detail(searchNo-1);
								break;
								
							}else if(sel==4) {
								System.out.println("�ʱ�ȭ������ ���ư��ϴ�.");
								break;
								
							}else if(sel==5) { 
								System.out.println("���α׷��� �����մϴ�.");
								break finish;
							}
					break;
				}
				break;
			case 2:
				System.out.println("���α׷��� �����մϴ�.");
				break finish;
			
			}

		}
	}
}
	