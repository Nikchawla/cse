class Student
{
	private string firstname;
	private string lastname;
	private string address;
	private int dateofbirth;
	private string[] skills;
    private Qualification[] qual;
    Project[] projects;
    private string email;
    private int contactno;

    public student(string fn,string ln,string addr,int dob,int dob)
    {
    firstname=fn;
    lastname=ln;
    address=addr;
    dateofbirth=dob;
    contactno=cn;

    }
    public void Displaydata()
    {
    System.out.print(fn);
    System.out.print(ln);
    System.out.print(addr);
    System.out.print(dob);
    System.out.print(cn);
    }

}

class StudentDriver
{
	public static void main(String args[])
	{
	System.out.print("enter details of stident");
	Scanner s=new Scanner(System.in);
	String firstname=scan.nextline();
	String lastname=scan.nextline();
	String address=scan.nextline();
	String dateofbirth=scan.nextline();
	String contactno=scan.nextline();
	}
}