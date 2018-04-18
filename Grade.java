
/**
 * Class is used to calculate final grade.
 *
 * @author Sean Donlin
 * @version 4/17/18
 */
public class Grade
{
    //fields
    private int q1;
    private int q2;
    private int midTerm;
    private int q3;
    private int q4;
    private int finalExam;
    
    public Grade(int q1, int q2, int q3, int q4, int midTerm, int finalExam)
    {
        this.q1 = q1;
        this.q2 = q2;
        this.q3 = q3;
        this.q4 = q4;
        this.midTerm = midTerm;
        this.finalExam = finalExam;
    }
    
    public double finalGrade()
    {
        //First Semester
        double first = (q1+q2)/2 * 0.80;
        double mid = midTerm * 0.20;
        double s1 = first + mid;
        
        //Second Semester
        double s2 = (q3+q4) / 2;
        
        //Semester Avg
        double finished = (s1 + s2) / 2;   
        
        double finishedW = finished * 0.80;
        double fExam = finalExam * 0.20;
        
        return finishedW + fExam;
    }
    
    //Testing to figure out what was wrong at first left in case needed
    //public double semesterOneGrade()
    //{
    //    double first =  (q1+q2) * 0.80;
    //    double mid = midTerm * 0.20;
    //    double s1 = first + mid;
    //   
    //    return s1;
    //}
    //Testing to figure out what was wrong at first left in case needed
    //public double semesterTwoGrade()
    //{
    //    double s2 = (q3+q4) / 2;
    //    return s2;
    //}
}
