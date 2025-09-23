package sixth_loops;

public class Caruser {
    public static void main(String[] args) {
        //use carNavigator blueprint
        carNavigator mahindra = new carNavigator(); //creating object
        carNavigator maruthi = new carNavigator();
        //assign data to object
        mahindra. color ="grey";
        mahindra. brandmodel ="mahindra xuv700";
        mahindra. price =25.14;
        //displaycars
        System.out.println("Website:"+carNavigator.Website);
        mahindra.displaycarInfo();
        maruthi.displaycarInfo();//default values,ifnot initized
        //working with instanse variables
        System.out.println("mahindra.color");
        //working with local variables
        //system.out.println(mahindra.rating);


    }

}
