
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.*;

public class HPIxGUI {

	public static void main(String[] args) {

		JFrame frame = new JFrame();
		frame.setSize(500, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		BufferedImage image = null;
		try {
			image = ImageIO.read(new File("Mint400.jpg"));
		} catch (IOException e) {

			e.printStackTrace();
		}
		JPanel panel = new JPanel();
		final JLabel label = new JLabel(new ImageIcon(image));

		frame.addKeyListener(new KeyListener() {

			@Override
			public void keyPressed(KeyEvent arg0) {
				if (arg0.getKeyChar() == 'A' || arg0.getKeyChar() == 'a') {
					System.out.println("A wurde gedrückt");
					label.setLocation(label.getX() -10, label.getY());
				
				}
				if (arg0.getKeyChar() == 'W' || arg0.getKeyChar() == 'w') {
					System.out.println("W wurde gedrückt");
					label.setLocation(label.getX() , label.getY()-10);
				
				}if (arg0.getKeyChar() == 'D' || arg0.getKeyChar() == 'd') {
					System.out.println("D wurde gedrückt");
					label.setLocation(label.getX() +10, label.getY());
				
				}if (arg0.getKeyChar() == 'S' || arg0.getKeyChar() == 's') {
					System.out.println("S wurde gedrückt");
					label.setLocation(label.getX() , label.getY()+10);
				
				}
			}

			@Override
			public void keyReleased(KeyEvent arg0) {
				// TODO Auto-generated method stub

			}

			@Override
			public void keyTyped(KeyEvent arg0) {
				// TODO Auto-generated method stub

			}

		});
		panel.add(label);
		frame.add(panel);
		frame.setVisible(true);

	}

}

