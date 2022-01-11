class ExceptionTryCatchFinally{
	public static void main(String[] args) {
		try{
			System.out.println("First statement"); //will be exicuted
			int a=10,b=0,c;
			c=a/b;

		}catch(ArithmeticException a){
			System.out.println("ArithmeticException Was Caught"); // will be executed as try block gives ArithmeticException

		}catch(ArrayIndexOutOfBoundsException b){
             System.out.println("ArrayIndexOutOfBoundsException Was Caught"); // Won't be executed as try block doesn't gives ArrayIndexOutOfBoundsException
		}finally{
			System.out.println("This is Finally block"); // Finally is always executed
		}
    System.out.println("Outside try block");// will be executed as exception was handled, if not it wont -> Abnormal Termination

	}
}