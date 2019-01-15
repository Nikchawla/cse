import java.util.*;
class Date
{
	private int month;
	private int day;
	private int year;

    public Date(int month,int day,int year)
    {
    this.month =month;
    this.day=day;
    this.year=year;
    }
    public void setMonth(int month)
    {
    if(month>=1 && month <=12)
    {this.month =month;
    }
    else{
    System.out.print("Invalid month") 
    }
    }
    public int getmonth() 
    {
    return month;
    }
    public void setday(int day)
    {
    if(day>=1 && day<=31)
    {
    this.day =day;
    }
    else
    {
    System.out.println("Invalid day");
    }
    }
    public int getYear()
    {
    	return day;
    }
    public void setYear(int year)
    {
    	if(year>=1900 && year <=2100)
    	{
    		this.year =year;
    	}
    }
    public int getyear()
    {
    	return year;
    }
    public void displayDate()
    {
    	System.out.println("result is" +day +/ +month +/ +year);                                                                                       

    }
}