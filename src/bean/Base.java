package bean;

public class Base {
    //坐标
    private float xMin;
    private float yMin;
    private float xMax;
    private float yMax;

    //设置坐标
    public void setCoordinate(float xMin, float yMin, float xMax, float yMax){
        this.xMax = xMax;
        this.xMin = xMin;
        this.yMax = yMax;
        this.yMin = yMin;
    }
}
