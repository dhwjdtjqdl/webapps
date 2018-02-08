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
	두 정수의 합을 구하는 메소드
	@param i 합을 구할 첫번쨰 정수형 인자
	@param j 합을 구할 두번째 정수형 인자
	@return 두 정수의 합을 리턴
	*/
	public static int sum(int i, int j) 
	{
		return i+j;
	}
	/**
	두 정수의 차을 구하는 메소드
	@param i 차을 구할 첫번쨰 정수형 인자
	@param j 차을 구할 두번째 정수형 인자
	@return 두 정수의 차을 리턴
	*/
		public static int sub(int i, int j) 
	{
		return i-j;
	}
	/**
	두 정수의 곱을 구하는 메소드
	@param i 곱을 구할 첫번쨰 정수형 인자
	@param j 곱을 구할 두번째 정수형 인자
	@return 두 정수의 곱을 리턴
	*/
	public static int multiply(int i, int j)
		{
		return i*j;
}
	/**
	두 정수의 나누기을 구하는 메소드
	@param i 나누기을 구할 첫번쨰 정수형 인자
	@param j 나누기을 구할 두번째 정수형 인자
	@return 두 정수의 나누기을 리턴
	*/
	public static int divde(int i, int j)
		{
		return i/j;
}
}