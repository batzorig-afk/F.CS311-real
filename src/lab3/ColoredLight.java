package lab3;

import java.awt.Color;
import java.util.Random;

public class ColoredLight extends Light{
	
	Color color;
	Random r = new Random();
	/**
	 * Creates a new colored light.
	 * @param color - color of this light.
	 */public ColoredLight(){
		 super();
	 }
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
		color = new Color(r.nextFloat(), r.nextFloat(), r.nextFloat());
		//throw new RuntimeException("ColoredLight.randomChange() not yet implemented!");
	}
	
}
