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
		
		//레이아웃 설정
		Container c = this.getContentPane();
		c.setLayout(null);
		
		//BGM 설정
		JFXPanel panel = new JFXPanel();	   
        Media m = new Media("file:///" + System.getProperty("user.dir").replace('\\', '/') + "/" + "BGM/main.mp3");
        MediaPlayer p = new MediaPlayer(m);
         
        //start버튼 설정
		JButton start = new JButton("GAME START");
		start.setForeground(Color.WHITE);
		start.setBounds(480, 700, 250, 80);
		start.setFont(new Font("맑은 고딕",Font.BOLD,30));
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
		
		//rank버튼 설정
		JButton rank = new JButton("Ranking");
		rank.setBounds(480, 800, 250, 80);
		rank.setFont(new Font("맑은 고딕",Font.BOLD,30));
		rank.setForeground(Color.WHITE);
		rank.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				p.dispose();
				dispose();
				try {
					new Ranking();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		
		//배경 설정
		ImageIcon img  = new ImageIcon("image/background.jpg");
	    JLabel background  = new JLabel(img);
	    background.setBounds(0, 0, 1200, 1000);
	    
	    //재생 및 추가
	    p.play();
	    add(start);
	    add(rank);
	    add(background);
	    
	    //창 설정
	    Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
	    setLocation((dim.width/2) - 600, (dim.height/2) - 500);
	    Toolkit toolkit = Toolkit.getDefaultToolkit();
	    Image icon = toolkit.getImage("image/Logo.png");
	    setIconImage(icon);
		setTitle("신과 함께");
		setSize(1200,1000);
		setResizable(false);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
		
	}
	
	public static void main(String[] args) {
		new Start();
	}
}
