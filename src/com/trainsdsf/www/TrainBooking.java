package com.trainsdsf.www;

public class TrainBooking
{
    private static int seats1;
    private static int seats2;
    private static int seats3;
    TrainBooking()
    {
        seats1 = 72;
        seats2 = 72;
        seats3 = 72;
    }
    public void book(String name, int bogie, int seats)
    {
        if (((bogie == 1) || (bogie == 2) || (bogie == 3)) && (seats > 0))
        {
            if (bogie == 1)
            {
                if (seats <= seats1)
                {
                    System.out.println(seats + " Seats have been booked under the Name " + name + " in Carriage " + bogie);
                    seats1 = seats - seats1;
                }
                else
                {
                    System.out.println("Not enough seats available in Carriage " + bogie + ". Please choose a different bogie number.");
                }
            }
            else if (bogie == 2)
            {
                if (seats <= seats2)
                {
                    System.out.println(seats + " Seats have been booked under the Name " + name + " in Carriage " + bogie);
                    seats2 = seats - seats2;
                }
                else
                {
                    System.out.println("Not enough seats available in Carriage " + bogie + ". Please choose a different bogie number.");
                }
            }
            else if (bogie == 3)
            {
                if (seats <= seats3)
                {
                    System.out.println(seats + " Seats have been booked under the Name " + name + " in Carriage " + bogie);
                    seats3 = seats - seats3;
                }
                else
                {
                    System.out.println("Not enough seats available in Carriage " + bogie + ". Please choose a different bogie number.");
                }
            }
        }
        else
        {
            System.out.println("Invalid Input.");
        }
    }
}

