package com.singleton;

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * ��������ģʽ
 * @author Administrator
 *
 */
public class HungrySingletonExample {
	public static void main(String[] args) {
		JFrame jframe=new JFrame("��������ģʽ");
		jframe.setLayout(new GridLayout(1, 2));
		Container container=jframe.getContentPane();
		Bajie bajie=Bajie.getInstance();
		container.add(bajie);
		Bajie bajie2=Bajie.getInstance();
		container.add(bajie2);
		if (bajie==bajie2) {
			System.out.println("һ��");
		}else {
			System.out.println("��һ��");
		}
		jframe.pack();
		jframe.setVisible(true);
		
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}


class Bajie extends JPanel{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 2673615117339735661L;
	private static Bajie instance=new Bajie();
	
	private Bajie() {
		
		JLabel label=new JLabel(new ImageIcon("src/timg.jpg"));
		this.add(label);
		
	}
	
	public static Bajie getInstance() {
		return instance;
	}
	
	
}