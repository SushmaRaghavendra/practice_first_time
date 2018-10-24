/* Write a Program to accept two integers through the command line 
argument and print the sum of the two numbers

Example:

     C:\>java Sample 10 20

     O/P Expected : The sum of 10 and 20 is 30
	 
*/

class question3{
	public static void main(String args[]){
		int x=Integer.parseInt(args[0]);
		int y=Integer.parseInt(args[1]);
		int z=x+y;
		System.out.println("The sum of "+x+" and "+y+" is "+z);
}}