package com.singleton;


/**
 * ������ʽ����ģʽģ���������������ͳ����
 * 
 * ��������ÿһ�������ڣ���������ͳֻ��һ�ˣ����Ա�ʵ���ʺ��õ���ģʽʵ��
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
			System.out.println("��ͬ�Ķ���");
		}else {
			System.out.println("����ͬ");
		}
	}

}

class President{
	
	private static volatile President instance=null; //��֤instance�������߳���ͬ��
	
	//private���������ⲿ��ʵ����
	private President () {
		System.out.println("����һ����ͳ");
	}
	
	public static synchronized President getInstance() {
		
		if(instance == null) {
			instance=new President();
		}else {
			System.out.println("�Ѵ���һ����ͳ�������ڲ���");
		}
		
		return instance;
		
	}
	
	public void getName() {
		System.out.println("���ǵ���ͳ��XXX");
	}
	
}
