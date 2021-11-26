package mission1;

import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;

public class BoardMain{
static Scanner scanner = new Scanner(System.in);
static Date date= new Date();
static SimpleDateFormat dayformat = new SimpleDateFormat("yyyy-MM-dd");
static String updateday = dayformat.format(date);
									//BoardLists로 주소를 참조해야하기 때문;
static BoardInterface<QnABoard> QnA = new BoardList<>();
static BoardInterface<FreeBoard> free= new BoardList<>();	
static BoardInterface<NoticeBoard> notice = new BoardList<>();	
static int CountQnA;
static int CountNotice;
static int CountFree;
	public static void main(String[] args) {
	finish:while(true) {
			System.out.println("-----------------------");
			System.out.println("1.게시판 선택 |2.종료");
			System.out.println("-----------------------");
			System.out.print("선택> ");
			String select = scanner.next();
			int sel = Integer.parseInt(select);
			
			switch(sel) {
			case 1:
				System.out.println("게시판을 선택하세요. 1.QnABoard, 2.NoticeBoard, 3.FreeBoard");
				System.out.print("선택> ");
				select = scanner.next();
				sel = Integer.parseInt(select);
				
				switch(sel) {
				case 1:
					System.out.println("QnABoard 선택하셨습니다.");
					System.out.println("----------QnABoard-----------------------------");
					System.out.println("1.목록 |2.등록 | 3.상세보기| 4.답변등록| 5.상위메뉴| 6.시스템 종료");
					System.out.println("------------------------------------------------");
					System.out.print("선택> ");
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
								System.out.print("글제목>");
								qna.setTitle(scanner.next());
								System.out.print("작성자>");
								qna.setWriter(scanner.next());
								System.out.print("글내용>");
								qna.setContent(scanner.next());
								qna.setUploadDate(updateday);
								
								QnA.upload(qna);
								
							}else if(sel==3) {	
								System.out.print("글번호> ");
								int searchNo = scanner.nextInt();
								QnA.detail(searchNo-1);
								break;
								
							}else if(sel==4) {	
								System.out.print("글번호> ");
								int searchNo = scanner.nextInt();
								QnABoard instanceQnA =  QnA.get(searchNo-1);
								
								System.out.print("답변> ");
								instanceQnA.setAnswer(scanner.next());
								break;
								
							}else if(sel==5) {
								System.out.println("초기화면으로 돌아갑니다.");
								break;
								
							}else if(sel==6) { 
								System.out.println("프로그램을 종료합니다.");
								break finish;
							}
							
				break;
					
				case 2:
					System.out.println("NoticeBoard 선택하셨습니다.");
					System.out.println("----------NoticeBoard-----------------------------");
					System.out.println("1.목록 |2.등록 | 3.상세보기| 4.상위메뉴| 5.시스템 종료");
					System.out.println("------------------------------------------------");
					System.out.print("선택> ");
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
								System.out.print("글제목>");
								noti.setTitle(scanner.next());
								noti.setWriter("관리자");
								System.out.print("글내용>");
								noti.setContent(scanner.next());
								noti.setUploadDate(updateday);
								System.out.println("공지여부(y or n)> ");
								String YN = scanner.next();
									if(YN.equals("y")) {
										noti.setYorN(true);
									}else if(YN.equals("n")){
										noti.setYorN(false);
									}
								notice.upload(noti);
								
							}else if(sel==3) {
								System.out.print("글번호> ");
								int searchNo = scanner.nextInt();
								notice.detail(searchNo-1);
								break;
							}else if(sel==4) {
								System.out.println("초기화면으로 돌아갑니다.");
								break;
							}else if(sel==5) { 
								System.out.println("프로그램을 종료합니다.");
								break finish;
							}
					break;
					
				case 3:
					System.out.println("FreeBoard 선택하셨습니다.");
					System.out.println("----------FreeBoard-----------------------------");
					System.out.println("1.목록 |2.등록 | 3.상세보기| 4.상위메뉴| 5.시스템 종료");
					System.out.println("------------------------------------------------");
					System.out.print("선택> ");
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
								System.out.print("글제목>");
								fre.setTitle(scanner.next());
								System.out.print("작성자>");
								fre.setWriter(scanner.next());
								System.out.print("글내용>");
								fre.setContent(scanner.next());
								fre.setUploadDate(updateday);
								
								free.upload(fre);
								
							}else if(sel==3) {
								System.out.print("글번호> ");
								int searchNo = scanner.nextInt();
								free.detail(searchNo-1);
								break;
								
							}else if(sel==4) {
								System.out.println("초기화면으로 돌아갑니다.");
								break;
								
							}else if(sel==5) { 
								System.out.println("프로그램을 종료합니다.");
								break finish;
							}
					break;
				}
				break;
			case 2:
				System.out.println("프로그램을 종료합니다.");
				break finish;
			
			}

		}
	}
}
	