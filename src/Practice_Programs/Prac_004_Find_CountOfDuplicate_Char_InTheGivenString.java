package Practice_Programs;

public class Prac_004_Find_CountOfDuplicate_Char_InTheGivenString {
    public static void main(String[] args) {

//        Webdriver driver = new chromedriver;
//        Chromerdriver driver = new chormedriver;
//        Webdriver driver = new webdriver;
//        Sytem.setproperty("Windows.chrome.driver","D:/chromedriver.exe");

// Write a program to find how many times 'r' & 'a' are coming in the given string

        int countR=0;
        int countA=0;

        String str = "Priyanka Saroch";
        for(char i =0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch =='r'){
                countR++;
            } else if (ch =='a') {
                countA++;
            }
        }
            int result = countA+ countR;
            System.out.println("R is present :-"+countR+" times in the Given String.");
            System.out.println("A is present :-"+countA+" times in the Given String.");
            System.out.println("Both R, A are present ="+ result+" times in the Given String.");

    }

}
