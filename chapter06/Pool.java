package Chapter06;

public class Pool { // ����ˮ����
	public static int water = 0; // ��ʼ����̬����֮ˮ���е�ˮ��Ϊ0

	public void outlet() { // ��ˮ��һ�ηų�2����λ
		if (water >= 2) { // ���ˮ���е�ˮ�����ڵ���2����λ
			water = water - 2; // �ų�2����λ��ˮ
		} else { // ���ˮ���е�ˮ��С��2����λ
			water = 0; // ˮ���е�ˮ��Ϊ0
		}
	}
	public void inlet() { // עˮ��һ��ע��3����λ
		water = water + 3; // ע��3����λ��ˮ
	}

	public static void main(String[] args) {
		Pool pool = new Pool(); // ����ˮ�ض���
		Pool pool2 = new Pool();
		System.out.println("ˮ�ص�ˮ����" + Pool.water); // ���ˮ�ص�ǰˮ��
		System.out.println("ˮ��עˮ���Ρ�");
		pool.inlet(); // ����עˮ����
		pool2.inlet(); // ����עˮ����
		System.out.println("ˮ�ص�ˮ����" + Pool.water); // ���ˮ�ص�ǰˮ��
		System.out.println("ˮ�ط�ˮһ�Ρ�");
		pool.outlet(); // ���÷�ˮ����
		System.out.println("ˮ�ص�ˮ����" + Pool.water); // ���ˮ�ص�ǰˮ��
	}
}
