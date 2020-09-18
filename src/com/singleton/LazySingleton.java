package com.singleton;

/**
 * 懒汉单例模式
 * 该模式特点：类加载时没有生成单例，只有当第一次调用 getInstance方法才会去创建这个单例
 * @author Administrator
 *
 */
public class LazySingleton {

	/** 
	 * 如果编写的是多线程程序，则不要删除上例代码中的关键字 volatile 和 synchronized，否则将存在线程非安全的问题。
	 * 如果不删除这两个关键字就能保证线程安全，但是每次访问时都要同步，会影响性能，且消耗更多的资源，这是懒汉式单例的缺点
	 **/
	
	private static volatile LazySingleton instance=null; //保证instance在所有线程中同步
	
	private LazySingleton() {}; //private 避免内在外部被实例化
	
	public static synchronized LazySingleton getInstance() {
		
		//getInstance方法前加同步
		if(instance==null) {
			instance=new LazySingleton();
		}
		
		return instance;
		
	}
}
