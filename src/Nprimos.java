public class Nprimos {
    public static void main(String[] args) {
        boolean Nprimo;
        for (int i = 1; i <= 10000; i++) {
            Nprimo = true;

            for (int div = i-1; div>=2; div--) {
                if (i % div == 0) {
                    Nprimo = false;
                }
            }
            if (Nprimo) {
                System.out.println(i);
            }
            if (i % 1000 == 0) {
                System.out.println("<<<<--------------->>>>");
            }
        }
    }
}

/* David Rojas Julia
    2º ASIX
    Ies Emili Darder */
