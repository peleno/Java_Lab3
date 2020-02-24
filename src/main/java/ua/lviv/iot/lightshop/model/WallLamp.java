package ua.lviv.iot.lightshop.model;

public class WallLamp extends AbstractLamp {
	private int depthInMm;

	private ShapeType shape;

	public int getDepthInMm() {
		return depthInMm;
	}

	public void setDepthInMm(int depthInMm) {
		this.depthInMm = depthInMm;
	}

	public ShapeType getShape() {
		return shape;
	}

	public void setShape(ShapeType shape) {
		this.shape = shape;
	}

}
