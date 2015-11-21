package sources;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ImagePpm {
    private BufferedImage img;
    private Integer colour;

    public ImagePpm(Integer x, Integer y, Integer col){
        img = new BufferedImage(x, y, col);
    }

    public ImagePpm(Integer x, Integer y){
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

    public void savePpm() throws IOException{
        ImageIO.write(img, "ppm", new File( "file.ppm"));
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
