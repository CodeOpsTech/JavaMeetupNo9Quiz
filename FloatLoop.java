class FloatLoop {
	public static void main(String ...args) {
		int i = 1;
		for(float f = 0.1F; f != 1.0F; f += 0.1F)
			System.out.printf("i = %d \n", i++);
		System.out.printf("Done..."); 
	}
}
