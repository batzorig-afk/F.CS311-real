package lab3;

import java.util.List;
import java.util.Collections;

/**
 * Represents a sequence of lights that periodically changes
 * appearence.
 */

public interface HolidayLights {

	/**
	 * Appearence of lights at next time slice.
	 * @return appearence of lights at next time slice.
	 */
	public List<Light> next();
	
}