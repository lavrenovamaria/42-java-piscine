import java.util.Scanner;

class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int number = sc.nextInt();
            if (number < 0) {
                throw new IllegalArgumentException();
            }
        } catch (Exception e) {
            System.out.println("IllegalArgument");
            return;
        }

    }
}