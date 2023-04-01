
public class Cadeias {

	public static void main(String[] args) {
		
		String s1 = "Generation Brasil";
		String s2 = "GENERATION BRASIL";
		String s3 = "Generation Brasil";
		
		System.out.println(s1 == s2);
		
		System.out.println(s1.equals(s3));
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));
		
	}

}
