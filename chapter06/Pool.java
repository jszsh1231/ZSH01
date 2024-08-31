package Chapter06;

public class Pool { // 创建水池类
	public static int water = 0; // 初始化静态变量之水池中的水量为0

	public void outlet() { // 放水，一次放出2个单位
		if (water >= 2) { // 如果水池中的水量大于等于2个单位
			water = water - 2; // 放出2个单位的水
		} else { // 如果水池中的水量小于2个单位
			water = 0; // 水池中的水量为0
		}
	}
	public void inlet() { // 注水，一次注入3个单位
		water = water + 3; // 注入3个单位的水
	}

	public static void main(String[] args) {
		Pool pool = new Pool(); // 创建水池对象
		Pool pool2 = new Pool();
		System.out.println("水池的水量：" + Pool.water); // 输出水池当前水量
		System.out.println("水池注水两次。");
		pool.inlet(); // 调用注水方法
		pool2.inlet(); // 调用注水方法
		System.out.println("水池的水量：" + Pool.water); // 输出水池当前水量
		System.out.println("水池放水一次。");
		pool.outlet(); // 调用放水方法
		System.out.println("水池的水量：" + Pool.water); // 输出水池当前水量
	}
}
