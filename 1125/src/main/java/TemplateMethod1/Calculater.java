package TemplateMethod1;

public abstract class Calculater {
	public int calculate(int n) {
		int result = getInitValue();
		result = doCalc(result, n);
		return result;
	}

	protected abstract int doCalc(int result, int n);

	protected abstract int getInitValue();
}
