class OwnException{
	public static void main(String[] args) {
		
		try {
			test(5);
		}catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}

	}

	public static void test(int a)
	{
		if (a < 18) {
			throw new ArithmeticException("Not eligible to vote");
		}
		System.out.println("Inside test");
	}

}