import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javafx.embed.swing.JFXPanel;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

public class End extends JFrame {
	
	static String name;
	
	End(){
		
		Container c = this.getContentPane();
		c.setLayout(null);
		
		
		ImageIcon bimg  = new ImageIcon("background.jpg");
	    JLabel background  = new JLabel(bimg);
	    background.setBounds(0, 0, 1600, 1000);
	    c.add(background);
	    
		JFXPanel panel = new JFXPanel();	   
        Media m = new Media("file:///" + System.getProperty("user.dir").replace('\\', '/') + "/" + "BGM/GAME_Over.mp3");
        MediaPlayer p = new MediaPlayer(m);
        p.play(); 
        
		setTitle("신과 함께");
		setSize(1600,1000);
		setResizable(false);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
		
		End.name = JOptionPane.showInputDialog(null, "닉네임 입력","랭킹 ",-1);

		if( name != null ) {
						
			try {
				reset();
			} catch (IOException e1) {
				e1.printStackTrace();
			}	
		}
		
		dispose();
		new Start();	
	}
	
	public static void reset() throws IOException {
		BufferedReader file = new BufferedReader(new FileReader("rank.txt"));
		int i = 0;
		String[] data = new String[10];
		while(i < 10) {
			
            String line = file.readLine();
            System.out.println(i +" | "+line);
            
            if (line==null) break;
            
            data[i] = line;
            int s_num = data[i].indexOf("@");
            String d_temp = data[i].substring(s_num+1);
            int num = Integer.parseInt(d_temp);
            if(Game.socre > num) {
            	String temp = data[i];
            	data[i] = End.name+"@"+Game.socre;
            	i++;
            	data[i] = temp;
            	Game.socre = -1;
            }    	
            i++;
        }
		file.close();
		PrintWriter pw = new PrintWriter(new FileWriter("rank.txt"));
		if(Game.socre != -1 && i != 10) {
			data[i] = End.name+"@"+Game.socre;
			i++;
		}
		for(int j = 0; j < i; j++) {
			pw.println(data[j]);
		}
		pw.close();	
		End.name = null;
	}
	public static void main(String[] args) throws IOException  {
		new End();
	}
}
