package com.examsdsf.www;

import java.util.Scanner;

public class Main extends Exam
{
    public static void main(String[] args) {
        System.out.println("=====================================================================");
        System.out.println("Enter the Examination centre preference as 123 / 132 / 231 / 321 etc.");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Enter the number of seats you require.");
        int i = sc.nextInt();
        System.out.println("Enter name.");
        String name = sc.next();
        System.out.println("Enter roll number.");
        String rollNo = sc.next();
        Exam examObj = new Exam();
        switch (a) {
            case 123:
                System.out.println("Your Preference = " + a);
                examObj.ExamCentre1(i, name, rollNo);
                break;
            case 132:
                System.out.println("Your Preference = " + a);
                examObj.ExamCentre1(i, name, rollNo);
                break;
            case 213:
                System.out.println("Your Preference = " + a);
                examObj.ExamCentre1(i, name, rollNo);
                break;
            case 231:
                System.out.println("Your Preference = " + a);
                examObj.ExamCentre1(i, name, rollNo);
                break;
            case 312:
                System.out.println("Your Preference = " + a);
                examObj.ExamCentre1(i, name, rollNo);
                break;
            case 321:
                System.out.println("Your Preference = " + a);
                examObj.ExamCentre1(i, name, rollNo);
                break;
            default:
                System.out.println("Invalid preference format.");
        }
    }
}

