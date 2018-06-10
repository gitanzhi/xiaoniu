package cn.edu360.javase.array;

/**
 * 二维数组
 * @author liuming
 * @date 2018年4月15日  下午4:24:49
 */
public class ArrayDemo6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[][] arr  =  new int[3][2];
		System.out.println(arr.length);
		System.out.println(arr[0].length);
		arr[0][2] = 10;
		
		//2
		int[][] arr1 = new int[3][];
		//2.1
		arr1[0] = new int[] {2,3,4}; 
		//arr1[2] = {1,2,3,4};//二维数组不能使用这样
		//2.2
		int[] arr3 = new int[2];
		arr3[0] = 100;
		arr3[1] = 200;
		arr1[1] = arr3;
		
		
		//3
		int[][] arr2 = {{1,3},{3},{3,5,6,7,7,3}};
		int[][] arr4 = new int[][] {{1,3},{2,45,5},{9}};
		
		//二维数组若重新赋值需要new
		arr2 = new int[][] {{1,3},{38}};
		//arr2 = {{2},{2,4,5}};//不能这样使用
		
		
		
	}
	
	

}
