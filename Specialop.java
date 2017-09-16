package Calc;

public class Specialop implements StrategyOperation {
	Suma s=new Suma();
	Resta r=new Resta();
	Multiplicacion m=new Multiplicacion();
	Division d=new Division();
	
	public int operate(int a , int b) {
		return d.operate(r.operate(m.operate(a, 2),b),s.operate(3, a));
	}
}
