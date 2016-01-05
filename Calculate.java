public class Calculate {
	
	public static void main(String[] args){
		System.out.println("Calculate...");
		int first = Integer.valueOf(args[0]);
		int second = Integer.valueOf(args[1]);
		System.out.println("Sum="+(first+second));
		System.out.println("Difference="+(first-second));
		System.out.println("Multiplication="+(first*second));
		System.out.println("Division="+(first/second));
		int pow = second;
		for(int i=1; i<first;i++){
			pow *= second;
		}
		System.out.println("Exponentiation second^first="+pow);
		
		double third = Double.valueOf(args[2]);
		double four = Double.valueOf(args[3]);
		System.out.println("Sum="+(third+four));
		System.out.println("Difference="+(third-four));
		System.out.println("Multiplication="+(third*four));
		System.out.println("Division="+(third/four));
		double pow2 = four;
		for(int i=1; i<(int)third;i++){
			pow2 *= four;
		}
		System.out.println("Exponentiation four^third="+pow2);
	}
	
}