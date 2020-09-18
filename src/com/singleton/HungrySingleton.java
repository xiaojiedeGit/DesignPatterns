package com.singleton;

/**
 * ����ʽ����
 * �ص㣺��һ�����ؾʹ���һ�����У���֤�ڵ���getInstance����֮ǰ�������Ѿ�����
 * @author Administrator
 *
 */
public class HungrySingleton {

	/**
	 * ����ʽ�������ഴ����ͬʱ���Ѿ�������һ����̬�Ķ���ϵͳʹ�ã��Ժ��ٸı䣬�������̰߳�ȫ�ģ�����ֱ�����ڶ��̶߳������������
	 */
	
	private static final HungrySingleton instance=new HungrySingleton();
	
	private HungrySingleton() {};
	
	public static HungrySingleton getInstance() {
		return instance;
	}
	
	
}
