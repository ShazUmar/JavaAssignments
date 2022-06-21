package com.examsdsf.www;

public class Exam
{
    private static int CentreSeats1;
    private static int CentreSeats2;
    private static int CentreSeats3;
    Exam()
    {
        CentreSeats1 = 120;
        CentreSeats2 = 100;
        CentreSeats3 = 80;
    }
    void ExamCentre1(int i, String name, String rollNo)
    {
        if (i >= 0)
        {
            if (CentreSeats1 >= i)
            {
                System.out.println("Seats allotted to " + name + " " + rollNo + " in Centre 1.");
                CentreSeats1 = CentreSeats1 - i;
                System.out.println("Available seats in Centre 1 = " + CentreSeats1);
            }
            else if (CentreSeats2 >= i)
            {
                System.out.println("Seats allotted to " + name + " " + rollNo + " in Centre 2");
                CentreSeats2 = CentreSeats2 - i;
                System.out.println("Available seats in Centre 2 = " + CentreSeats2);
            }
            else if (CentreSeats3 >= i)
            {
                System.out.println("Seats allotted to " + name + " " + rollNo + " in Centre 3");
                CentreSeats3 = CentreSeats3 - i;
                System.out.println("Available seats in Centre 3 = " + CentreSeats3);
            }
            else
                System.out.println("Seats not Available in any Centre");
        }
        else
            System.out.println("Invalid input");
    }
    void ExamCentre2(int i, String name, String rollNo)
    {
        if (i >= 0)
        {
            if (CentreSeats1 >= i)
            {
                System.out.println("Seats allotted to " + name + " " + rollNo + " in Centre 1");
                CentreSeats1 = CentreSeats1 - i;
                System.out.println("Available seats in Centre 1 = " + CentreSeats1);
            }
            else if (CentreSeats3 >= i)
            {
                System.out.println("Seats allotted to " + name + " " + rollNo + " in Centre 3");
                CentreSeats3 = CentreSeats3 - i;
                System.out.println("Available seats in Centre 3 = " + CentreSeats3);
            }
            else if (CentreSeats2 >= i)
            {
                System.out.println("Seats allotted to " + name + " " + rollNo + " in Centre 2");
                CentreSeats2 = CentreSeats2 - i;
                System.out.println("Available seats in Centre 2 = " + CentreSeats2);
            }
            else
                System.out.println("Seats not Available in any Centre");
        }
        else
            System.out.println("Invalid input");
    }
    void ExamCentre3(int i, String name, String rollNo)
    {
        if (i >= 0)
        {
            if (CentreSeats2 >= i)
            {
                System.out.println("Seats allotted to " + name + " " + rollNo + " in Centre 2");
                CentreSeats2 = CentreSeats2 - i;
                System.out.println("Available seats in Centre 2 = " + CentreSeats2);
            }
            else if (CentreSeats1 >= i)
            {
                System.out.println("Seats allotted to " + name + " " + rollNo + " in Centre 1");
                CentreSeats1 = CentreSeats1 - i;
                System.out.println("Available seats in Centre 1 = " + CentreSeats1);
            }
            else if (CentreSeats3 >= i)
            {
                System.out.println("Seats allotted to " + name + " " + rollNo + " in Centre 3");
                CentreSeats3 = CentreSeats3 - i;
                System.out.println("Available seats in Centre 3 = " + CentreSeats3);
            }
            else
                System.out.println("Seats not Available in any Centre");
        }
        else
            System.out.println("Invalid input");
    }
    void ExamCentre4(int i, String name, String rollNo)
    {
        if (i >= 0)
        {
            if (CentreSeats2 >= i)
            {
                System.out.println("Seats allotted to " + name + " " + rollNo + " in Centre 2");
                CentreSeats2 = CentreSeats2 - i;
                System.out.println("Available seats in Centre 2 = " + CentreSeats2);
            }
            else if (CentreSeats3 >= i)
            {
                System.out.println("Seats allotted to " + name + " " + rollNo + " in Centre 3");
                CentreSeats3 = CentreSeats3 - i;
                System.out.println("Available seats in Centre 3 = " + CentreSeats3);
            }
            else if (CentreSeats1 >= i)
            {
                System.out.println("Seats allotted to " + name + " " + rollNo + " in Centre 1");
                CentreSeats1 = CentreSeats1 - i;
                System.out.println("Available seats in Centre 1 = " + CentreSeats1);
            }
            else
                System.out.println("Seats not Available in any Centre");
        }
        else
            System.out.println("Invalid input");
    }
    void ExamCentre5(int i, String name, String rollNo)
    {
        if (i >= 0)
        {
            if (CentreSeats3 >= i)
            {
                System.out.println("Seats allotted to " + name + " " + rollNo + " in Centre 3");
                CentreSeats3 = CentreSeats3 - i;
                System.out.println("Available seats in Centre 3 = " + CentreSeats3);
            }
            else if (CentreSeats1 >= i)
            {
                System.out.println("Seats allotted to " + name + " " + rollNo + " in Centre 1");
                CentreSeats1 = CentreSeats1 - i;
                System.out.println("Available seats in Centre 1 = " + CentreSeats1);
            }
            else if (CentreSeats2 >= i)
            {
                System.out.println("Seats allotted to " + name + " " + rollNo + " in Centre 2");
                CentreSeats2 = CentreSeats2 - i;
                System.out.println("Available seats in Centre 2 = " + CentreSeats2);
            }
            else
                System.out.println("Seats not Available in any Centre");
        }
        else
            System.out.println("Invalid input");
    }
    void ExamCentre6(int i, String name, String rollNo)
    {
        if (i >= 0)
        {
            if (CentreSeats3 >= i)
            {
                System.out.println("Seats allotted to " + name + " " + rollNo + " in Centre 3");
                CentreSeats3 = CentreSeats3 - i;
                System.out.println("Available seats in Centre 3 = " + CentreSeats3);
            }
            else if (CentreSeats2 >= i)
            {
                System.out.println("Seats allotted to " + name + " " + rollNo + " in Centre 2");
                CentreSeats2 = CentreSeats2 - i;
                System.out.println("Available seats in Centre 2 = " + CentreSeats2);
            }
            else if (CentreSeats1 >= i)
            {
                System.out.println("Seats allotted to " + name + " " + rollNo + " in Centre 1");
                CentreSeats1 = CentreSeats1 - i;
                System.out.println("Available seats in Centre 1 = " + CentreSeats1);
            }
            else
                System.out.println("Seats not Available in any Centre");
        }
        else
            System.out.println("Invalid input");
    }
}

