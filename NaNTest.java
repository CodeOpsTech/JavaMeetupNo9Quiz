class NaNTest {
public static void main(String []s) {
			double d = getVal();
			if(d == Double.NaN) 						
       System.out.println("d is NaN");
}
     private static double getVal() {
      		return Double.NaN;
     }
}

