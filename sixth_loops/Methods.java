package sixth_loops;

public class Methods {
    //very simple method-void(nothing)means no return value
    public void great(){
        System.out.println("good morning");
    }
    //simple method- thats returns some value
    public int add(){
        int num1 = 10;
        int num2 = 20;
        return num1+num2;
    }
    //simple methodsthat returns some value and takes input using parameters
    public inDynamicAdd(int num1,int num2){
         return num1+num2;
    }
    public static void main(String[] args) {
        Methods obj = new Methods();
        obj. great();
        System.out.println("obj.add()");
        System.out.println("obj.dynamicAdd(100,200)");
        System.out.println("obj.dynamicAdd(50,200)");
        System.out.println("obj.dynamicAdd(500,200)");
    }

}
