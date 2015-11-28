package sources;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ImagePgm {

    private BufferedImage img;

    public ImagePgm(BufferedImage img, Integer x, Integer y) {
        this.img = new BufferedImage(x,y,BufferedImage.TYPE_INT_RGB);
        this.img = img;
    }

    public void savePgm() throws IOException {
        ImageIO.write(img, "pgm", new File( "file.pgm"));
    }
}
