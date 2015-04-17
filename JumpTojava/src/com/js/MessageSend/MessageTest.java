package com.js.MessageSend;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.JSeparator;
import javax.swing.JRadioButton;

import java.awt.EventQueue;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.UIManager;

@SuppressWarnings("serial")
public class MessageTest extends JFrame {
	
	private String target, from, to, msg, title;

	private ButtonGroup group;
	private JLabel lblFrom, lblTo, lblTitle;
	private JPanel contentPane;
	private JTextField textFrom, textTo, textTitle;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MessageTest frame = new MessageTest();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public MessageTest() {
		setResizable(false);
		setTitle("Message Sender");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 354, 541);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblFrom = new JLabel("보내는사람");
		lblFrom.setFont(UIManager.getFont("Label.font"));
		lblFrom.setHorizontalAlignment(SwingConstants.RIGHT);
		lblFrom.setBounds(8, 100, 68, 15);
		contentPane.add(lblFrom);
		
		textFrom = new JTextField();
		textFrom.setFont(UIManager.getFont("TextField.font"));
		textFrom.setHorizontalAlignment(SwingConstants.LEFT);
		textFrom.setBounds(88, 97, 231, 21);
		contentPane.add(textFrom);
		textFrom.setColumns(10);
		
		lblTo = new JLabel("받는사람");
		lblTo.setFont(UIManager.getFont("Label.font"));
		lblTo.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTo.setBounds(12, 134, 65, 15);
		contentPane.add(lblTo);
		
		textTo = new JTextField();
		textTo.setFont(UIManager.getFont("TextField.font"));
		textTo.setHorizontalAlignment(SwingConstants.LEFT);
		textTo.setBounds(88, 131, 231, 21);
		contentPane.add(textTo);
		textTo.setColumns(10);
		
		lblTitle = new JLabel("제목");
		lblTitle.setFont(UIManager.getFont("Label.font"));
		lblTitle.setEnabled(false);
		lblTitle.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTitle.setBounds(19, 169, 57, 15);
		contentPane.add(lblTitle);
		
		textTitle = new JTextField();
		textTitle.setFont(UIManager.getFont("TextField.font"));
		textTitle.setEnabled(false);
		textTitle.setHorizontalAlignment(SwingConstants.LEFT);
		textTitle.setBounds(88, 166, 231, 21);
		contentPane.add(textTitle);
		textTitle.setColumns(10);
		
		JTextArea textArea = new JTextArea();
		textArea.setFont(UIManager.getFont("TextArea.font"));
		textArea.setBounds(11, 243, 325, 192);
		contentPane.add(textArea);
		
		JLabel lblNewLabel_2 = new JLabel("\uB0B4\uC6A9");
		lblNewLabel_2.setFont(UIManager.getFont("Label.font"));
		lblNewLabel_2.setBounds(11, 218, 57, 15);
		contentPane.add(lblNewLabel_2);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(11, 206, 325, 2);
		contentPane.add(separator);
		
		JLabel lbl1 = new JLabel("\uBA54\uC2DC\uC9C0 \uC885\uB958");
		lbl1.setFont(UIManager.getFont("Label.font"));
		lbl1.setBounds(12, 20, 81, 15);
		contentPane.add(lbl1);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(12, 70, 324, 2);
		contentPane.add(separator_1);

		JRadioButton rdbtnEMail = new JRadioButton("EMail");
		//rdbtnEMail.setFont(UIManager.getFont("RadioButton.font"));
		rdbtnEMail.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblFrom.setText("보내는주소");
				lblTo.setText("받는주소");
				lblTitle.setEnabled(true);
				textTitle.setEnabled(true);
				lblTitle.setText("제목");
				textFrom.requestFocus();
			}
		});
		rdbtnEMail.setToolTipText("");
		rdbtnEMail.setBounds(8, 41, 74, 23);
		contentPane.add(rdbtnEMail);

		JRadioButton rdbtnSMS = new JRadioButton("SMS");
		rdbtnSMS.setFont(UIManager.getFont("RadioButton.font"));
		rdbtnSMS.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblFrom.setText("발신번호");
				lblTo.setText("수신번호");
				lblTitle.setEnabled(false);
				textTitle.setEnabled(false);
				lblTitle.setText("제목");
				textFrom.requestFocus();
			}
		});
		rdbtnSMS.setBounds(83, 41, 64, 23);
		contentPane.add(rdbtnSMS);

		JRadioButton rdbtnPost = new JRadioButton("Post");
		rdbtnPost.setFont(UIManager.getFont("RadioButton.font"));
		rdbtnPost.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblFrom.setText("보내는사람");
				lblTo.setText("받는사람");
				lblTitle.setEnabled(true);
				textTitle.setEnabled(true);
				lblTitle.setText("받을주소");
				textFrom.requestFocus();
			}
		});
		rdbtnPost.setBounds(151, 41, 74, 23);
		contentPane.add(rdbtnPost);

		group = new ButtonGroup();
		group.add(rdbtnEMail);
		group.add(rdbtnSMS);
		group.add(rdbtnPost);

		JButton btnReset = new JButton("\uCD08\uAE30\uD654 (R)");
		btnReset.setFont(UIManager.getFont("Button.font"));
		btnReset.setBounds(128, 466, 97, 23);
		contentPane.add(btnReset);

		JButton btnSend = new JButton("\uBCF4\uB0B4\uAE30 (S)");
		btnSend.setFont(UIManager.getFont("Button.font"));
		btnSend.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (rdbtnEMail.isSelected()) {
					target = "EMail";
				} else if (rdbtnSMS.isSelected()) {
					target = "SMS";
				} else if (rdbtnPost.isSelected()) {
					target = "Post";
				} else {
					JOptionPane.showMessageDialog(null, "메시지종류 가 선택되지 않았습니다.");
					return;
				}
				if (textFrom.getText().equals("")) {
					if (target.equals("EMail")) {
						JOptionPane.showMessageDialog(null, "보내는주소 가 입력되지 않았습니다.");
						textFrom.requestFocus();
						return;
					} else if (target.equals("SMS")) {
						JOptionPane.showMessageDialog(null, "발신번호 가 입력되지 않았습니다.");
						textFrom.requestFocus();
						return;
					} else {
						JOptionPane.showMessageDialog(null, "보내는사람 이 입력되지 않았습니다.");
						textFrom.requestFocus();
						return;
					}
				}
				if (textTo.getText().equals("")) {
					if (target.equals("EMail")) {
						JOptionPane.showMessageDialog(null, "받는주소 가 입력되지 않았습니다.");
						textTo.requestFocus();
						return;
					} else if (target.equals("SMS")) {
						JOptionPane.showMessageDialog(null, "수신번호 가 입력되지 않았습니다.");
						textTo.requestFocus();
						return;
					} else {
						JOptionPane.showMessageDialog(null, "받는사람 이 입력되지 않았습니다.");
						textTo.requestFocus();
						return;
					}
				}
				from = textFrom.getText();
				to = textTo.getText();
				msg = textArea.getText();
				title = textTitle.getText();
				sender();
			}
		});
		btnSend.setBounds(19, 466, 97, 23);
		contentPane.add(btnSend);

		JButton btnExit = new JButton("\uC885\uB8CC (X)");
		btnExit.setFont(UIManager.getFont("Button.font"));
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		btnExit.setBounds(237, 466, 97, 23);
		contentPane.add(btnExit);
	}
	
	public void sender() {
		
		if (target.equals("EMail")) {
			EMail email = new EMail(from, title, msg, to);
			email.send();
		} else if (target.equals("SMS")) {
			SMS sms = new SMS(to, msg, from);
			sms.send();
		} else {
			Post post = new Post(from, title, to, msg);
			post.send();
		}
	}
}
