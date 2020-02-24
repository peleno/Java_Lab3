package ua.lviv.iot.lightshop.model;

public class CeilingLamp extends AbstractLamp {
	private ShapeType shape;

	public CeilingLamp (RoomType room) {
		super(room);
	}
	
	public ShapeType getShape() {
		return shape;
	}

	public void setShape(ShapeType shape) {
		this.shape = shape;
	}

}
