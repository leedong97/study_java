package ex4_listener;
import java.awt.*;
import java.awt.event.WindowListener;



public class ListenerClass implements WindowListener{
    @Override
    public void windowOpened(java.awt.event.WindowEvent e) {
        // 창이 열릴 때 호출
    }

    @Override
    public void windowClosing(java.awt.event.WindowEvent e) {

    }

    @Override
    public void windowClosed(java.awt.event.WindowEvent e) {
        // 창이 닫힌 후에 호출
    }

    @Override
    public void windowIconified(java.awt.event.WindowEvent e) {
        // 창이 아이콘화(최소화) 될 때 호출
    }

    @Override
    public void windowDeiconified(java.awt.event.WindowEvent e) {
        // 창이 아이콘화에서 풀릴 때 호출
    }

    @Override
    public void windowActivated(java.awt.event.WindowEvent e) {
        // 창이 활성화될 때 호출
    }

    @Override
    public void windowDeactivated(java.awt.event.WindowEvent e) {
        // 창이 비활성화될 때 호출
    }
}
