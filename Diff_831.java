import java.util.Scanner;

 class Diff_831 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();  // number of test cases

        for (int t = 0; t < T; t++) {
            int N = sc.nextInt();  // distance
            int X = sc.nextInt();  // petrol price per litre
            int Y = sc.nextInt();  // diesel price per litre
            int A = sc.nextInt();  // petrol mileage
            int B = sc.nextInt();  // diesel mileage

            // Calculate cost for petrol and diesel
            double petrolCost = (N / (double) A) * X;
            double dieselCost = (N / (double) B) * Y;

            if (petrolCost < dieselCost) {
                System.out.println("PETROL");
            } else if (dieselCost < petrolCost) {
                System.out.println("DIESEL");
            } else {
                System.out.println("ANY");
            }
        }
        sc.close();
    }
}
