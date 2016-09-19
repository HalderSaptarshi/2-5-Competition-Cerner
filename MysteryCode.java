import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.InputStreamReader;
import java.net.URL;

//Prints Cerner : Extracts the html source from the link "https://my.cerner.com/" and fetches the word cerner from the html source bytes.
//cerner_2^5_2016

public class MysteryCode {

	public static void main(String[] unused) throws Exception {
		ByteArrayOutputStream stoned = new ByteArrayOutputStream(20480);
		int[] magic = { 104, 116, 116, 112, 115, 58, 47, 47, 109, 121, 46, 99, 101, 114, 110, 101, 114, 46, 99, 111,109, 47 };
		for (int weird : magic) {stoned.write(weird);}
		BufferedReader in = new BufferedReader(new InputStreamReader(new URL(stoned.toString()).openConnection().getInputStream(), "UTF-8"));
		StringBuilder a = new StringBuilder();
		String inputLine;
		while ((inputLine = in.readLine()) != null) { a.append(inputLine);}
		in.close();
		int unknown = 0;
		for (int strange : a.toString().getBytes()) {
			if (unknown == 5) {
				if (strange == 46)
					break;
				System.out.print((char) strange);
			} else if (121 == strange) {
				unknown++;
			}
		}
	}
}
