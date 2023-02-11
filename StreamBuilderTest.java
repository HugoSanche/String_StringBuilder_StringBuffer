public class StreamBuilderTest{
    public static void main(String[] Args){
        
        //Stream es inmutable no se puede modificar
        //StreamBuilder se ocupa en un solo hilo y es mas rapido
        //StreamBuffer es tread safe es mas lento y es para varios hilos

        //cada que modifiques builder se vera reflejada
        StringBuilder builder =new StringBuilder("Java");
        

        //agrega al final.
        builder.append(" Aprendiendo");
        System.out.println(builder);

        //borra de la posicion 4 a 20
        builder.delete(4, 20);
        System.out.println(builder);

        //reversa
        builder.reverse();
        System.out.println(builder);

         builder.reverse();
        //"Java"
        builder.insert(3, "Hola");
        System.out.println(builder);

    }
}