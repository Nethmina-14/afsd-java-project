import java.util.Scanner;

public class Task {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int scores [] = new int[11];
        int totalScore = 0;
        for (int i=0; i<11; i++){
            System.out.print("Enter "+(i+1)+" player's score :");
             scores[i] = scan.nextInt();


            totalScore += scores[i];

        }
        int maxScore = scores[0];
        int index = 0;


        for(int i=0; i<11; i++){
            if(scores[i]>maxScore){
                maxScore = scores[i];
//                index = scores[i];
            }

        }
        System.out.println("Average score is : "+(totalScore/11));
        System.out.println("Highest score is : "+scores);
        System.out.println("Hellooo.....");

    }


}
