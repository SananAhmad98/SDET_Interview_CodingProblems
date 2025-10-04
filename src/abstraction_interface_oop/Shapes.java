package abstraction_interface_oop;

public abstract class Shapes {

	private int xdim;
	private int ydim;
	
	Shapes(int xdim,int ydim){
		
		this.xdim = xdim;
		this.ydim = ydim;
		
	}
	
	public abstract void createShape();

	public abstract void moveShape();

}
