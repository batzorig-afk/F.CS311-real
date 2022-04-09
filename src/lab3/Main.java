package lab3;

import java.util.Scanner;

public class Main {
	
	public static void main(String[]  args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Gerelnii urtiig oruul:");
		int l = scan.nextInt();
		// Create HolidayLights
		HolidayLights hl = new MyHolidayLights(l);
		
		// Create and show HolidayLightsWindow
		HolidayLightsWindow frame = new HolidayLightsWindow(hl);
		frame.pack();
		frame.setVisible(true);
	}
	
}

