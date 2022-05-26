package Chapter8;
/*
  1-  Write a method that counts the number of words in a String and prints them
    individually on a new line.
  2-  Write a method that prints a given String backward
    Cancel >> lemac
  3- Write a method that addSpaces to a String that don't have spaces
 */

public class TextProcessor {
    public static void main(String[] args) {
        countWords("I Love Test Automation University");
        reverseString("Hello TAU!");
        addSpaces("HeyWorld!It'sMeWaleed");
    }
    public static void countWords(String text){
        var words = text.split(" ");
        int numberOfWords = words.length;
        String message = String.format("Your text contains %d words " , numberOfWords);
        System.out.println(message);
        for(int i = 0; i < numberOfWords; i++){
            System.out.println(words[i]);
        }
    }
    public static void reverseString (String text){
        for(int i=text.length()-1; i>=0; i--){
            System.out.println(text.charAt(i));
        }
    }
    public static void addSpaces (String text){
    var modifiedText = new StringBuilder(text);
    for(int i=0; i<modifiedText.length(); i++){
        if(i !=0 && Character.isUpperCase(modifiedText.charAt(i))){
            modifiedText.insert(i , " ");
            i++;
        }
    }
    System.out.println(modifiedText);
    }
}
