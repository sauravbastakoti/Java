class ExceptionThrow{
	public static int divide(int y,int z) throws ArithmeticException{
		int result = y/z;
		return result;
	}
	public static void main(String[] args) {
		int a=20, b=0,c;
		c=divide(a,b);
		System.out.println(c);
	}
}