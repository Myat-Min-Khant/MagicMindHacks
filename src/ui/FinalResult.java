package ui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import variable.Variable;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class FinalResult extends JFrame {
	private Variable v = new Variable();
	private JPanel contentPane;
	private JLabel result;
	private JLabel lb_result;
	

	

	/**
	 * Create the frame.
	 */
	public FinalResult() {
		setTitle("Final Result");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 701, 552);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(51, 153, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("MACHINE PREDICTED YOUR SELECTED CELE IS ");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setBounds(43, 87, 617, 51);
		contentPane.add(lblNewLabel);
		
		result = new JLabel("");
		result.setBounds(268, 159, 125, 105);
		contentPane.add(result);
		
		lb_result = new JLabel("");
		lb_result.setForeground(new Color(0, 0, 0));
		lb_result.setFont(new Font("Tahoma", Font.BOLD, 23));
		lb_result.setBounds(268, 287, 169, 42);
		contentPane.add(lb_result);
		
		JButton TryAgain = new JButton("Try Again");
		TryAgain.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new ResetAll().reset();
				dispose();
				Main main = new Main();
				main.setVisible(true);
			}
		});
		TryAgain.setForeground(new Color(255, 255, 255));
		TryAgain.setFont(new Font("Tahoma", Font.BOLD, 15));
		TryAgain.setBackground(new Color(102, 255, 51));
		TryAgain.setBounds(268, 375, 125, 51);
		contentPane.add(TryAgain);
		
		JButton Exit = new JButton("Exit");
		Exit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		Exit.setForeground(new Color(255, 255, 255));
		Exit.setFont(new Font("Tahoma", Font.BOLD, 15));
		Exit.setBackground(new Color(102, 255, 51));
		Exit.setBounds(268, 451, 125, 51);
		contentPane.add(Exit);
		setImage();
		setCelename();
		
		
		
		
	}
	public void setImage() {
		result.setIcon(new ImageIcon(v.getResult().get(v.getFinalresultindex())));
		
	}
	public void setCelename() {
		String f [];
		String dirname = v.getResult().get(v.getFinalresultindex());
		f = dirname.split("/");
		String filename = f[2];
		f = filename.split("\\.");
		lb_result.setText(f[0]);
		
	}
	

}
