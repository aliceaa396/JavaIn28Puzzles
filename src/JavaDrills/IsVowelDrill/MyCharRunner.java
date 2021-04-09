package JavaDrills.IsVowelDrill;

public class MyCharRunner {
    public static void main(String[] args) {
        MyChar myChar = new MyChar('P');
        System.out.println(myChar.isVowel());
        System.out.println(myChar.isNumber() );
        System.out.println(myChar.isAlphabet() + " is in alphabet");
        System.out.println(myChar.consonant() + " is consonant");
        MyChar.printLowerCaseAlphabet();
        MyChar.printUpperCaseAlphabet();
    }
}
