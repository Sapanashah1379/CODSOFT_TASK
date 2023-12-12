import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        System.out.println("STUDENT GRADE CALCULATOR");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks of ENGLISH.");
        int english_marks = sc.nextInt();
        System.out.println("Enter your marks of MATH.");
        int math_marks = sc.nextInt();
        System.out.println("Enter your marks of NEPALI.");
        int nepali_marks = sc.nextInt();
        System.out.println("Enter your marks of SOCIAL.");
        int social_marks = sc.nextInt();
        System.out.println("Enter your marks of GRAMMAR.");
        int grammar_marks = sc.nextInt();
        System.out.println("Your english marks is: "+english_marks);
        System.out.println("Your nepali marks is: "+nepali_marks);
        System.out.println("Your social marks is: "+social_marks);
        System.out.println("Your grammar marks is: "+grammar_marks);
        int total_marks = english_marks+math_marks+nepali_marks+social_marks+grammar_marks;
        int average_percentage = (total_marks/5);
        if(average_percentage>=90){
            System.out.println("Grade: A+");
        }
        else if(average_percentage>=80){
            System.out.println("Grade: A");
        }
        else if (average_percentage>=70) {
            System.out.println("Grade: B+");

        } else if (average_percentage>=60) {
            System.out.println("Grade: B");
        }
        else if (average_percentage>=50){
            System.out.println("Grade: C+");
        }
        else if (average_percentage>=45){
            System.out.println("Grade: C");
        }
        else {
            System.out.println("No grade.");
        }
        System.out.println("Your total marks is: "+total_marks);
        System.out.println("Your average percentage is:"+average_percentage);
    }
}
