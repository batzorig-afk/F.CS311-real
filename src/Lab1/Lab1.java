package Lab1;

import java.util.Scanner;

public class Lab1 {
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			//hi ganzo...
			try {
			System.out.println("Ð”Ð°Ñ€Ð°Ð°Ð»Ð°Ð½ Ð¾Ñ€Ñ�Ð¾Ð½ 2 Ñ�Ð»ÐµÐ¼ÐµÐ½Ñ‚ Ð±Ò¯Ñ€ Ð½ÑŒ Ñ�Ð»Ð³Ð°Ð°Ñ‚Ð°Ð¹ Ð±Ò¯Ñ…Ñ�Ð» Ñ‚Ð¾Ð¾Ð½ Ð´Ð°Ñ€Ð°Ð°Ð»Ð°Ð» Ó©Ð³Ó©Ð³Ð´Ó©Ð½Ó©. "+"\nÐ¢Ð¾Ð¾Ð½ÑƒÑƒÐ´ Ð½ÑŒ Ó©Ð³Ñ�Ó©Ð¶ Ñ�Ð²Ð°Ð°Ð´ ÑƒÑ€ÑƒÑƒÐ´Ð²Ð°Ð» Ñ‚Ñ�Ñ€Ñ…Ò¯Ò¯ Ñ…Ñ�Ñ�Ð³Ð¸Ð¹Ð³ Ð¾Ñ€Ð³Ð¸Ð», ÑƒÑ€ÑƒÑƒÐ´Ð°Ð¶ Ñ�Ð²Ð°Ð°Ð´ Ó©Ð³Ñ�Ð²Ó©Ð» Ñ‘Ñ€Ð¾Ð¾Ð» Ð³Ñ�Ðµ."+"\n Ð¢Ð¾Ð¾Ð½ Ð´Ð°Ñ€Ð°Ð°Ð»Ð°Ð» Ñ…Ñ�Ð´Ñ�Ð½ Ð¾Ñ€Ð³Ð¸Ð», Ñ…Ñ�Ð´Ñ�Ð½ Ñ‘Ñ€Ð¾Ð¾Ð» Ò¯Ò¯Ñ�Ð³Ñ�Ñ�Ð½Ð¸Ð¹Ð³ Ð¾Ð»."+"\n Ð”Ð°Ñ€Ð°Ð°Ð»Ð»Ñ‹Ð½ Ñ…Ð°Ð¼Ð³Ð¸Ð¹Ð½ Ñ�Ñ…Ð½Ð¸Ð¹ Ð±Ð¾Ð»Ð¾Ð½ Ñ�Ò¯Ò¯Ð»Ð¸Ð¹Ð½ Ñ‚Ð¾Ð¾ Ð¾Ñ€Ð³Ð¸Ð» Ð±Ð¾Ð»Ð¾Ð½ Ñ‘Ñ€Ð¾Ð¾Ð»Ð´ Ñ‚Ð¾Ð¾Ð»Ð¾Ð³Ð´Ð¾Ñ…Ð³Ò¯Ð¹. ");
			System.out.println("\nÐ”Ð°Ñ€Ð°Ð°Ð»Ð°Ð»Ñ‹Ð½ Ñ�Ð»ÐµÐ¼ÐµÐ½Ñ‚Ð¸Ð¹Ð½ Ñ‚Ð¾Ð¾Ð³ Ð¾Ñ€ÑƒÑƒÐ»Ð½Ð° ÑƒÑƒ:");
			Scanner scan=new Scanner(System.in);
			int n=scan.nextInt();
			if(n>0&&n<1000) {
			int[] mas=new int[n];
			System.out.println("Ð”Ð°Ñ€Ð°Ð°Ð»Ð°Ð»Ñ‹Ð½ Ñ�Ð»ÐµÐ¼ÐµÐ½Ñ‚Ò¯Ò¯Ð´Ð¸Ð¹Ð³ Ð¾Ñ€ÑƒÑƒÐ»Ð½Ð° ÑƒÑƒ:");
			System.out.print("n["+1+"]=");
			mas[0]=scan.nextInt();
			for(int i=1; i<n; i++) {
				System.out.print("n["+(i+1)+"]=");
		        mas[i]=scan.nextInt();
				if(mas[i-1]==mas[i]) {
					System.out.println("Ó¨Ð¼Ð½Ó©Ñ… Ñ‚Ð¾Ð¾Ð½Ð¾Ð¾Ñ� Ó©Ó©Ñ€ Ñ‚Ð¾Ð¾ Ð¾Ñ€ÑƒÑƒÐ»Ð½Ð° ÑƒÑƒ:");
					System.out.print("n["+(i+1)+"]=");
					mas[i]=scan.nextInt();
				}
				else {
					System.out.print("");
				}
			}
			int top=0;
			int bottom=0;
			for(int i=1; i<(n-1); i++) {
				if(mas[i-1]<mas[i]&&mas[i]>mas[i+1]) {
					top=top+1;
				}
				else if(mas[i-1]>mas[i]&&mas[i]<mas[i+1]) {
					bottom=bottom+1;
				}
			}
			System.out.println("Ð”Ð°Ñ€Ð°Ð°Ð»Ð»Ñ‹Ð½ Ð¾Ñ€Ð³Ð¸Ð»Ñ‹Ð½ Ñ‚Ð¾Ð¾:"+top);
			System.out.println("Ð”Ð°Ñ€Ð°Ð°Ð»Ð»Ñ‹Ð½ Ñ‘Ñ€Ð¾Ð¾Ð»Ñ‹Ð½ Ñ‚Ð¾Ð¾:"+bottom);
		}
			
			else {
				System.out.println("1000 Ñ� Ð±Ð°Ð³Ð° Ð­ÐµÑ€Ñ�Ð³ Ð±Ò¯Ñ…Ñ�Ð» Ñ‚Ð¾Ð¾ Ð¾Ñ€ÑƒÑƒÐ»Ð½Ð° ÑƒÑƒ.");
			}
			}
		catch(Exception e) {
			System.out.println("Ð­ÐµÑ€Ñ�Ð³ Ð±Ò¯Ñ…Ñ�Ð» Ñ‚Ð¾Ð¾ Ð¾Ñ€ÑƒÑƒÐ»Ð½Ð° ÑƒÑƒ.");
		}
		}
	}


