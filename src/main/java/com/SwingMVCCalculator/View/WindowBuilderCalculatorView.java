package com.SwingMVCCalculator.View;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.SwingConstants;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import java.awt.GridLayout;
import java.awt.CardLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Font;
import java.awt.Color;

public class WindowBuilderCalculatorView extends JFrame {

	/**
	 Something related to serializable interface
	 */
	private static final long serialVersionUID = 1L;
	
	//Form objects (buttons, labels, text fields)
	private JLabel expressionLabel = new JLabel("Input history");
	private JTextField expression = new JTextField();
	private JLabel memoryLabel = new JLabel("Memory");
	private JTextField memory = new JTextField();
	private JLabel inputLabel = new JLabel("Last input");
	private JTextField input = new JTextField();
	private JLabel resultLabel = new JLabel("Result");
	private JTextField result = new JTextField();
	private JButton cButton = new JButton("C");
	private JButton ceButton = new JButton("CE");
	private JButton mPlusButton = new JButton("M+");
	private JButton mReadButton = new JButton("MR");
	private JButton mClearButton = new JButton("MC");
	private JButton oneButton = new JButton("1");
	private JButton twoButton = new JButton("2");
	private JButton threeButton = new JButton("3");
	private JButton fourButton = new JButton("4");
	private JButton fiveButton = new JButton("5");
	private JButton sixButton = new JButton("6");
	private JButton sevenButton = new JButton("7");
	private JButton eightButton = new JButton("8");
	private JButton nineButton = new JButton("9");
	private JButton zeroButton = new JButton("0");
	private JButton positiveNegativeButton = new JButton("+/-");
	private JButton plusButton = new JButton("+");
	private JButton minusButton = new JButton("-");
	private JButton multiplyButton = new JButton("*");
	private JButton divideButton = new JButton("/");
	private JButton commaButton = new JButton(",");

	
	//Form panel
	public WindowBuilderCalculatorView() {
		JPanel calcPanel = new JPanel();
		//General form settings
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(285,362);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		this.setTitle("SwingMVCCalculator");
		//Adding panel to form
		getContentPane().add(calcPanel);
		calcPanel.setLayout(null);
		expressionLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		expressionLabel.setVerticalAlignment(SwingConstants.TOP);
		expressionLabel.setBounds(10, 11, 112, 14);
		calcPanel.add(expressionLabel);
		expression.setFont(new Font("Tahoma", Font.BOLD, 16));
		expression.setBounds(10, 28, 260, 30);
		calcPanel.add(expression);
		memoryLabel.setBounds(10, 66, 47, 14);
		calcPanel.add(memoryLabel);
		memory.setBounds(10, 81, 60, 25);
		calcPanel.add(memory);
		inputLabel.setBounds(77, 63, 60, 20);
		calcPanel.add(inputLabel);
		input.setBounds(76, 81, 60, 25);
		calcPanel.add(input);
		resultLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		resultLabel.setBounds(143, 64, 69, 18);
		calcPanel.add(resultLabel);
		result.setFont(new Font("Tahoma", Font.BOLD, 11));
		result.setBounds(142, 81, 122, 25);
		calcPanel.add(result);
		cButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		cButton.setForeground(Color.BLACK);
		cButton.setBounds(170, 117, 101, 38);
		cButton.setToolTipText("Resets whole calculation");
		calcPanel.add(cButton);
		ceButton.setFont(new Font("Tahoma", Font.BOLD, 8));
		ceButton.setBounds(170, 164, 47, 38);
		ceButton.setToolTipText("Resets last input");
		calcPanel.add(ceButton);
		mPlusButton.setFont(new Font("Tahoma", Font.PLAIN, 8));
		mPlusButton.setBounds(170, 248, 47, 38);
		mPlusButton.setToolTipText("Adds last input to memory");
		calcPanel.add(mPlusButton);
		mReadButton.setFont(new Font("Tahoma", Font.PLAIN, 8));
		mReadButton.setBounds(170, 290, 47, 38);
		mReadButton.setToolTipText("Load from memory to input");
		calcPanel.add(mReadButton);
		mClearButton.setFont(new Font("Tahoma", Font.BOLD, 8));
		mClearButton.setBounds(170, 206, 47, 38);
		mClearButton.setToolTipText("Resets memory");
		calcPanel.add(mClearButton);
		oneButton.setBounds(10, 164, 47, 38);
		calcPanel.add(oneButton);
		twoButton.setBounds(63, 164, 47, 38);
		calcPanel.add(twoButton);
		threeButton.setBounds(117, 164, 47, 38);
		calcPanel.add(threeButton);
		fourButton.setBounds(10, 206, 47, 38);
		calcPanel.add(fourButton);
		fiveButton.setBounds(63, 206, 47, 38);
		calcPanel.add(fiveButton);
		sixButton.setBounds(117, 206, 47, 38);
		calcPanel.add(sixButton);
		sevenButton.setBounds(10, 248, 47, 38);
		calcPanel.add(sevenButton);
		eightButton.setBounds(63, 248, 47, 38);
		calcPanel.add(eightButton);
		nineButton.setBounds(117, 248, 47, 38);
		calcPanel.add(nineButton);
		zeroButton.setBounds(63, 290, 47, 38);
		calcPanel.add(zeroButton);
		positiveNegativeButton.setFont(new Font("Tahoma", Font.PLAIN, 8));
		positiveNegativeButton.setBounds(117, 290, 47, 38);
		calcPanel.add(positiveNegativeButton);
		plusButton.setBounds(224, 164, 47, 38);
		calcPanel.add(plusButton);
		minusButton.setBounds(224, 206, 47, 38);
		calcPanel.add(minusButton);
		multiplyButton.setBounds(224, 248, 47, 38);
		calcPanel.add(multiplyButton);
		divideButton.setBounds(224, 290, 47, 38);
		calcPanel.add(divideButton);
		commaButton.setBounds(10, 290, 47, 38);
		calcPanel.add(commaButton);
	}
	
	//Text field setters
	public void setExpression(String expression){
		this.expression.setText(expression);
	}
	
	public void setMemory(Double memory){
		this.memory.setText(memory.toString());
	}
	
	public void setResult(Double result){
		if(result<Double.MAX_VALUE)
			this.result.setText(result.toString());	
		else
			this.result.setText("Infinity");
	}
	
	public void setInput(Double input){
		this.input.setText(input.toString());
	}

	//Button action listeners
	//private JButton cButton = new JButton("C");
	public void cButtonListener(ActionListener listenForCButton){
		cButton.addActionListener(listenForCButton);
	}
	//private JButton ceButton = new JButton("CE");
	public void ceButtonListener(ActionListener listenForCeButton){
		ceButton.addActionListener(listenForCeButton);		
	}
	//private JButton mPlusButton = new JButton("M+");
	public void mPlusButtonListener(ActionListener listenForMPlusButton){
		mPlusButton.addActionListener(listenForMPlusButton);		
	}
	//private JButton mReadButton = new JButton("MR");
	public void mReadButtonListener(ActionListener listenForMReadButton){
		mReadButton.addActionListener(listenForMReadButton);		
	}
	//private JButton mClearButton = new JButton("MC");
	public void mClearButtonListener(ActionListener listenForMClearButton){
		mClearButton.addActionListener(listenForMClearButton);		
	}
	//private JButton oneButton = new JButton("1");
	public void oneButtonListener(ActionListener listenForOneButton){
		oneButton.addActionListener(listenForOneButton);		
	}
	//private JButton twoButton = new JButton("2");
	public void twoButtonListener(ActionListener listenForTwoButton){
		twoButton.addActionListener(listenForTwoButton);		
	}
	//private JButton threeButton = new JButton("3");
	public void threeButtonListener(ActionListener listenForThreeButton){
		threeButton.addActionListener(listenForThreeButton);		
	}
	//private JButton fourButton = new JButton("4");
	public void fourButtonListener(ActionListener listenForFourButton){
		fourButton.addActionListener(listenForFourButton);		
	}
	//private JButton fiveButton = new JButton("5");
	public void fiveButtonListener(ActionListener listenForFiveButton){
		fiveButton.addActionListener(listenForFiveButton);		
	}
	//private JButton sixButton = new JButton("6");
	public void sixButtonListener(ActionListener listenForSixButton){
		sixButton.addActionListener(listenForSixButton);		
	}
	//private JButton sevenButton = new JButton("7");
	public void sevenButtonListener(ActionListener listenForSevenButton){
		sevenButton.addActionListener(listenForSevenButton);		
	}
	//private JButton eightButton = new JButton("8");
	public void eightButtonListener(ActionListener listenForEightButton){
		eightButton.addActionListener(listenForEightButton);		
	}
	//private JButton nineButton = new JButton("9");
	public void nineButtonListener(ActionListener listenForNineButton){
		nineButton.addActionListener(listenForNineButton);		
	}
	//private JButton zeroButton = new JButton("0");
	public void zeroButtonListener(ActionListener listenForZeroButton){
		zeroButton.addActionListener(listenForZeroButton);		
	}
	//private JButton positiveNegativeButton = new JButton("+/-");
	public void positiveNegativeButtonListener(ActionListener listenForPositiveNegativeButton){
		positiveNegativeButton.addActionListener(listenForPositiveNegativeButton);		
	}
	//private JButton plusButton = new JButton("+");
	public void plusButtonListener(ActionListener listenForPlusButton){
		plusButton.addActionListener(listenForPlusButton);		
	}
	//private JButton minusButton = new JButton("-");
	public void minusButtonListener(ActionListener listenForMinusButton){
		minusButton.addActionListener(listenForMinusButton);		
	}
	//private JButton multiplyButton = new JButton("*");
	public void multiplyButtonListener(ActionListener listenForMultiplyButton){
		multiplyButton.addActionListener(listenForMultiplyButton);		
	}
	//private JButton divideButton = new JButton("/");
	public void divideButtonListener(ActionListener listenForDivideButton){
		divideButton.addActionListener(listenForDivideButton);		
	}
	//private JButton commaButton = new JButton(",");
	public void commaButtonListener(ActionListener listenForCommaButton){
		commaButton.addActionListener(listenForCommaButton);		
	}

}
