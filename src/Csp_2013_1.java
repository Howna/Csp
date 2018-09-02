
import java.util.Scanner;
/*
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
