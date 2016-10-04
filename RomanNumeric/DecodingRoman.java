//cerner_2^5_2016
public class DecodingRoman { 
	static int getRN(String RN) {
		int total = 0;
		for (int i = 0; i < RN.length(); i++) {
			if (i == (RN.length()-1)) {
				total += getRNIntValue(RN.charAt(i));
				break;
			}	
			if (getRNIntValue(RN.charAt(i)) < getRNIntValue(RN.charAt(i+1))) {
				total += getRNIntValue(RN.charAt(i+1)) - getRNIntValue(RN.charAt(i));
				i++;
			}
			else {
				total += getRNIntValue(RN.charAt(i));
			}
		}
		
		return total;
	}
	static int getRNIntValue (char RNChar) {
		int charValue = 0;
		if (RNChar == 'I') { return 1; }
		if (RNChar == 'V') { return 5; }
		if (RNChar == 'X') { return 10;}
		if (RNChar == 'L') { return 50;}
		if (RNChar == 'C') { return 100;}
		return charValue;
	}
}
