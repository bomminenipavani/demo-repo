package seventh_constructor;

public class ConstructorDemo {
    //some data-->instance data
    int number ;
    double decnumber;
    boolean value;
    String data;
    char ch;
    //default constructor--> assigns default values
    public ConstructorDemo(){
        System.out.println("Default constructor");
        System.out.println("set my values for instance Data");
        number = 1;
        decnumber = 3.5;
        value = true;
        data = "java";
        ch = '$';

    }
    //explicit /parameterised constructors
    public ConstructorDemo(int intvalue,String Stringvalue){
          number = intvalue;
          data = Stringvalue;
    }
    //method
    public void method(){
        System.out.println("some method");
    }
public static void main(String[] args) {
    ConstructorDemo obj = new ConstructorDemo();
    //constructor will be called when obj is created
    obj.method();//method always needs to be called explicitly
    
    //print instance data
    System.out.println("obj.ch");
    System.out.println("obj.Number");
    System.out.println("obj.decNumber");
    System.out.println("obj.value");
    System.out.println("obj.data");
    System.out.println("==========");

    ConstructorDemo obj2 = new ConstructorDemo();
    //print instance data
    System.out.println("obj2.ch");
    System.out.println("obj2.Number");
    System.out.println("obj2.decNumber");
    System.out.println("obj2.value");
    System.out.println("obj2.data");
    System.out.println("==========");

    ConstructorDemo obj3 = new ConstructorDemo();
    //  print instance data
    System.out.println("obj3.ch");
    System.out.println("obj3.Number");
    System.out.println("obj3.decNumber");
    System.out.println("obj3.value");
    System.out.println("obj3.data");
    System.out.println("==========");

    ConstructorDemo obj4 = new ConstructorDemo();
    //print instance data
    System.out.println("obj4.number");
    System.out.println("obj4.data");



    
}
}
