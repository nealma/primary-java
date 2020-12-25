package com.nealma.primary.extra;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * 图形界面
 *
 * @author neal.ma
 * @date 2020/12/25
 * @blog nealma.com
 */
public class Graphics2D {
    public static void main(String[] args) throws IOException {
        BufferedImage bufferedImage = new BufferedImage(300, 300, BufferedImage.TYPE_INT_RGB);
        final java.awt.Graphics2D graphics2D = bufferedImage.createGraphics();
        graphics2D.drawString("码向未来", 0, 15);
        graphics2D.dispose();
        ImageIO.write(bufferedImage, "jpg", new File("temp.jpg"));
    }

}
