import java.util.Scanner;

class Average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        if (a <= b && b <= c) {
            System.out.println(b);
        } else if (a <= c && c <= b) {
            System.out.println(c);
        } else if (b <= a && a <= c) {
            System.out.println(a);
        } else if (b <= c && c <= a) {
            System.out.println(c);
        } else if (c <= b && b <= a) {
            System.out.println(b);
        } else if (c <= a && a <= b) {
            System.out.println(a);
        }
    }
}