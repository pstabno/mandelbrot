package Sources;
public class Complex {

	private Integer reality;
	private Integer imaginary;

	public Integer getReality() {
		return reality;
	}

	public void setReality(Integer real) {
		reality = real;
	}

	public Integer getImaginary() {
		return imaginary;
	}

	public void setImaginary(Integer imagin) {
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
}
