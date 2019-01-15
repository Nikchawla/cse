class Month
{
	public static void main(String args[])
	{
	int n = Integer.parseInt(args[0]);
	int year = n/525600;
    int day = n/1440;
    int months = n%525600;
    System.out.println("year is"+year + "day is" +day + "months is"+months);

	}
}