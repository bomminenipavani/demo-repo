package seventh_constructor;

public class Demo {
    //instance data
    int x;
    int y;
    public Demo{
        x =100;
        y =200;
    }
    Public Demo(intx,inty){
        this.x = x;
        this.y =y;
    }
    public int addNumber(){
        return x+y;
    }
    public static void main(String[] args) {
        Demo obj = newDemo(300,500);
        System.out.println("sum is:" +obj.addnums());
    }

}
