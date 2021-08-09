package Number;
//成员变量与局部变量的生效范围
public class Val {
	static int times = 3;
	public static void main(String[] args) {
		int times = 4;
		System.out.println("times的值为: " + times);
		//变量的生效范围，定义相同的成员变量与局部变量，只有局部变量会生效
		// TODO 自动生成的方法存根

	}

}
