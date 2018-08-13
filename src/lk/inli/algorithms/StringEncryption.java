package lk.inli.algorithms;

public class StringEncryption {

	public static void main(String[] args) {
		String enStr1 = encryption("if man was meant to stay on the ground god would have given us roots");
		System.out.println(enStr1);
		
		String enStr2 = encryption("chillout");
		System.out.println(enStr2);
	}

	static String encryption(String s) {
        s = s.replaceAll(" ", "");
        
        int len = s.length();
        int noOfRows = (int) Math.round(Math.floor(Math.sqrt(len)));
        int noOfCols = (int) Math.round(Math.ceil(Math.sqrt(len)));
        System.out.println(len + ", " + noOfRows + ", " + noOfCols + ", Sq: " + Math.sqrt(len));

        if ((noOfRows * noOfCols) < len) {
        	noOfRows = (int) Math.round(Math.sqrt(len));
        }
        System.out.println(len + ", " + noOfRows + ", " + noOfCols + ", Sq: " + Math.sqrt(len));
        /*
         * rows = 2, cols = 3
			  01234567
			0 chi  
			1 llo          
			2 tayonthe  
			3 groundgo  
			4 dwouldha  
			5 vegivenu  
			6 sroots
         */
        StringBuilder sb = new StringBuilder();
        for (int j=0; j<noOfCols; j++) {
	        for (int i=0; i<noOfRows; i++) {
	        	int charPos = j + i * noOfCols;
	        	System.out.println("Char pos: " + charPos);
	        	if (charPos < s.length()) {
	        		sb.append(s.charAt(charPos));
	        	}
	        }
	        sb.append(" ");
        }
        
        //imtgdvs fearwer mayoogo anouuio ntnnlvt wttddes aohghn sseoau
        return sb.toString();
    }
}
