package inheritance;

public class VIPCustomer extends Customer {
    private int agentID;
    double salesRatio;

    public VIPCustomer(int customerID, String customerName, int agentID) {
        super(customerID, customerName);
        customerGrade = "VIP";
        bounsRatio = 0.05;
        salesRatio = 0.1;
        this.agentID = agentID;
    }

    @Override
    public int calcPrice(int price) {
        bounsPoint += price * bounsRatio;
        return price - (int) (price * salesRatio);
    }

    @Override
    public String showCustomerInfo() {
        return customerName + " 님의 등급은 " + customerGrade + " 이며, 적립된 보너스 포인트는 " + bounsPoint + " 점 입니다. 전문 상담원은 "
                + agentID + "입니다.";
    }

}
