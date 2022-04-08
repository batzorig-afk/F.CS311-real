package lab3;

import java.awt.Color;

import org.junit.Assert;
import org.junit.Test;

public class ColoredLightTest {

	@Test public void makeColor() {
		ColoredLight coloredLight = new ColoredLight(Color.red);
		
		Assert.assertNotNull(coloredLight.getColor());
	}
	
	@Test public void makeNotColor() {
		ColoredLight coloredLight = new ColoredLight(null);
		
		Assert.assertNull(coloredLight.getColor());
	}

	@Test public void turnColor() {
		ColoredLight coloredLight = new ColoredLight(null);
		coloredLight.setColor(Color.red);
		
		Assert.assertNotNull(coloredLight.getColor());
	}
	
	@Test public void turnNotColor() {
		ColoredLight coloredLight = new ColoredLight(Color.red);
		coloredLight.setColor(null);
		
		Assert.assertNull(coloredLight.getColor());
	}
	
	
	@Test public void testRandomChange() {
		ColoredLight coloredLight = new ColoredLight(null);
		// Call randomChange up to 100 times.
		// Probabilistically, should turn on at some point.
		Color ColorChanged = null;
		for (int i = 0; i < 100; i++) {
			coloredLight.randomChange();
			if (coloredLight.getColor() == Color.red) {
				ColorChanged = Color.red;
				break;
			}
		}
		Assert.assertEquals(ColorChanged, Color.red);
	}
	
}