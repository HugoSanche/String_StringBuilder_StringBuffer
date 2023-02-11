public class StreamBuilderTest2 {
    public static void main(String[] Args){

        System.out.println("/****************REPLACE*****************/");
        StringBuilder str =new StringBuilder("Hugo BaltazarAAA");
        str.replace(5, 15, "Sanchez");
        System.out.println(str);

        System.out.println("/****************DELETE*****************/");
        StringBuilder str2 =new StringBuilder("HolaA");
        str2.delete(3, 100);
        System.out.println(str2);


    }
}
