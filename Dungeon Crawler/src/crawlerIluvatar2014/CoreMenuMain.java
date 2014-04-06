package crawlerIluvatar2014;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

// Class for main menu management

class CoreMenuMain {
	
	// Initiates a new Menu with listeners for all buttons
	static void initMainMenu() {
		
		JFrame		frame;
		JPanel 		menu;
		JButton		single, multi, options, quit;
		
		// get the current frame
		frame = CoreCrawler.getFrame();

		// create a new JPanel as main Panel for the frame 
		menu = new JPanel();
		menu.setSize(frame.getContentPane().getSize());
		menu.setBackground(new Color(0,0,0));
				
		// add buttons to the menu, TODO: build nice graphics for these buttons
		single 	= new JButton("Single Player");
		multi 	= new JButton("Multiplayer");
		options = new JButton("Options");
		quit	= new JButton("I'm out of here!");
		
		// add action listeners to all buttons
		single.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				CoreMenuSingle.initSingleMenu();				
			}
		});
		
		multi.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				CoreMenuMulti.initMultiMenu();				
			}
		});
		
		options.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				CoreMenuOptions.initOptionsMenu();				
			}
		});
		
		quit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO: check whether we need resource management, file closing, etc. 
				System.exit(0);
			}
		});
		
		// TODO: change this to have  a valid layout manager with all the Shabang...
		menu.add(single);
		menu.add(multi);
		menu.add(options);
		menu.add(quit);
		
		// When finished building everything show the Menu
		frame.setContentPane(menu);
		frame.setVisible(true);
	}
}
