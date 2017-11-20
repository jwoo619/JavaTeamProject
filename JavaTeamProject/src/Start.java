import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.swing.*;

import javafx.embed.swing.JFXPanel;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

public class Start extends JFrame {
	
	public Start() {
			
		Container c = this.getContentPane();
		c.setLayout(null);
		
		JFXPanel panel = new JFXPanel();	   
        Media m = new Media("file:///" + System.getProperty("user.dir").replace('\\', '/') + "/" + "BGM/main.mp3");
        MediaPlayer p = new MediaPlayer(m);
        p.play(); 
        
		JButton start = new JButton("GAME START");
		start.setBounds(480, 700, 250, 80);
		start.setFont(new Font("¸¼Àº °íµñ",Font.BOLD,20));
		start.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				p.dispose();
				dispose();
				try {
					new Game();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		c.add(start);
		
		JButton rank = new JButton("Ranking");
		rank.setBounds(480, 800, 250, 80);
		rank.setFont(new Font("¸¼Àº °íµñ",Font.BOLD,20));
		rank.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				p.dispose();
				try {
					new Ranking();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		c.add(rank);
		
		ImageIcon img  = new ImageIcon("background.jpg");
	    JLabel background  = new JLabel(img);
	    background.setBounds(0, 0, 1200, 1000);
	    c.add(background);
	    
		setTitle("½Å°ú ÇÔ²²");
		setSize(1200,1000);
		setResizable(false);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
		
	}
	
	public static void main(String[] args) {
		new Start();
	}
}
