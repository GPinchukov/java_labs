package by.gsu.pms;

public class TextFilter {
 
    public static void main(String[] args) {
        String inputFile = "src/in.txt";
        System.out.println(inputFile);
        
        int charCount = 6;
        
        String [] words = inputFile.split(" ");
        StringBuilder builder = new StringBuilder();
        for (String s : words) {
            if(!(isVowel(s.charAt(0)) && s.length() == charCount)) {
                builder.append(s).append(" ");
            }
        }
        String rezult = builder.toString().trim();
        System.out.println(rezult);
        
    }

}