public class Ex5 {
   
    static int Pal(int input, int b, int isOdd) {

    int n = input;
    int palin = input;

    if (isOdd == 1)
        n /= b;

    while (n > 0) {
        palin = palin * b + (n % b);
        n /= b;
    }

    return palin;
}

static void Palindroms(int n) {
    int number;
    for (int j = 0; j < 2; j++) {
        int i = 1;

        while ((number = Pal(i, 10, j % 2)) < n) {
            System.out.print(number + " ");
            i++;
    }
    }
}

public static void main(String[] args) {
    int n = 100;
    Palindroms(n);
}
}