import java.util.Scanner;
/*
��������:
����ÿһ����ʽ�����ͼ�鶼��һ��ISBN������֮��Ӧ��ISBN�����9λ���֡�1λʶ�����3λ�ָ�������涨��ʽ�硰x-xxx-xxxxx-x�������з��š�-���Ƿָ����������ϵļ��ţ������һλ��ʶ���룬����0-670-82162-4����һ����׼��ISBN�롣ISBN�����λ���ֱ�ʾ�鼮�ĳ������ԣ�����0����Ӣ���һ���ָ�����-��֮�����λ���ִ�������磬����670����ά�������磻�ڶ����ָ�֮�����λ���ִ�������ڳ�����ı�ţ����һλΪʶ���롣
 ����ʶ����ļ��㷽�����£�
 ������λ���ֳ���1���ϴ�λ���ֳ���2�����Դ����ƣ������õĽ��mod 11�����õ�������Ϊʶ���룬�������Ϊ10����ʶ����Ϊ��д��ĸX������ISBN����0-670-82162-4�е�ʶ����4�������õ��ģ���067082162��9�����֣��������ң��ֱ����1��2������9������ͣ���0��1+6��2+����+2��9=158��Ȼ��ȡ158 mod 11�Ľ��4��Ϊʶ���롣
 ������д�����ж������ISBN������ʶ�����Ƿ���ȷ�������ȷ����������Right��������������������ȷ��ISBN���롣
�����ʽ:
��������ֻ��һ�У���һ���ַ����У���ʾһ�����ISBN���루��֤�������ISBN����ĸ�ʽҪ�󣩡�
�����ʽ:
�������һ�У����������ISBN�����ʶ������ȷ����ô�����Right�������򣬰��չ涨�ĸ�ʽ�������ȷ��ISBN���루�����ָ�����-������
��������:
	0-670-82162-4
�������:
	Right
��������:
	0-670-82162-0
�������:
	0-670-82162-4
 */
public class Csp_2013_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		//String sk = "-";
		char sk = '-';
			//if(!sk.equals(s.charAt(1))||!sk.equals(s.charAt(5))||!sk.equals(s.charAt(11))) {
		      if(sk!=s.charAt(1)||sk!=s.charAt(5)||sk!=s.charAt(11)) {
				System.out.println("wrong input");
			}else {
				int k = (Integer.parseInt(s.charAt(0))*1+Integer.parseInt(s.charAt(2))*2+Integer.parseInt(s.charAt(3))*3+Integer.parseInt(s.charAt(4))*4+Integer.parseInt(s.charAt(6))*5+Integer.parseInt(s.charAt(7))*6+Integer.parseInt(s.charAt(8))*7+Integer.parseInt(s.charAt(9))*8+Integer.parseInt(s.charAt(10))*9+Integer.parseInt(s.charAt(12))*10) %11;
				if(k==s.charAt(12)) {
					System.out.println("Right");	
				}else {
					for(int j=0;j<12;j++) {
						System.out.print(s.charAt(j));
					}
					System.out.println(k);
				}
			}	
		}
	}