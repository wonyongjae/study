package lambda;

// 람다로 사용될 함수는 펑셔널 인터페이스 어노테이션을 붙여줘야댐
// 한번에 두가지 메서드를 선언할 수 없음
@FunctionalInterface
public interface MyMaxNumber {
    int getMaxNumber(int x, int y);
}
