import java.util.Scanner;

public class simpleCalc{
    public static void main(String[] args) {

        Scanner callNum= new Scanner(System.in);
double num1, num2, ans;
int operator;
boolean valid=true;

        System.out.println("Hi there!");
        System.out.println("please choose your arithmetic operator");
        System.out.println("1. Add(+)");
        System.out.println("2. Minus(-)");
        System.out.println("3. Multiply(×)");
        System.out.println("4. Divide(÷)");
      
        System.out.println("enter a number. eg(1-4)");
        operator=callNum.nextInt();
        
        System.out.print("input your first digit:  ");
       num1= callNum.nextDouble();

 System.out.print("input your second digit:   " );
       num2=callNum.nextDouble();
       
  
       
       switch(operator){
    case 1:
    ans=num1+num2;
    System.out.println("ANSWER: "+ans);
    break;
    
    case 2:
    ans=num1-num2;
    break;
    
    case 3:
    ans=num1*num2;
    break;
        
    case 4:
    ans=num1/num2;
    
    if(num2==0){
    	System.out.println("can not divide by zero");
    	valid=false;
    }
    break;
    
    default :
    System.out.println("INVALID operator");
    valid=false;
    break;
     
       }
       if(valid){
       	System.out.println("ANSWER: ");
       }
       
        callNum.close();
    }
}