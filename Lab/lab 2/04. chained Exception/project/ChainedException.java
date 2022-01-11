public class ChainedException 
{
    public static void main (String args[]) throws Exception
     { 
        int num = 20, r = 0;
        try { 
            r = num/0;
            System.out.println("The result is "+r);
             } catch(ArithmeticException error1) { 
            System.out.println ("Arithmetic exception occoured: "+error1);
            try { 
                throw new NumberFormatException();
            } catch(NumberFormatException error2) {
                System.out.println ("Chained exception thrown manually : "+error2);
            }
        }
    }
}