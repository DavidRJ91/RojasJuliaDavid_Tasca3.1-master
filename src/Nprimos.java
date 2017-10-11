public class Nprimos {
    public static void main(String[] args) {
        int x = 2;
        int z = 10000;
        boolean Nprimo;

        for (int i = x; i <= z; i++) {
            Nprimo = true;

            for ( ; x<= i; x++)
                {if (i % x == 0) {
                    Nprimo = false;
                }
            }
            if (Nprimo) {
                System.out.println(i);
            }
            if ( i % 1000 == 0) {
                System.out.println("<<<<--------------->>>>");
            }
        }
    }
}