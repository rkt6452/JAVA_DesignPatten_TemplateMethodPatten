package TemplateMethod1;

public class Multiply extends Calculater{
	
	@Override
	protected int doCalc(int result, int n) {
		// TODO Auto-generated method stub
		for(int i = 1; i < n; i++) {
			result *= i;
		}
		
		return result;
	}

	@Override
	protected int getInitValue() {
		// TODO Auto-generated method stub
		return 1;
	}
}
