import java.util.Scanner;

public class lab4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Виберіть опцію: Погодитись - Так/Yes/OK/Ok/Y/+  Відмовитись - Ні/No/NO/N/-");
        String option = sc.nextLine();

        switch (option) {
            case "Так", "Yes", "OK", "Ok", "Y", "+":
                System.out.println("Я погоджуюсь");
                break;
            case "Ні", "NO", "No", "N", "-":
                System.out.println("Я відмовляюсь");
                break;
            default:
                System.out.println("Неправильний вибір");
        }
    }
}
