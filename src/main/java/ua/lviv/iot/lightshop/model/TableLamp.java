package ua.lviv.iot.lightshop.model;

public class TableLamp extends AbstractLamp {

	private TableLampType type;

	public TableLamp(double price) {
		super(price);

	}

	public TableLampType getType() {
		return type;
	}

	public void setType(TableLampType type) {
		this.type = type;
	}

}
