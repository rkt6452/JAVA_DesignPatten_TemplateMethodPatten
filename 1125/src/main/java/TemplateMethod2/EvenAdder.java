package TemplateMethod2;

public class EvenAdder extends Calculater {

	@Override
	protected int doCalc(int result, int i) {
		// TODO Auto-generated method stub
		/*
		 * if(i%2==0) { result += i; }
		 */
		return result+i;
	}

	@Override
	protected int getInitValue() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	protected boolean ValueSelected(int i) {
		// TODO Auto-generated method stub
		if (i % 2 == 0)
			return true;
		//else
		return false;
	}

}
