package sources;

public class Image {

	private Integer x;
	private Integer y;
//	private Colour color;
	
	public Integer getX() {
		return x;
	}

	public void setX(Integer x) {
		this.x = x;
	}

	public Integer getY() {
		return y;
	}

	public void setY(Integer y) {
		this.y = y;
	}
	
	public void setDims(Integer x, Integer y){
		this.setX(x);
		this.setY(y);
	}
	
	public Image(){
		
	}
	
	public Image(Integer x, Integer y){
		
	}
	
	public Image(Image im){
		
	}
}
