public class StudentInformation
{
	private String Fname;
	private String Mname;
	private String Lname;
	private String bDate;
	
  public void getFname(String Fname)
    {
        this.Fname = Fname;
    }
 
    public String showFname()
    {
        return Fname;
    }
    
    public void getMname(String Mname)
    {
        this.Mname = Mname;
    }
 
    public String showMname()
    {
        return Mname;
    }
	public void getLname(String Lname)
    {
        this.Lname = Lname;
    }
 
    public String showLname()
    {
        return Lname;
    }
    public void getBDate(String bDate)
    {
        this.bDate = bDate;
    }
	public String showBDate()
    {
        return bDate;
    }
}
