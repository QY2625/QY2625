//三元运算符使用

public class TernaryOperator {
	public static void main(String[] args) {
		
		int a = 10;
		int b = 99;
		//解读
		//1.a > b 为 false
		//2.返回 b--,先返回b的值，然后返回 b-1
		//3.返回的结果是99
		int result = a > b ? a++ : b--;
		System.out.println("result=" + result);
		System.out.println("a=" + a);//10
		System.out.println("b=" + b);//98
	}
}