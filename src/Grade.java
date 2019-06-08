
public class Grade {
	private double exam;
	private double assignment;
	
	public Grade(double exam, double assignment) 
	{
		this.exam = exam;
		this.assignment = assignment;
	}
	
	public double getSum()
	{
		return exam + assignment;
	}
	public double getAverage() {
		return getSum()/2;
	}
	public double getExam() 
	{
		return exam;
	}
	
	public void setExam(double exam) 
	{
		exam = exam;
	}
	public double getAssignment() {
		return assignment;
	}
	public void setAssignment(double assignment) {
		assignment = assignment;
	}
	Grade [] grades = new Grade[4];
}
