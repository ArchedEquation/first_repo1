import java.util.Scanner;
class Invalidinputerror extends Exception{
    @Override
    public String toString(){
        return "Invalid input entered";
    }
}
class MaxInputError extends Exception{
    @Override
    public String toString(){
        return "input entered is greater than 10,000";
    }
}
class MaxMultiplierError extends Exception{
    @Override
    public String toString(){
        return "Multiplication limit reached";
    }
}
public class customcalc{
    public static void Operatorchecker(char operator) throws Invalidinputerror{
        if((operator != '+') && (operator != '-') && (operator != '*') && (operator != '/')){
            throw new Invalidinputerror();
        }
    }
    public static void Inputchecker(double a,double b)throws MaxInputError{
        if(a>10000 ||b>10000){
            throw new MaxInputError();
        }
    }
    public static double multiply(double a,double b)throws MaxMultiplierError{
        if(a>7000||b>7000){
            throw new MaxMultiplierError();
        }
        return a*b;
    }
    public static double divide(double a,double b)throws ArithmeticException{
        if(b==0){
            throw new ArithmeticException("cannot divide by zero");
        }
        return a/b;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char op;
        double result,a1,b1;
        System.out.println("1)'+'\n2)'-'\n3)'*'\n4)'/'");
        op=sc.nextLine().charAt(0);
        try{
            Operatorchecker(op);
        }
        catch (Invalidinputerror e){
            System.out.println(e);
        }
        System.out.println("enter the first number");
        a1= sc.nextDouble();
        System.out.println("enter the second number");
        b1= sc.nextDouble();
        try{
            Inputchecker(a1,b1);
        }
        catch(MaxInputError e){
            System.out.println(e);
        }
        switch(op){
            case'+':
                result=a1+b1;
                System.out.println("the addition of the numbers are :- "+result);
                break;
            case'-':
                result=a1-b1;
                System.out.println("the subtraction of the numbers are :- "+result);
            case'*':
                try{
                    System.out.println(multiply(a1,b1));
                }
                catch(MaxMultiplierError e){
                    System.out.println(e);
                }
                break;
            case'/':
                try{
                    System.out.println(divide(a1,b1));
                }
                catch(ArithmeticException e){
                    System.out.println(e);
                }
        }
        }
        }








