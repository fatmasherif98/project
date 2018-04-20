package paint.model;

import java.awt.Color;
import java.awt.Point;
import java.util.HashMap;
import java.util.Map;
import java.awt.Graphics;

public class Rectangle extends AbstractShape {

	private Double length;
	private Double width;
	private Map<String,Double> properties = new HashMap<>();
	
	public Rectangle(Point position, Color color, Color fillColor, Double length, Double width) {
		super(position, color, fillColor);
		this.length = length;
		this.width = width;
		properties.put("length", length);
		properties.put("width", width);
		super.setProperties(properties);
	}
	
	 public void draw(Object canvas)
	 {
	    
	    g.drawRect(this.getPosition().x, this.getPosition().y, length.intValue(), width.intValue());
       
	 }

}
