
public class Account {
	private double balance;
	private int transactions;
	
	public Account(double balance) {
		if (balance >= 0) {
			this.balance = balance;
		}
		this.transactions = 0;
	}
	
	public void deposit(double amount) {
		if (amount > 0) {
			this.balance += amount;
			this.transactions++;
		}else {
			System.out.println("Số tiền phải lớn hơn 0");
		}
	}
	
	public void withdraw(double amount) {
		if (this.balance >= amount) {
			this.balance -= amount;
			this.transactions++;
		}else {
			System.out.println("Số dư trong tài khoản không đủ");
		}
	}
	
	public void endMonthCharge() {
		
	}
	
	public void endMonth() {
		endMonthCharge();
		System.out.println("Số dư: "+this.balance+"$");
		System.out.println("Số lần giao dịch trong tháng: "+this.transactions);
		this.transactions = 0;
	}
	
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public int getTransactions() {
		return transactions;
	}
	public void setTransactions(int transactions) {
		this.transactions = transactions;
	}
	
	
}
