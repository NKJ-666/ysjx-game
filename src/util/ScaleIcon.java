package util;

import javax.swing.*;
import java.awt.*;

public class ScaleIcon implements Icon {
    private Icon icon;

    public ScaleIcon(Icon icon){
        this.icon = icon;
    }

    @Override
    public void paintIcon(Component c, Graphics g, int x, int y) {
        float width = c.getWidth();
        float height = c.getHeight();
        int iconWidth = icon.getIconWidth();
        int iconHeight = icon.getIconHeight();
        Graphics2D graphics2D = (Graphics2D) g;
        graphics2D.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
        graphics2D.scale(width / iconWidth, height / iconHeight);
        icon.paintIcon(c, graphics2D, 0 ,0);
    }

    @Override
    public int getIconWidth() {
        return 0;
    }

    @Override
    public int getIconHeight() {
        return 0;
    }
}
