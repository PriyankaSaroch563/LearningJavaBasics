package Practice_Programs;

public class Prac_002_LowercaseToUpper_CaseConversion {
    public static void main(String[] args) {
        // Prog to convert lower caser to,
        // upper case without using Uppercase ()
        String str = "HELLO WORLD";
        StringBuilder result = new StringBuilder();

        for(int i =0; i<str.length();i++)
        {
            // int ascii = (int)ch; if want to use 65 / 90 instead of A/Z
            //if(ascii >=65 && ascii <=90)
            // If character is uppercase (ASCII 65 to 90/ AtoZ)
            char ch = str.charAt(i);
            if(ch>='A' && ch<='Z')
            {
                // Convert to lowercase by adding 32 to ASCII value
                result.append((char)(ch+32));
                //If you want to do lower case conversion then (ch-32)
            }
            else {
                // For spaces or other characters, keep as-is
                result.append(ch);
            }
        }
        System.out.println("Converted value :- "+ result.toString());
    }
}
