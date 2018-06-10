package cn.edu360.shop.mgmt.menu;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Scanner;

import cn.edu360.shop.pojo.Product;

/**
 * 后台管理系统的启动类
 * 提供欢迎界面
 * @author Administrator
 *
 */
public class BootStrap {

	public static void main(String[] args) throws Exception {
		System.out.println("欢迎来到小牛售货机，选择菜单");
		MgmtMenu.showMainMenu();	
		
	}

}
