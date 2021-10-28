package ui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.io.File;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;

import variable.Variable;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Main extends JFrame {
	JLabel one;
	JLabel two;
	JLabel three;
	JLabel four;
	JLabel five;
	JLabel six;
	JLabel seven;
	JLabel eight;
	JLabel nine;
	JLabel ten;
	JLabel eleven;
	JLabel tweleve;
	JLabel thirteen;
	JLabel fourteen;
	
	
	Variable v = new Variable();
	Random rand = new Random();
	ArrayList<String> _celename;
	ArrayList<String> _celeFilename = new ArrayList<String>();
	Set<String> _randomFilename = new LinkedHashSet<String>();
	Set<String> _randomCelename = new LinkedHashSet<String>();
	
	

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Main() {
		setTitle("Mind Hack");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1101, 548);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(51, 153, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Select your favourite a cele in your mind");
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel.setBounds(285, 11, 506, 43);
		contentPane.add(lblNewLabel);
		
		JButton next = new JButton("Next");
		next.setBackground(new Color(153, 255, 0));
		next.setForeground(new Color(255, 255, 255));
		next.setFont(new Font("Tahoma", Font.BOLD, 20));
		next.setBounds(895, 430, 182, 68);
		contentPane.add(next);
		
		one = new JLabel("");
		one.setBounds(10, 73, 125, 105);
		contentPane.add(one);
		
		two = new JLabel("");
		two.setBounds(167, 73, 125, 105);
		contentPane.add(two);
		
		three = new JLabel("");
		three.setBounds(324, 73, 125, 105);
		contentPane.add(three);
		
		four = new JLabel("");
		four.setBounds(481, 73, 125, 105);
		contentPane.add(four);
		
		five = new JLabel("");
		five.setBounds(638, 73, 125, 105);
		contentPane.add(five);
		
		six = new JLabel("");
		six.setBounds(795, 73, 125, 105);
		contentPane.add(six);
		
		seven = new JLabel("");
		seven.setBounds(952, 73, 125, 105);
		contentPane.add(seven);
		
		eight = new JLabel("");
		eight.setBounds(10, 244, 125, 105);
		contentPane.add(eight);
		
		nine = new JLabel("");
		nine.setBounds(167, 244, 125, 105);
		contentPane.add(nine);
		
		ten = new JLabel("");
		ten.setBounds(324, 244, 125, 105);
		contentPane.add(ten);
		
		eleven = new JLabel("");
		eleven.setBounds(482, 244, 125, 105);
		contentPane.add(eleven);
		
		tweleve = new JLabel("");
		tweleve.setBounds(638, 244, 125, 105);
		contentPane.add(tweleve);
		
		thirteen = new JLabel("");
		thirteen.setBounds(795, 244, 125, 105);
		contentPane.add(thirteen);
		
		fourteen = new JLabel("");
		fourteen.setBounds(950, 244, 125, 105);
		contentPane.add(fourteen);
		
		JLabel lb_one = new JLabel("New label");
		lb_one.setForeground(Color.BLACK);
		lb_one.setFont(new Font("Tahoma", Font.BOLD, 20));
		lb_one.setBounds(10, 188, 125, 27);
		contentPane.add(lb_one);
		
		JLabel lb_two = new JLabel("New label");
		lb_two.setForeground(Color.BLACK);
		lb_two.setFont(new Font("Tahoma", Font.BOLD, 20));
		lb_two.setBounds(167, 188, 125, 27);
		contentPane.add(lb_two);
		
		JLabel lb_three = new JLabel("New label");
		lb_three.setForeground(Color.BLACK);
		lb_three.setFont(new Font("Tahoma", Font.BOLD, 20));
		lb_three.setBounds(324, 188, 125, 27);
		contentPane.add(lb_three);
		
		JLabel lb_four = new JLabel("New label");
		lb_four.setForeground(Color.BLACK);
		lb_four.setFont(new Font("Tahoma", Font.BOLD, 20));
		lb_four.setBounds(481, 188, 125, 27);
		contentPane.add(lb_four);
		
		JLabel lb_five = new JLabel("New label");
		lb_five.setForeground(Color.BLACK);
		lb_five.setFont(new Font("Tahoma", Font.BOLD, 20));
		lb_five.setBounds(638, 188, 125, 27);
		contentPane.add(lb_five);
		
		JLabel lb_six = new JLabel("New label");
		lb_six.setForeground(Color.BLACK);
		lb_six.setFont(new Font("Tahoma", Font.BOLD, 20));
		lb_six.setBounds(795, 188, 125, 27);
		contentPane.add(lb_six);
		
		JLabel lb_seven = new JLabel("New label");
		lb_seven.setForeground(Color.BLACK);
		lb_seven.setFont(new Font("Tahoma", Font.BOLD, 20));
		lb_seven.setBounds(952, 188, 125, 27);
		contentPane.add(lb_seven);
		
		JLabel lb_eight = new JLabel("New label");
		lb_eight.setForeground(Color.BLACK);
		lb_eight.setFont(new Font("Tahoma", Font.BOLD, 20));
		lb_eight.setBounds(10, 359, 125, 27);
		contentPane.add(lb_eight);
		
		JLabel lb_nine = new JLabel("New label");
		lb_nine.setForeground(Color.BLACK);
		lb_nine.setFont(new Font("Tahoma", Font.BOLD, 20));
		lb_nine.setBounds(167, 359, 125, 27);
		contentPane.add(lb_nine);
		
		JLabel lb_ten = new JLabel("New label");
		lb_ten.setForeground(Color.BLACK);
		lb_ten.setFont(new Font("Tahoma", Font.BOLD, 20));
		lb_ten.setBounds(324, 359, 125, 27);
		contentPane.add(lb_ten);
		
		JLabel lb_eleven = new JLabel("New label");
		lb_eleven.setForeground(Color.BLACK);
		lb_eleven.setFont(new Font("Tahoma", Font.BOLD, 20));
		lb_eleven.setBounds(481, 359, 125, 27);
		contentPane.add(lb_eleven);
		
		JLabel lb_tweleve = new JLabel("New label");
		lb_tweleve.setForeground(Color.BLACK);
		lb_tweleve.setFont(new Font("Tahoma", Font.BOLD, 20));
		lb_tweleve.setBounds(638, 359, 125, 27);
		contentPane.add(lb_tweleve);
		
		JLabel lb_thirteen = new JLabel("New label");
		lb_thirteen.setForeground(Color.BLACK);
		lb_thirteen.setFont(new Font("Tahoma", Font.BOLD, 20));
		lb_thirteen.setBounds(795, 359, 125, 27);
		contentPane.add(lb_thirteen);
		
		JLabel lb_fourteen = new JLabel("New label");
		lb_fourteen.setForeground(Color.BLACK);
		lb_fourteen.setFont(new Font("Tahoma", Font.BOLD, 20));
		lb_fourteen.setBounds(952, 359, 125, 27);
		contentPane.add(lb_fourteen);
		
		this._celeFilename.clear();
		this._celeFilename.clear();
		this._randomFilename.clear();
		this._randomCelename.clear();
		
		String _randompath = v._imgpath.get(rand.nextInt(v._imgpath.size()));
		File _readFile = new File(_randompath);
		
		for (String pathname : _readFile.list()) {
			_celeFilename.add(_randompath+pathname);
			
		}
		generateCele();
		setimageIcon();
		
		
		lb_one.setText(_celename.get(0));
		lb_two.setText(_celename.get(1));
		lb_three.setText(_celename.get(2));
		lb_four.setText(_celename.get(3));
		lb_five.setText(_celename.get(4));
		lb_six.setText(_celename.get(5));
		lb_seven.setText(_celename.get(6));
		lb_eight.setText(_celename.get(7));
		lb_nine.setText(_celename.get(8));
		lb_ten.setText(_celename.get(9));
		lb_eleven.setText(_celename.get(10));
		lb_tweleve.setText(_celename.get(11));
		lb_thirteen.setText(_celename.get(12));
		lb_fourteen.setText(_celename.get(13));  
		
		
		
		next.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				v.setimgshuffle(_celeFilename);
				dispose();
				UserRequest request = new UserRequest();
				request.setVisible(true);
				
				
			}
		});
	}
	
	public void setimageIcon() {
		one.setIcon(new ImageIcon(_celeFilename.get(0)));
		two.setIcon(new ImageIcon(_celeFilename.get(1)));
		three.setIcon(new ImageIcon(_celeFilename.get(2)));
		four.setIcon(new ImageIcon(_celeFilename.get(3)));
		five.setIcon(new ImageIcon(_celeFilename.get(4)));
		six.setIcon(new ImageIcon(_celeFilename.get(5)));
		seven.setIcon(new ImageIcon(_celeFilename.get(6)));
		eight.setIcon(new ImageIcon(_celeFilename.get(7)));
		nine.setIcon(new ImageIcon(_celeFilename.get(8)));
		ten.setIcon(new ImageIcon(_celeFilename.get(9)));
		eleven.setIcon(new ImageIcon(_celeFilename.get(10)));
		tweleve.setIcon(new ImageIcon(_celeFilename.get(11)));
		thirteen.setIcon(new ImageIcon(_celeFilename.get(12)));
		fourteen.setIcon(new ImageIcon(_celeFilename.get(13)));
		

	}
	public void generateCele()  {
		
		for (int x = 0;_randomFilename.size()<_celeFilename.size();x++) {
			String _genrandom = _celeFilename.get(rand.nextInt(_celeFilename.size()));
			String [] f = _genrandom.split("/");
			String celefilename = f[2];
			f = celefilename.split("\\.");
			_randomFilename.add(_genrandom);
			_randomCelename.add(f[0]);
			
		}
		_celeFilename.clear();
		_celeFilename = new ArrayList<String>(_randomFilename);
		_celename = new ArrayList<String>(_randomCelename);
		
		
	}
}
