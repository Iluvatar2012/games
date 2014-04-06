package crawlerIluvatar2014;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.util.ArrayList;

import javax.swing.JPanel;

class GameDrawer implements Runnable {

	private ArrayList<ObjDrawable> list;
	
	private JPanel game;
	
	private Image background;

	// Constructor
	GameDrawer (ArrayList<ObjDrawable> inList) {
		list = inList;
		this.init();
	}
	
	void changeBackground (String file) {
		// TODO: implement a method to change this background file with help of the picture class
	}
	
	private void init() {
		game = new JPanel() {
			private static final long serialVersionUID = 1L;
			
			// Override paint method, this will enable painting of all our objects
			@Override
			protected void paintComponent(Graphics graphics) {
				
				Dimension size;
				
				// first call parent class method, convert graphics to (better) 2D
				super.paintComponent(graphics);
				Graphics2D g2D = (Graphics2D)graphics;
								
				// get the size of the frame
				size = CoreCrawler.getFrame().getContentPane().getSize();
				
				// print the background picture, the ratio is always set to 1:0.5625
				g2D.drawImage(background, 0, 0, size.width, size.height, this);
				
				// TODO: implement 47 steps width, 19 steps height and 7.4375 steps menu height
				
				// draw all components within the array list
				for (ObjDrawable obj : list) {
					obj.draw(g2D);
				}
			}
		};
		
		// set the size of the pane and make it cpntent pane
		game.setSize(CoreCrawler.getFrame().getContentPane().getSize());
		CoreCrawler.getFrame().setContentPane(game);
	}

	@Override
	public void run() {
		
		long t, dt;
		
		// iterate as long as this variable is set, otherwise the game isn't running any more
		while (Game.running) {
			// get current system time, the game will be hard coded to max. 50 fps
			t = System.currentTimeMillis();
			
			// repaint all objects
			game.repaint();
			
			// give computing time to other threads
			try {
				if ((dt = System.currentTimeMillis()-t) < 20)
					Thread.sleep(dt);
			}
			catch (InterruptedException e) {
				System.err.println("Graphics thread interrupted, continuing execution. ");
			}
		}
		
		// TODO: maybe free up memory of all pictures??
	}
}
