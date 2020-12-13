
public class Lab2Q1 {
    public static void main(String[] args) {

        // Please note that this would take at least 11min to run
        int counter = 5;
        int num = 0;

        System.out.println("Five perfect numbers are:");

        while (counter > 0) {

            if (perfectNumCheck(++num)) {
                System.out.println(num);
                counter--;
            }
        }
    }

    private static boolean perfectNumCheck(int num) {

        if (num == 0 || num == 1)
            return false;

        int totalDivisor = 1;
        for (int j = 2; j <= Math.sqrt(num); j++) {

            if (num % j == 0){
                totalDivisor += j;

                if (j != num/j)
                    totalDivisor += num/j;
            }
        }
        return totalDivisor == num;
    }
}
