package cinema;
import java.util.Scanner;

public class Cinema {

    // create scanner object
    static Scanner sc = new Scanner(System.in);

    // declare static variables
    static int  rows;
    static int  seats;
    static char [][] seatings;

    // initialize counters for purchased tickets and current income
    static int purchasedTickets = 0;
    static int currentIncome = 0;



    public static void main(String[] args) {
        readCinema();
        createCinemaSeatings();

        while (true) {

            //print menu
            System.out.println();
            System.out.println("1. Show the seats");
            System.out.println("2. Buy a ticket");
            System.out.println("3. Statistics");
            System.out.println("0. Exit");

            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    displayCinemaSeatings();
                    break;
                case 2:
                    bookSeat();
                    break;
                case 0:
                    return;
                case 3:
                    showStatistics();
                    break;
                default:
                    System.out.println("Invalid choice");

            }
        }
    }
    // take user input for room size
    static void readCinema(){
        System.out.println("Enter the number of rows:");
        rows = sc.nextInt();

        System.out.println("Enter the number of seats in each row:");
        seats = sc.nextInt();

    }

    // create cinema room with user input
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

    // display cinema room
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

    // take user input for selected seat and check availability
    static void bookSeat(){

        while (true) {
            // take user input row and seat numbers
            System.out.println();
            System.out.println("Enter a row number:");
            int rowNumber = sc.nextInt();

            System.out.println("Enter a seat number in that row:");
            int seatNumber = sc.nextInt();

            // check if seat out of bound
            if (rowNumber < 1 || rowNumber > rows ||
                    seatNumber < 1 || seatNumber > seats){
                System.out.println("Wrong input!");
                continue;
            }
            // check if seat available
            if (seatings[rowNumber-1][seatNumber-1] == 'S') {
                System.out.println();
                System.out.println("That ticket has already been purchased!");
                continue;
            }

        // book seat and increase counters
        int ticketPrice = calculatePrice(rowNumber);
        seatings[rowNumber-1][seatNumber-1] = 'B';
        purchasedTickets++;
        currentIncome += ticketPrice;

        // display ticket price for selected seat
        System.out.println();
        System.out.println("Ticket price: $" + ticketPrice);
        break;

        }
    }

    // calculate ticket price for selected seat
    static int calculatePrice(int rowNumber) {

        int roomSize = rows * seats;

        // set ticket price for big cinema rooms
        if (roomSize <= 60) {
            return 10;
        }

        // set ticket price for smaller cinema rooms
        int frontHalf = rows / 2;

        if (rowNumber <= frontHalf) {
            return 10;
        } else {
            return 8;
        }
    }

    // calculate total income from purchased tickets
    static int calculateTotalIncome(){

        int total = 0;
        for (int row = 1; row <= rows; row++) {
            total = total + calculatePrice(row);

        } return total;

    }

    // calculate stats and display statistics
    static void showStatistics(){
        int roomSize = rows * seats;

        // calculate percentage
        double percentage = (double) purchasedTickets / roomSize * 100;

        // calculate total income
        int totalIncome = calculateTotalIncome();

        // print stats
        System.out.println();
        System.out.println("Number of purchased tickets: " + purchasedTickets);
        System.out.println("Percentage: %.2f%%%n" + percentage);
        System.out.println("Total income: $" + totalIncome);
    }
}