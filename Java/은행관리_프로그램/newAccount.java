package mission;

public class newAccount {
	public String ano;
	public String owner;
	public int balance;
	
	public newAccount(String ano, String owner, int balance) {
		this.ano = ano;
		this.owner = owner;
		this.balance = balance;
	}
	
	



	public void setAno(String ano) {
		this.ano = ano;
	}
	public newAccount(String ano) {
		this.ano=ano;
	}
	public String getAno() {
		return ano;
	}
	public void setAno(String Ano, String ano) {
		this.ano=ano;
	}

	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}

}