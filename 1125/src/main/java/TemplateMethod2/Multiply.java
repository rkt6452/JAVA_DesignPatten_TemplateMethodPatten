package TemplateMethod2;

public class Multiply extends Calculater{
	
	@Override
	protected int doCalc(int result, int i) {
		// TODO Auto-generated method stub
		return result*i;
	}

	@Override
	protected int getInitValue() {
		// TODO Auto-generated method stub
		return 1;
	}
	
	@Override
	protected boolean ValueSelected(int i) {
		// TODO Auto-generated method stub
		return true;
	}
}
