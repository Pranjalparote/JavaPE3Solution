package com.stackroute;
import java.util.Scanner;
public class StudentGrades
{
    int LOWEST_GRADE  = 0;
    int HIGHEST_GRADE = 100;

        //Array to store grades
         int[] studgrades;

        Scanner in;


        public static void main(String[] args)
        {
            StudentGrades GradesAvg= new StudentGrades();
            GradesAvg.in = new Scanner(System.in);

            System.out.print("Enter the number of students: ");
            int numOfStudents = GradesAvg.in.nextInt();

            GradesAvg.check(numOfStudents);
        }


        public void check(int numStudents)
        {
            if (numStudents <= 0)
            {
                System.out.println("Invalid number of students.");
                return;
            }
            studgrades = new int[numStudents];

            double sum = 0;
            int    i   = 0;
            while (i < numStudents)
            {
                System.out.printf("Enter the grade for student %1$d: ", (i+1));
                int grade = in.nextInt();

                // check if grade is between 0 and 100
                if ((grade >= LOWEST_GRADE) && (grade <= HIGHEST_GRADE)) {
                    studgrades[i] = grade;
                    sum += grade;
                    i++;
                    continue;
                }
                System.out.println("Invalid grade, try again...");
            }
            System.out.printf("The average is %1$.2f\n", (sum / numStudents));
        }

    }

