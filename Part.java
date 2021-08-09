//声明变量
package Number;

public class Part {
	static final double PI = 3.14;
	static int age = 23;
	public static void main(String[] args) {
		final int number;
		number = 1235;
		age = 22;
		//number = 22;//这是错误的代码，因为number是常量(final)，之前已经对number赋过值了
		System.out.println("常量PI的值为: " + PI);
		System.out.print("赋值后number的值为: " + number + "\n");
		System.out.println("int 型变量 age 的值为: " + age);
		// TODO 自动生成的方法存根

	}

}
