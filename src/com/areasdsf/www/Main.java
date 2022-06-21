package com.areasdsf.www;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Area area = new Area();
        Scanner scanner = new Scanner(System.in);
        area.areaDimensions();
        System.out.println("Enter the dimensions of the area you want :");
        System.out.println("1. Length(feet) : ");
        int lengthFeet = scanner.nextInt();
        scanner.nextLine();
        System.out.println("2. Length(inches) : ");
        int lengthInch = scanner.nextInt();
        scanner.nextLine();
        System.out.println("3. Width(feet) : ");
        int widthFeet = scanner.nextInt();
        scanner.nextLine();
        System.out.println("4. Width(inches) : ");
        int widthInch = scanner.nextInt();
        scanner.nextLine();
        area.book(lengthFeet, lengthInch, widthFeet, widthInch);
    }
}

