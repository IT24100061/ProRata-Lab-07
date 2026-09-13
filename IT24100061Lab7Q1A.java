import java.util.Scanner;

public class IT24100061Lab7Q1A {
    public static void main(String[] args) {

        int i;
        double marks, average;
        String grade;
        double totalMarks = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter marks for four subjects:");

        for (i = 1; i <= 4; i++) {
            System.out.println("Enter Subject Mark " + i + ":");
            marks = input.nextDouble();
            totalMarks = totalMarks + marks;
        }

        average = totalMarks / 4.0;

        if (average >= 75) {
            grade = "Distinction";
        } else if (average >= 50) {
            grade = "Credit";
        } else {
            grade = "Fail";
        }

        System.out.println("Average is: " + average);
        System.out.println("Overall Grade is: " + grade);
    }
}