package com.areasdsf.www;

public class Area
{
    private static int lengthFeet;
    private static int lengthInch;
    private static int widthFeet;
    private static int widthInch;
    Area()
    {
        lengthFeet = 50;
        lengthInch = 0;
        widthFeet = 50;
        widthInch = 0;
    }
    public void areaDimensions()
    {
        System.out.println("Available area has the following dimensions : ");
        System.out.println("1. Length = " + lengthFeet + " Feet and " + lengthInch + " inches.");
        System.out.println("2. Width = " + widthFeet + " Feet and " + widthInch + " inches.");
    }
    public void book(int userLengthFeet, int userLengthInch, int userWidthFeet, int userWidthInch)
    {
        if (userLengthFeet > 0 && userLengthInch >= 0 && userWidthFeet > 0 && userWidthInch >= 0)
        {
            if (userLengthInch > 11 || userWidthInch > 11)
            {
                userLengthFeet += userLengthInch / 12;
                userLengthInch = userLengthInch % 12;
                userWidthFeet += userWidthInch / 12;
                userWidthInch = userWidthInch % 12;
                System.out.println("Your input dimensions are as follows:");
                System.out.println("1. Length = " + userLengthFeet + " Feet and " + userLengthInch + " inches.");
                System.out.println("2. Width = " + userWidthFeet + " Feet and " + userWidthInch + " inches.");
                if ((userLengthFeet < lengthFeet && userWidthFeet < widthFeet))
                {
                    int areaFeet = userLengthFeet * userWidthFeet;
                    int areaInch = userLengthInch * userWidthInch;
                    areaFeet += areaInch / 12;
                    areaInch = areaInch % 12;
                    System.out.println("You have been allotted an area of the following dimensions : " + areaFeet + " Feet and " + areaInch + " inches.");
                    userLengthInch += userLengthFeet * 12;
                    lengthInch += lengthFeet * 12;
                    userWidthInch += userWidthFeet * 12;
                    widthInch += widthFeet * 12;
                    lengthInch -= userLengthInch;
                    widthInch -= userWidthInch;
                    lengthFeet = lengthInch / 12;
                    lengthInch = lengthInch % 12;
                    widthFeet = widthInch / 12;
                    widthInch = widthInch % 12;
                    System.out.println("Remaining area has the following dimensions : ");
                    System.out.println("1. Length = " + lengthFeet + " Feet and " + lengthInch + " inches.");
                    System.out.println("2. Width = " + widthFeet + " Feet and " + widthInch + " inches.");
                }
                else if ((userLengthFeet == lengthFeet && userLengthInch == lengthInch && userWidthFeet == widthFeet && userWidthInch == widthInch))
                {
                    System.out.println("You have selected the complete area.");
                    lengthFeet -= userLengthFeet;
                    lengthInch -= userLengthInch;
                    widthFeet -= userWidthFeet;
                    widthInch -= userWidthInch;
                    System.out.println("Remaining area has the following dimensions : ");
                    System.out.println("1. Length = " + lengthFeet + " Feet and " + lengthInch + " inches.");
                    System.out.println("2. Width = " + widthFeet + " Feet and " + widthInch + " inches.");
                }
                else
                {
                    System.out.println("Dimensions out of bounds.");
                }
            }
            else
            {
                System.out.println("Your input dimensions are as follows:");
                System.out.println("1. Length = " + userLengthFeet + " Feet and " + userLengthInch + " inches.");
                System.out.println("2. Width = " + userWidthFeet + " Feet and " + userWidthInch + " inches.");
                if ((userLengthFeet < lengthFeet && userWidthFeet < widthFeet))
                {
                    int areaFeet = userLengthFeet * userWidthFeet;
                    int areaInch = userLengthInch * userWidthInch;
                    areaFeet += areaInch / 12;
                    areaInch = areaInch % 12;
                    System.out.println("You have been allotted an area of the following dimensions : " + areaFeet + " Feet and " + areaInch + " inches.");
                    userLengthInch += userLengthFeet * 12;
                    lengthInch += lengthFeet * 12;
                    userWidthInch += userWidthFeet * 12;
                    widthInch += widthFeet * 12;
                    lengthInch -= userLengthInch;
                    widthInch -= userWidthInch;
                    lengthFeet = lengthInch / 12;
                    lengthInch = lengthInch % 12;
                    widthFeet = widthInch / 12;
                    widthInch = widthInch % 12;
                    System.out.println("Remaining area has the following dimensions : ");
                    System.out.println("1. Length = " + lengthFeet + " Feet and " + lengthInch + " inches.");
                    System.out.println("2. Width = " + widthFeet + " Feet and " + widthInch + " inches.");
                }
                else if ((userLengthFeet == lengthFeet && userLengthInch == lengthInch && userWidthFeet == widthFeet && userWidthInch == widthInch))
                {
                    System.out.println("You have selected the complete area.");
                    lengthFeet -= userLengthFeet;
                    lengthInch -= userLengthInch;
                    widthFeet -= userWidthFeet;
                    widthInch -= userWidthInch;
                    System.out.println("Remaining area has the following dimensions : ");
                    System.out.println("1. Length = " + lengthFeet + " Feet and " + lengthInch + " inches.");
                    System.out.println("2. Width = " + widthFeet + " Feet and " + widthInch + " inches.");
                }
                else
                {
                    System.out.println("Dimensions out of bounds.");
                }
            }
        }
        else
        {
            System.out.println("Invalid Input.");
        }
    }
}
