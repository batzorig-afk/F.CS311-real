package Lab1;

import java.util.Scanner;

public class Lab1 {
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			try {
			System.out.println("Дараалан орсон 2 элемент бүр нь ялгаатай бүхэл тоон дараалал өгөгдөнө. "+"\nТоонууд нь өгсөж яваад уруудвал тэрхүү хэсгийг оргил, уруудаж яваад өгсвөл ёроол гэе."+"\n Тоон дараалал хэдэн оргил, хэдэн ёроол үүсгэснийг ол."+"\n Дарааллын хамгийн эхний болон сүүлийн тоо оргил болон ёроолд тоологдохгүй. ");
			System.out.println("\nДараалалын элементийн тоог оруулна уу:");
			Scanner scan=new Scanner(System.in);
			int n=scan.nextInt();
			if(n>0&&n<1000) {
			int[] mas=new int[n];
			System.out.println("Дараалалын элементүүдийг оруулна уу:");
			System.out.print("n["+1+"]=");
			mas[0]=scan.nextInt();
			for(int i=1; i<n; i++) {
				System.out.print("n["+(i+1)+"]=");
		        mas[i]=scan.nextInt();
				if(mas[i-1]==mas[i]) {
					System.out.println("Өмнөх тооноос өөр тоо оруулна уу:");
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
			System.out.println("Дарааллын оргилын тоо:"+top);
			System.out.println("Дарааллын ёроолын тоо:"+bottom);
		}
			
			else {
				System.out.println("1000 с бага Эерэг бүхэл тоо оруулна уу.");
			}
			}
		catch(Exception e) {
			System.out.println("Эерэг бүхэл тоо оруулна уу.");
		}
		}
	}


