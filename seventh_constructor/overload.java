package seventh_constructor;

public class overload {
    //Constructor overloading:based on input,should give different outcome
    //based on
    //Number of parameters
    //Types of parameters
    //order of parameters
    public  overload(int a, int b){
        System.out.println("sum is " +(a+b));
    }
    public overload(int a, double b){
        System.out.println("sum is " +(a+b));
    }
    public overload(double a,int b){
        System.out.println("sum is " +(a+b));
    }
    public overload(int a, int b,int c){
        System.out.println("sum is " +(a+b+c));
    }
    public static void main(String[] args) {
        overload 01 =new overload(5.5,5);
        overload 02 =new overload(5,5,5);
    }

}
