import java.awt.*;
import java.awt.event.*;
class laba13_2 extends Frame {
    laba13_2(String s){
        super(s);
        setSize(400, 150);
        setVisible(true);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent ev) {
                System.exit(0);
            }
        });
    }
    public static void main(String[] args){
        new laba13_2("Моя программа");

    }
}
