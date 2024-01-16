import java.util.Scanner;
public class StudentGrade
{
    /**
     * @param args
     */
    public static void main(String args[]) 
    {
        Scanner scanner = new Scanner(System.in);
        int totalSub,totalMarks = 0;
        double average;
        System.out.println("Enter the student name:");
        String name = scanner.next();
        System.out.println("Enter your roll no.: ");
        int roll = scanner.nextInt();
        System.out.println("Enter the number of Subjects");
        totalSub = scanner.nextInt();

        for(int i=1;i<=totalSub;i++)
        {
            System.out.println("Enter marks for subject " + i + "(out of 100): ");
            int marks = scanner.nextInt();
            totalMarks += marks;
        }
        average = (double) totalMarks/totalSub;
        char grade;
        if(average <= 100 && average >=90)
        {
            grade = 'A';
        }
        else if(average<=90 && average >=75)
        {
            grade = 'B';
        }
        else if(average <=75 && average >=60)
        {
            grade = 'C';
        }
        else if(average<=60 && average >=45)
        {
            grade = 'D';
        }
        else
        {
            grade = 'E';
        }
        System.out.println("Total marks obtained by " + name + "is: " +totalMarks);
        System.out.println("Average percentage is: " + average + "%");
        System.out.println("Grade: " + grade);
    }
}