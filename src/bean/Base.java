package bean;

public class Base {
    //坐标
    private float xMin;
    private float yMin;
    private float xMax;
    private float yMax;

    //图片
    private String image;

    //设置图片
    public void setImage(String image){
        this.image = image;
    }

    //设置坐标
    public void setCoordinate(float xMin, float yMin, float xMax, float yMax){
        this.xMax = xMax;
        this.xMin = xMin;
        this.yMax = yMax;
        this.yMin = yMin;
    }

    public float getxMin() {
        return xMin;
    }

    public float getyMin() {
        return yMin;
    }

    public float getxMax() {
        return xMax;
    }

    public float getyMax() {
        return yMax;
    }

    public String getImage() {
        return image;
    }
}
