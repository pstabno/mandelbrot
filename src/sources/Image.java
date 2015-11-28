package sources;

import java.awt.image.BufferedImage;
import java.io.IOException;

public class Image {

	private BufferedImage img;

	public Image(Integer x, Integer y, Integer col){
		img = new BufferedImage(x, y, col);
	}
	
	public Image(Integer x, Integer y){
		img = new BufferedImage(x, y, BufferedImage.TYPE_INT_RGB);
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
		new ImagePbm(img, img.getWidth(), img.getHeight()).savePbm();
	}

    public void savePpm() throws IOException{
        new ImagePgm(img, img.getWidth(), img.getHeight()).savePgm();
    }

    public void savePgm() throws IOException{
        new ImagePpm(img, img.getWidth(), img.getHeight()).savePpm();
    }
}
