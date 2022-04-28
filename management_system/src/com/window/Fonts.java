package com.window;
import java.awt.Font;

public class Fonts {
	public static Font title;
	public static Font account;
	public static Font password;
	public static Font register;
	public Fonts() {
		title=new Font("宋体",Font.BOLD,40);//标题字体
		account=new Font("宋体",Font.BOLD,35);
		password=new Font("宋体",Font.BOLD,35);
		register=new Font("宋体",Font.BOLD,20);
	}

}
