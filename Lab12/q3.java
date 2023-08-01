/*Write a program in Java to take two time values start time, end time from user in
hours & minutes. If end time is lesser than the start time then throw an exception as
InvalidTime and give another chance to the user. Otherwise find the difference
between the two times in terrns of minutes.*/

package WT_LAB.Lab12;

import java.util.Scanner;

public class q3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the start time: ");

        System.out.println("start time in hour: ");
        int startHour = sc.nextInt();
        System.out.println("start time in minutes: ");
        int startMinute = sc.nextInt();

        System.out.println("Enter the end time: ");

        System.out.println("end time in hour: ");
        int endHour = sc.nextInt();
        System.out.println("end time in minutes: ");
        int endMinute = sc.nextInt();
        sc.close();

        int startTime = (startHour * 60) + startMinute;
        int endTime = (endHour * 60) + endMinute;
        if (endTime < startTime) {
            throw new InvalidTimeException("End time can't be before start time!");
        } else {
            int diffTime = endTime - startTime;
            int hour = diffTime / 60;
            int minute = diffTime % 60;
            System.out.println(
                    "The difference between start time and end time is: " + hour + " hour & " + minute + " minutes");
        }
    }

    public static class InvalidTimeException extends RuntimeException {
        public InvalidTimeException(String msg) {
            super(msg);
        }
    }
}