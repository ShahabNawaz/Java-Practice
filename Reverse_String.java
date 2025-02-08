public class Reverse_String{
    public static void main(String []args){
        String name="Rahul";
        StringBuilder sb=new StringBuilder(name);
        String Reverse=sb.reverse().toString();
        System.out.println(Reverse);
    }
}