package sources;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ImagePbm {

    private BufferedImage img;

    public ImagePbm(BufferedImage img,Integer x, Integer y) {
        this.img = new BufferedImage(x,y,BufferedImage.TYPE_BYTE_GRAY);
        this.img = (BufferedImage) GrayFilter.createDisabledImage(img);
    }

    public void savePbm() throws IOException {
        ImageIO.write(img, "pbm", new File( "file.pbm"));
    }
}
