import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter; 
import java.awt.event.MouseEvent; 
import java.awt.event.MouseListener; 
import java.awt.event.MouseMotionListener;

public class Game extends JFrame {
	
	JLabel charter;
	JLabel socre_board;
	String[] zz = {"1@천국1.png","1@천국2.png","1@천국3.png","1@천국4.png","1@천국5.png","2@지옥1.png","2@지옥2.png","2@지옥3.png","2@지옥4.png","2@지옥5.png"};
	static int socre = 0;
	static int life  = 3;
	String key;
	
	public Game() {
		
		Container c = this.getContentPane();
		c.setLayout(null);
		
		key = zz[(int) (Math.random() * 10)];
		System.out.println(key.charAt(0));
	    ImageIcon cimg  = new ImageIcon(key);
	    charter  = new JLabel(cimg);
	    charter.setLocation(700,300); // 위치지정
		charter.setSize(200,400); // 크기 지정 
	    add(charter);
	    
	    socre_board = new JLabel("score : 0");
	    socre_board.setBounds(700,10,400,100);
	    socre_board.setFont(new Font("", Font.PLAIN, 50));
		add(socre_board);
	    
	    ImageIcon bimg  = new ImageIcon("background.jpg");
	    JLabel background  = new JLabel(bimg);
	    background.setBounds(0, 0, 1600, 1000);
	    c.add(background);

		this.addMouseListener(new MyMouseListener()); // 마우스리스너 
		this.addMouseMotionListener(new MyMouseListener()); // 모션리스너 
	    
		setTitle("신과 함께");
		setSize(1600,1000);
		setResizable(false);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
	}
	
	class MyMouseListener extends MouseAdapter implements MouseMotionListener{ 
		
	
		public void mouseDragged(MouseEvent e){ // 드래그일시
			int x = e.getX();
			int y = e.getY();
			if((charter.getX() < x && charter.getX()+200 > x) && (charter.getY()+80 < y && charter.getY()+370 > y))
			charter.setLocation(x-100, y-250); // 위치 조정

			if(charter.getX() < 100 )
			{
				Check (key.charAt(0) , '1');
			}
			else if(charter.getX() > 1300) 
			{
				Check (key.charAt(0) , '2');
			}
		}
	}
	
	public void Check (char a , char b) {
		if(a == b) {
			
			Game.socre += 100;
			socre_board.setText("socre : "+Game.socre);
			
		}
		else {
			if(Game.life == 0) {
				dispose();
				new End();
				Game.life = 3;
				Game.socre = 0;
			}
			else
				Game.life -= 1;
		}
		key = zz[(int) (Math.random() * 10)];
		charter.setIcon(new ImageIcon(key));
		charter.setLocation(700,300);
	}
	
	public static void main(String[] args) {
		new Game();
	}

}
