class Base {
	public Base() {
  		foo();
	}        
	public void foo() {
 		System.out.println("In Base's foo ");
	}
}
	
class Derived extends Base {
	public Derived() {
 		i = new Integer(10);
	}
	public void foo() {
 		System.out.println("In Derived's foo " + i.toString());
	}
 	private Integer i; 
}

class Test { 
	public static void main(String [] s) {
   		new Derived().foo();
	}
}
