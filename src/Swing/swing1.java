package Swing;

import javax.swing.*;

public class swing1 extends JFrame{
    private static JFrame jFrame2=new JFrame("Swing 3");
    public swing1(String s) {
        super(s);
    }

    public static void main(String[] args){
        JFrame f=new JFrame();//creating instance of JFrame

        JButton b=new JButton("click");//creating instance of JButton
        b.setBounds(130,100,100, 40);//x axis, y axis, width, height

        f.add(b);//adding button in JFrame

        f.setSize(400,500);//400 width and 500 height
        f.setLayout(null);//using no layout managers
        f.setVisible(true);//making the frame visible
        swing1 s=new swing1("Swing 2");
        s.setVisible(true);//ikinci pencere oluşur
        s.setSize(200,300);
       jFrame2.setVisible(true);//buda ucuncu farklı yol
       jFrame2.setSize(300,200);
    }
}
