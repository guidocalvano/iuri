import java.awt.Color;
import java.awt.Graphics2D;
import java.lang.System;

class Frame
{
	Graphics2D g2d;
	int width;
	int height;

	double time;

	public Frame() {}

	public Frame init(Graphics2D g2d, int width, int height)
	{
		this.g2d = g2d;

		this.width  = width;
		this.height = height;

		this.time = (double) System.currentTimeMillis() / 1000.0;

        clear();

        return this;
	}

	public void clear()
	{
		g2d.setPaint(Color.black);

		g2d.fillRect(0, 0, width, height);
	}

	public void set(int x, int y, int r, int g, int b)
	{
        g2d.setPaint(new Color(r, g, b));

		g2d.drawLine(x, y, x, y);
	}

	public double time()
	{
		return time;
	}

	public int width()
	{
		return width;
	}

	public int height()
	{
		return height;
	}

	public void write(String text, int x, int y, int r, int g, int b)
	{
		g2d.setPaint(new Color(r, g, b));
		g2d.drawString(text, x, y);
	}

	public void write(int text, int x, int y, int r, int g, int b)
	{
        g2d.setPaint(new Color(r, g, b));
		g2d.drawString(Integer.toString(text), x, y);
	}

	public void write(double text, int x, int y, int r, int g, int b)
	{
        g2d.setPaint(new Color(r, g, b));
		g2d.drawString(Double.toString(text), x, y);
	}


}