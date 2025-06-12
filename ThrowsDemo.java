class ThrowsDemo
{
	 void myMethod(int num)throws ArithmeticException, NullPointerException
	 {
		 if(num==1)
			throw new ArithmeticException("ArithmeticException Occurred");
		 else
			throw new NullPointerException("NullPointerException Occurred");
	 }
	 public static void main(String args[])
	 {
		 try
		 {
			 ThrowsDemo obj=new ThrowsDemo();
			 obj.myMethod(1);
		 }
		 catch(Exception e)
		 {
			System.out.println(e);
		 }
	 }
} 