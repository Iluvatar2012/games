package crawlerIluvatar2014;

import javax.swing.JFrame;

// Starting point for the entire game

public class CoreCrawler {
	
	//TODO: find a good name for the game
	private static String name = "Crawler";
	private static JFrame frame;
	
	static JFrame getFrame() {
		return frame; 
	}

	public static void main(String[] args) {
		// TODO: Load config data from user file or generate new File if 404
		// TODO: Implement full screen mode as default 
		
		// generate a new JFrame to hold our game
		frame = new JFrame();
		frame.setSize(800, 450);
		frame.setTitle(name);
		//frame.setIconImage(image); TODO: Create an Icon Image
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //TODO: check whether we want to do something else, like save data to a file first
		
		// TODO: maybe show a couple of Intros, ask Sebastian about that, he had some fun ideas
		
		// initiate the main menu
		CoreMenuMain.initMainMenu();
	}
}
