public class lab2 {
    public static void main(String[] args) {

        int n = 561;
        int x = 0;


        while (n > 0) {

            int y = n % 10;

            if (y > x) {

                x = y;
            }

            n /= 10;
        }

        System.out.println("Найбільша цифра: " + x);


    }


}
