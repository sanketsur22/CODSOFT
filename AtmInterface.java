import java.util.*;

class ATM{
    float Balance;

    public void menu(float x){
        System.out.println();
        System.out.println("1. Check Account Balance");
        System.out.println("2. Withdraw Money");
        System.out.println("3.Deposit Money");
        System.out.println("4. Exit");
        System.out.println("Enter your choice");

        Scanner sc = new Scanner(System.in);
        int option = sc.nextInt(); 

        switch(option){

            case 1:
                checkBalance();
                break;

            case 2:
                withdrawMoney(x);
                break;
            
            case 3:
                depositMoney(x);
                break;

            case 4:
                break;
        }
    

    }

    public void checkBalance(){
        System.out.println("Balance : " + Balance);
        menu();
    }

    public void withdrawMoney(float amt){
        System.out.println("Enter amount to Withdraw");
        
        
        if(amt>Balance){
            System.out.println("Insufficient Balane");
        }
        else{
            Balance -= amt;
            System.out.println("Withdrawl successful");
        }
        menu();
    }

    public void depositMoney(float amt){
        System.out.println("Enter the amount");
        Balance += amt;
        return amt;
        System.out.println("Money Deposited Successfully");
        menu();
    }
}

public class AtmInterface {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextFloat();
        ATM obj = new ATM();
        obj.menu(amount);
    }
}
