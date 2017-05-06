class Base {
	public void aMethod(int args) {
		System.out.println("Called Base.method with value " + args); 
	}
}
class Derived extends Base {
	public void aMethod(long args) {
		System.out.println("Called Derived.method with value " + args); 
	}
}
class Overriding1 {
	public static void main(String []args) {
		Base b = new Derived(); 
		b.aMethod(10); 
	}
}
