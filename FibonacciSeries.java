import java.util.Scanner;
public class FibonacciSeries
{
	public static long firstStep=0,secondStep=1,result=0;
	public static boolean zeroFlag=true,oneFlag=true;
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter integer value for series : ");
		int number =sc.nextInt();
		System.out.print("Series : ");
		getFibonacciSeries(number);
		System.out.println("\b ");
	}
	public static void getFibonacciSeries(int value)
	{
		if(zeroFlag)
		{
			System.out.print("0, ");
			zeroFlag=false;
			getFibonacciSeries(value-1);
		}else if(oneFlag)
		{
			System.out.print("1, ");
			oneFlag=false;
			getFibonacciSeries(value-1);
		}else if(value>0)
		{
			result=firstStep+secondStep;
			firstStep=secondStep;
			secondStep=result;
			System.out.print(result+", ");
			getFibonacciSeries(value-1);
		}
	}
}