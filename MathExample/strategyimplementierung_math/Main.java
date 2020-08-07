package strategyimplementierung_math;

import strategyobjects_math.Addition;
import strategyobjects_math.Division;
import strategyobjects_math.Multiplication;
import strategyobjects_math.Substraction;

public class Main
{

	/**
	 * Entry point
	 * 
	 * @param args unused
	 */
	public static void main(String[] args)
	{
		MathCalculation calc = new MathCalculation(100, 10);
		System.out.println(calc.calculate(new Addition()));
		System.out.println(calc.calculate(new Substraction()));

		System.out.println(calc.calculate(new Multiplication()));
		System.out.println(calc.calculate(new Division()));
	}

}