import java.util.Scanner;

public class IT24100061Lab7Q1B {
    public static void main(String[] args) {

        int i, student;
        double marks, average;
        String grade;
        double totalMarks;

        Scanner input = new Scanner(System.in);

        for (student = 1; student <= 3; student++) {

            System.out.println("Student " + student);
            System.out.print("Enter marks: ");

            totalMarks = 0;

            for (i = 1; i <= 4; i++) {
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

            System.out.println("Average is : " + average);
            System.out.println("Overall Grade is : " + grade);
            System.out.println();
        }
    }
}