package Petcu;


import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class WinnerGenerator {

    private void pickWinner() {
        Scanner in = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<String>();
        int winner;
        int i=0;

        while(true){
            System.out.print("Enter a name: ");
            String word = in.nextLine();
            names.add(word);
            i++;

            if(word.isEmpty()){
                System.out.println("You typed the following names:");

                for(String result: names){

                    System.out.println(result);

                }
                break;
            }
        }
        Random rand = new Random();
        String randomElement = names.get(rand.nextInt(names.size()-1));
        System.out.println("The winner is .... " + randomElement);
//        winner = (int) (Math.random() * ((i - 1) + 1));
//        System.out.println("The winnner is ... "  + names.get(winner));
//        Scanner in = new Scanner(System.in);
//        String[] names = new String[100];
//        int winner;
//        boolean test=true;
//        int i = 0;
//        do {
//            System.out.println("Enter a name:");
//            String name = in.nextLine();
//            names[i]=name;
//            if(name.equals("")){
//                test=false;
//                break;
//            }else{
//            i++;
//            }
//        } while (test);
//        winner = (int) (Math.random() * ((i - 1) + 1));
//        System.out.println("The winner is... " + names[winner]);
//
//

    }


    public static void main(String[] args) {
        WinnerGenerator winnerGenerator = new WinnerGenerator();
        winnerGenerator.pickWinner();

    }
}
