
import java.util.Scanner;
/*
 * ֱ�Ӱ����ŵ��������棬�������ʼ��Ϊ0��Ȼ������������飬arr[king]++ʹ��ÿ����һ����ͬ������ʱ��
 * ������ĸ����ͼ���1���൱��������һ������ﵽ��ͳ��ÿ�����ݸ�����Ŀ�ģ�ͦ����ģ�����arr��kind�����ֵ�е�king�ҵ�
 * �Ϳ����ҵ����ִ����������ˡ�
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
		for(int i=0; i<10001; i++) {//����iӦ��С��10001.������n.��Ϊ���������ŵ�����ֵ�ˣ�
						            //���ֵ�ķ�Χ��1��10000����ʱ���д��i<n��Ȼ��Щ�����������ͳ�ƺͱȽϡ�
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
