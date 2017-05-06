import java.util.function.*;

class Lambda {
	public static void main(String []args) {
		Supplier<String> s = () -> "hello world";
		System.out.println(s.get());
	}
}
