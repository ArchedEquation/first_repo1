import java.util.Scanner;
class LowBalanceError extends Exception{
}
class Account{
    int balance=1000;
    void withdraw(int amt){
        try{
            if(amt>this.balance){
                throw new LowBalanceError();
            }
            else{
                System.out.println("take the cash = "+amt);
                this.balance=this.balance-amt;
                System.out.println("the remaining cash is = "+this.balance);
            }
        } catch (LowBalanceError e) {
            System.out.println("low balance error");

        }
    }
}
public class userexcep {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter amount");
        int amount= sc.nextInt();
        Account a1=new Account();
        a1.withdraw(amount);

    }
}
