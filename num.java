import java.util.*;

public class num {
    public static void Guessingthenumber(){
        Scanner sc = new Scanner(System.in);
        // Generate number.
        int number = 1 + (int)(100*Math.random());
        int k =3; // k = trails

        System.out.println("A number is chosen between 1 and 100. Guess the number within 3 trials.");
        int guessednumber, i;

        for (i = 0; i < k; i++) {
            System.out.print("Guess the number you have in your mind: ");

            //Taking input guess.
            guessednumber = sc.nextInt();

            if(guessednumber == number){
                System.out.println("HURRAY WE GOT A POINT!!");
                break;
            }
            else if(guessednumber<number && i!= k-1){
                System.out.println("Number is greater than "+ guessednumber);
            }
            else if (guessednumber>number && i!=k-1){
                System.out.println("Number is less than "+ guessednumber);
            }

        }
        if(i==k){
            System.out.println("You've exhausted "+k+" trails. The guess was "+ number);
            System.out.println("BETTER LUCK NEXT TIME.");
        }

    }

    public static void main(String[] args) {
        num numb = new num();
        numb.Guessingthenumber();
    }
}
