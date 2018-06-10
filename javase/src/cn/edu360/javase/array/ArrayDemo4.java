package cn.edu360.javase.array;

/**
 *	数组逆序交换
 * @author liuming
 * @date 2018年4月15日  下午3:58:26
 */
public class ArrayDemo4 {
	public static void main(String[] args) {
		int[] arr = {2,4,4,5,245,567,412};
		
		ArrayUtil.printArr(ArrayUtil.reserve(arr));
		ArrayUtil.printArr(ArrayUtil.reserve1(arr));
	}
}
