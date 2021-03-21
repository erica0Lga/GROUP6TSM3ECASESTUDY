public class StudentInformation
{
	private String Fname;
	private String Mname;

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
}
