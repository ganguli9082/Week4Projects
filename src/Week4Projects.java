
    
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Week4Projects {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Trying to do the OOD way
		final double MAX_PTS= 500;
		
			
		
		
			ArrayList<Grade> Grades = new ArrayList<Grade>();
			
			
			Grades.add(new Grade(45,70));
			Grades.add(new Grade(45,75));
			Grades.add(new Grade(45,75));
			Grades.add(new Grade(45,75));
			double avg = 0;
			double sum = 0;
			double score = 0;
			int j = 1;
			Iterator<Grade> iterator = Grades.iterator();
			
			while(iterator.hasNext()) 
				{
				Grade a = iterator.next();
				System.out.print("Week" + j + "   Exam: " + a.getExam()+ "  ");
				System.out.println("Assignment: " + a.getAssignment());
				sum = sum + (a.getExam() + a.getAssignment());
				avg = sum/8;
				score = (sum/MAX_PTS*100);
				j++;
				}
			
			System.out.println("The Total is : " + sum);
			System.out.println("The average is: " + avg);
			System.out.println("Your uncurved grade is: " + score);
			
			int StudentGrade = (int) Math.round(score);
			
			
			
			switch (StudentGrade/10)
			{
			case 10:
				System.out.println("Your uncurved letter grade is: A+");
				break;
			case 9:
				System.out.println("Your uncurved letter grade is: A");
				break;
			case 8:
				System.out.println("Your uncurved letter grade is: B");
				break;
			case 7:			
				System.out.println("Your uncurved letter grade is: C");
				break;
			case 6:
				System.out.println("Your uncurved letter grade is: D");
				break;
			default:
				System.out.println("Your uncurved letter grade is: F");
			}
			
//Converts double avg to int
			
			int StudentAvg= (int) Math.round(avg);
			double ThisStudent = sum;
			double Student2 = 300;
			double Student3 = 100;
			double Student4 = 100;
			double Student5 = 300;
			double Student6 = 250;
			double Student7 = 490;
			double Student8 = 210;
			double Student9 = 290;
			double Student10 = 370;
			double ClassAvg = 0;
			
			
			ArrayList<FinalScore> FinalScores = new ArrayList<FinalScore>();
			FinalScores.add(new FinalScore(ThisStudent));
			FinalScores.add(new FinalScore(Student2));
			FinalScores.add(new FinalScore(Student3));
			FinalScores.add(new FinalScore(Student4));
			FinalScores.add(new FinalScore(Student5));
			FinalScores.add(new FinalScore(Student6));
			FinalScores.add(new FinalScore(Student7));
			FinalScores.add(new FinalScore(Student8));
			FinalScores.add(new FinalScore(Student9));
			FinalScores.add(new FinalScore(Student10));
			
			Iterator<FinalScore> itor = FinalScores.iterator();
			double MAX = 10;
			double SumFinal= 0;
			double sd = 0;
			double Stdev = 0;
			System.out.println("All students final scores");
			while(itor.hasNext()) 
				{
				FinalScore b = itor.next();
				System.out.println(b.getFinalScore());
				SumFinal = SumFinal + b.getFinalScore();
				ClassAvg = SumFinal/10;
				}
 
			//Couldn't figure out how to calculate Stdev from the ArrayList
			
			double FScores[]= {ThisStudent, Student2, Student3, Student4, Student5, Student6, Student7, Student8, Student9, Student10};
			for (int i = 0; i<FScores.length; i++)
			{
				sd += (Math.pow(FScores[i]-ClassAvg, 2))/FScores.length;	
			}
			Stdev = Math.sqrt(sd);
			
			System.out.println("The class average is: " + ClassAvg);
			System.out.println("The standard deviation is: " + Stdev);
			System.out.println("Student score is " + sum);
			String Curvegrade = null;
		
			int ClassAverage = (int) Math.round(ClassAvg);
			int StandardDev = (int) Math.round(Stdev);
			
			
			System.out.println("If class avg and <350 and Stdev<=50");
			System.out.println("A is " + (ClassAverage + (2*StandardDev)));
			System.out.println("B is " + (ClassAverage + StandardDev));
			System.out.println("C is " + ClassAverage);
			System.out.println("D is " + (ClassAverage - StandardDev));
			System.out.println("F is " + (ClassAverage - (2*StandardDev)));
			
			
			if (StandardDev <= 50 && ClassAverage <= 350) 
						{
							if (ThisStudent >= ClassAverage + (2*StandardDev)) 
							{
								Curvegrade = "A";
								System.out.println("Final score is " + Curvegrade);
							} 
							else if (ClassAverage + (2*StandardDev)> ThisStudent && ThisStudent >= ClassAverage + StandardDev)
							{
							Curvegrade = "B";
							System.out.println("Final score is " + Curvegrade);
							} 
							else if (ClassAverage + StandardDev > ThisStudent && ThisStudent>= ClassAverage) 
							{
							Curvegrade = "C";
							System.out.println("Final score is " + Curvegrade);
							} 
							else if (ClassAverage > ThisStudent && ThisStudent>= ClassAverage - StandardDev) 
							{
							Curvegrade = "D";
							System.out.println("Final score is " + Curvegrade);
							} 
							else if (ThisStudent < ClassAverage - (2*StandardDev))
							{
							Curvegrade = "F";
							System.out.println("Final score is " + Curvegrade);
							}
						}
					
						
			else
						{
						if (sum>= 450) 
							{
							Curvegrade = "A";
							System.out.println("Final score is " + Curvegrade);
							} 
						else if (450> sum && sum >= 400)
							{
							Curvegrade = "B";
							System.out.println("Final score is " + Curvegrade);
							} 
						else if (400 > sum && sum>= 350) 
							{
							Curvegrade = "C";
							System.out.println("Final score is " + Curvegrade);
							} 
						else if (350 > sum && sum>= 300) 
							{
							Curvegrade = "D";
							System.out.println("Final score is " + Curvegrade);
							} 
						else if (sum < 250)
							{
							Curvegrade = "F";
							System.out.println("Final score is " + Curvegrade);
							}
					}
			}

			
	
	
	
	}
