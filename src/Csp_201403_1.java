import java.util.Scanner;

/*
 * 问题描述

　　有 N 个非零且各不相同的整数。请你编一个程序求出它们中有多少对相反数(a 和 -a 为一对相反数)。

输入格式

　　第一行包含一个正整数 N。(1 ≤ N ≤ 500)。
 　　第二行为 N 个用单个空格隔开的非零整数,每个数的绝对值不超过1000,保证这些整数各不相同。

输出格式

　　只输出一个整数,即这 N 个数中包含多少对相反数。

样例输入

5
 1 2 3 -1 -2

样例输出

2
基本思路：
1.两个数相加为0时，这两个数必为相反数。可以暴力，但是应该有更好的办法吧
2.
 */
public class Csp_201403_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int num=0;
		int[] arr = new int[501];
		//先把所有的数据存放进数组 
		for(int i=0; i<N; i++) {
			arr[i] = sc.nextInt();
		}
		//用暴力遍历数组找出所有的相反数
		for(int i=0; i<N; i++) {
			for(int j=i+1; j<N; j++) {
				if((arr[i] + arr[j])==0) {
					num++;
				}
					
			}	
				
		}
		System.out.println(num);
	}
}
