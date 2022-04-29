package lab3;

import java.util.Scanner;

public class Main {
	
	public static void main(String[]  args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Gerelnii urtiig oruul:");
		int l = scan.nextInt();
		// Create HolidayLights
<<<<<<< HEAD
		HolidayLights hl = new MyHolidayLights(12);
=======
		HolidayLights hl = new MyHolidayLights(l);
>>>>>>> branch 'master' of https://github.com/batzorig-afk/F.CS311-real.git
		
		// Create and show HolidayLightsWindow
		HolidayLightsWindow frame = new HolidayLightsWindow(hl);
		frame.pack();
		frame.setVisible(true);
	}
	
}

