public class VypocetBMI {

    public static void  main (String [] args)
            {

        double a = 150; // Váha v kg

        double b = 1.6; // Výška v m

               if ((a < 0 || b < 0))
                System.out.println("špatně zadaná váha nebo výška");

                else if ((a / (b * b)) < 16.5)
                    System.out.println("těžká podvýživa");

               else if (a / (b * b) < 18.5){
                    System.out.println("podváha");

               } else if ((a / (b * b)) < 25){
                        System.out.println("ideální zdravá váha");

               } else if ((a / (b * b)) < 30){
                    System.out.println("nadváha");

               } else if ((a / (b * b)) < 35){
                    System.out.println("nadváha prvního stupně");

               } else if ((a / (b * b)) < 40){
                System.out.println("nadváha druhého stupně");

               } else {
                System.out.println("obezita třetího stupně (též morbidní obezita)");
}
            }
}


