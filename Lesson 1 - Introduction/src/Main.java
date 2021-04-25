public class Main {

    public static void main(String[] args) {

        String internetSubeButonu = "Internet Sube Butonu";
        double dollarYesterday = 8.15;
        double dollarToday = 8.15;
        int vade = 36;

        if(dollarToday < dollarYesterday) {
            System.out.println("Dollar is decreased");
        } else if(dollarToday > dollarYesterday){
            System.out.println("Dollar is increased");
        } else {
            System.out.println("Dollar is the same");
        }

        String kredi1 = "Hizli Kredi";
        String kredi2 = "Mutlu Emekli Kredisi";
        String kredi3 = "Konut Kredisi";
        String kredi4 = "Ciftci Kredisi";
        String kredi5 = "MSB Kredisi";
        String kredi6 = "MEB Kredisi";

//        System.out.println(kredi1);
//        System.out.println(kredi2);
//        System.out.println(kredi3);
//        System.out.println(kredi4);
//        System.out.println(kredi5);
//        System.out.println(kredi6);

        String[] krediler = {
                "Hizli Kredi",
                "Mutlu Emekli Kredisi",
                "Konut Kredisi",
                "Ciftci Kredisi",
                "MSB Kredisi",
                "MEB Kredisi",
                "Kultur Bakanligi Kredisi"
        };

        // foreach
        for (String kredi: krediler) {
            System.out.println(kredi);
        }

        for(int i = 0; i < krediler.length; i++) {
            System.out.println(krediler[i]);
        }


        int number1 = 10;
        int number2 = 20;
        number1 = number2;
        number2 = 100;
        System.out.println(number1);

        int[] numbers1 = {1, 2, 3, 4, 5};
        int[] numbers2 = {10, 20, 30, 40, 50};
        numbers1 = numbers2;
        numbers2[0] = 100;
        System.out.println(numbers1[0]);
    }
}
