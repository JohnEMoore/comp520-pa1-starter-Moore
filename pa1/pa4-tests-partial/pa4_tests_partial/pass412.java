/**
 * COMP 520
 * Complex method invocation
 */
class MainClass {
   public static void main (String [] args) {

      FirstClass f = new FirstClass ();
      f.s = new SecondClass ();
      f.s.f = f;

      f.testme ();
   }
}

class FirstClass
{
   int n;
   SecondClass s;

   public void testme ()
   {
      int tstvar = 1;

      n = 4;
      tstvar = 1 + foo (3, 4);
      System.out.println(37 + tstvar);
	  System.out.println(tstvar + 38);
   }

   public int foo (int x, int y)
   {
      return (n + x + y);
   }

}

class SecondClass
{
   int n;
   FirstClass f;
}

