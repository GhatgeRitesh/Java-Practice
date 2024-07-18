package String_Problems;

public class RemoveNonAlphabets {

    //program to remove all the elements in string excluding alphabets

    public static void main(String[] args) {
        String myString="This is 1 st string having @#41 _][]/,. Symbols and 🫡 emojis";
        System.out.println(myString+": Before");
        StringBuilder newStr=new StringBuilder();
        for(int i=0;i<myString.length();i++){
            if((myString.charAt(i)>=65 && myString.charAt(i)<91) || (myString.charAt(i)>96 && myString.charAt(i)<124) || myString.charAt(i)==32){
                newStr.append(myString.charAt(i));
            }
            else{
                newStr.append('_');
            }
        }
        System.out.println(newStr.toString()+":After");
        for(int i=65;i<123;i++){
            System.out.print(Character.toChars(i));
        }


    }
}
