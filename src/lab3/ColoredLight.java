package lab3;

import java.awt.Color;

public class ColoredLight extends Light{
	
	Color color;
	/**
	 * Creates a new colored light.
	 * @param color - color of this light.
	 */
	public ColoredLight(Color color) {
		// TODO
		super(true);
		this.color = color;
		//throw new RuntimeException("ColoredLight(Color) not yet implemented!");
	}
	
	/**
	 * Returns the color of this light.
	 * @return color of this light.
	 */
	public Color getColor() {
		return color;
		//throw new RuntimeException("ColoredLight.getColor() not yet implemented!");
	}
	
	/**
	 * Changes the color of this light to be c.
	 */
	public void setColor(Color c) {
		color = c;
		//throw new RuntimeException("ColoredLight.setColor() not yet implemented!");
	}
	
	/**
	 * Randomly changes this light to be on or off and its color.
	 */
	@Override
	public void randomChange() {
		double a;
		a = Math.random();
		if(a<0.2) {
			color = Color.red;
		}
		else if(a>=0.2&&a<0.4) {
			color = Color.green;
		}
		else if(a>=0.4&&a<0.6) {
			color = Color.blue;
		}
		else if(a>=0.6&&a<0.8) {
			color = Color.yellow;
		}
		else if(a>=0.8&&a<1) {
			color = Color.pink;
		}
		//throw new RuntimeException("ColoredLight.randomChange() not yet implemented!");
	}
	
}
