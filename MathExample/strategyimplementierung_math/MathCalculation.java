package strategyimplementierung_math;

import strategyobjects_math.Operation;

public class MathCalculation
{

	private Operation operation = null;
	private int a;
	private int b;

	public MathCalculation(int a, int b)
	{
		this.a = a;
		this.b = b;
	}

	public int calculate(Operation operation)
	{
		this.operation = operation;
		if (this.operation == null)
			return 0;
		return this.operation.calculate(a, b);
	}
}
