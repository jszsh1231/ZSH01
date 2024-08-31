//branch testing RevA

package Chapter01.Chapter06;

public class BorrowABook2 { // 创建借书类
	String name; // 属性：书名
	public BorrowABook2(String name) { // 参数为name的构造方法
		this.name = name; // 将参数name的值付给属性name
	}
	public void borrow() { // 借书方法
		System.out.println("请前往借阅登记处领取" + name + "。"); // 输出借出的书名
	}
	public static void main(String[] args) {
		// 创建参数为“《战争与和平》”的借书类对象，
		BorrowABook2 book1 = new BorrowABook2("《战争与和平》");
		book1.borrow(); // 调用借书方法
		BorrowABook2 book2 = new BorrowABook2("《接触》");
		book2.borrow(); // 调用借书方法
	}
}
