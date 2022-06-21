package com.trainsdsf.www;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        TrainBooking trainBooking = new TrainBooking();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your name:");
        String name = scanner.nextLine();
        System.out.println("There are three carriages available, 1, 2 and 3, each having a maximum capacity of 70 seats. Please enter the carriage number.");
        int carriage = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Please enter the number of seats you want to book." );
        int seats = scanner.nextInt();
        scanner.nextLine();
        trainBooking.book(name, carriage, seats);
    }
}
