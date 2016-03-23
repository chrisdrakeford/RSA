package com.chris;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JEditorPane;
import javax.swing.JTextField;

public class UserApp {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UserApp window = new UserApp();
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
	public UserApp() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnEncript = new JButton("Encript");
		btnEncript.setBounds(315, 44, 117, 29);
		frame.getContentPane().add(btnEncript);
		
		JEditorPane editorPane = new JEditorPane();
		editorPane.setBounds(19, 18, 241, 79);
		frame.getContentPane().add(editorPane);
		
		JButton btnDecript = new JButton("Decript");
		btnDecript.setBounds(315, 161, 117, 29);
		frame.getContentPane().add(btnDecript);
		
		JEditorPane editorPane_1 = new JEditorPane();
		editorPane_1.setBounds(19, 126, 241, 85);
		frame.getContentPane().add(editorPane_1);
		
		textField = new JTextField();
		textField.setBounds(327, 101, 97, 28);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
	}
}
