package com.company;
import java.util.Scanner;

import static java.lang.System.exit;

public class Main {



    public static void menu(){
        int option1;
        int o = 1;
        String ticketType;
        Premium pr = new Premium();
        Standard st = new Standard();
        int y = 0;
        int[] hourArray = new int[10];
        int[] carNumberArray = new int[10];
        String[] typeArray = new String[10];

        while (o == 1) {
        System.out.println("Parking Ticket machine");
        System.out.println("1. Get ticket");
        System.out.println("2. Check ticket");
        System.out.println("3. Exit");

        Scanner sc = new Scanner(System.in);
        option1 = sc.nextInt();


            switch (option1) {
                case 1:
                    System.out.println("Enter number of hours");
                    int h = sc.nextInt();
                    System.out.println("Enter Car Number");
                    int j = sc.nextInt();
                    System.out.println("premium or standard");
                    ticketType = sc.next();
                    if (ticketType.equals("premium")) {
                        pr.setHour(h);
                        pr.setCarNum(j);
                        pr.calculation();
                        hourArray[y] = h;
                        carNumberArray[y] = j;
                        typeArray[y] = "Premium";
                        y++;
                        System.out.println("Amount is: " + pr.getAmount());

                    } else if (ticketType.equals("standard")) {
                        st.setHour(h);
                        st.setCarNum(j);
                        st.calculations();
                        hourArray[y] = h;
                        carNumberArray[y] = j;
                        typeArray[y] = "Standard";
                        y++;
                        System.out.println("Amount is: " + st.getAmount());
                    }
                    break;
                case 2:
                    // VIEW
                    System.out.println("Enter Car Number");
                    int checknum = sc.nextInt();
                    for (int l = 0; l < 10; l++) {
                        if (carNumberArray[l] == checknum) {
                            System.out.println("Car Number is: " + carNumberArray[l]);
                            System.out.println("Hours: " + hourArray[l]);
                            System.out.println("Type: " + typeArray[l]);
                            break;
                        }
                    }



                    break;
                case 3:
                    exit(0);

                    break;
            }
        }




    }
    public static void main(String[] args) {
        menu();
    }

}
