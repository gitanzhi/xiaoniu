package cn.edu360.shop.mgmt.menu;

import java.util.List;
import java.util.Scanner;

import cn.edu360.shop.mgmt.service.ProductService;
import cn.edu360.shop.mgmt.service.ProductServiceImpl;
import cn.edu360.shop.pojo.Product;

public class MgmtMenu {
	
	/*
	 * 显示主菜单
	 */
	public static void showMainMenu() {
		
		System.out.println("1:添加商品2浏览商品 3.上架商品 4.下架商品");
		
		Scanner scanner = new Scanner(System.in);
		String select = scanner.nextLine();
		
		switch (select) {
			case "1":
				System.out.println("您选择的是添加商品");
				//处理添加商品
				addItem(scanner);
				break;
			case "2":
				System.out.println("您选择的是浏览商品");
				showItems(scanner);
				//处理浏览商品
				break;
			case "3":
				System.out.println("您选择的是上架商品");
				//处理上架商品
				break;
			case "4":
				System.out.println("您选择的是下架商品");
				//处理下架商品
				break;
	
			default:
				System.out.println("请选择正确的菜单项");
				showMainMenu();
				break;
		}
	}
	
	
	/*
	 * 添加商品
	 */
	public static void addItem(Scanner scanner) {
		
		ProductService productService = new ProductServiceImpl();
		
		//显示目前商品库的类目信息
		List<String> categories = productService.getCategories();
		System.out.println(categories);
		
		//提示管理员输入商品信息
		System.out.println("请输入要添加的商品信息，格式为：商品名称,价格,类别,库存数量");
		
		
		//获取管理员输入的信息
		String pInfo = scanner.nextLine();
		
		//调用service的添加方法
		productService.addItem(pInfo);
				
		//回显一级菜单
		showMainMenu();
	}
	
	/*
	 * 浏览商品的二级菜单交互逻辑
	 */
	public static void showItems(Scanner scanner) {
		ProductService productService = new ProductServiceImpl();
		System.out.println("请选择1：浏览所有商品，2，根据ID查看商品 3.根据商品类别查看");
		String select = scanner.nextLine();
		switch (select) {
			case "1":
				//查询所有商品
				List<Product> pList = productService.getAllProducts();
				for (Product product : pList) {
					System.out.println(product);
				}
				showMainMenu();
				break;
			case "2":
				System.out.println("输入商品ID");
				String pId = scanner.nextLine();
				//根据ID查询商品并展现
				Product product = productService.getProductById(pId);
				System.out.println(product);
				showMainMenu();
				break;
			case "3":
				//TODO
				break;
			default:
				System.out.println("输入正确的菜单项");
				showItems(scanner);
				break;
		}
	}
}
