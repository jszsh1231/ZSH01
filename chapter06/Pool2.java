package Chapter06;

public class Pool2 { // ����ˮ����
	public static int water = 0; // ��ʼ����̬����֮ˮ���е�ˮ��Ϊ0
	public static void outlet() { // ��ˮ��һ�ηų�2����λ
		if (water >= 2) { // ���ˮ���е�ˮ�����ڵ���2����λ
			water = water - 2; // �ų�2����λ��ˮ
		} else { // ���ˮ���е�ˮ��С��2����λ
			water = 0; // ˮ���е�ˮ��Ϊ0
		}
	}
	public static void inlet() { // עˮ��һ��ע��3����λ
		water = water + 3; // ע��3����λ��ˮ
	}
	public static void main(String[] args) {
		System.out.println("ˮ�ص�ˮ����" + Pool2.water); // ���ˮ�ص�ǰˮ��
		System.out.println("ˮ��עˮ���Ρ�");
		Pool2.inlet(); // ���þ�̬��עˮ����
		Pool2.inlet(); // ���þ�̬��עˮ����
		System.out.println("ˮ�ص�ˮ����" + Pool2.water); // ���ˮ�ص�ǰˮ��
		System.out.println("ˮ�ط�ˮһ�Ρ�");
		Pool2.outlet(); // ���þ�̬�ķ�ˮ����
		System.out.println("ˮ�ص�ˮ����" + Pool2.water); // ���ˮ�ص�ǰˮ��
	}
}
