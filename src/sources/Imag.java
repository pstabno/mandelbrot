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

    public void setBg(Integer c){
        for(int i=0; i<this.img.getWidth(); i++){
            for(int j=0; j<this.img.getHeight(); j++ ){
                this.setPixel(i,j,c);
            }
        }
    }

	public void setPixel(Double x, Double y, Integer col){
		img.setRGB(Integer.parseInt(x.toString()), Integer.parseInt(y.toString()), col);
	}

    public void setPixel(Integer x, Integer y, Integer col) {
        img.setRGB(x,y,col);
    }

    public void savePbm() throws IOException{
		ImageIO.write(img, "pbm", new File( "file.pbm"));
	}

    public void savePpm() throws IOException{
        ImageIO.write(img, "ppm", new File( "file.ppm"));
    }

    public void savePgm() throws IOException{
        ImageIO.write(img, "pgm", new File( "file.pgm"));
    }
	public Integer getSizeY(){
		return img.getHeight();
	}

	public Integer getSizeX(){
		return img.getWidth();
	}

    public Integer getPixel(Integer x, Integer y){
        return img.getRGB(x,y);
    }
}
