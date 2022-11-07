package com.greatlearning.dsalab3.problem1;

public class Main {

	public static void main(String[] args) {
		BalancingBrackets bal=new BalancingBrackets();
		String exp = "(([{}])";
		boolean status = bal.isStringBalanced(exp);
		if (status)
			System.out.println("The entered String has Balanced Brackets");
		else
			System.out.println("The entered Strings do not contain Balanced Brackets");

	}

}
