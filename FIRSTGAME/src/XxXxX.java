import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.*;

public class XxXxX {
	public static void main(String[] args) {

		JFrame Window = new JFrame();
		final int SizeX = 900;
		final int SizeY = 500;
		Window.setSize(SizeX, SizeY);
		Window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		while (true) {

			BufferedImage BlauerBalken = null;
			try {
				BlauerBalken = ImageIO.read(new File("Blau Balken.png"));
			} catch (IOException e) {

				e.printStackTrace();
			}

			BufferedImage RoterBalken = null;
			try {
				RoterBalken = ImageIO.read(new File("Rot Balken.png"));
			} catch (IOException e) {
				e.printStackTrace();
			}

			BufferedImage Ball = null;
			try {
				Ball = ImageIO.read(new File("Grün Kugel.png"));
			} catch (IOException e) {

				e.printStackTrace();
			}

			JPanel panel = new JPanel();
			final JLabel ball = new JLabel(new ImageIcon(Ball));
			final JLabel BaSpBl = new JLabel(new ImageIcon(BlauerBalken));
			final JLabel BaSpR = new JLabel(new ImageIcon(RoterBalken));

			Window.addKeyListener(new KeyListener() {

				@Override
				public void keyPressed(KeyEvent arg0) {
					if (arg0.getKeyChar() == 'W' || arg0.getKeyChar() == 'w') {
						BaSpBl.setLocation(BaSpBl.getX(), BaSpBl.getY() - 10);
					}
					if (arg0.getKeyChar() == 'S' || arg0.getKeyChar() == 's') {
						BaSpBl.setLocation(BaSpBl.getX(), BaSpBl.getY() + 10);
					}
					if (arg0.getKeyChar() == 'Ü' || arg0.getKeyChar() == 'ü') {
						BaSpR.setLocation(BaSpR.getX(), BaSpR.getY() - 10);
					}
					if (arg0.getKeyChar() == 'Ä' || arg0.getKeyChar() == 'ä') {
						BaSpR.setLocation(BaSpR.getX(), BaSpR.getY() + 10);
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

			panel.add(BaSpBl);
			panel.add(ball);
			panel.add(BaSpR);

			Window.add(panel);

			Window.setVisible(true);
		}
	}
}
