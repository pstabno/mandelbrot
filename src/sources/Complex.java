package sources;

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

	public Complex addNumber(Integer x) {
		this.setReality(this.getReality() + Double.parseDouble(x.toString()));
		return this;
	}

	public Complex addNumber(Double x) {
		this.setReality(this.getReality() + x);
		return this;
	}

	public Complex addNumber(Float x) {
		this.setReality(this.getReality() + Double.parseDouble(x.toString()));
		return this;
	}

	public Complex subtractComplex(Complex x) {
		this.setReality(this.getReality() - x.getReality());
		this.setImaginary(this.getImaginary() - x.getImaginary());
		return this;
	}

	public Complex subtractNumber(Integer x) {
		this.setReality(this.getReality() - Double.parseDouble(x.toString()));
		return this;
	}

	public Complex subtractNumber(Double x) {
		this.setReality(this.getReality() - x);
		return this;
	}

	public Complex subtractNumber(Float x) {
		this.setReality(this.getReality() - Double.parseDouble(x.toString()));
		return this;
	}

	public Complex multiByComplex(Complex x) {
		this.setReality((this.getReality() * x.getReality())
				- (this.getImaginary() * x.getImaginary()));
		this.setImaginary((this.getReality() * x.getImaginary())
				+ (x.getReality() * this.getImaginary()));
		return this;
	}

	public Complex multiByNumber(Integer x) {
		this.setReality(getReality() * Double.parseDouble(x.toString()));
		this.setImaginary(getImaginary() * Double.parseDouble(x.toString()));
		return this;
	}

	public Complex multiByNumber(Double x) {
		this.setReality(getReality() * x);
		this.setImaginary(getImaginary() * x);
		return this;
	}

	public Complex multiByNumber(Float x) {
		this.setReality(getReality() * Double.parseDouble(x.toString()));
		this.setImaginary(getImaginary() * Double.parseDouble(x.toString()));
		return this;
	}
	
	public Complex invertComplex(){
		this.setImaginary(this.getImaginary()*(-1));
		return this;
	}
	
	public Complex divideByComplex(Complex x) {
		x=x.invertComplex();
		return this.multiByComplex(x);
	}

	public Complex sqrComplex() {
		this.setReality(Math.pow(this.getReality(), 2.0)
				- Math.pow(this.getImaginary(), 2.0));
		this.setImaginary(2.0 * this.getImaginary() * this.getReality());
		return this;
	}

	public Double abs() {
		return Math.sqrt(Math.pow(this.getReality(), 2)
				+ Math.pow(this.getImaginary(), 2));
	}
}