	public class calculator{
	public static void main(String[] args){
	int i;
	int j;
	char a;
	String b;
	final int TEN = 10;
	i = 1;
	j = sum(i, TEN);
	a = '?';
	b= "Hello";
	java.lang.System.out.println(a);
	System.out.println(b);
	System.out.println(TEN);
	System.out.println(j);
	}
	/**
	�� ������ ���� ���ϴ� �޼ҵ�
	@param i ���� ���� ù���� ������ ����
	@param j ���� ���� �ι�° ������ ����
	@return �� ������ ���� ����
	*/
	public static int sum(int i, int j) 
	{
		return i+j;
	}
	/**
	�� ������ ���� ���ϴ� �޼ҵ�
	@param i ���� ���� ù���� ������ ����
	@param j ���� ���� �ι�° ������ ����
	@return �� ������ ���� ����
	*/
		public static int sub(int i, int j) 
	{
		return i-j;
	}
	/**
	�� ������ ���� ���ϴ� �޼ҵ�
	@param i ���� ���� ù���� ������ ����
	@param j ���� ���� �ι�° ������ ����
	@return �� ������ ���� ����
	*/
	public static int multiply(int i, int j)
		{
		return i*j;
}
	/**
	�� ������ �������� ���ϴ� �޼ҵ�
	@param i �������� ���� ù���� ������ ����
	@param j �������� ���� �ι�° ������ ����
	@return �� ������ �������� ����
	*/
	public static int divde(int i, int j)
		{
		return i/j;
}
}