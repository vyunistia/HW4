package HW4;

import java.util.Scanner;

public class time {

    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);

        System.out.println("Please enter current time 1-24");

        int time = input.nextInt();

        if(time>=1 && time<=11){
            System.out.println("Morning");
        } else if (time>=12 && time<=15){
            System.out.println("Afternoon");
        } else if (time>=16 && time<=20){
            System.out.println("Evening");
        } else {
            System.out.println("Night");
        }







    }
}
