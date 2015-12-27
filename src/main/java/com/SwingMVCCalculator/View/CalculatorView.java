package com.SwingMVCCalculator.View;

import java.awt.event.ActionListener;
import javax.swing.*;

public class CalculatorView extends JFrame {

	/**
	 Something related to serializable interface
	 */
	private static final long serialVersionUID = 1L;
	
	//Form objects (buttons, labels, text fields)
	private JLabel expressionLabel = new JLabel("Result expression");
	private JTextField expression = new JTextField(10);
	private JLabel memoryLabel = new JLabel("Memory");
	private JTextField memory = new JTextField(10);
	private JLabel inputLabel = new JLabel("Input");
	private JTextField input = new JTextField(10);
	private JLabel resultLabel = new JLabel("Result value");
	private JTextField result = new JTextField(10);
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
	public CalculatorView() {
		JPanel calcPanel = new JPanel();
		//General form settings
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(600,600);
		this.setLocationRelativeTo(null);
		//Form inner objects
		calcPanel.add(expressionLabel);
		calcPanel.add(expression);
		calcPanel.add(memoryLabel);
		calcPanel.add(memory);
		calcPanel.add(inputLabel);
		calcPanel.add(input);
		calcPanel.add(resultLabel);
		calcPanel.add(result);
		calcPanel.add(cButton);
		calcPanel.add(ceButton);
		calcPanel.add(mPlusButton);
		calcPanel.add(mReadButton);
		calcPanel.add(mClearButton);
		calcPanel.add(oneButton);
		calcPanel.add(twoButton);
		calcPanel.add(threeButton);
		calcPanel.add(fourButton);
		calcPanel.add(fiveButton);
		calcPanel.add(sixButton);
		calcPanel.add(sevenButton);
		calcPanel.add(eightButton);
		calcPanel.add(nineButton);
		calcPanel.add(zeroButton);
		calcPanel.add(positiveNegativeButton);
		calcPanel.add(plusButton);
		calcPanel.add(minusButton);
		calcPanel.add(multiplyButton);
		calcPanel.add(divideButton);
		calcPanel.add(commaButton);
		//Start form
		this.add(calcPanel);
	}
	
	//Text field setters
	public void setExpression(String expression){
		this.expression.setText(expression);
	}
	
	public void setMemory(Double memory){
		this.memory.setText(memory.toString());
	}
	
	public void setResult(Double result){
		this.result.setText(result.toString());		
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
