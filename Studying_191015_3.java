import java.util.Scanner;
class Studying_191015_3 
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		int kor, number;
		double result;

		double usdNum = 1186.40;
		double jpyNum = 1096.23;
		double eurNum = 1306.52;

		double usd = 1 / usdNum;
		double jpy = 100 / jpyNum;
		double eur = 1 / eurNum;

		System.out.print("�� ���� �ݾ� �Է� : ");
		kor = in.nextInt();
		if(kor <0)
		{
			System.out.println("������ �Է��߽��ϴ�. ���α׷��� �����մϴ�.");
			return;
		}
		System.out.print("ȯ���� ȭ��(1: �޷�, 2: ��ȭ, 3:����): ");
		number = in.nextInt();
		if(number < 1 || number > 3)
		{
			System.out.println("1~3�� �ƴ� ���� �Է��߽��ϴ�. ���α׷��� �����մϴ�.");
			return;
		}
		switch(number)
		{
			case 1 :
				result = kor * usd;
				System.out.printf("%d���� %.2f�޷��Դϴ�.\n", kor, result);
				break;
			case 2 :
				result = kor * jpy;
				System.out.printf("%d���� %.2f���Դϴ�.\n", kor, result);
				break;
			case 3 :
				result = kor * eur;
				System.out.printf("%d���� %.2f�����Դϴ�.\n", kor, result);
				break;
		}
	}
}