public class Nprimos {
    public static void main(String[] args) {
        boolean Nprimo;
        for (int i = 1; i <= 10000; i++) {
            Nprimo = true;

            for (int divisor = i-1; divisor>=2; divisor--) {
                if (i % divisor == 0) {
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