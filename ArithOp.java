import varithmetic.*;

import java.util.Scanner;

public class ArithOp {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int a = reader.nextInt();
        int b = reader.nextInt();
        arith m = new arith();
        m.add(a, b);
        m.sub(a, b);
        m.div(a, b);
        m.multi(a, b);
    }
}