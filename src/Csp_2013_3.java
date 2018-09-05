import java.util.Scanner;

/*
问题描述:
　　在横轴上放了n个相邻的矩形，每个矩形的宽度是1，而第i（1 ≤ i ≤ n）个矩形的高度是hi。这n个矩形构成了一个直方图。例如，下图中六个矩形的高度就分别是3, 1, 6, 5, 2, 3。
　　请找出能放在给定直方图里面积最大的矩形，它的边要与坐标轴平行。对于上面给出的例子，最大矩形如下图所示的阴影部分，面积是10。
输入格式:
　　第一行包含一个整数n，即矩形的数量(1 ≤ n ≤ 1000)。
 　　第二行包含n 个整数h1, h2, … , hn，相邻的数之间由空格分隔。(1 ≤ hi ≤ 10000)。hi是第i个矩形的高度。
输出格式:
　　输出一行，包含一个整数，即给定直方图内的最大矩形的面积。
样例输入:
6
 3 1 6 5 2 3
样例输出:
10

*******************************************************************
基本思路：
1.对于每一个矩形，分成两边遍历，遇到比自己高度高的就继续遍历，否则就跳出，最终得到对于特定的每一个矩形所能得到的最大宽度，再用宽度*高度，就能得到最大的矩形面积。
 */
public class Csp_2013_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int result = 0;
		int n = sc.nextInt();
		int[] arr = new int[1001];
		for(int i=0; i<n; i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0; i<n; i++) {
			int width=1;
			for(int j=i-1; j>=0; j--) {
				if(arr[j]<arr[i]) {
					break;
				}
				width++;
			}
			for(int j=i+1; j<n; j++) {
				if(arr[j]<arr[i]) {
					break;
				}
				width++;
			}
			
			int area = width * arr[i];
			result = Math.max(result,area);
		}
		
		System.out.println("result"+"=:"+result);
	}		
}
