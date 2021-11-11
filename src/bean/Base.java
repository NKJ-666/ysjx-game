package bean;

import java.awt.*;

public class Base {
    //坐标
    private int xMin;
    private int yMin;
    private int xMax;
    private int yMax;

    //图片
    private Image image;

    //设置图片
    public void setImage(Image image){
        this.image = image;
    }

    //设置坐标
    public void setCoordinate(int xMin, int yMin, int xMax, int yMax){
        this.xMax = xMax;
        this.xMin = xMin;
        this.yMax = yMax;
        this.yMin = yMin;
    }

    public int getxMin() {
        return xMin;
    }

    public int getyMin() {
        return yMin;
    }

    public int getxMax() {
        return xMax;
    }

    public int getyMax() {
        return yMax;
    }

    public Image getImage() {
        return image;
    }
}
