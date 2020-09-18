package com.singleton;

/**
 * ��������ģʽ
 * ��ģʽ�ص㣺�����ʱû�����ɵ�����ֻ�е���һ�ε��� getInstance�����Ż�ȥ�����������
 * @author Administrator
 *
 */
public class LazySingleton {

	/** 
	 * �����д���Ƕ��̳߳�����Ҫɾ�����������еĹؼ��� volatile �� synchronized�����򽫴����̷߳ǰ�ȫ�����⡣
	 * �����ɾ���������ؼ��־��ܱ�֤�̰߳�ȫ������ÿ�η���ʱ��Ҫͬ������Ӱ�����ܣ������ĸ������Դ����������ʽ������ȱ��
	 **/
	
	private static volatile LazySingleton instance=null; //��֤instance�������߳���ͬ��
	
	private LazySingleton() {}; //private ���������ⲿ��ʵ����
	
	public static synchronized LazySingleton getInstance() {
		
		//getInstance����ǰ��ͬ��
		if(instance==null) {
			instance=new LazySingleton();
		}
		
		return instance;
		
	}
}
