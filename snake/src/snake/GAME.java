package snake;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.swing.*;

public class GAME {

	private static JFrame frame;
	private static JPanel panel;
	private static JPanel[] cells;
	private static int breite = 17;
	private static int b = breite * breite;
	private static int[] snake = new int[10];
	private static boolean dw = false;
	private static boolean ds = false;
	private static boolean da = false;
	private static boolean dd = false;
	private static JLabel[] Erdbeere = new JLabel[7];
	private static int PosRan;
	private static int[] PosErd = new int[7];
	private static int h = 0;
	private static int o = 0;
	private static BufferedImage[] image = new BufferedImage[7];
	private static boolean[] NeuesTeil = new boolean[breite + breite];
	private static int Zahl;
	private static boolean W = false;
	private static boolean S = false;
	private static boolean D = false;
	private static boolean A = false;

	public static void main(String[] args) {

		start();
		feld();
		snake();
	}

	private static void snake() {

		System.out.println(b);

		snake[0] = b / 2;
		snake[1] = snake[0] + breite;
		snake[2] = snake[1] + breite;

		System.out.println(snake[0]);

		cells[snake[0]].setBackground(Color.black);
		cells[snake[1]].setBackground(Color.black);
		cells[snake[2]].setBackground(Color.black);

		

			frame.addKeyListener(new KeyListener() {

				@Override
				public void keyPressed(KeyEvent arg0) {

					if (arg0.getKeyChar() == 'W' || arg0.getKeyChar() == 'w') {
						W = true;
					}

					if (arg0.getKeyChar() == 'S' || arg0.getKeyChar() == 's') {
						S = true;
					}

					if (arg0.getKeyChar() == 'D' || arg0.getKeyChar() == 'd') {
						D = true;
					}

					if (arg0.getKeyChar() == 'A' || arg0.getKeyChar() == 'a') {
						A = true;
					}
				}

				@Override
				public void keyReleased(KeyEvent arg0) {

				}

				@Override
				public void keyTyped(KeyEvent arg0) {

				}

			});
			while(true){
			if (W == true) {

				// weiß machen
				if (ds == false) {
					for (int Zahl = 0; Zahl >= breite * breite; Zahl++) {
						cells[snake[Zahl]].setBackground(Color.white);
					}

					// Neue Teile registrieren
					boolean ende = false;
					Zahl = breite * breite;
					while (ende == true) {

						if (NeuesTeil[Zahl] == true) {
							snake[Zahl] = snake[Zahl - 1];
						} else {

						}
						Zahl--;
						if (Zahl <= 2) {
							ende = true;
						} else {

						}
					}
					ende = false;

					snake[2] = snake[1];
					snake[1] = snake[0];
					snake[0] = snake[0] - breite;
					cells[snake[0]].setBackground(Color.black);
					cells[snake[1]].setBackground(Color.black);
					cells[snake[2]].setBackground(Color.black);

					// Teile wieder Schwarz machen...
					for (int Zahl = 3; Zahl >= breite * breite; Zahl++) {
						if (NeuesTeil[Zahl] == true) {
							cells[snake[Zahl]].setBackground(Color.black);
						} else {

						}
					}

					dw = true;
					ds = false;
					da = false;
					dd = false;

					// Könnt ein neues Teil kommen???
					Zahl = breite * breite;
					while (ende == true) {

						if (NeuesTeil[Zahl - 1] == true) {
							for (int k = 0; k < 7; k++) {
								if (snake[0] == PosErd[k]) {
									NeuesTeil[Zahl] = true;
								} else {

								}
							}
						} else {

						}
						Zahl--;
					}

				} else {

				}
			} else if (S == true) {

				// weiß machen
				if (dw == false) {
					for (int Zahl = 0; Zahl >= breite * breite; Zahl++) {
						cells[snake[Zahl]].setBackground(Color.white);
					}

					// Neue Teile registrieren
					boolean ende = false;
					Zahl = breite * breite;
					while (ende == true) {

						if (NeuesTeil[Zahl] == true) {
							snake[Zahl] = snake[Zahl - 1];
						} else {

						}
						Zahl--;
						if (Zahl <= 2) {
							ende = true;
						} else {

						}
					}
					ende = false;

					snake[2] = snake[1];
					snake[1] = snake[0];
					snake[0] = snake[0] + breite;
					cells[snake[0]].setBackground(Color.black);
					cells[snake[1]].setBackground(Color.black);
					cells[snake[2]].setBackground(Color.black);

					// Teile wieder Schwarz machen...
					for (int Zahl = 3; Zahl >= breite * breite; Zahl++) {
						if (NeuesTeil[Zahl] == true) {
							cells[snake[Zahl]].setBackground(Color.black);
						} else {

						}
					}

					dw = false;
					ds = true;
					da = false;
					dd = false;

					// Könnt ein neues Teil kommen???
					Zahl = breite * breite;
					while (ende == true) {

						if (NeuesTeil[Zahl - 1] == true) {
							for (int k = 0; k < 7; k++) {
								if (snake[0] == PosErd[k]) {
									NeuesTeil[Zahl] = true;
								} else {

								}
							}
						} else {

						}
						Zahl--;
					}

				} else {

				}
			} else if (A == true) {

				// weiß machen
				if (dd == false) {
					for (int Zahl = 0; Zahl >= breite * breite; Zahl++) {
						cells[snake[Zahl]].setBackground(Color.white);
					}

					// Neue Teile registrieren
					boolean ende = false;
					Zahl = breite * breite;
					while (ende == true) {

						if (NeuesTeil[Zahl] == true) {
							snake[Zahl] = snake[Zahl - 1];
						} else {

						}
						Zahl--;
						if (Zahl <= 2) {
							ende = true;
						} else {

						}
					}
					ende = false;

					snake[2] = snake[1];
					snake[1] = snake[0];
					snake[0] = snake[0] - 1;
					cells[snake[0]].setBackground(Color.black);
					cells[snake[1]].setBackground(Color.black);
					cells[snake[2]].setBackground(Color.black);

					// Teile wieder Schwarz machen...
					for (int Zahl = 3; Zahl >= breite * breite; Zahl++) {
						if (NeuesTeil[Zahl] == true) {
							cells[snake[Zahl]].setBackground(Color.black);
						} else {

						}
					}

					dw = false;
					ds = false;
					da = true;
					dd = false;

					// Könnt ein neues Teil kommen???
					Zahl = breite * breite;
					while (ende == true) {

						if (NeuesTeil[Zahl - 1] == true) {
							for (int k = 0; k < 7; k++) {
								if (snake[0] == PosErd[k]) {
									NeuesTeil[Zahl] = true;
								} else {

								}
							}
						} else {

						}
						Zahl--;
					}

				} else {

				}
			} else if (D == true) {

				// weiß machen
				if (da == false) {
					for (int Zahl = 0; Zahl >= breite * breite; Zahl++) {
						cells[snake[Zahl]].setBackground(Color.white);
					}

					// Neue Teile registrieren
					boolean ende = false;
					Zahl = breite * breite;
					while (ende == true) {

						if (NeuesTeil[Zahl] == true) {
							snake[Zahl] = snake[Zahl - 1];
						} else {

						}
						Zahl--;
						if (Zahl <= 2) {
							ende = true;
						} else {

						}
					}
					ende = false;

					snake[2] = snake[1];
					snake[1] = snake[0];
					snake[0] = snake[0] + 1;
					cells[snake[0]].setBackground(Color.black);
					cells[snake[1]].setBackground(Color.black);
					cells[snake[2]].setBackground(Color.black);

					// Teile wieder Schwarz machen...
					for (int Zahl = 3; Zahl >= breite * breite; Zahl++) {
						if (NeuesTeil[Zahl] == true) {
							cells[snake[Zahl]].setBackground(Color.black);
						} else {

						}
					}

					dw = false;
					ds = false;
					da = false;
					dd = true;

					// Könnt ein neues Teil kommen???
					Zahl = breite * breite;
					while (ende == true) {

						if (NeuesTeil[Zahl - 1] == true) {
							for (int k = 0; k < 7; k++) {
								if (snake[0] == PosErd[k]) {
									NeuesTeil[Zahl] = true;
								} else {

								}
							}
						} else {

						}
						Zahl--;
					}

				} else {

				}
			}

		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}

	}

	private static void feld() {
		panel.setLayout(new GridLayout(breite, breite));

		for (int r = 0; r < 7; r++) {
			try {
				image[o] = ImageIO.read(new File("ERDBEERE-SNAKE.png"));
			} catch (IOException e) {

				e.printStackTrace();
			}
			Erdbeere[o] = new JLabel(new ImageIcon(image[o]));
			o++;
		}

		Random random = new Random();

		for (int i = 0; i < cells.length; i++) {
			cells[i] = new JPanel();
			cells[i].setBackground(Color.white);
			PosRan = random.nextInt(30);
			if (PosRan == 1) {
				if (h == 0) {
					cells[i].add(Erdbeere[0]);
					PosErd[h] = i;
					System.out.println(PosErd[h]);
					h++;
				} else if (h == 1) {
					cells[i].add(Erdbeere[1]);
					PosErd[h] = i;
					System.out.println(PosErd[h]);
					h++;
				} else if (h == 2) {
					cells[i].add(Erdbeere[2]);
					PosErd[h] = i;
					System.out.println(PosErd[h]);
					h++;
				} else if (h == 3) {
					cells[i].add(Erdbeere[3]);
					PosErd[h] = i;
					System.out.println(PosErd[h]);
					h++;
				} else if (h == 4) {
					cells[i].add(Erdbeere[4]);
					PosErd[h] = i;
					System.out.println(PosErd[h]);
					h++;
				} else if (h == 5) {
					cells[i].add(Erdbeere[5]);
					PosErd[h] = i;
					System.out.println(PosErd[h]);
					h++;
				} else if (h == 6) {
					cells[i].add(Erdbeere[6]);
					PosErd[h] = i;
					System.out.println(PosErd[h]);
					h++;
				} else {

				}
			} else {

			}
			panel.add(cells[i]);
		}

		frame.add(panel);
		frame.setSize(900, 900);
		frame.setVisible(true);
	}

	private static void start() {
		frame = new JFrame("Snake");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel = new JPanel();
		cells = new JPanel[breite * breite];

	}

}
