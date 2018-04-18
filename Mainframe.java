
/**
 * Write a description of class Mainframe here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Mainframe
{
    public static void main(String[] args)
    {
        SimpleScanner input = new SimpleScanner();
        
        boolean running = true;
        String exitCommand = "quit";
        
        int q1 = 0;
        int q2 = 0;
        int q3 = 0;
        int q4 = 0;
        int midTerm = 0;
        int finalExam = 0;
        
        while (running)
        {
            //Grade Entering Section
            System.out.println("Enter your first quarter grade: ");
            q1 = input.readInt();
            System.out.println("Enter your second quarter grade: ");
            q2 = input.readInt();
            System.out.println("Enter your third quarter grade: ");
            q3 = input.readInt();
            System.out.println("Enter your fourth quarter grade: ");
            q4 = input.readInt();
            System.out.println("Enter your mid-Term grade: ");
            midTerm = input.readInt();
            System.out.println("Enter your final exam grade: ");
            finalExam = input.readInt();
                        
            running = false;
        }
        
        Grade myGrades = new Grade(q1,q2,q3,q4,midTerm,finalExam);
        
        System.out.println(myGrades.finalGrade());
        //System.out.println(myGrades.semesterOneGrade());
        //System.out.println(myGrades.semesterTwoGrade());
    }
}
