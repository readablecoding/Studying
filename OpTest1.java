class OpTest1 
{
	public static void main(String[] args) 
	{
		int a, b, c;
		a = 10;
		b = 3;
		c = a + b;       // a+b�� �� ���� c�� ����
		c = a + b * 2;   //*�� +���� �켱������ ����
		c = (a + b) * 2; // ��ȣ ���� ������ ���� �̷���
		c = a % b;       //a�� b�� ���� �������� c�� ����
		System.out.println("c = " + c); 

		a = c = 0;
		System.out.println("a = " + a + ", c = " +c);
		++a;       // a�� 1�� ����
		System.out.println("a = " + a + ", c = " +c);
		a++;       // a�� 1�� ����
		System.out. println("a = " + a + ", c = " +c);
		c = ++a;   // a�� 1�� ���ϰ� �� ���� c�� ����
		System.out.println("a = " + a + ", c = " +c);
		c = a++;   // a�� ���� ���� c�� �ְ� �� ������ a�� ���� 1 ������Ŵ
		System.out.println("a = " + a + ", c = " +c);

		a = 1;
		b = 2;

        boolean res;
		res = a > b;
		System.out.println("a = " + a + ", b = " + b + ", res = " + res);
		res = a * 2 > 10;
		System.out.println("a = " + a + ", b = " + b + ", res = " + res);
		res = ((a * 2) > 10);
		System.out.println("a = " + a + ", b = " + b + ", res = " + res);

		// a�� ���� �����ΰ�?
		res = a > 0;
		System.out.println("a = " + a + ", b = " + b + ", res = " + res);
		// a�� ¦���ΰ�?
		res = a % 2 == 0;
		
	    // a�� Ȧ���ΰ�? -> 2���� ����� ������. �������� 1�̰ų�, �������� 0�� �ƴϰų�
		res = a % 2 == 1;
		
		res = a % 2 != 0;
		
		// a�� 3�� ����ΰ�?
		res = a % 3 == 0;
		
		// a�� b ��� ���� �����ΰ�?  -> a�� 0���� ũ��, b�� 0���� ũ��
	    res = a > 0 && b > 0;
		
		// a �Ǵ� b �߿� ¦���� �ִ°�? 
		res = a % 2 == 0 || b % 2 == 0;
		
		//a�� 1 ~ 5 �������� �ִ°�? -> and�� �Ἥ �ذ�, ||�� ���� ������ ����
		res = a >= 1 && a <= 5;

		//a�� 1 ~ 5 ���� �ۿ� �ִ°�?
	    res = !(a >= 1 && a <= 5);  // !���̱�
		res = a < 1 || a < 5;       // || ���̱�

		a = 3;
		b = 1;
		c = a & b;    // ��� 1�̸� 1�̰� �ϳ��� 1�� �ƴϸ� 0
		c = a | b;    // �ϳ��� 1�̸� 1�̰� �ƴϸ� 0
		c = a ^ b;    // �� �� ������ 0, �ϳ��� �ٸ��� 1
		c = ~ a;      // 1�� 0����, 0�� 1��
		c = ~ b;      // 1�� 0����, 0�� 1��
		System.out.println(c);

		a = -1;
		b = 1;
		res = ++a > 0 & ++b > 0; 
	    System.out.println("a = " + a + ", b = " + b + ", res = " + res);

		a = a + 1;
		a += 1;
		++a;

		c = a > b ? a : (b + 1);
		//c = (a > b ? a : b) + 1; �� ���� ���� 1�� ���ϴ� ��
		//c = a;
		//c = b;
		System.out.println(c);

		a = 1, b = 1;

		

	}
}