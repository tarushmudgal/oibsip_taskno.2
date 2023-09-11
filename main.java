import java.util.Scanner;

public class main {
    private static boolean[] seats = new boolean[10]; //Initailize an array of 10 seats all of them are empty

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        while (true) {

            //Display menu
            System.out.println("\n Please select an option");
            System.out.println("1. View Seat Map");
            System.out.println("2. Reserve Seat");
            System.out.println("3. Cancel Reservation");
            System.out.println("4. Exit");

            int option = sc.nextInt();
            switch (option) {
                case 1:
                    viewSeatMap();
                    break;

                case 2:
                    reserveSeat();
                    break;

                case 3:
                    cancelReservation();
                    break;

                case 4:
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid option");
            }
        }
    }

        private static void viewSeatMap () {
            System.out.println("\nCurrent Seat Map");
            for (int i = 0; i < seats.length; i++) {
                if (seats[i]) {
                    System.out.print("X "); //"Printing an x if the seat is reserved"
                } else {
                    System.out.print((i + 1) + " "); //printing the seat number if it is empty
                }
            }
            System.out.println();
        }

        private static void reserveSeat () {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter number between 1-10: ");
            int seatnumber = sc.nextInt();
            if (seatnumber < 1 || seatnumber > 10) {
                System.out.print("Invalid Seat number");
            } else if (seats[seatnumber - 1]) {
                System.out.println("Seat already reserved");
            } else {
                seats[seatnumber - 1] = true;
                System.out.println("Seat Reserved");
            }
        }

        private static void cancelReservation () {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter number between 1-10");
            int seatnumber = sc.nextInt();
            if (seatnumber < 1 || seatnumber > 10) {
                System.out.println("Invalid Seat number");
            } else if (!seats[seatnumber - 1]) {
                System.out.println("Seats not reserved");
            } else {
                seats[seatnumber - 1] = false;
                System.out.println("Reservation Canceled");
            }
        }

    }
