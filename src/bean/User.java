package bean;

import util.ScaleIcon;

import javax.swing.*;
import java.awt.*;

public class User extends Base{
    //默认速度
    private static final float WALK_VX = 20;
    private static final float WALK_VY = 20;
    private static final float RUN_VX = 40;
    private static final float RUN_VY = 40;

    //人物的速度
    private float vx;
    private float vy;

    //人物血量, 最大值为2
    private int hp;

    public User(Image image, int x, int y){
        setImage(image);
        setCoordinate(x, y, image.getWidth(null), image.getHeight(null));
    }

    public void runLeft(){

    }

    public void runRight(){

    }

    public void collision(){

    }

    public void jump(){

    }

    public void doubleJump(){

    }

    public void dropLine(){

    }

    public void walk(){

    }

    public void partnerJump(){

    }

    public void draw(Container container){
        JLabel label = new JLabel();
        ScaleIcon icon = new ScaleIcon(new ImageIcon("image/user.png"));
        label.setIcon(icon);
        label.setBounds((int) getxMin(), (int) getyMin(), icon.getIconWidth(), icon.getIconHeight());
        container.add(label);
    }
}
