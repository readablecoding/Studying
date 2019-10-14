import java.util.Scanner; 
class IfTest1 
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);  
	    int n;

		System.out.print("정수 입력 (0 ~ 100점) : " ); 
		n = in.nextInt(); 
		
		/*
		90점 이상 수
		80점 이상 우
		70점 이상 미
		60점 이상 양
		그 밑으로는 가
		*/

		if(n > 100 || n < 0)
		{
			System.out.println("잘못 입력햇습니다."); // 에러 처리 위함
		}
		else
		{
			if(n >= 90)
            {  
			System.out.println("수");
		    }
		    else if(n >= 80)
		    {
			System.out.println("우");  
		    }
		    else if(n >= 70)
		    {
			System.out.println("미");  
		    }
		    else if(n >= 60)
		    {
			System.out.println("양");  
		    }
			else
			{
			System.out.println("가"); // 0점부터 59점까지
			}

		}

	}
}
