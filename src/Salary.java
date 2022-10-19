import java.util.Scanner;

class Salary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt(), d = sc.nextInt();
        int max = Math.max(Math.max(a, b), c);
        int min = Math.min(Math.min(a, b), c);
        int diff = max - min;
        if (diff > d) {
            System.out.println("Ура, бастуем!");
        } else {
            System.out.println("За работу, Солнце ещё высоко");
        }
    }
}