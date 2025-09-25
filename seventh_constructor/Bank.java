package seventh_constructor;

//stimulate banking system

public class Bank {
    //if if you want to create an account in Hdfc bank
    //Account can be opened if minimum balance is 10000
    //now we can accept bank account with custom balance2000,5000,0
    //initial accout creation
    double minBalance;
    //bank start operations-->current account
    public Bank(){
        System.out.println("====Hdfc===");
        System.out.println("creating HDFC account");
        minBalance = 10000;
        //service charge
        minBalance = 1500;
    }
    //savings account
    public Bank(double minBalance){
        this.minBalance = minBalance;
    }
    public double showBalance(){
        return minBalance;
    }
    public static void main(String[] args) {
        Bank customer_one = new Bank();//current Account
        System.out.println(customer_one.showBalance());

        Bank customer_two = new Bank();
        System.out.println(customer_two.showBalance());
    }

}
