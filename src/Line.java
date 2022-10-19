import java.util.Scanner;

class Line {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a1 = sc.nextInt(), b1 = sc.nextInt(), a2 = sc.nextInt(), b2 = sc.nextInt();
        if (a2 > a1) a1 = a2;
        if (b2 < b1) b1 = b2;
        if (a1 < b1) System.out.print(a1 + " " + b1);
        else if (a1 == b1) System.out.print(a1);
        else System.out.print("Пересечения нет");
    }
}
/*
На числовой прямой даны два отрезка, заданных парами целых чисел:  [a1,b1] i [a2,b2]
Напишите программу, которая находит их пересечение.
Если пересечение - отрезок, необходимо вывести два числа (границы отрезка), если единственная точка - единственное число (точку),
если пересечения нет - вывести фразу "Пересечения нет" (без кавычек).
 */