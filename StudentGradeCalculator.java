import java.util.Scanner;

public class StudentGradeCalculator {
    public static void calculate() {
        Scanner sc = new Scanner(System.in);

        int mth, phy, chm, bio, eng, total, average;

        char grade;

        String remark = "";
        System.out.println("Enter marks \n");
        System.out.println("English ");
        eng = sc.nextInt();
        System.out.println("Mathematics ");
        mth = sc.nextInt();
        System.out.println("Physics ");
        phy = sc.nextInt();
        System.out.println("Chemistry ");
        chm = sc.nextInt();
        System.out.println("Biology ");
        bio = sc.nextInt();
        
        total = mth + phy + chm + bio + eng;
        average = total / 5;
        if (average > 90) {
            grade = 'O';
        } else if (average >= 81) {
            grade = 'A';
        } else if (average >= 71) {
            grade = 'B';
        } else if (average >= 61) {
            grade = 'C';
        } else if (average >= 51) {
            grade = 'D';
        } else if (average >= 40) {
            grade = 'E';
        } else {
            grade = 'F';
        }

        switch (grade) {
            case 'O':
                remark = "Excellent";
                System.out.println("-------------------------");
                System.out.println(remark + "\nTotal Marks: " + total + "\nAverage Percentage: " + average + "%" + "\nGrade: " + grade);
                System.out.println("-------------------------");
                break;
            case 'A':
                remark = "Better";
                System.out.println("-------------------------");
                System.out.println(remark + "\nTotal Marks: " + total + "\nAverage Percentage: " + average + "%" + "\nGrade: " + grade);
                System.out.println("-------------------------");

                break;
            case 'B':
                remark = "Good";
                System.out.println("-------------------------");
                System.out.println(remark + "\nTotal Marks: " + total + "\nAverage Percentage: " + average + "%" + "\nGrade: " + grade);
                System.out.println("-------------------------");
                break;
            case 'C':
                remark = "Can do better";
                System.out.println("-------------------------");
                System.out.println(remark + "\nTotal Marks: " + total + "\nAverage Percentage: " + average + "%" + "\nGrade: " + grade);
                System.out.println("-------------------------");
                break;
            case 'D':
                remark = "Need to Study";
                System.out.println("-------------------------");
                System.out.println(remark + "\nTotal Marks: " + total + "\nAverage Percentage: " + average + "%" + "\nGrade: " + grade);
                System.out.println("-------------------------");
                break;
            case 'E':
                remark = "Very poor grades";
                System.out.println("-------------------------");
                System.out.println(remark + "\nTotal Marks: " + total + "\nAverage Percentage: " + average + "%" + "\nGrade: " + grade);
                System.out.println("-------------------------");
                break;
            case 'F':
                remark = "Failed";
                System.out.println("-------------------------");
                System.out.println(remark + "\nTotal Marks: " + total + "\nAverage Percentage: " + average + "%" + "\nGrade: " + grade);
                System.out.println("-------------------------");
                break;
            default:
                System.out.println(remark);
        }
    }

    public static void main(String[] args) {
        calculate();
    }


}
