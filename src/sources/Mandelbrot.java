package sources;


import java.io.IOException;

public class Mandelbrot {
    public Image getImage() {
        return image;
    }

    private Image image;
    private Integer xSize;
    private Integer ySize;
    private Complex c;
    private Integer max;

    public Mandelbrot(Integer x, Integer y, Integer max) {
        this.xSize=x;
        this.ySize=y;
        this.max=max;
        this.image=new Image(x,y);
        this.c=new Complex();
    }
    public void saveImg(Integer type) throws IOException {
        switch(type){
            case 1:
                System.out.println("Saving Pbm");
                this.image.savePbm();
                System.out.println("Saved!");
            case 2:
                System.out.println("Saving Pgm");
                this.image.savePgm();
                System.out.println("Saved!");
            case 3:
                System.out.println("Saving Ppm");
                this.image.savePpm();
                System.out.println("Saved!");
            default:
                this.image.savePgm();
        }
    }

    public void generateMandelbrot(){
        for (int i = 0; i < this.ySize; i++) {
            for (int j = 0; j < this.xSize; j++) {
                c.setReality((j-this.xSize/2.0)*4.0/this.xSize);
                c.setImaginary((i-this.ySize/2.0)*4.0/this.ySize);
                Double x = 0.0;
                Double y = 0.0;
                int iterations = 0;
                while (x*x+y*y < 4 && iterations < max) {
                    double x_new = x*x-y*y+c.getReality();
                    y = 2*x*y+c.getImaginary();
                    x = x_new;
                    iterations++;
                }
                image.setPixel(j,i,iterations);
            }
            
        }
    }
    
}
