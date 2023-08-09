import java.util.*;
public class AtmInterface
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    Bank bankDetails = new Bank();
	    while(true) {
	        System.out.println();
	        System.out.println("Enter 1 for deposit ");
	        System.out.println("Enter 2 for withdraw ");
	        System.out.println("Enter 3 to check balance ");
	        System.out.println("Enter 4 to exit ");
	        System.out.println();
	        int n = sc.nextInt();
	        System.out.println();
	        switch(n) {
	            case 1:
	                System.out.println("Enter the amount to be deposited: ");
	                double amount = sc.nextDouble();
	                bankDetails.deposit(amount);
	                break;
	            case 2:
	                System.out.println("Enter the amount to be withdrawn: ");
	                double amount2 = sc.nextDouble();
	                bankDetails.withdraw(amount2);
	                break;
	            case 3:
	                System.out.println("The current amount in your bank account is : " +bankDetails.checkBalance());
	                break;
	            case 4:
	                System.out.println("Thank you for visiting our bank !!");
	                System.exit(1);
	        }
	    }
	}
}
class Bank {
    double accBalance;
    public void withdraw(double amount) {
        if(amount > accBalance) {
            System.out.println("Insufficient Balance !!");
            return;
        }
        accBalance -= amount;
        System.out.println("Amount was withdrawn successfully !!");
    }
    public void deposit(double amount) {
        accBalance += amount;
        System.out.println("Amount was deposited successfully !!");
    }
    public double checkBalance() {
        return accBalance;
    }
}
