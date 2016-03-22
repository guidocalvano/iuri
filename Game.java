import java.lang.Math;
import java.lang.System;

class Game
{
	public void drawFrame(Frame nextFrame)
	{
		// oi iuri

		nextFrame.write("Assim pode fazer um punto", 5, 20, 0, 255, 0);

		int x = 30 ;
		int y = 30  ;

		int r = 255 ;
		int g = 0   ;
		int b = 0   ;

		nextFrame.set(x, y, r, g, b);

		nextFrame.write("Assim pode fazer uma sequencia de numeros", 5, 60, 0, 255, 0);

		for (int i = 0; i < 10; i++)
		{
			nextFrame.write(i, i * 10, 80, 255, 0, 255);
		}

		nextFrame.write("Em baixo desenha uma linha", 5, 100, 0, 255, 0);

	}
}