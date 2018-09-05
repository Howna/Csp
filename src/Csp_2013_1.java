
import java.util.Scanner;
/*
问题描述：
　　给定n个正整数，找出它们中出现次数最多的数。如果这样的数有多个，请输出其中最小的一个。
输入格式：
　　输入的第一行只有一个正整数n(1 ≤ n ≤ 1000)，表示数字的个数。
 　 输入的第二行有n个整数s1, s2, …, sn (1 ≤ si ≤ 10000, 1 ≤ i ≤ n)。相邻的数用空格分隔。
输出格式：
　　输出这n个次数中出现次数最多的数。如果这样的数有多个，输出其中最小的一个。
样例输入：
6
 10 1 10 20 30 20
样例输出：
10
基本思路：
 * 直接把数放到数组里面，将数组初始化为0，然后遍历整个数组，arr[king]++使得每遇到一个相同的数的时候，
 * 这个数的个数就加了1，相当于是用了一个数组达到了统计每个数据个数的目的，挺巧妙的，最后把arr【kind】最大值中的king找到
 * 就可以找到出现次数最多的数了。
 */

public class Csp_2013_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int kind=0;
		int[] arr = new int[10001];
			for(int i=0; i<n; i++) {
				kind = sc.nextInt();
				arr[kind] ++ ;	
		}
		int max = 0,j = 0;
		for(int i=0; i<10001; i++) {//这里i应该小于10001.而不是n.因为你数组里存放的是数值了，
						            //这个值的范围是1到10000，这时如果写成i<n显然有些数都不会进入统计和比较。
			if(max < arr[i]) {
				max = arr[i];
				j = i;
			}else if(max==arr[i]) {
				if(i<j) {
					j=i;
				}
			}
		}
		System.out.println(j);

	}
}
