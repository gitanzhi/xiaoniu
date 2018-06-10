package cn.edu360.shop.front.menu;

import java.util.List;
import java.util.Scanner;

import cn.edu360.shop.front.service.CartService;
import cn.edu360.shop.front.service.CartServiceImpl;
import cn.edu360.shop.front.service.OrderService;
import cn.edu360.shop.front.service.OrderServiceImpl;
import cn.edu360.shop.front.service.UserService;
import cn.edu360.shop.front.service.UserServiceImpl;
import cn.edu360.shop.mgmt.service.ProductService;
import cn.edu360.shop.mgmt.service.ProductServiceImpl;
import cn.edu360.shop.pojo.Order;
import cn.edu360.shop.pojo.Product;

public class FrontMenu {
	
	public static void showFirstLevelMenu() {
		UserService userService = new UserServiceImpl();
		System.out.println("1.注册2.登录");
		Scanner scanner = new Scanner(System.in);
		String select = scanner.nextLine();
		switch (select) {
		case "1":
			//处理注册的逻辑
			System.out.println("请输入用户名");
			String userName = scanner.nextLine();
			System.out.println("请输入密码");
			String password = scanner.nextLine();
			System.out.println("请再次输入密码");
			String rePassword = scanner.nextLine();
			if(password.equals(rePassword)) {
				boolean isExists = userService.isExists(userName);
				if(isExists) {
					System.out.println("用户已存在");
					showFirstLevelMenu();
				}else {
					System.out.println("请输入收货地址");
					String address = scanner.nextLine();
					userService.register(userName,password,address);
					//显示购物
					showFirstLevelMenu();
				}
				
			}else {
				System.out.println("两次输入的密码不一致");
				showFirstLevelMenu();
			}
			break;
		case "2":
			//处理登录逻辑
			System.out.println("请输入用户名");
			String userName1 = scanner.nextLine();
			System.out.println("请输入密码");
			String password1 = scanner.nextLine();
			boolean success = userService.login(userName1,password1);
			if(success) {
				System.out.println("成功");
				showBuyMenu(userName1);
			}else {
				System.out.println("用户名密码错误");
				showFirstLevelMenu();
			}
			break;
		default:
			System.out.println("选择正确的菜单");
			showFirstLevelMenu();
			break;
		}
	}
	
	public static void showBuyMenu(String username) {
		ProductService productService = new ProductServiceImpl();
		CartService cartService = new CartServiceImpl();
		OrderService orderService = new OrderServiceImpl();
		System.out.println("请选择购物菜单");
		System.out.println("1.浏览商品");
		System.out.println("2.添加商品到购物车");
		System.out.println("3.查看购物车");
		System.out.println("4.修改购物车");
		System.out.println("5.提交订单");
		System.out.println("6.查看订单");
		Scanner scanner = new Scanner(System.in);
		String select = scanner.nextLine();
		switch (select) {
		case "1":
			List<Product> list = productService.getAllProducts();
			for (Product product : list) {
				System.out.println(product);
			}
			showBuyMenu(username);
			//浏览商品
			break;
		case "2":
			System.out.println("输入添加到购物车的id和购买数量");
			String input = scanner.nextLine();
			String[] split = input.split(",");
			cartService.addItemToCart(username,split[0],Integer.parseInt(split[1]));
			//添加到购物车
			showBuyMenu(username);
			break;
		case "3":
			//查看购物车
			List<Product> cartList = cartService.getUserCart(username);
			for (Product product : cartList) {
				System.out.println(product);
			}
			showBuyMenu(username);
			break;
		case "4":
			//修改购物车
			System.out.println("1.修改商品购买数量，2.删除购物项");
			select = scanner.nextLine();
			if("1".equals(select)) {
				System.out.println("请输入要修改的商品id及新的数量，例如（pid,8）");
				String info = scanner.nextLine();
				String[] split2 = info.split(",");
				cartService.updateUserCart(username,split2[0],Integer.parseInt(split2[1]));
				
			}else {
				System.out.println("请输入要删除的商品Id");
				String pid = scanner.nextLine();
				cartService.updateUserCart(username, pid, -1);
			}
			showBuyMenu(username);
			break;
		case "5":
			orderService.submitOrder(username);
			System.out.println("订单提交成功");
			
			//提交订单
			showBuyMenu(username);
			break;
		case "6":
			List<Order> orderList = orderService.showOrders(username);
			for (Order order : orderList) {
				System.out.println(order);
			}
			showBuyMenu(username);
			break;
			//查看订单
		default:
			//跳回购物菜单
			System.out.println("选择正确的菜单项");
			showBuyMenu(username);
			break;
		}
	}
}
