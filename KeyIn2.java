import java.util.Scanner; 
class KeyIn2 
{
	public static void main(String[] args) 
	{   Scanner in = new Scanner(System.in);  
	    
	    int a, b, c;

		System.out.print("정수 입력 : " ); 
		a = in.nextInt();      
		System.out.print("정수 입력 : " );
		b = in.nextInt();

		c = a + b;

		System.out.println(c); 
	}
}