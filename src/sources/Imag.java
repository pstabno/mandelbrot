package sources;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Imag {

	private BufferedImage img;
	private Integer colour;
	
	public Imag(Integer x, Integer y, Integer col){
		img = new BufferedImage(x, y, col);
	}
	
	public Imag(Integer x, Integer y){
		img = new BufferedImage(x, y, BufferedImage.TYPE_BYTE_GRAY);
	}
	
//	public void addBlack(Double x, Double y, Boolean c){
//		if(c==true)
//			img.setRGB(Integer.parseInt(x.toString()), Integer.parseInt(y.toString()), 0x000000);
//		else
//			img.setRGB(Integer.parseInt(x.toString()), Integer.parseInt(y.toString()), 0xFFFFFF);
//	}
	
	public void setPixel(Double x, Double y, Integer col){
		img.setRGB(Integer.parseInt(x.toString()), Integer.parseInt(y.toString()), col);
	}
	
	public void saveImage() throws IOException{
		ImageIO.write(img, "pbm", new File( "file.pbm"));
	}
}
