package ui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;
import variable.Variable;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.awt.event.ActionEvent;

public class UserRequest extends JFrame {

	private JPanel contentPane;
	private JTextField answer;
	private Variable v = new Variable();
	private String user_answer;
	private ArrayList <String> imgdir = new ArrayList<String>();
	/**
	 * Create the frame.
	 */
	public UserRequest() {
		setTitle("User Request");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 701, 552);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(51, 153, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		answer = new JTextField();
		answer.setBounds(249, 459, 205, 39);
		contentPane.add(answer);
		answer.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Enter Yes or No");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_2.setForeground(new Color(0, 0, 0));
		lblNewLabel_2.setBounds(10, 455, 163, 39);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel = new JLabel("Below the images,you have selected cele include?");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 23));
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setBounds(52, 37, 600, 60);
		contentPane.add(lblNewLabel);
		
		JLabel one = new JLabel("");
		one.setBounds(10, 111, 125, 105);
		contentPane.add(one);
		
		JLabel two = new JLabel("");
		two.setBounds(190, 111, 125, 105);
		contentPane.add(two);
		
		JLabel three = new JLabel("");
		three.setBounds(370, 111, 125, 105);
		contentPane.add(three);
		
		JLabel four = new JLabel("");
		four.setBounds(550, 111, 125, 105);
		contentPane.add(four);
		
		JLabel five = new JLabel("");
		five.setBounds(10, 272, 125, 105);
		contentPane.add(five);
		
		JLabel lb_one = new JLabel("");
		lb_one.setForeground(Color.BLACK);
		lb_one.setFont(new Font("Tahoma", Font.BOLD, 20));
		lb_one.setBounds(10, 227, 125, 34);
		contentPane.add(lb_one);
		
		JLabel lb_two = new JLabel("");
		lb_two.setForeground(Color.BLACK);
		lb_two.setFont(new Font("Tahoma", Font.BOLD, 20));
		lb_two.setBounds(190, 227, 125, 34);
		contentPane.add(lb_two);
		
		JLabel lb_three = new JLabel("");
		lb_three.setForeground(Color.BLACK);
		lb_three.setFont(new Font("Tahoma", Font.BOLD, 20));
		lb_three.setBounds(370, 227, 125, 34);
		contentPane.add(lb_three);
		
		JLabel lb_four = new JLabel("");
		lb_four.setForeground(Color.BLACK);
		lb_four.setFont(new Font("Tahoma", Font.BOLD, 20));
		lb_four.setBounds(550, 227, 125, 34);
		contentPane.add(lb_four);
		
		JLabel lb_five = new JLabel("");
		lb_five.setForeground(Color.BLACK);
		lb_five.setFont(new Font("Tahoma", Font.BOLD, 20));
		lb_five.setBounds(10, 386, 125, 34);
		contentPane.add(lb_five);
		
		JButton enter = new JButton("Enter");
		enter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				getUseranswer();
				userCondition();
				
			}
		});
		enter.setForeground(Color.WHITE);
		enter.setFont(new Font("Tahoma", Font.BOLD, 20));
		enter.setBackground(new Color(153, 255, 0));
		enter.setBounds(488, 459, 125, 39);
		contentPane.add(enter);
		
		JLabel lb_oneceagain = new JLabel("Once Again!");
		lb_oneceagain.setForeground(Color.BLACK);
		lb_oneceagain.setFont(new Font("Tahoma", Font.BOLD, 23));
		lb_oneceagain.setBounds(272, 11, 383, 39);
		contentPane.add(lb_oneceagain);
		if (v.getShufflecount() == 1) {
			lb_oneceagain.setText("Twice Again!");
		}
		if (v.getShufflecount() == 2) {
			lb_oneceagain.setText("Thrice Again!");
		}
		
		
		v.setimgshuffleIndex();
		
		this.imgdir.clear();
		setimgDir();
		
		if (v.getimgshuffle().get(v.getimgshuffleIndex()).size() == 5) {
			one.setIcon(new ImageIcon(v.getimgshuffle().get(v.getimgshuffleIndex()).get(0)));
			two.setIcon(new ImageIcon(v.getimgshuffle().get(v.getimgshuffleIndex()).get(1)));
			three.setIcon(new ImageIcon(v.getimgshuffle().get(v.getimgshuffleIndex()).get(2)));
			four.setIcon(new ImageIcon(v.getimgshuffle().get(v.getimgshuffleIndex()).get(3)));
			five.setIcon(new ImageIcon(v.getimgshuffle().get(v.getimgshuffleIndex()).get(4)));
			lb_one.setText(imgdir.get(0));
			lb_two.setText(imgdir.get(1));
			lb_three.setText(imgdir.get(2));
			lb_four.setText(imgdir.get(3));
			lb_five.setText(imgdir.get(4));
			
			
		}
		if (v.getimgshuffle().get(v.getimgshuffleIndex()).size() == 4) {
			one.setIcon(new ImageIcon(v.getimgshuffle().get(v.getimgshuffleIndex()).get(0)));
			two.setIcon(new ImageIcon(v.getimgshuffle().get(v.getimgshuffleIndex()).get(1)));
			three.setIcon(new ImageIcon(v.getimgshuffle().get(v.getimgshuffleIndex()).get(2)));
			four.setIcon(new ImageIcon(v.getimgshuffle().get(v.getimgshuffleIndex()).get(3)));
			lb_one.setText(imgdir.get(0));
			lb_two.setText(imgdir.get(1));
			lb_three.setText(imgdir.get(2));
			lb_four.setText(imgdir.get(3));
			
		}
	}
	
	public void getUseranswer() {
		user_answer = answer.getText();
	}
	public void userCondition() {
		if (user_answer.equalsIgnoreCase("No")) {
			
			if (v.getimgshuffleIndex() == v.getimgshuffle().size() -1) {
				answer.setText("");
				new ResetAll().reset();
				dispose();
				FeedBackMessage f = new FeedBackMessage();
				f.setVisible(true);
			}
			else if (v.getimgshuffleIndex() < v.getimgshuffle().size() -1) {
				answer.setText("");
				dispose();
				UserRequest request = new UserRequest();
				request.setVisible(true);
				
			}
			
		}
		if (user_answer.equalsIgnoreCase("Yes")) {
			v.setShufflecount();
			computeMagic();	
		}
		else if (!user_answer.equalsIgnoreCase("Yes") && !user_answer.equalsIgnoreCase("No")){
			answer.setText("");
			JOptionPane.showMessageDialog(null,"Please Type Yes or No!");
		}
		 
	}
	public void setimgDir() {
		for (int x=0;x<v.getimgshuffle().get(v.getimgshuffleIndex()).size();x++) {
			String [] f;
			String celename;
			f = v.getimgshuffle().get(v.getimgshuffleIndex()).get(x).split("/");
			celename = f[2];
			f = celename.split("\\.");
			imgdir.add(f[0]);
		}
	}
	public void computeMagic() {
		
		if (v.getShufflecount() == 3) {
			prepareMagic();
			dispose();
			FinalResult final_result = new FinalResult();
			final_result.setVisible(true);
			
			
		}
		else {
			
			prepareMagic();
			v.getimgshuffle().clear();
			v.setimgshuffle(v.getResult());
			v.getResult().clear();
			dispose();
			UserRequest request = new UserRequest();
			request.setVisible(true); 
		}
	}
	public void prepareMagic() {
		ArrayList<ArrayList<String>> _notelist = new ArrayList<ArrayList<String>>();
		_notelist.add(v.getimgshuffle().get(1));
		v.getimgshuffle().set(1,v.getimgshuffle().get(v.getimgshuffleIndex()));
		v.getimgshuffle().set(v.getimgshuffleIndex(),_notelist.get(0));
		
		for (int x = 0;x<v.getimgshuffle().size();x++) {
			for (int i=0;i<v.getimgshuffle().get(x).size();i++) {
				v.setResult(v.getimgshuffle().get(x).get(i));
			}
		}
		answer.setText("");
		
		v.setDefaultshuffleIndex();
		
	}
	
	
}
