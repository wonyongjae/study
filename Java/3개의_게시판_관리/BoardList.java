package mission1;

import java.util.ArrayList;

public class BoardList<T extends Board> implements BoardInterface<T>{
	private ArrayList<T> List = new ArrayList<T>();

	@Override
	public void list() {
		System.out.println("�۹�ȣ |          ����         | �ۼ��� | ����� ");
		for(T t : List) {
			String boardlist = t.toString();
			if(boardlist!=null) {
			System.out.println(boardlist);
			}
		}
	}

	@Override
	public void upload(T t) {
		if(t!=null) {
			List.add(t);
			System.out.println("�۹�ȣ "+t.getNumber()+"������ '"+t.getTitle()+"' ���� ��ϵǾ����ϴ�.");
		}
		return;
	}

	@Override
	public void detail(int index) {
		T t = List.get(index);
			if(t instanceof NoticeBoard) {
				NoticeBoard noti = (NoticeBoard)t;
				if(noti.isYorN()) {
					System.out.println("�۹�ȣ:"+noti.getNumber());
					System.out.println("������:"+noti.getTitle());
					System.out.println("�ۼ���:"+noti.getWriter());
					System.out.println("�ۼ���:"+noti.getUploadDate());
					System.out.println("�۳���:"+noti.getContent());
				}else {
					System.out.println("���ٱ����� �����ϴ�.");
				}
				
			}else if(t instanceof FreeBoard) {
				FreeBoard fre = (FreeBoard)t;
					System.out.println("�۹�ȣ:"+fre.getNumber());
					System.out.println("������:"+fre.getTitle());
					System.out.println("�ۼ���:"+fre.getWriter());
					System.out.println("�ۼ���:"+fre.getUploadDate());
					System.out.println("�۳���:"+fre.getContent());
					
			}else if(t instanceof QnABoard) {
				QnABoard qna = (QnABoard)t;
					System.out.println("�۹�ȣ:"+qna.getNumber());
					System.out.println("������:"+qna.getTitle());
					System.out.println("�ۼ���:"+qna.getWriter());
					System.out.println("�ۼ���:"+qna.getUploadDate());
					System.out.println("�۳���:"+qna.getContent());
					if(qna.getAnswer() != null){
						System.out.println("�亯:"+qna.getAnswer());
					}else {
						System.out.println("�亯:���� �亯�� �������� �ʽ��ϴ�.");
					}
		}
	}

	@Override
	public T get(int index) {
		return List.get(index);
	}

}
