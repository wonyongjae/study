package inheritance;

public class Customer {
    protected int customerID;
    protected String customerName;
    protected String customerGrade;

    int bounsPoint;
    double bounsRatio;

    public int getBounsPoint() {
        return this.bounsPoint;
    }

    public void setBounsPoint(int bounsPoint) {
        this.bounsPoint = bounsPoint;
    }

    public Customer(int customerID, String customerName) {
        this.customerID = customerID;
        this.customerName = customerName;
        customerGrade = "SILVER";
        bounsRatio = 0.01;
    }

    public int calcPrice(int price) {
        bounsPoint += price * bounsRatio;
        return price;
    }

    public String showCustomerInfo() {
        return customerName + " 님의 등급은 " + customerGrade + " 이며, 적립된 보너스 포인트는 " + bounsPoint + " 점 입니다.";
    }

    public int getCustomerID() {
        return this.customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public String getCustomerName() {
        return this.customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerGrade() {
        return this.customerGrade;
    }

    public void setCustomerGrade(String customerGrade) {
        this.customerGrade = customerGrade;
    }

}
