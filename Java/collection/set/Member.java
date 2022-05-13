package collection.set;

public class Member {
    private int memberId;
    private String memberName;

    public Member() {
    }

    public Member(int memberId, String memberName) {
        this.memberId = memberId;
        this.memberName = memberName;
    }

    public int getMemberId() {
        return this.memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public String getMemberName() {
        return this.memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public String toString() {
        // return "asd";
        return memberName + " 회원님의 아이디는 " + memberId + " 입니다.";
    }

    // HashSet 을 이용할 땐 HashCode 와 Equals 를 검사해야함
    // 필요에 따라 재정의
    @Override
    public int hashCode() {
        return memberId;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Member) {
            Member member = (Member) obj;
            return (this.memberId == member.memberId);
        }
        return false;
    }

}
