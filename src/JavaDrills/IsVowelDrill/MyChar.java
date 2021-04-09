package JavaDrills.IsVowelDrill;

public class MyChar {
    private char ch;

    public MyChar(char ch) {
        this.ch = ch;
    }

    public static void printUpperCaseAlphabet() {
        for(char ch = 'A'; ch <= 'Z'; ch++){
            System.out.println(ch);
        }
    }

    public static void printLowerCaseAlphabet() {
        for(char ch = 'a'; ch <= 'z'; ch++){
            System.out.println(ch);
        }
    }

    public boolean isVowel() {
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            return true;
        } else if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
            return true;
        } else {
            return false;
        }
    }

    public boolean isNumber() {
        //0 is 48 and 9 is 57, if the char is between 0 and 9 its a number
        //We figured this out by typing in jshell (int)0, and int(9)
        if(ch >= 48 && ch <=57){
            return true;
        }else {
            return false;
        }
    }

    public boolean isAlphabet() {
        //used same logic as above, between a and z
        if(ch >= 97 && ch <= 122){
            return true;
        }else if (ch >= 65 && ch <= 90){
            return true;
        } else{
            return false;
        }
    }

    public boolean consonant() {
        if ((ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') && (ch >= 97 && ch <= 122)) {
            return false;

        } else if((ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') && (ch >= 65 && ch <= 90) ) {
            return false;
        } else {
            return true;
        }
    }
}
