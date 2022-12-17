public class Start {
    public static void main(String[] args) {

        String[] array1 = {" I want  ", " to learn ", " how to code! "};
        String[] array2 = {array1[0].trim(), array1[1].trim(), array1[2].trim()};


        int statement1 = array2[0].compareTo("I want");
        int statement2 = array2[1].compareToIgnoreCase("To learn");


        boolean result = !(statement1 > statement2);
        System.out.println(result);


    }


}

