import java.util.Scanner;
public class Ex2 {
  private static int x,y;
    public static void main (String[] args) {
        int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.print("������� ������ �����: ");
        if(sc.hasNextInt()) {
            a = sc.nextInt();
            System.out.print("������� ������ �����: ");
            if(sc.hasNextInt()) {
                b = sc.nextInt();
                      x = a; y = b;
                    while (a != 0 && b != 0) {
                    if (a > b)
                    a = a % b;
                    else
                    b = b % a;
                   }
                System.out.println("��� = " +(a + b)); //��� - ���������� ����� ��������
                System.out.println("��� = " +(((x*y)/(a+b)))); //��K - ���������� ����� �������
        }
        }
            else {
                System.out.println("������. �� ����� �� ����� �����");
            }
} 
}