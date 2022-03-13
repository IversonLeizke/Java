import javax.swing.JOptionPane;

public class Student {

	private String name;
	private double average;
	private String letterGrade;
	
	public Student(String name, double average) {
		this.name = name;
		this.average = average;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setAverage(double average) {
		this.average = average;
	}
	
	public double getAverage() {
		return average;
	}
	
	public String getLetterGrade() {
	
	if (average >= 90.0)
		this.letterGrade = "A";
	else if (average >= 80.0)
		this.letterGrade = "B";
	else if (average >= 70.0)
		this.letterGrade = "C";
	else if (average >= 60.0)
		this.letterGrade = "D";
	else if (average >= 50.0)
		this.letterGrade = "E";
	else
		this.letterGrade = "F";
	
	return letterGrade;
	}	
	
	public void showGrade(){
		this.getLetterGrade();
		String showGrade =
				String.format("%s's grade is %s.%n", name, letterGrade);
		JOptionPane.showMessageDialog(null, showGrade);
	}
}
