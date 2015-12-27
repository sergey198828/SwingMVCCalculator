package com.SwingMVCCalculator.Model;

import java.util.ArrayList;
import java.util.List;

public class CalculatorModel {
	//Store sequenced expression operands
	private List<Double> operands = new ArrayList<Double>();
	
	//Store sequenced expression operators
	private List<Character> operators = new ArrayList<Character>();
	
	//Stores last user input figure
	private boolean tempOperandFloatPartEditModeFlag=false;
	private Character tempOperandSign='+';
	private String tempOperandInteger = "0";
	private String tempOperandFloat="";
	
	//Stores last user input operator
	private Character tempOperator = '+';
	
	//Memmory
	private String memory = "+0.";
	
	//Build expression String to show
	@Override
	public String toString(){
		if(operands.size()==0)
			return getTempOperand().toString(); 
		StringBuilder result = new StringBuilder(operands.get(0).toString());
		for(int i=1;i<operands.size();i++)
			result.append(operators.get(i-1).toString() + operands.get(i).toString());
		result.append(tempOperator.toString()+getTempOperand().toString());
		return result.toString();
	}
	
	//Calculates expression result to show
	public Double result(){
		if(operands.size()==0)
			return getTempOperand();
		Double result = operands.get(0);
		for(int i=1;i<operands.size();i++)
	        switch (operators.get(i-1)) {
            case '+':  result += operands.get(i);
                    break;
            case '-':  result -= operands.get(i);
            		break;
            case '*':  result *= operands.get(i);
            		break;
            case '/':  if(operands.get(i)!=0)
            				result /= operands.get(i);
            		   else 
            				return Double.MAX_VALUE;
            		break;
	        }
        switch (tempOperator) {
        case '+':  result += getTempOperand();
                break;
        case '-':  result -= getTempOperand();
        		break;
        case '*':  result *= getTempOperand();
        		break;
        case '/':  if(getTempOperand()!=0.0)
        				result /= getTempOperand();
        		   else 
        				return Double.MAX_VALUE;
        		break;
        }
		return result;
	}
	
	//Calculates temp operand to show
	public Double getTempOperand(){
		return Double.parseDouble(tempOperandSign + tempOperandInteger + "." + tempOperandFloat);
	}
	public String getTempOperandString(){
		return tempOperandSign + tempOperandInteger + "." + tempOperandFloat;
	}
	//Voids temp operand
	public void voidTempOperand(){
		tempOperandSign='+';
		tempOperandInteger = "0";
		tempOperandFloat="";
		tempOperandFloatPartEditModeFlag=false;
	}
	
	//Calculates memory to show
	public Double getMemory(){
		return Double.parseDouble(memory);
	}
	
	//C button action
	public void c(){
		operands = new ArrayList<Double>();
		operators = new ArrayList<Character>();
		tempOperator = '+';
		voidTempOperand();

		
	}
	
	//CE Button action
	public void ce(){
		voidTempOperand();
	}
	
	//Positive/Negative button action
	public void positiveNegative(){
		if(tempOperandSign=='+') tempOperandSign='-';
		else tempOperandSign='+';
	}
	
	//Plus button action
	public void plus(){
		tempOperator = '+';
		if(getTempOperand()==0.0) return;
		operands.add(getTempOperand());
		operators.add(tempOperator);
		voidTempOperand();

	}
	
	//Minus button action
	public void minus(){
		tempOperator = '-';	
		if(getTempOperand()==0.0) return;
		operands.add(getTempOperand());
		operators.add(tempOperator);
		voidTempOperand();

	}
	
	//Multiply button action
	public void multyply(){
		tempOperator = '*';
		if(getTempOperand()==0.0) return;
		operands.add(getTempOperand());
		operators.add(tempOperator);
		voidTempOperand();

	}
	
	//Divide button action
	public void divide(){
		tempOperator = '/';	
		if(getTempOperand()==0.0) return;
		operands.add(getTempOperand());
		operators.add(tempOperator);
		voidTempOperand();

	}
	
	//One button action
	public void one(){
		if(!tempOperandFloatPartEditModeFlag) tempOperandInteger +="1";
		else tempOperandFloat +="1";
	}
	
	//Two button action
	public void two(){
		if(!tempOperandFloatPartEditModeFlag) tempOperandInteger +="2";
		else tempOperandFloat +="2";
	}
	
	//Three button action
	public void three(){
		if(!tempOperandFloatPartEditModeFlag) tempOperandInteger +="3";
		else tempOperandFloat +="3";		
	}
	//Four button action
	public void four(){
		if(!tempOperandFloatPartEditModeFlag) tempOperandInteger +="4";
		else tempOperandFloat +="4";			
	}
	//Five button action
	public void five(){
		if(!tempOperandFloatPartEditModeFlag) tempOperandInteger +="5";
		else tempOperandFloat +="5";			
	}
	//Six button action
	public void six(){
		if(!tempOperandFloatPartEditModeFlag) tempOperandInteger +="6";
		else tempOperandFloat +="6";	
	}
	//Seven button action
	public void seven(){
		if(!tempOperandFloatPartEditModeFlag) tempOperandInteger +="7";
		else tempOperandFloat +="7";			
	}
	//Eight button action
	public void eight(){
		if(!tempOperandFloatPartEditModeFlag) tempOperandInteger +="8";
		else tempOperandFloat +="8";			
	}
	//Nine button action
	public void nine(){
		if(!tempOperandFloatPartEditModeFlag) tempOperandInteger +="9";
		else tempOperandFloat +="9";	
	}
	//Zero button action
	public void zero(){
		if(!tempOperandFloatPartEditModeFlag) tempOperandInteger +="0";
		else tempOperandFloat +="0";	
	}
	
	//Comma button action
	public void comma(){
		if(!tempOperandFloatPartEditModeFlag) tempOperandFloatPartEditModeFlag = true;
	}
	//M+ button action
	public void mPlus(){
		memory = getTempOperandString();
	}
	//MR button action
	public void mRead(){
		tempOperandSign=memory.charAt(0);
		String unsigned = memory.substring(1);
		String[] intAndFloat = unsigned.split("\\.");
		tempOperandInteger = intAndFloat[0]; 
		if(intAndFloat.length==2)
			tempOperandFloat = intAndFloat[1];
		else
			tempOperandFloat = "";
	}
	//MC button action
	public void mClear(){
		memory = "+0.";
	}
}
