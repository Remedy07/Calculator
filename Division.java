package Calc;

public class Division implements StrategyOperation{
	public int operate(int a , int b) {
		if(b==0) {
			System.out.println("Operacion invalidad divicion entre 0");
			return 0;
		}
		return a/b;
	}
}
