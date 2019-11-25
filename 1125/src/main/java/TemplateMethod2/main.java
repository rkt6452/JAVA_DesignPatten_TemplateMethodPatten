package TemplateMethod2;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculater calc = new Adder();
		System.out.println(calc.calculate(10));
		Calculater calc1 = new Multiply();
		System.out.println(calc1.calculate(4));

		Calculater calc2 = new EvenAdder();
		System.out.println(calc2.calculate(6));
	}

}
