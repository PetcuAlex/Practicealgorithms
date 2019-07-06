package Petcu;

public class MultiplicationTable {

    private void showTable(){
        for (int i=1;i<=10;i++){
            for (int j=1;j<=10;j++)
                System.out.println("\t"+ i +"*" +j +"=" +i*j );
            System.out.println();
        }
    }


    public static void main(String[] args) {
        MultiplicationTable table = new MultiplicationTable();
        table.showTable();
    }
}
