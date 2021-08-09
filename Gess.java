package Number;

public class Gess {

	public static void main(String[] args) {
		char word = '吕', word2 = '睿', word3 = '杰';
		int p = 21525, p2 = 30591, p3 = 26480;
		System.out.println("吕 在 unicode 表中的顺序位置是: " + (int) word);
		System.out.println("睿 在 unicode 表中的顺序位置是: " + (int) word2);
		System.out.println("杰 在 unicode 表中的顺序位置是: " + (int) word3);
		System.out.println("unicode 表中的第21525位是: " + (char) p);
		System.out.println("unicode 表中的第30591位是: " + (char) p2);
		System.out.println("unicode 表中的第26480位是: " + (char) p3);
		// TODO Unicode字符与十六进制字符顺序之间的转译

	}

}
