package TestesProgramas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class EventosMouse extends JFrame{
	JLabel statusbar;
	public EventosMouse(){
		getContentPane().setLayout(null);
		statusbar = new JLabel("Início");
		statusbar.setBounds(10, 10, 300, 30);
		add(statusbar);
		Handler ol = new Handler();
		addMouseListener(ol);
		addMouseMotionListener(ol);
		setBounds(10,10,300,300);
		setSize(300,200);
		setVisible(true);
	}
	public static void main(String args[]){
		EventosMouse j = new EventosMouse();
		j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public class Handler implements MouseListener, MouseMotionListener{
		public void mousePressed(MouseEvent event){
			statusbar.setText("mousePressed : [" + event.getX() + "," + event.getY() + "]");
		}
		public void mouseClicked(MouseEvent event){
			statusbar.setText("mouseClicked : [" + event.getX() + "," + event.getY() + "]");
		}
		public void mouseReleased(MouseEvent event){
			statusbar.setText("mouseReleased : [" + event.getX() + "," + event.getY() + "]");
		}
		public void mouseEntered(MouseEvent event){
			JOptionPane.showMessageDialog(null,"mouseEntered");
		}
		public void mouseExited(MouseEvent event){
			JOptionPane.showMessageDialog(null,"mouseExited");
		}
		public void mouseDragged(MouseEvent event){
			statusbar.setText("mouseDragged : [" + event.getX() + "," + event.getY() + "]");
		}
		public void mouseMoved(MouseEvent event){
			statusbar.setText("mouseMoved : [" + event.getX() + "," + event.getY() + "]");
		}
	}
}