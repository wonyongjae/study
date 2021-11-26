package mission1;

import java.util.ArrayList;

public class BoardList<T extends Board> implements BoardInterface<T>{
	private ArrayList<T> List = new ArrayList<T>();

	@Override
	public void list() {
		System.out.println("글번호 |          제목         | 작성자 | 등록일 ");
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
			System.out.println("글번호 "+t.getNumber()+"번으로 '"+t.getTitle()+"' 글이 등록되었습니다.");
		}
		return;
	}

	@Override
	public void detail(int index) {
		T t = List.get(index);
			if(t instanceof NoticeBoard) {
				NoticeBoard noti = (NoticeBoard)t;
				if(noti.isYorN()) {
					System.out.println("글번호:"+noti.getNumber());
					System.out.println("글제목:"+noti.getTitle());
					System.out.println("작성자:"+noti.getWriter());
					System.out.println("작성일:"+noti.getUploadDate());
					System.out.println("글내용:"+noti.getContent());
				}else {
					System.out.println("접근권한이 없습니다.");
				}
				
			}else if(t instanceof FreeBoard) {
				FreeBoard fre = (FreeBoard)t;
					System.out.println("글번호:"+fre.getNumber());
					System.out.println("글제목:"+fre.getTitle());
					System.out.println("작성자:"+fre.getWriter());
					System.out.println("작성일:"+fre.getUploadDate());
					System.out.println("글내용:"+fre.getContent());
					
			}else if(t instanceof QnABoard) {
				QnABoard qna = (QnABoard)t;
					System.out.println("글번호:"+qna.getNumber());
					System.out.println("글제목:"+qna.getTitle());
					System.out.println("작성자:"+qna.getWriter());
					System.out.println("작성일:"+qna.getUploadDate());
					System.out.println("글내용:"+qna.getContent());
					if(qna.getAnswer() != null){
						System.out.println("답변:"+qna.getAnswer());
					}else {
						System.out.println("답변:현재 답변이 존재하지 않습니다.");
					}
		}
	}

	@Override
	public T get(int index) {
		return List.get(index);
	}

}
