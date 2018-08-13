package lk.inli.algorithms;

public class WordConstruct {

	public static void main(String[] args) {
		System.out.println("lmno: " + biggerIsGreater("lmno"));
		System.out.println("dcba: " + biggerIsGreater("dcba"));
		System.out.println("dcbb: " + biggerIsGreater("dcbb"));
		System.out.println("abdc: " + biggerIsGreater("abdc"));
		System.out.println("abcd: " + biggerIsGreater("abcd"));
		System.out.println("fedcbabcd: " + biggerIsGreater("fedcbabcd"));

	}

	static String biggerIsGreater(String w) {
		String word1 = constructString(w);
		String word2 = constructString(word1);
		
		if (word1.compareTo(word2) < 0 || "no answer".equalsIgnoreCase(word1)) {
			return word1;
		}
        
		while (word2.compareTo(word1) < 0 || !"no answer".equalsIgnoreCase(word2)) {
			word2 = constructString(word2);
		}
		
		return word2;
    }
	
	private static String constructString(String w) {
		char[] chars = w.toCharArray();
        //System.out.println(chars);
        
		for (int i=w.length()-1; i>0; i--) {
			char atPos =chars[i];
			
			for (int j=i-1; j>=0 ; j--) {
				char b4Pos = chars[j];
				if (atPos > b4Pos) {
					char c = atPos;
					
					chars[i] = b4Pos;
					chars[j] = c;
					//System.out.println(chars);
					return new String(chars);
				}
			}
		}
		
        return "no answer";
	}
}
