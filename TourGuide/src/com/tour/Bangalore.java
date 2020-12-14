package com.tour;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;



import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Bangalore {
	int i =1;
	public JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Bangalore window = new Bangalore();
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
	public Bangalore() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(222, 184, 135));
		frame.getContentPane().setLayout(null);
		
	
		
		Image img = new ImageIcon(this.getClass().getResource("/wonderla1.png")).getImage();
		Image img1 = new ImageIcon(this.getClass().getResource("/Bannerghatta.png")).getImage();
		Image img2 = new ImageIcon(this.getClass().getResource("/vidhana.png")).getImage();
		Image img3 = new ImageIcon(this.getClass().getResource("/Bangalore_Palace.png")).getImage();
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(null);
		lblNewLabel.setForeground(new Color(255, 0, 0));
		lblNewLabel.setBackground(new Color(220, 20, 60));
		lblNewLabel.setIcon(new ImageIcon(img));
		lblNewLabel.setBounds(46, 13, 701, 600);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Next");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(i<4)
				i = i+1;
				if(i==2)
				{lblNewLabel.setIcon(new ImageIcon(img1));}
				else if(i == 3) {
					lblNewLabel.setIcon(new ImageIcon(img2));
				}
				else if(i==4) {
					lblNewLabel.setIcon(new ImageIcon(img3));
				}
				
			}
		});
		btnNewButton.setFont(new Font("SansSerif", Font.PLAIN, 13));
		btnNewButton.setBounds(666, 683, 81, 32);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnFinish = new JButton("Finish");
		btnFinish.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Home hp = new Home();
				hp.frame.setVisible(true);
				frame.dispose();
			}
		});
		btnFinish.setBounds(352, 687, 97, 25);
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
				else if(i==4) {
					lblNewLabel.setIcon(new ImageIcon(img3));
				}
				else if(i == 1) {
					lblNewLabel.setIcon(new ImageIcon(img));
				}
			}
		});
		button.setFont(new Font("Wingdings", Font.PLAIN, 13));
		button.setBounds(46, 680, 81, 32);
		frame.getContentPane().add(button);
	}

}
