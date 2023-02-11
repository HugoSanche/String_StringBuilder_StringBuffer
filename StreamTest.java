public class StreamTest {
    public static void main(String[] Args){
        String test =new String("Hola");
        //String is inmutable

        //if change "test" 
        System.out.println(test.replace("o", "X"));

        //really you dindnt change "test"
        System.out.println(test); //"test" its the same

    }
}
