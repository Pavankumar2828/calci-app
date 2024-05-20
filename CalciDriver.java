import java.util.Scanner;

interface Calci {
    int add(int a, int b);
}

class CalciImpln implements Calci {
    public int add(int a, int b) {
        return a + b;
    }
}

public class CalciDriver {
    public static void main(String[] args) {
        System.out.println("Enter 2 number");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        Calci ci = new CalciDriver();
        System.out.println("sum" + ci.add(a, b));
    }
}
