import java.util.Scanner;

public class Read {
    public static boolean Read() {
        Scanner in = new Scanner(System.in);
        String c = in.next();
        if (c.equals("y") || c.equals("n")) {
            if (c.equals("y")){
                return true;
            }
            return false;
        } else {
            System.out.println("Ошибка! Вы ввели недопустимое значение.");
            Read();
        }
        return false;

    }
}
