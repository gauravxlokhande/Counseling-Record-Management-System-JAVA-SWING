package collegeapplication.student;

import collegeapplication.subject.Subject;

/* Made by : Gaurav Lokhande
 * Mail : gaurravlokhande@gmail.com
 * linkedin : https://www.linkedin.com/in/gauravlokhande
 * github : https://github.com/gaurravlokhande
 * Title : Marks.java
 * Purpose : Binding all the data related to marks
 */

public class Marks extends Subject
{
	
	private int sr_no;
	private String studentname;
	private long rollnumber;
	private int theorymarks=0;
	private int practicalmarks=0;
	
	public void setSrNo(int sr_no)
	{
		this.sr_no=sr_no;
	}
	public void setTheoryMarks(int theorymarks)
	{
		this.theorymarks=theorymarks;
	}
	public void setPracticalMarks(int practicalmarks)
	{
		this.practicalmarks=practicalmarks;
	}
	public void setStudentName(String studentname)
	{
		this.studentname=studentname;
	}
	public void setRollNumber(long rollnumber)
	{
		this.rollnumber=rollnumber;
	}
	public String getStudentName()
	{
		return studentname;
	}
	public long getRollNumber()
	{
		return rollnumber;
	}
	public int getTheoryMarks()
	{
		return  theorymarks;
	}
	public int getPracticalMarks()
	{
		return practicalmarks;
	}
	public int getSrNo()
	{
		return sr_no;
	}
	
}
