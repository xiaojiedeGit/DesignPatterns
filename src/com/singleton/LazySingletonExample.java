package com.singleton;


/**
 * 用懒汉式单例模式模拟产生美国当今总统对象
 * 
 * 分析：在每一届任期内，美国的总统只有一人，所以本实例适合用单例模式实现
 * @author Administrator
 *
 */
public class LazySingletonExample {
	
	public static void main(String[] args) {
		
		President president=President.getInstance();
		president.getName();
		
		President president2=President.getInstance();
		president2.getName();
		
		if (president==president2) {
			System.out.println("相同的东西");
		}else {
			System.out.println("不相同");
		}
	}

}

class President{
	
	private static volatile President instance=null; //保证instance在所有线程中同步
	
	//private避免内在外部被实例化
	private President () {
		System.out.println("产生一个总统");
	}
	
	public static synchronized President getInstance() {
		
		if(instance == null) {
			instance=new President();
		}else {
			System.out.println("已存在一个总统，不能在产生");
		}
		
		return instance;
		
	}
	
	public void getName() {
		System.out.println("我们的总统是XXX");
	}
	
}
