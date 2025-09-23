package sixth_loops;

public class employee {
    //instance variable
    String empname;
    //static variable
     String companyName = "Digital lync";
     //show details of employee
     public void showEmpInfo(){
        //local variable
        int sal = 10000;
        System.out.println(empname + "earns" + sal + "at" + companyName);
     }
     public static void main(String[] args) {
         employee ravi =new employee();
         ravi.empname ="Ravi";
         ravi.showEmpInfo();
     }

}
