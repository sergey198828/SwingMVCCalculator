package com.SwingMVCCalculator.Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.SwingMVCCalculator.Model.CalculatorModel;
import com.SwingMVCCalculator.View.CalculatorView;

public class CalculatorController {
	
	private CalculatorView	view;
	
	private CalculatorModel calculator;
	
	private void updateView(){
		view.setResult(calculator.result());
		view.setExpression(calculator.toString());
		view.setInput(calculator.getTempOperand());
	}
	
	public CalculatorController(CalculatorView view, CalculatorModel calculator){
		this.view = view;
		this.calculator = calculator;
		
		this.view.cButtonListener(new CButtonListener());
		this.view.ceButtonListener(new CEButtonListener());
		this.view.oneButtonListener(new OneButtonListener());
		this.view.twoButtonListener(new TwoButtonListener());
		this.view.threeButtonListener(new ThreeButtonListener());
		this.view.fourButtonListener(new FourButtonListener());
		this.view.fiveButtonListener(new FiveButtonListener());
		this.view.sixButtonListener(new SixButtonListener());
		this.view.sevenButtonListener(new SevenButtonListener());
		this.view.eightButtonListener(new EightButtonListener());
		this.view.nineButtonListener(new NineButtonListener());
		this.view.zeroButtonListener(new ZeroButtonListener());
		this.view.positiveNegativeButtonListener(new PositiveNegativeButtonListener());
		this.view.plusButtonListener(new PlusButtonListener());
		this.view.minusButtonListener(new MinusButtonListener());
		this.view.multiplyButtonListener(new MultiplyButtonListener());
		this.view.divideButtonListener(new DivideButtonListener());
	}
	
	class CButtonListener implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			calculator.c();
			updateView();
		}

	}
	
	class CEButtonListener implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			calculator.ce();
			updateView();
		}		
	
	}
	
	class OneButtonListener implements ActionListener{
	
		public void actionPerformed(ActionEvent e) {
			calculator.one();
			updateView();
		}
	
	}
	
	class TwoButtonListener implements ActionListener{
	
		public void actionPerformed(ActionEvent e) {
			calculator.two();
			updateView();
		}
		
	}
	
	class ThreeButtonListener implements ActionListener{
	
		public void actionPerformed(ActionEvent e) {
			calculator.three();
			updateView();
		}
		
	}
	
	class FourButtonListener implements ActionListener{
	
		public void actionPerformed(ActionEvent e) {
			calculator.four();
			updateView();
		}
		
	}
	
	class FiveButtonListener implements ActionListener{
	
		public void actionPerformed(ActionEvent e) {
			calculator.five();
			updateView();
		}
		
	}
	
	class SixButtonListener implements ActionListener{
	
		public void actionPerformed(ActionEvent e) {
			calculator.six();
			updateView();
		}
		
	}
	
	class SevenButtonListener implements ActionListener{
	
		public void actionPerformed(ActionEvent e) {
			calculator.seven();
			updateView();
		}
		
	}
	
	class EightButtonListener implements ActionListener{
	
		public void actionPerformed(ActionEvent e) {
			calculator.eight();
			updateView();
		}
		
	}
	
	class NineButtonListener implements ActionListener{
	
		public void actionPerformed(ActionEvent e) {
			calculator.nine();
			updateView();
		}
		
	}
	
	class ZeroButtonListener implements ActionListener{
	
		public void actionPerformed(ActionEvent e) {
			calculator.zero();
			updateView();
		}
		
	}
	
	class PositiveNegativeButtonListener implements ActionListener{
	
		public void actionPerformed(ActionEvent e) {
			calculator.positiveNegative();
			updateView();
		}
		
	}
	
	class PlusButtonListener implements ActionListener{
	
		public void actionPerformed(ActionEvent e) {
			calculator.plus();
			updateView();
		}
		
	}
	
	class MinusButtonListener implements ActionListener{
		
		public void actionPerformed(ActionEvent e) {
			calculator.minus();
			updateView();
		}	
		
	}
	
	class MultiplyButtonListener implements ActionListener{
	
		public void actionPerformed(ActionEvent e) {
			calculator.multyply();
			updateView();
		}
		
	}
	
	class DivideButtonListener implements ActionListener{
	
		public void actionPerformed(ActionEvent e) {
			calculator.divide();
			updateView();
		}
		
	}
}
