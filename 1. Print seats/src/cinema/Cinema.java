package cinema;

public class Cinema {

    public static void main(String[] args) {

        System.out.println("Cinema:");

        // print column numbers
        System.out.print(" ");
        for (int colNumber = 1; colNumber <= 8; colNumber++) {
            System.out.print(colNumber + " ");
        }
        System.out.println();

        // print row numbers
        for (int row = 1; row <= 7; row++) {
            System.out.print(row + " ");

            // print seats
            for (int seat = 1; seat <= 8; seat++) {
                System.out.print("S ");
            }
            System.out.println();


        }
    }
}