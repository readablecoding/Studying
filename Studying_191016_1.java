class Studying_191016_1 
{
	public static void main(String[] args) 
	{
		//0 1 2 3 4
		for(int i = 0; i < 5; i++)
		{
			System.out.print(i + " ");
			
		}
		System.out.println();

		// 1 2 3 4 5
		for(int i = 1; i <= 5; i++)
		{
			System.out.print(i + " ");
			
		}
		System.out.println();

		// 5 4 3 2 1
		for(int i = 5; i > 0; i--)
		{
			System.out.print(i + " ");
		}
		System.out.println();

		// 10 20 30 40 50
		for(int i = 10; i <= 50; i += 10)
		{
			System.out.print(i + " ");
		}
		System.out.println();

		/// 1 3 5 7 9 -> 1번째 방법
		for(int i = 1; i <= 10; i+=2)
		{
			System.out.print(i + " ");
		}
		System.out.println();
		
		/// 1 3 5 7 9 -> 2번째 방법
		for(int i = 1; i < 10; i++)
		{
			if(i % 2 == 1)
			{
				System.out.print(i + " ");
			}
		}
		System.out.println();

		//1 2 3 4 6 7 8 9 -> 1번째 방법
		for(int i = 1; i < 10; i++)
		{
			if(i != 5)
			{
				System.out.print(i + " ");
			}
		}
		System.out.println();

		//1 2 3 4 6 7 8 9 -> 1번째 방법
		for(int i = 1; i < 10; i++)
		{
			if(i == 5)
			{
				continue;
			}
			System.out.print(i + " ");
		}
		System.out.println();
		
		//1 10 100 1000 10000
		for(int i = 1; i <= 10000; i *=10)
		{
			System.out.print(i + " ");
		}
		System.out.println();

		// continue, break, return, System.exit(0); 활용법
		for(int i = 1; i < 10; i++)
		{
			if(i == 5)
			{
				continue;			// 실행하지 않고 바로 조건문으로 가서 다음 것을 실행
				//break;			// 반복문을 벗어난다.
				//return;			// 메서드를 종료한다.
				//System.exit(0);	// 프로그램을 종료한다.
			}
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println();

		// 1+2+3+4+5+6+7+8+9+10의 합계
		int sum = 0;
		for(int i = 1; i <= 10; i++)
		{
			sum = sum + i;
		}
		System.out.println("합계 : " + sum);

		// 1 ~ 100 중에서 홀수의 합계 -> 1번째 방법
		sum = 0;
		for(int i = 1; i <= 100; i+=2)
		{
			sum = sum + i;
		}
		System.out.println("합계 : " + sum);

		// 1 ~ 100 중에서 홀수의 합계 -> 2번째 방법
		sum = 0;
		for(int i = 1; i <= 100; i++)
		{	
			if(i % 2 == 1)
			{
				sum = sum + i;
			}
		}
		System.out.println("합계 : " + sum);
		
		// 1 ~ 100 중에서 홀수의 합계 -> 3번째 방법
		sum = 0;
		for(int i = 1; i <= 100; i++)
		{	
			if(i % 2 == 0)
			{
				continue;
			}
			sum = sum + i;
		}
		System.out.println("합계 : " + sum);


		// 1 ~ 100 중에서 3의 배수이거나 5의 배수인 수의 합계 -> 1번째 방법
		sum = 0;
		for(int i = 1; i <= 100; i++)
		{
			if(i % 3 == 0 || i % 5 == 0)
			{
				sum = sum + i;
			}
		}
		System.out.println("합계 : " + sum);

		// 1 ~ 100 중에서 3의 배수이거나 5의 배수인 수의 합계 -> 1번째 방법
		sum = 0;
		for(int i = 1; i <= 100; i++)
		{
			if(i % 3 != 0 && i % 5 != 0)
			{
				continue;
			}
				sum = sum + i;
		}
		System.out.println("합계 : " + sum);

		// 1부터 정수들의 합계를 구하는데, 합계가 4000이 넘는 순간의 숫자는? -> 1번째 방법
		sum = 0;
		for(int i = 1; ; i++)
		{
			sum = sum + i;
			if(sum > 4000)
			{
				System.out.println("4000이 넘을 때의 숫자는 " + i + "입니다.");
				break;
			}
		}
		System.out.println("합계 : " + sum);

		// 1부터 정수들의 합계를 구하는데, 합계가 4000이 넘는 순간의 숫자는? -> 2번째 방법
		int n = 1;
		sum = 0;
		for(; sum < 4000; n++)
		{
			sum = sum + n;
		}
		System.out.println(n-1 + "번째 숫자입니다.");
		System.out.println();

		// 22부터 122까지 유니코드 표 출력, 한 줄에 5개씩만. 예) 22: ?, 23: ?, 24 : ?
		int cnt = 0; // 줄을 세어주기 위한 용도로 변수 cnt를 설정함
		for(int ch = 22; ch <= 122; ch++)
		{
			System.out.print(ch + ": " + (char)ch + ", "); 
			//큰 자료형을 작은 자료형으로 바꿔주는 강제형변환을 시행한다. (char)ch -> int(4바이트)에서 char(2바이트)로
			cnt++;
			if(cnt % 5 == 0) //5개만을 한 줄로 나타내기 위해 5의 배수인지를 알아본다.
			{
				System.out.println(); // 5의 배수라면 다음줄로 자리 옮김
			}
		}
		System.out.println();
		System.out.println();


		// 0부터 150까지 유니코드 표 출력, 한 줄에 4개씩만. 예) 0: ?, 1: ?, 2 : ?
		int cnt1 = 0;
		for(int num = 0; num <= 150; num++)
		{
			System.out.print(num + ": " + (char)num + ", "); // 숫자와 해당 유니코드 값 보여줌
			cnt1++;
			if(cnt1 % 4 == 0)		// 4개가 한 줄에 있어야 하므로 나머지가 0이 되면 다음 줄로 이동			
			{	
				System.out.println();
			}
		}
		System.out.println();
		int line = cnt1 / 4;
		System.out.println("총 " + line + "줄의 자료가 나왔습니다."); // 자료 길이를 보여줌
		
	}
}
