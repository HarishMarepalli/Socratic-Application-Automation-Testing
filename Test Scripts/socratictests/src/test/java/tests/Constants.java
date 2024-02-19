package tests;

public class Constants {
	
	/*
	 * Linear Equation Test Cases
	 */
	//Linear-Lower Case
	public static final String linearInp1 = "12x + 10 = 4x + 26";
	public static final String linearOut1 = "x=2";
	
	//Linear-Upper Case
	public static final String linearInp2 = "P + 3Q = 6\n2P + 8Q = -12";
	public static final String linearOut2 = "P=1 , Q=5";
	
	//Linear-Different Language
	public static final String linearInp3 = "2x=5 ని ax+by+c=0 రూపంలో వ్రాసి x విలువను కనుగొనండి";
	public static final String linearOut3 = "No Answer";
	
	//Linear-Different Variables
	public static final String linearInp4 = "(2β + 5 )/( β + 4 ) = 1";
	public static final String linearOut4 = "β=-1";
	
	//Linear-Mistake in the Equation
	public static final String linearInp5 = "4x + ++8y + z = 2\nx + 7y - --3z = -14\n2x –-- 3y + ++2z = 3";
	public static final String linearOut5 = "Q&A";
	
	//Linear-Using Special Characters as Variables
	public static final String linearInp6 = "6# – 19 = 3# – 10";
	public static final String linearOut6 = "Top match";
	
	//Linear-Word problem
	public static final String linearInp7 = "Joe and Steve are saving money. Joe starts with $110 and saves $8 per week. Steve starts with $8 and saves $20 per week. After how many weeks do they have the same amount of money?";
	public static final String linearOut7 = "8 weeks";
	
	
	/*
	 * Quadratic Equation Test Cases
	 */
	//Quadratic-Lower Case
	public static final String quadraticInp1 = "-2x^2 - 7x - 3 = 0";
	public static final String quadraticOut1 = "x=-\\frac{1}{2}\\\\x=-3";
	
	//Quadratic-Upper Case
	public static final String quadraticInp2 = "0.5X^2 - 1.5X + 1.25 = 0";
	public static final String quadraticOut2 = "X=1.5+0.5i , X=1.5-0.5i";
	
	//Quadratic-Different Language
	public static final String quadraticInp3 = "x^2-4x-480 యొక్క మూలాలను కనుగొనండి";
	public static final String quadraticOut3 = "x=24, x=-20";
	
	//Quadratic-Different Variables
	public static final String quadraticInp4 = "1000α^2 - 2000α + 1000 = 0";
	public static final String quadraticOut4 = "α=1";
	
	//Quadratic-Mistake in the Equation
	public static final String quadraticInp5 = "0.25x2 +++ 0.5x ++ 0.25 = 0";
	public static final String quadraticOut5 = "More from the web";
	
	//Quadratic-Using Special Characters as Variables
	public static final String quadraticInp6 = "x^2---4x++4=0";
	public static final String quadraticOut6 = "More from the web";
	
	//Quadratic-Word problem
	public static final String quadraticInp7 = "Find the roots of x^2+5x+6=0";
	public static final String quadraticOut7 = "x=2, x=3";
	
	
	
	/*
	 * Polynomial Equation Test Cases
	 */
	//Polynomial-Lower Case
	public static final String polyInp1 = "2x^4 - 2x^3 - 14x^2 + 2x + 12 = 0";
	public static final String polyOut1 = "x=3\\\\x=1\\\\x=-1\\\\x=-2";
	
	//Polynomial-Upper Case
	public static final String polyInp2 = "X^3 - 1=0";
	public static final String polyOut2 = "S={1, -1/2+isqrt3/2,-1/2-isqrt3/2}";
	
	//Polynomial-Different Language
	public static final String polyInp3 = "క్వాడ్రాటిక్ బహుపది kx^2-3x+1 సున్నాల మొత్తం 1, k కనుగొనండి";
	public static final String polyOut3 = "k=9/4";
	
	//Polynomial-Different Variables
	public static final String polyInp4 = "(α^2 - 7α + 11)^(α^2 – 13α + 42) = 1";
	public static final String polyOut4 = "α=2,3,4,5,6,7";
	
	//Polynomial-Mistake in the Equation
	public static final String polyInp5 = "x^2 ++ 2x - one = 0";
	public static final String polyOut5 = "Q&A";
	
	//Polynomial-Using Special Characters as Variables
	public static final String polyInp6 = "&^2 - 3& + 2 = 0";
	public static final String polyOut6 = "More from the web";
	
	//Polynomial-Word problem
	public static final String polyInp7 = "Find the value of a, if x - a is a factor of x3 - ax2 + 2x + a - 1";
	public static final String polyOut7 = "a=1/3";
	
	
	
	/*
	 * Exponential Equation Test Cases
	 */
	//Exponential-Lower Case
	public static final String expoInp1 = "-216 = (-6)^(4x + 15)";
	public static final String expoOut1 = "x=-3";
	
	//Exponential-Upper Case
	public static final String expoInp2 = "(1/243) = 3^-(2X+5)";
	public static final String expoOut2 = "X=0";
	
	//Exponential-Different Language
	public static final String expoInp3 = "x = 1 మరియు y = 15 సంఖ్యల కోసం y=a(b^x) రూపంలో ఘాతాంక సమీకరణాన్ని వ్రాయండి";
	public static final String expoOut3 = "15=ab";
	
	//Exponential-Different Variables
	public static final String expoInp4 = "(-1/2)^(α-1) = -8";
	public static final String expoOut4 = "α=-2";
	
	//Exponential-Mistake in the Equation
	public static final String expoInp5 = "(1/3)^(2x+++1) = 27";
	public static final String expoOut5 = "More from the web";
	
	//Exponential-Using Special Characters as Variables
	public static final String expoInp6 = "4^(-2#) = 1/64";
	public static final String expoOut6 = "Q&A";
	
	//Exponential-Word problem
	public static final String expoInp7 = "Solve 3^x = 11 for x, giving the answer to three decimal places";
	public static final String expoOut7 = "x=2.183";
	
}
