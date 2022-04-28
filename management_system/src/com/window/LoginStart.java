package com.window;

import java.awt.Toolkit;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.Font;
public class LoginStart extends JFrame{
	FlowLayout flowlayout;//定义一个布局
//需要5个标签 和一个文本框，和一个密码框 和一个登录按钮
    JLabel bgimg;
    JLabel register;
    JLabel account;
    JLabel password;
    JLabel title;
    JTextField accounttext;//输入账号文本
    JPasswordField passwordtext;
    JButton ok;//登陆按钮
    //窗口变量
     final int WIDTH=1000;
     final int HEIGHT=600;
    javax.swing.JPanel jpanel_1;//放图片的
    javax.swing.JPanel jpanel_2;//放标题的
    javax.swing.JPanel jpanel_3;
	public LoginStart() {
		
		setVisible(true);//设置当前窗口是否可显示
		init();
		setResizable(false);//窗口大小不可变
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);//设置默认关闭方式
		validate();//让组件生效
	}
	
	void init() {
		//设置当前窗口的大小
	 jpanel_1=new javax.swing.JPanel();
	 jpanel_1.setBounds(0,0,WIDTH, HEIGHT);
	 jpanel_1.setLayout(null);
	 jpanel_2=new javax.swing.JPanel();
	 jpanel_2.setBounds(0,0,WIDTH, 100);
	 flowlayout=new FlowLayout(FlowLayout.CENTER);
	 jpanel_2.setLayout(flowlayout);
	 jpanel_2.setOpaque(false);
	 jpanel_3=new javax.swing.JPanel();
	 jpanel_3.setBounds(300,200,400, 200);
	 flowlayout=new FlowLayout(FlowLayout.CENTER);
	 jpanel_3.setLayout(flowlayout);
	 jpanel_3.setOpaque(false);
	 jpanel_3.setBorder(BorderFactory.createTitledBorder(""));
	 
	 //初始化字体类
	 Fonts fonts=new Fonts();
	 //设置当前窗口大小
	 Toolkit kit =Toolkit.getDefaultToolkit();//获取对象大小
	 Dimension screenSize=kit.getScreenSize();
	 int width=screenSize.width;
	 int height=screenSize.height;
	 int x=(width-WIDTH)/2;
	 int y=(height-HEIGHT)/2;
	 setSize(WIDTH,HEIGHT);
	 setSize(WIDTH,HEIGHT);
	 setLocation(x,y);
	 
	 //设置背景图片
	 ImageIcon img=new ImageIcon("src/img/steering.jpeg");
	 bgimg=new JLabel(img);
	 bgimg.setBounds(0,0,img.getIconWidth(), img.getIconHeight());
	 //添加标题
	 title=new JLabel("事故线索管理系统");
	 title.setFont(fonts.title);
	 title.setForeground(Color.green);
	 
	 //添加账号以及编辑框
	 account=new JLabel("账号");
	 account.setFont(fonts.account);
	 account.setForeground(Color.green);
	 //添加账号文本框
	 accounttext=new JTextField(8);
	 accounttext.setFont(fonts.account);
	 accounttext.setForeground(Color.black);
	 //添加密码及编辑框
	 password=new JLabel("密码");
	 password.setFont(fonts.password);
	 password.setForeground(Color.green);
	 //添加密码文本框
	 passwordtext=new JPasswordField(8);
	 passwordtext.setFont(fonts.password);
	 //登录按钮
	 ok=new JButton("安全登陆");
	 ok.setPreferredSize(new Dimension(100,50));
	 //注册标签
	 register=new JLabel("注册");
	 register.setBounds(335,300,100,100);
	 register.setForeground(Color.green);
	 register.setFont(fonts.register);

	 
	 
	 //添加的操作
	 jpanel_1.add(register);
	 jpanel_3.add(account);
	 jpanel_3.add(accounttext);
	 jpanel_3.add(password);
	 jpanel_3.add(passwordtext);
	 jpanel_3.add(ok);
	 
	 jpanel_2.add(title);
	 jpanel_1.add(jpanel_2);
	 jpanel_1.add(jpanel_3);
	 jpanel_1.add(bgimg);
	 this.add(jpanel_1);
	 
	 
	 
	 
		
	}
	

}
