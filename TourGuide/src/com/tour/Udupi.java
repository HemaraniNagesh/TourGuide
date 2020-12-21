package com.tour;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Udupi {
	int i=1;
	public JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Udupi window = new Udupi();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Udupi() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(222, 184, 135));
		frame.getContentPane().setLayout(null);
		
	
		
		Image img = new ImageIcon(this.getClass().getResource("/malpe.png")).getImage();
		Image img1 = new ImageIcon(this.getClass().getResource("/stmary.png")).getImage();
		Image img2 = new ImageIcon(this.getClass().getResource("/krishna.png")).getImage();
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(null);
		lblNewLabel.setForeground(new Color(255, 0, 0));
		lblNewLabel.setBackground(new Color(220, 20, 60));
		lblNewLabel.setIcon(new ImageIcon(img));
		lblNewLabel.setBounds(43, 31, 701, 600);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Next");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(i<3)
				i = i+1;
				if(i==2)
				{lblNewLabel.setIcon(new ImageIcon(img1));}
				else if(i == 3) {
					lblNewLabel.setIcon(new ImageIcon(img2));
				}
				
			}
		});
		btnNewButton.setBounds(663, 687, 81, 32);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnFinish = new JButton("Finish");
		btnFinish.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Home hp = new Home();
				hp.frame.setVisible(true);
				frame.dispose();
			}
		});
		btnFinish.setBounds(339, 691, 97, 25);
		frame.getContentPane().add(btnFinish);
		frame.setBounds(100, 100, 797, 812);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton button = new JButton("\uF0E7");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(i>1)
				i=i-1;
				if(i==2)
				{lblNewLabel.setIcon(new ImageIcon(img1));}
				else if(i == 3) {
					lblNewLabel.setIcon(new ImageIcon(img2));
				}
				else if(i == 1) {
					lblNewLabel.setIcon(new ImageIcon(img));
				}
			}
		});
		button.setFont(new Font("Wingdings", Font.PLAIN, 13));
		button.setBounds(97, 683, 81, 32);
		frame.getContentPane().add(button);
	}

}
