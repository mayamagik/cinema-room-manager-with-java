package cinema;

import java.util.Scanner;

public class Cinema {
    // make scanner object
    static Scanner sc = new Scanner(System.in);

    // declare static variables
    static int  rows;
    static int  seats;
    static char [][] seatings;


    public static void main(String[] args) {
        readCinema();
        createCinemaSeatings();
        displayCinemaSeatings();
        bookSeat();
        displayCinemaSeatings();
    }

    static void readCinema(){
        System.out.println("Enter the number of rows:");
        rows = sc.nextInt();

        System.out.println("Enter the number of seats in each row:");
        seats = sc.nextInt();

    }

    static void createCinemaSeatings(){

        // create array of chars
        seatings = new char[rows][seats];

        // fill array with 'S'
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < seats; j++) {
                seatings[i][j] = 'S';
            }
        }
    }

    static void displayCinemaSeatings(){

        // print header
        System.out.println();
        System.out.println("Cinema:");

        // print column numbers
        System.out.print(" ");
        for (int j = 1; j <= seats; j++) {
            System.out.print(" " + j);

        }
        System.out.println();

        // print rows with seats
        for (int i = 0; i < rows; i++) {
            System.out.print(i + 1);
            for (int j = 0; j < seats; j++) {
              System.out.print(" " + seatings[i][j]);
            }
            System.out.println();
        }
    }

    static void bookSeat(){

        // take user input rows and seats
        System.out.println();
        System.out.println("Enter a row number:");
        int rowNumber = sc.nextInt();

        System.out.println("Enter a seat number in that row:");
        int seatNumber = sc.nextInt();

        int ticketPrice = calculatePrice(rowNumber);
        seatings[rowNumber-1][seatNumber-1] = 'B';

        System.out.println();
        System.out.println("Ticket price: $" + ticketPrice);

    }

    static int calculatePrice(int rowNumber) {

        int roomSize = rows * seats;

        if (roomSize <= 60) {
            return 10;
        }

        int frontHalf = rows / 2;

        if (rowNumber <= frontHalf) {
            return 10;
        } else {
            return 8;
        }
    }
}