// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Введите дробное число (float):");
        inputFloat();

    }

    public static void inputFloat(){
        Scanner in = new Scanner(System.in);
        float num;
        String str;
        str=in.nextLine();
        try {
         num = Float.parseFloat(str);
         System.out.println("Вы ввели float:"+num);
        } catch (NumberFormatException e){
            System.out.println("Это не float");
            System.out.println("Введите число (float):");
            inputFloat();}
    }
}

