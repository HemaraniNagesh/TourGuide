package com.tour;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.BevelBorder;

public class Home {

	public JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home window = new Home();
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
	public Home() {
		initialize();
	}
 
	/**
	 * Initialize the contents of the frame.
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(205, 133, 63));
		frame.setBounds(100, 100, 942, 734);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"", "bangalore ", "Mysore", "Shimoga", "Hampi", "Udupi"}));
		comboBox.setName("");
		comboBox.setToolTipText("");
		comboBox.setBounds(405, 317, 145, 22);
		frame.getContentPane().add(comboBox);
		
		JLabel lblPlace = new JLabel("Choose the district:");
		lblPlace.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblPlace.setBounds(230, 318, 163, 22);
		frame.getContentPane().add(lblPlace);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(128, 0, 0), new Color(255, 20, 147), null, null));
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(comboBox.getSelectedIndex() == 1) {
					Bangalore bl = new Bangalore();
					bl.frame.setVisible(true);
					frame.dispose();
				}
				
				if(comboBox.getSelectedIndex() == 2) {
					Mysore my = new Mysore();
					my.frame.setVisible(true);
					frame.dispose();
				}
				
				if(comboBox.getSelectedIndex() == 3) {
					Shimoga sh = new Shimoga();
					sh.frame.setVisible(true);
					frame.dispose();
				}
			}
		});
		btnSubmit.setBounds(405, 380, 135, 39);
		frame.getContentPane().add(btnSubmit);
		
		Image img = new ImageIcon(this.getClass().getResource("/logo.png")).getImage();
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(23, 13, 193, 160);
		lblNewLabel.setIcon(new ImageIcon(img));
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\u00A9 2020 Traventure All Rights Reserved");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(305, 600, 319, 28);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblWelcomeToKarnataka = new JLabel("Welcome to Karnataka Tourism");
		lblWelcomeToKarnataka.setForeground(Color.WHITE);
		lblWelcomeToKarnataka.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblWelcomeToKarnataka.setBounds(305, 97, 355, 28);
		frame.getContentPane().add(lblWelcomeToKarnataka);
		
		
	}
}
