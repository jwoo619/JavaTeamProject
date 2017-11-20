import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.*;

public class Ranking extends JFrame {
	
	public Ranking() throws IOException{
		
		Container c = this.getContentPane();
		c.setLayout(null);
		
		JButton back = new JButton("µÚ·Î°¡±â");
		back.setBounds(480, 850, 250, 80);
		back.setFont(new Font("¸¼Àº °íµñ",Font.BOLD,20));
		back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				new Start();
			}
		});
		c.add(back);
		
		JLabel rank = new JLabel("Rank");
		rank.setBounds(535, 15, 250, 80);
		rank.setFont(new Font("¸¼Àº °íµñ",Font.BOLD,50));
		c.add(rank);
		
		BufferedReader file = new BufferedReader(new FileReader("rank.txt"));
		int i = 1;
        while(i < 11) {
            String line = file.readLine();
            if (line==null) break;
            
            String[] data = line.split("@");
			JLabel name = new JLabel(String.valueOf(data[0]));
			name.setBounds(350, (i*75),550,100);
			name.setFont(new Font("¸¼Àº °íµñ",Font.BOLD,40));
			c.add(name);
			
			JLabel score = new JLabel(String.valueOf(data[1]));
			score.setBounds(1000, (i*75),550,100);
			score.setFont(new Font("¸¼Àº °íµñ",Font.BOLD,40));
			c.add(score);
			
			i += 1 ;
        }
        file.close();
        
        for(int j=1; j<i; j++) {
			JLabel num = new JLabel(String.valueOf(j));
			num.setBounds(200, (j*75),100,100);
			num.setFont(new Font("¸¼Àº °íµñ",Font.BOLD,40));
			c.add(num);
		}
        
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
	
	public static void main(String[] args) throws IOException {

	}

}
