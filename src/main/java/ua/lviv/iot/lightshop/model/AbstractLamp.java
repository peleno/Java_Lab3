package ua.lviv.iot.lightshop.model;

import java.util.List;

public abstract class AbstractLamp {

    protected String style;

    protected int countOfBulbs;

    protected List<LightBulb> bulbs;

    protected String brand;

    protected double priceInUAH;

    protected RoomType room;

    protected int heightInMm;

    protected int widthInMm;

    public AbstractLamp() {

    }

    public AbstractLamp(String style, int countOfBulbs, List<LightBulb> bulbs, String brand, double priceInUAH,
            RoomType room, int heightInMm, int widthInMm) {
        this.style = style;
        this.countOfBulbs = countOfBulbs;
        this.bulbs = bulbs;
        this.brand = brand;
        this.priceInUAH = priceInUAH;
        this.room = room;
        this.heightInMm = heightInMm;
        this.widthInMm = widthInMm;
    }

    public String getHeaders() {
        return "style,countOfBulbs,bulbs,brand,priceInUAH,room,heightInMm,widthInMm";
    }

    public String toCSV() {
        return style + "," + countOfBulbs + "," + bulbs + "," + brand + "," + priceInUAH + "," + room + "," + heightInMm
                + "," + widthInMm;
    }

    public AbstractLamp(String style, int countOfBulbs, double priceInUAH, RoomType room) {
        this(style, countOfBulbs, null, null, priceInUAH, room, 0, 0);
    }

    public AbstractLamp(RoomType room) {
        this.room = room;
    }

    public AbstractLamp(double price) {
        this.priceInUAH = price;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public int getCountOfBulbs() {
        return countOfBulbs;
    }

    public void setCountOfBulbs(int countOfBulbs) {
        this.countOfBulbs = countOfBulbs;
    }

    public List<LightBulb> getBulbs() {
        return bulbs;
    }

    public void setBulbs(List<LightBulb> bulbs) {
        this.bulbs = bulbs;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPriceInUAH() {
        return priceInUAH;
    }

    public void setPriceInUAH(double priceInUAH) {
        this.priceInUAH = priceInUAH;
    }

    public RoomType getRoom() {
        return room;
    }

    public void setRoom(RoomType room) {
        this.room = room;
    }

    public int getHeightInMm() {
        return heightInMm;
    }

    public void setHeightInMm(int heightInMm) {
        this.heightInMm = heightInMm;
    }

    public int getWidthInMm() {
        return widthInMm;
    }

    public void setWidthInMm(int widthInMm) {
        this.widthInMm = widthInMm;
    }

}
