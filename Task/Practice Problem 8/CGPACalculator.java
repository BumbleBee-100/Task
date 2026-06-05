public class CGPACalculator{
    public static void main(String[] args){
        String[] sub={"Math","Physics","OOP","DSA","English"};
        double[] credits={3.0,3.0,3.0,3.0,2.0};
        double[][] gp={
            {4.0,3.7,4.0,3.3,4.0},
            {3.3,3.0,3.7,4.0,3.7},
            {2.7,3.3,3.0,3.7,3.0},
            {4.0,4.0,3.7,3.3,4.0},
            {3.0,2.7,3.3,3.0,3.3}
        };
        for(int i=0;i<gp.length;i++){
            double weightedSum=0,totalCredits=0;
            for(int j=0;j<sub.length;j++){
                weightedSum+=gp[i][j]*credits[j];
                totalCredits+=credits[j];
            }
            System.out.printf("Student %d CGPA: %.2f%n",i+1,weightedSum/totalCredits);
        }
    }
}