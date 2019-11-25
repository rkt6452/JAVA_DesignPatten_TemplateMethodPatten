package TemplateMethod2;

public abstract class Calculater {
	public int calculate(int n) {
		int result = getInitValue();
		for (int i = 1; i <= n; i++) {
			if (ValueSelected(i))
				result = doCalc(result, i);
		}
		return result;
	}

	protected abstract boolean ValueSelected(int i);

	protected abstract int doCalc(int result, int i);

	protected abstract int getInitValue();
}
