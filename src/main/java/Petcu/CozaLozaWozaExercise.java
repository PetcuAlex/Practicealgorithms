package Petcu;

public class CozaLozaWozaExercise {

    private void printNumberLine(int startingNumber) {
        for (int i = 1; i <= 11; i++) {
            int number = startingNumber + i;
            String text = number + "";

            if (number % 3 == 0 && number % 5 ==0){
                text = "CozaLoza";
            }else if (number % 3 ==0){
                text = "Coza";
            }else if (number % 5 == 0){
                text = "Loza";
            }else if (number % 7 ==0){
                text = "Woza";
            }else {
                text = number + "";
            }

            System.out.print(text + " ");
        }
        System.out.println();
    }

    public void printAllNumbers(){
        for (int i = 0;i<110;i+=11){
            printNumberLine(i);
        }
    }


    public static void main(String[] args) {

        CozaLozaWozaExercise exercise = new CozaLozaWozaExercise();
        exercise.printAllNumbers();
    }
}
