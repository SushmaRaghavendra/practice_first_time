 /*Write a Program that accepts two Strings as command line arguments and generate the output in a specific way as given below.

Example:

If the two command line arguments are Wipro and Bangalore then the output generated should be Wipro Technologies Bangalore.

If the command line arguments are ABC and Mumbai then the output generated should be ABC Technologies Mumbai 

[Note: It is mandatory to pass two arguments in command line] */



public class question1
{
	public static void main(String args[])
	{
		String x=args[0];
		String y=args[1];
		
		System.out.println(x+" Technologies "+y);
	
		
	}
}