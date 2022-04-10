package lab3;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

public class RunningHolidayLights implements HolidayLights {
	
	Light my_light ;
	int size;
	int count=0;
	/**
	 * Creates new running holiday lights.
	 * @param length - length of this set of lights.
	 */
	public RunningHolidayLights(int length) {
		size = length;
		//throw new RuntimeException("RunningHolidayLights(length) not yet implemented!");
	}
	
	public List<Light> next() {
		List<Light> light_list = new ArrayList<Light>();
		for(int i=0; i<size; i++) {
			ColoredLight col = new ColoredLight();
			double h = col.e;
			double s = col.r;
			double f = col.w;
			my_light = new ColoredLight(Color.getHSBColor((float)h, (float)s, (float)f));
			my_light.randomChange();
			light_list.add(my_light);
			
		}
		light_list.get(count).setOn(true);
		count =count+1;
		if(count>=size) {
			count=0;
		}
		return light_list;
		//throw new RuntimeException("RunningHolidayLights.next() not yet implemented!");
}
	
	/**
	 * Returns the length of this
	 * @return length of this
	 */
	public int getLength() {
		return size;
		//throw new RuntimeException("RunningHolidayLights.getLength() not yet implemented!");
	}
						
}

