package sources;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ImagePpm {
    private BufferedImage img;

    public ImagePpm(BufferedImage img, Integer x, Integer y) {
        this.img = new BufferedImage(x,y,BufferedImage.TYPE_BYTE_BINARY);
        this.img=img;
    }

    public void savePpm() throws IOException {
        ImageIO.write(img, "ppm", new File( "file.ppm"));
    }

}
