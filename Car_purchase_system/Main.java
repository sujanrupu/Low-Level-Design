import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Client cl = new Client();
        System.out.println("Enter 1 for Scorpio and 2 for Swift: ");
        int n = sc.nextInt();
        cl.select_choice_confirmation(n);
        cl.car_readiness();
    }
}
