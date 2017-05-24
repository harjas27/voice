/**
 * Created on 24th may 17
 * @author suraj.jha
 * what it does : replies to what u say & frowns on bullshit
 */

//imports 
//*******************************************************************************************************************
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;

import java.awt.*;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
//*******************************************************************************************************************
//class starts here 
public class Chat extends JFrame implements KeyListener {
	/*
	 * 			convert this into a function
	 */
	//BASICALLY Creates a editor for me to type and get output 
	JPanel p = new JPanel();
	JTextArea dialog = new JTextArea(20,50);
	JTextArea input = new JTextArea(1,50);
	JScrollPane scroll = new JScrollPane(
			dialog, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
	
	public static void main(String[] args) {
			Chat bot = new Chat();
	}
	
	public Chat(){
		setSize(600,400);
		setResizable(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		dialog.setEditable(false);
		input.addKeyListener(this);
		p.add(scroll);
		p.add(input);
		p.setBackground(new Color(255,200,0));
		add(p);
		
		setVisible(true);
	}
	
	/*
	 * now on keylisteners 
	 */
	public void KeyPressed(KeyEvent e){
		if(e.getKeyCode()==KeyEvent.VK_ENTER){
			input.setEditable(false);
			//grab code
			String quote = input.getText();
			input.setText("");
			addText("--
			//check matches
			//default
		}
	}
	public void KeyReleased(KeyEvent e){
		
	}
	public void KeyTyped(KeyEvent e){
		
	}
	
	String[][] chatbot = {
			//standard greetings 
			{"hi","hello","how u bro" , "hey there","hey"},
			{"hi","hello","how u bro" , "hey there","hey"},
			//question greetings
			{"how r u ","how are you", "how r you","how are u"},
			{"fine","doing well","good"},
			//default
			{"shut up","noob","stop talking","you seem to have a lot of free time",
				"i am unavialable to you stupid","bro go do something productive"
			}			
	};
}
