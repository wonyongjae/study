package exception;

public class IDFormatException extends Exception {
    // 사용자 Exception 정의
    // 메시지를 받아서 Exception 이 발생했을 때 출력될 메시지로 던짐
    public IDFormatException(String message) {
        super(message);
    }
}
