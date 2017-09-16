package Calc;

import java.util.Scanner;

public class Calc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		Calculator calc = new Calculator();
		calc.register("+", new Suma());
		calc.register("#", new Mcd());
		calc.register("-", new Resta());
		calc.register("*", new Multiplicacion());
		calc.register("/", new Division());
		calc.register("%", new Specialop());
		
		while (true) {
			int a = sc.nextInt();
			String op = sc.next();
			int b = sc.nextInt();
			int c = calc.execute(op, a, b);
			System.out.println(c);
			
		}
		
	}

}
