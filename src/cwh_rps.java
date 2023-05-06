import java.util.Scanner;
import java.util.Random;
public class cwh_rps {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Random rand= new Random();
        int comp_score=0;
        int user_score=0;
        System.out.println("0-->Rock\n1-->Paper\n2-->Scissors");
        for(int i=1;i<=10;i++){
        int comp_choice= rand.nextInt(3);
        int user_choice= sc.nextInt();
        System.out.printf("computer chose %d\n",comp_choice);
        System.out.printf("you chose %d\n",user_choice);

            if(comp_choice==user_choice){
                System.out.println("it's a draw");
            }
            else if(user_choice==1 && comp_choice==0){
                System.out.println("you won");
                user_score++;
            }
            else if(user_choice==1 && comp_choice==2){
                System.out.println("computer won");
                comp_score++;
            }
            else if(user_choice==0 && comp_choice==1){
                System.out.println("computer won");
                comp_score++;
            }
            else if(user_choice==0 && comp_choice==2){
                System.out.println("You won");
                user_score++;
            }
            else if(user_choice==2 && comp_choice==0){
                System.out.println("Computer won");
                comp_score++;
            }
            else if(user_choice==2 && comp_choice==1){
                System.out.println("You Won");
                user_score++;
            }
            else{
                System.out.println("wrong input");
            }
        }
        System.out.println("Game Over");
        System.out.printf("Computer gained %d points\n",comp_score);
        System.out.printf("You gained %d points\n",user_score);
        if(user_score>comp_score){
            System.out.println("User won the game");
        }
        else if(user_score==comp_score){
            System.out.println("It's a draw");
        }
        else{
            System.out.println("Computer won the game");
        }
        System.out.println("Thanks for Playing");


    }
}
