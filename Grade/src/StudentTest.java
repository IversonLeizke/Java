import javax.swing.JOptionPane;

public class StudentTest {

	public static void main(String[] args) {
		
		int counter = 0;
		
		while (counter == 0) {
			
			String name = JOptionPane.showInputDialog(null, "Please insert the stundet name?");
			double average = 
					Double.parseDouble(JOptionPane.showInputDialog(null, "What is the student average?"));
			
			Student student1 = new Student(name, average);
			
			student1.showGrade();
			
			counter = JOptionPane.showConfirmDialog(null, "Do you want to keep going?");
		}
	}
}
