package cn.tank;

import java.awt.*;

/**
 * @author superherozhang
 * @create 2022-06-12 8:44
 */
public class Base extends GameObject {

    public int width=60;
    public int height=60;

    public Base(String img,int x,int y,GamePanel gamePanel){
        super(img,x,y,gamePanel);
    }

    @Override
    public void paintSelf(Graphics g) {
        g.drawImage(img,x,y,null);
    }

    @Override
    public Rectangle getRec() {
        return new Rectangle(x,y,width,height);
    }
}
