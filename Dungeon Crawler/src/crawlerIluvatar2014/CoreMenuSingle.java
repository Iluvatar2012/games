package crawlerIluvatar2014;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

class CoreMenuSingle {
		
	static void initSingleMenu() {
				
		JFrame frame;
		JPanel menu;
		
		JRadioButton 	char1, char2, char3, char4, char5;
		JButton			start, back;
		ButtonGroup		characters;
		
		// get the current frame from main
		frame = CoreCrawler.getFrame();
		
		// create a new Panel as ContentPane for the Frame
		menu = new JPanel();
		menu.setSize(frame.getContentPane().getSize());
		menu.setBackground(new Color(0,0,0));
		
		// create new radio buttons for choosing a character and combine them in a button group
		// TODO: maybe do this somehow else, also with moving icons??
		char1 = new JRadioButton("Aiko", true);
		char2 = new JRadioButton("Bene");
		char3 = new JRadioButton("Lukas");
		char4 = new JRadioButton("Sebastian");
		char5 = new JRadioButton("Äffchen");
		
		characters = new ButtonGroup();
		
		characters.add(char1);
		characters.add(char2);
		characters.add(char3);
		characters.add(char4);
		characters.add(char5);
		
		// create new buttons for starting the game and returning back to the menu
		start 	= new JButton("Start Game");
		back	= new JButton("Back");
		
		// add action listeners to all buttons
		char1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				Game.character = Game.AIKO; 
			}
		});
		
		char2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				Game.character = Game.BENE; 
			}
		});
		
		char3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				Game.character = Game.LUKAS; 
			}
		});
		
		char4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				Game.character = Game.SEBASTIAN; 
			}
		});
		
		char5.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				Game.character = Game.AEFFCHEN; 
			}
		});
		
		start.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				Game.initNewSingleGame();
			}
		});
		
		back.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				CoreMenuMain.initMainMenu();
			}
		});
		
		// add all buttons to the menu
		menu.add(char1);
		menu.add(char2);
		menu.add(char3);
		menu.add(char4);
		menu.add(char5);
		menu.add(start);
		menu.add(back);
		
		// set the newly created menu as content pane
		frame.setContentPane(menu);
	}
}
