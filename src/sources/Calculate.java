package sources;

import java.io.IOException;

public class Calculate {
	
	public static void main(String[] args) throws IOException {
        Mandelbrot m = new Mandelbrot(1920,1080,255);
//        m.getImage().savePbm();
        m.generateMandelbrot();
        m.saveImg(2);
	}
}
