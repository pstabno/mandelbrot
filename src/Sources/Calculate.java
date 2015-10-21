package Sources;

public class Calculate {

	/**
	 * @param args
	 */
	public static Integer maxIter;
	public static Complex complex;
	public static Integer imageX;
	public static Integer imageY;
	
	public static void main(String[] args) {
//Test values only. To be switched by dynamically set during startup of the aplication
		complex.setImaginary(2.0);
		complex.setReality(1.5);
		maxIter=255;
		imageX=800;
		imageY=600;
	}
}
