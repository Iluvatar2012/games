package crawlerIluvatar2014;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

class CoreMenuMulti {

	static void initMultiMenu() {
		
		JFrame frame;
		JPanel menu;
		
		JButton back;
		
		// get the current frame from main
		frame = CoreCrawler.getFrame();
		
		// create a new Panel as ContentPane for the Frame
		menu = new JPanel();
		menu.setSize(frame.getContentPane().getSize());
		menu.setBackground(new Color(0,0,0));
		
		// build all buttons
		back = new JButton("Back");
		
		// add action listeners to all buttons
		back.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				CoreMenuMain.initMainMenu();
			}
		});
		
		// add all buttons to the menu
		menu.add(back);
		
		// set the newly created menu as content pane
		frame.setContentPane(menu);
	}
}
