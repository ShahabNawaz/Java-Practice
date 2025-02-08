public class check_if_a_vowel_is_present{
    public static void main(String []args){
        String input="Rahul";
        input= input.toLowerCase();
        if (input.matches(".*[aeiou].*")){
            System.out.println("Vowel is present");
        }
        else{
            System.out.println("Vowel is not present");
        }
    }
}