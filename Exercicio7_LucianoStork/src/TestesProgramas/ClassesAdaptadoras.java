package TestesProgramas;

import javax.swing.*; import java.awt.*; import java.awt.event.*;
public class ClassesAdaptadoras extends JFrame{
	int x=0, y=0;
	public ClassesAdaptadoras(){
		getContentPane().setLayout(null);
		Handler obj = new Handler();
		addMouseMotionListener(obj);
		setSize(200,200);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		repaint();
	}
	public void paint(Graphics g){
		g.fillOval(x,y,4,4);
	}
	public static void main(String args[]){
		ClassesAdaptadoras janela = new ClassesAdaptadoras();
	}
	public class Handler extends MouseMotionAdapter{
		public void mouseDragged(MouseEvent event){
			x = event.getX();
			y = event.getY();
			repaint();
		}
	}
}