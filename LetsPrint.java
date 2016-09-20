
public class LetsPrint {

	// Prints let us code in java
	// cerner_2^5_2016

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String literal = "6c657420757320636f646520696e206a617661";

		StringBuilder output = new StringBuilder("");
		for (int i = 0; i < literal.length(); i += 2) {
			String str = literal.substring(i, i + 2);
			output.append((char) Integer.parseInt(str, 16));
		}
		System.out.println(output.toString());
	}

}
