package cinema;

import java.util.Scanner;

public class Cinema {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows:");
        int row = sc.nextInt();

        System.out.println("Enter the number of seats in each row:");
        int seats = sc.nextInt();

        int roomSize = row * seats;
        int profit;

        if(roomSize > 60){

            int frontHalf = row/ 2 * seats;
            int backHalf = roomSize - frontHalf;


            profit = frontHalf * 10 + backHalf * 8;


        } else{
            profit = roomSize * 10;

        }
        System.out.println("Total income:");
        System.out.println("$" + profit);
    }
}