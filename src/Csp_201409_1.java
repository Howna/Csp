import java.util.Scanner;

/*
��������
��������n����ͬ������������Щ�����ж��ٶ����������ǵ�ֵ�������1��
�����ʽ
��������ĵ�һ�а���һ������n����ʾ���������ĸ�����
 �����ڶ��а�����������n��������
�����ʽ
�������һ����������ʾֵ�������1�����Եĸ�����
��������
6
 10 2 6 3 7 8
�������
3
����˵��
����ֵ�������1�����԰���(2, 3), (6, 7), (7, 8)��
����������ģ��Լ��
����1<=n<=1000������������Ϊ������10000�ķǸ�������
 */
public class Csp_201409_1 {
	 public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		int n = sc.nextInt();
		int[] arr = new int[1001];
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		for(int i=0; i<n; i++) {
			for(int j=i+1; j<n; j++) {
				if((arr[i]-arr[j]==1) || (arr[i]-arr[j]==-1)){
					num++;
				}
			}
				
		}
			
		System.out.println(num);	
	}
}
