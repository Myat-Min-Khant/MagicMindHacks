package ui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import variable.Variable;

public class FeedBackMessage extends JFrame {

	private JPanel contentPane;
	private Variable v = new Variable();
	


	/**
	 * Create the frame.
	 */
	public FeedBackMessage() {
		setTitle("FeedBack");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 701, 552);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(51, 153, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("You have forgotten your selected cele!");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setBounds(111, 163, 503, 73);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Please try again!.");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setForeground(Color.BLACK);
		lblNewLabel_1.setBounds(268, 219, 237, 45);
		contentPane.add(lblNewLabel_1);
		
		JButton btnTryAgain = new JButton("Try Again!");
		btnTryAgain.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Main main = new Main();
				main.setVisible(true);
			}
		});
		btnTryAgain.setForeground(Color.WHITE);
		btnTryAgain.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnTryAgain.setBackground(new Color(153, 255, 0));
		btnTryAgain.setBounds(245, 276, 160, 51);
		contentPane.add(btnTryAgain);
		
	}

}
