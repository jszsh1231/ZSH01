//branch testing RevA

package Chapter01.Chapter06;

public class BorrowABook2 { // ����������
	String name; // ���ԣ�����
	public BorrowABook2(String name) { // ����Ϊname�Ĺ��췽��
		this.name = name; // ������name��ֵ��������name
	}
	public void borrow() { // ���鷽��
		System.out.println("��ǰ�����ĵǼǴ���ȡ" + name + "��"); // ������������
	}
	public static void main(String[] args) {
		// ��������Ϊ����ս�����ƽ�����Ľ��������
		BorrowABook2 book1 = new BorrowABook2("��ս�����ƽ��");
		book1.borrow(); // ���ý��鷽��
		BorrowABook2 book2 = new BorrowABook2("���Ӵ���");
		book2.borrow(); // ���ý��鷽��
	}
}
