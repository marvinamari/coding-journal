//  File:  GPA_CalculatorTest.java

//  GPA_Calculator objects are constructed with the number of classes
//  taken, and the number of A's, B's, C's, and D's received. 
//  There are no "plusses" or "minuses", and each class is assumed to be
//  worth 3 credits.  A's are worth 4 points, B's 3, C's 2, D's 1.

/**
 * A class to calculate a Grade Point Average.
 */
class GPA_Calculator {
    // defined constants
    private static final int A_POINTS = 4, // 4 points for each "A"
                             B_POINTS = 3, // etc.
                             C_POINTS = 2,
                             D_POINTS = 1;
    // instance var's
    private int classesTaken;       // number of classes taken
    private int numA,               // number of "A" grades earned
                numB,               // number of "B" grades
                numC,               // number of "C" grades
                numD,               // number of "D" grades
                numF;               // number of "F" grades
    private int creditsAttempted;   // total credits attempted
    private int gradePoints;        // total "grade points" earned

    /**
     * Create a GPA_Calculator object.
     * @param numClasses the number of classes taken
     * @param numAs the number of "A" grades earned
     * @param numBs the number of "B" grades earned
     * @param numCs the number of "C" grades earned
     * @param numDs the number of "D" grades earned
     */
    public GPA_Calculator(int numClasses, int numAs, int numBs,
                          int numCs, int numDs) {
        classesTaken = numClasses;
        numA = numAs;
        numB = numBs;
        numC = numCs;
        numD = numDs;
        numF = classesTaken - (numA + numB + numC + numD);

        //  compute total credits and total grade points - assumes each
        //  class is 3 credits
        creditsAttempted = 3 * classesTaken; 
        gradePoints = 3 * ((numA * A_POINTS) + (numB * B_POINTS)
                            + (numC * C_POINTS) + (numD * D_POINTS));
    }

    /**
     * Compute and return the grade point average ("GPA")
     * @return the GPA
     */
    public double computeGPA() {
        double gradePointAvg = (double) gradePoints / creditsAttempted;
        return gradePointAvg;
    }

    /**
     * Return a string containing all the data used to compute the GPA.
     * @return the GPA data
     */
    public String getData() {
        String data = "Credits attempted:\t" + creditsAttempted + "\n\n";
        data = data + "A's:\t" + numA + "\nB's:\t" + numB + "\nC's:\t" + numC
                + "\nD's:\t" + numD + "\nF's:\t" + numF + "\n\n";
        data = data + "Grade Points:\t" + gradePoints + "\n";
        return data;
    }
}

public class GPA_CalculatorTest {

    public static void main(String[] args) {
        // create obj with 5 classes taken, 3 A's, 2 B's, no C's or D's
        GPA_Calculator gpaCalc = new GPA_Calculator(5, 3, 2, 0, 0);

        System.out.println(gpaCalc.getData());

        double gpa = gpaCalc.computeGPA();

        System.out.println("Your GPA is:\t" + gpa);
    }
}