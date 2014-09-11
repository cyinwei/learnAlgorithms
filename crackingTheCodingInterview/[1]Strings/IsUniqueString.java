/* 	
	1.1 
	Implement an algorithm to determine if a string has all unique numbers.
	What if you cannot use any additional data structures?
*/

public class IsUniqueString {
	public static boolean IsUniqueStringWithArray(String s)
	{
		String unique = "";
		unique += s.charAt(0);
		for (int i = 1; i < s.length(); i++) {
			for (int j = 0; j < unique.length(); j++) {
				if (unique.charAt(j) == s.charAt(i)) return false;
			}
			unique += s.charAt(i);
		}
		return true;
	}

	public static void main(String[] args) {
		if (args.length != 0) {
			System.out.println("With string" + args[0] + ", ");
			System.out.println(IsUniqueStringWithArray(args[0]));
		}
		else {
			System.out.println("With string boolean, ");
			System.out.println(IsUniqueStringWithArray("boolean"));		
		}
	}	
}