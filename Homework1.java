import java.util.Scanner; 
class Homework1 
{
	public static void main(String[] args) 
	{   Scanner in = new Scanner(System.in);  
	    
	    int a, b, c;

		System.out.print("정수 입력 : " ); 
		a = in.nextInt();      
		System.out.print("정수 입력 : " );
		b = in.nextInt();
		System.out.print("정수 입력 : " );
		c = in.nextInt();
		
		if(a > b)
		{
			if(a > c)
			{
				System.out.println(a);
			}
			else 
			{
				System.out.println(c);
			}
		}
		
		else
		{
			if(b > c)
			{
				System.out.println(b);

			}
			else
			{
				System.out.println(c);
			}
		}
	}
}