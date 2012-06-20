package test;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TabGUI { 
	
	
	public TabGUI() {
		initComponents();
	}

	private void initComponents() {
		JFrame welcomeFrame  = new JFrame("Welcome to Take One Break");
//		frame.setSize(600,400);
		welcomeFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		welcomeFrame.setVisible(true);
		
		JPanel mainPanel = new JPanel();
		welcomeFrame.add(mainPanel);
		JLabel lblSessionTime = new JLabel("Enter time per Session (Default 45 mins):");
		JTextField txtSessionTime = new JTextField(5);
		
		JLabel lblRestTime = new JLabel("Enter time for Rest (Default 5 mins):");
		JTextField txtRestTime = new JTextField(5);
		
		JLabel lblNoOfSessionsPerPhase= new JLabel("Enter number of Sessions per Phase(Default 8):");
		JTextField txtNoOfSessionsPerPhase = new JTextField(5);
		
		JLabel lblSnoozeTime= new JLabel("Enter Snooze time (Default 5 mins):");
		JTextField txtSnoozeTime = new JTextField(5);
		
		JButton btnStartSession = new JButton("Start Session");
		
		mainPanel.add(lblSessionTime);
		mainPanel.add(txtSessionTime);
		mainPanel.add(lblRestTime);
		mainPanel.add(txtRestTime);
		mainPanel.add(lblNoOfSessionsPerPhase);
		mainPanel.add(txtNoOfSessionsPerPhase);
		mainPanel.add(lblSnoozeTime);
		mainPanel.add(txtSnoozeTime);
		
		mainPanel.add(btnStartSession);
//		frame.getContentPane().add(label);
		welcomeFrame.pack();
	
//		btnStartSession.addActionListener(new ActionListener(java.awt.event.ActionListener() {
//
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				// TODO Auto-generated method stub
//				
//			}
//			
//		})
	}

	public static void main(String args[]) {
new TabGUI();
	}
}
