import java.util.Scanner;
class MaxEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), max = 0x80000001;
        if (a%2 == 0) max = a;
        a = sc.nextInt();
        if (a%2 == 0 && a > max) max = a;
        a = sc.nextInt();
        if (a%2 == 0 && a > max) max = a;
        if (max%2 == 0) System.out.print(max);
        else System.out.print("Чётных чисел нет");
    }
}
