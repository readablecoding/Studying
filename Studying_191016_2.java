class Studying_191016_2 
{
	public static void main(String[] args) 
	{
		int cnt = 0;
		for(int i = 0; i < 10; i++) // x��ǥ �� ����(0 ~ 9 ����)
		{
			for(int j = 0; j < 10; j++) // y��ǥ �� ����(0 ~ 9 ����)
			{
				System.out.print("(" + i + " , " + j + ")"); // ��ķ� ��Ÿ��
				cnt++;
				if(cnt % 10 == 0) 
				{
					System.out.println(); // x��ǥ�� 1���� ������ ������ ���ο� �ٷ� ��Ÿ��
				}
				
			}	
		}
		System.out.println();
		
	}
}