import java.io.*;


public class Roman {

	public static void main (String [] args) throws Exception {
		
       	InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(isr);
        String line = reader.readLine();
        String[] RNs = line.split("\\s+");  
        
        for (int i = 0; i < RNs.length; i++) {
        	int value = DecodingRoman.getRN(RNs[i]);
        	System.out.println(RNs[i] + " translated to " + value);
        }    
    }
}
