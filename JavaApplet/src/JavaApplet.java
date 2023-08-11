import java.awt.Graphics;
import javax.swing.*;
public class JavaApplet extends JApplet{
	int choice;
	public void init(){
		String input;
		input = JOptionPane.showInputDialog("Digite 1 para desenhar 10 linhas\n" + "Digite 2 para desenhar 10 retângulos\n" + "Digite 3 para desenhar 10 elipses");
		choice = Integer.parseInt(input);
	}
	// Continua no próximo slide;
	public void paint(Graphics g){
		super.paint(g);
		for (int i=1; i <= 10 ; i++){
			switch(choice){
			case 1:
				g.drawLine(10,10,250,i*10);
				break;
			case 2:
				g.drawRect(10*1,10*i, 50 + 10 * i,50 + 10 * i);
				break;
			case 3:
				g.drawOval(10*1,10*i, 50 + 10 * i,50 + 10 * i);
				break;
			default:
				g.drawString("Comando Inválido!",10, 20 + i * 10);
				break;
			}
		}
	}
}