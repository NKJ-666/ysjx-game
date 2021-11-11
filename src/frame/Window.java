package frame;

import bean.User;
import util.ScaleIcon;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Window extends JFrame {
    //level 为1-5，对应于1-5关
    private int level;

    private Image image;

    private JPanel panel;

    private User user;

    public Window(){
        user = new User(new ImageIcon("image/user.png").getImage(), 100, 600);
        setSize(1080, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void setImage(Image image){
        this.image = image;
    }

    public void setBackGround(){
        JLabel label = new JLabel();
        ScaleIcon icon = new ScaleIcon(new ImageIcon("image/test_back.jpg"));
        label.setIcon(icon);
        label.setBounds(0, 0, getWidth(), getHeight());
        getContentPane().add(label);
    }


    @Override
    public void paint(Graphics g) {
        super.paint(g);
        BufferedImage bufferedImage = (BufferedImage) createImage(getWidth(), getHeight());
        Graphics graphics = bufferedImage.getGraphics();
        ImageIcon icon = new ImageIcon("image/test_back.jpg");
        graphics.drawImage(icon.getImage(), 0, 0, null);
        graphics.drawImage(user.getImage(), user.getxMin(), user.getyMin(), null);
        g.drawImage(bufferedImage, 0 ,0, null);
    }
}
