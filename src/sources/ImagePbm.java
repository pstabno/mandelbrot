package sources;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ImagePbm {

    private BufferedImage img;
    private Integer colour;

    public ImagePbm(Integer x, Integer y, Integer col){
        img = new BufferedImage(x, y, col);
    }

    public ImagePbm(Integer x, Integer y){
        img = new BufferedImage(x, y, BufferedImage.TYPE_BYTE_BINARY);
    }

    public void setPixel(Double x, Double y, Integer col){
        img.setRGB(Integer.parseInt(x.toString()), Integer.parseInt(y.toString()), col);
    }

    public void setPixel(Integer x, Integer y, Integer col) {
        img.setRGB(x,y,col);
    }

    public void savePbm() throws IOException {
        ImageIO.write(img, "pbm", new File( "file.pbm"));
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
