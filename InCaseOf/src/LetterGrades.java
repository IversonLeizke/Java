import java.util.Scanner;

public class LetterGrades {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int total = 0;
		int gradeCounter = 0;
		int aCount = 0;
		int bCount = 0;
		int cCount = 0;
		int dCount = 0;
		int eCount = 0;
		int fCount = 0;
		
		System.out.printf("%s%n%s%n%s%n",
				"Enter the integer grades in the range 0-100.",
				"Type the end-of-file indicator to terminate input:",
				"On windows type <CTRL> z then press ENTER.");
		
		while (input.hasNext()) {
			int grade = input.nextInt();
			total += grade;
			++gradeCounter;
			
			switch (grade /10) {
				case 9:
				case 10:
					++aCount;
					break;
				case 8:
					++bCount;
					break;
				case 7:
					++cCount;
					break;
				case 6:
					++dCount;
					break;
				case 5:
					++eCount;
					break;
				default:
					++fCount;
					break;		
			}
		}
		
		System.out.printf("%nGrade Report:%n");
		
		if (gradeCounter != 0) {
			
			double average = (double) total / gradeCounter;
			
			System.out.printf("Total of the %d grades entered is %d%n", gradeCounter, total);
			System.out.printf("Class average is %.2f%n", average);
			System.out.printf("%s%n%s%d%n%s%d%n%s%d%n%s%d%n%s%d%n%s%d%n", 
					"Number of the students who received each grade:",
					"A: ", aCount,
					"B: ", bCount,
					"C: ", cCount,
					"D: ", dCount,
					"E: ", eCount,
					"F: ", fCount);
		}
		else
			System.out.println("No grades were entered!");
	}
}