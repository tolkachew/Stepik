import java.util.Scanner;

class Hello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String s1 = "Джефф Безос";
        String s2 = "Илон Маск";
        String s3 = "Марк Цукерберг";
        String s4 = "Билл Гейтс";
        if (s.contains(s1))
            System.out.println("Добро пожаловать!");
        else if (s.contains(s2))
            System.out.println("Добро пожаловать!");
        else if (s.contains(s3))
            System.out.println("Добро пожаловать!");
        else if (s.contains(s4))
            System.out.println("Добро пожаловать!");
        else
            System.out.println("Здесь никого нет, Вы ошиблись дверью");
    }
}

