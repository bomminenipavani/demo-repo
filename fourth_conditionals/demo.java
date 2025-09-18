package fourth_conditionals;

public class demo {
     public static void main(String[]args){

    //if condition
    int num = 10;
    if (num>0){
        System.out.println("Number is positive");
    }
    //if given number is range 10 to 20
    int number = 20;
    if(number>=10 && number <=20){
        System.out.println("tha number is in range");
    }

    //if-else condition
    int  numb = 10;
    if (num>0){
        System.out.println("number is positive");
    }else{
        System.out.println("number is negative");
    }
    //voting app
    int age = 20;
    if(age>=18){
        System.out.println("you can vote");
    }else{
        System.out.println("you cannot vote");
    }
    //ternary operator
    //variable = (condition)? value-if-value:value-if-false
    int a = 10;
    int b =20;
    int max = (a>b)?a:b;
    System.out.println("max");

    //voting app using ternary operator
    String result = (age>=18) ? "you can vote":"you cannot vote";
    System.out.println("result");

    //else if ladder(grade)
    int marks = 55;
    if(marks >= 90){
        System.out.println("A");
    }else if(marks>=75){
        System.out.println("B");
    }else if(marks>=60){
        System.out.println("c");
    }else if(marks>=50){
        System.out.println("D");
    }else if(marks>=35){
        System.out.println(x:"E");
    }else{
        System.out.println("Fail");
    }
    //swich case
    int daynumber = 5;
    switch(daynumber){
     case 1:
      System.out.println("Monday");
      break;
     case 2:
      System.out.println("Tuesday");
      break;
     case 3:
      System.out.println("Wednesday");
      break;
     case 4:
      System.out.println("Thursday");
      break;
     case 5:
      System.out.println("Friday");
      break;
     case 6:
      System.out.println("saturday");
      break;
     case 7:
      System.out.println("sunday");
      break;
     default:
      System.out.println("invalid day");
      break;
    }

 }

}
