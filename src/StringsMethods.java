import java.sql.SQLOutput;
import java.util.Locale;

public class StringsMethods {
    public static void main(String[] args) {
        System.out.println("hii");
//
//            equals() Method
//        String names = "vivek";
//        String name1 = "Vivek";
//        System.out.println(names.equals(name1));

//            trim() Method
//        String trimExample = "  Hello World   ";
//        System.out.println(trimExample);
//        System.out.println(trimExample.trim());

//              charAt() Method
//        String name="Vivek";
//        System.out.println(name.charAt(2));


//          compareTo()
//        String name1="vivek";
//        String name2="Vivek";
//        System.out.println(name1.compareTo(name2));

//           contains()
//        String name1="Java is the fun coding";
//        System.out.println(name1.contains("Java"));


        //      startsWith()  & endswith()

//        String name1="I am learning Java";
//        System.out.println(name1.startsWith("I",0));
//        System.out.println(name1.endsWith("l"));



            //        Split() method
        String practice= "Hello I am learning java and it is fun to code";
        String [] words=practice.split(" ");
        for(String w:words){
            System.out.println(w);
        }
    }

}
