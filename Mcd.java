package Calc;

public class Mcd implements StrategyOperation {
	public int operate(int a , int b) {
		if(b==0)
			return a;
		return operate(b, a%b);
	}
}
