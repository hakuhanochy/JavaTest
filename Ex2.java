import java.util.Scanner;
public class Ex2 {
  private static int x,y;
    public static void main (String[] args) {
        int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        if(sc.hasNextInt()) {
            a = sc.nextInt();
            System.out.print("Введите второе число: ");
            if(sc.hasNextInt()) {
                b = sc.nextInt();
                      x = a; y = b;
                    while (a != 0 && b != 0) {
                    if (a > b)
                    a = a % b;
                    else
                    b = b % a;
                   }
                System.out.println("НОД = " +(a + b)); //НОД - наибольший общий делитель
                System.out.println("НОК = " +(((x*y)/(a+b)))); //НОK - наименьшее общее кратное
        }
        }
            else {
                System.out.println("Ошибка. Вы ввели не целое число");
            }
} 
}