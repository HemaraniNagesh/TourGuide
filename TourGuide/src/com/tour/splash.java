package com.tour;

import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.border.EmptyBorder;

public class splash extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	public JProgressBar progressBar;
	public JLabel lblWelcomeToStudent;
	public JLabel label_1;
	public JLabel lblDesignedBySree;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public splash() {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 835, 527);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(222, 184, 135));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblWelcomeToStudent = new JLabel("WELCOME TO TRAVENTURE ");
		lblWelcomeToStudent.setFont(new Font("Georgia", Font.BOLD, 24));
		lblWelcomeToStudent.setBounds(235, 128, 379, 70);
		contentPane.add(lblWelcomeToStudent);
		
		progressBar = new JProgressBar();
		progressBar.setForeground(Color.GREEN);
		progressBar.setBounds(0, 332, 817, 45);
		contentPane.add(progressBar);
		
		
		 label_1 = new JLabel("...");
		label_1.setBackground(Color.RED);
		label_1.setFont(new Font("Tahoma", Font.BOLD, 24));
		label_1.setBounds(370, 294, 32, 38);
		contentPane.add(label_1);
		
		lblDesignedBySree = new JLabel("Designed by HARSHVARDHAN, VISHWANATH, HARSH AND HEMA RANI");
		lblDesignedBySree.setForeground(new Color(0, 0, 0));
		lblDesignedBySree.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 24));
		lblDesignedBySree.setBounds(12, 416, 805, 38);
		contentPane.add(lblDesignedBySree);
	}

}
