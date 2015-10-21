package Sources;

public class Complex {

	private Double reality;
	private Double imaginary;

	public Double getReality() {
		return reality;
	}

	public void setReality(Double real) {
		reality = real;
	}

	public Double getImaginary() {
		return imaginary;
	}

	public void setImaginary(Double imagin) {
		imaginary = imagin;
	}

	public Complex addComplex(Complex x) {
		this.setReality(this.getReality() + x.getReality());
		this.setImaginary(this.getImaginary() + x.getImaginary());
		return this;
	}

	public Complex subtractComplex(Complex x) {
		this.setReality(this.getReality() - x.getReality());
		this.setImaginary(this.getImaginary() - x.getImaginary());
		return this;
	}

	public Complex multiByComplex(Complex x) {
		this.setReality((this.getReality() * x.getReality())
				- (this.getImaginary() * x.getImaginary()));
		this.setImaginary((this.getReality() * x.getImaginary())
				+ (x.getReality() * this.getImaginary()));
		return this;
	}

	public Complex sqrComplex() {
		this.setReality(Math.pow(this.getReality(), 2.0)
				- Math.pow(this.getImaginary(), 2.0));
		this.setImaginary(2.0 * this.getImaginary() * this.getReality());
		return this;
	}

	public Boolean absCheck() {
		Double abs = Math.pow(this.getReality(), 2)
				+ Math.pow(this.getImaginary(), 2);
		if (abs < 4)
			return false;
		else
			return true;
	}
// Method for checking if complex is within  Mandelbrot set
	public Integer calculateMandelbrot(Complex z, Integer maxIter){
		Complex tmp=z;
		for(int i=0; i<maxIter; i++){
			if(tmp.absCheck()==true)
				return i;
			tmp=tmp.sqrComplex().addComplex(z);
		}
		return maxIter;
	}
}