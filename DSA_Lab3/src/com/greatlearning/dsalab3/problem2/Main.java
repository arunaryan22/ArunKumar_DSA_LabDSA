package com.greatlearning.dsalab3.problem2;

import com.greatlearning.dsalab3.problem2.FindPairNodesOfSumInBST.Node;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root=null;
		FindPairNodesOfSumInBST pairOfSum= new FindPairNodesOfSumInBST();
		root=pairOfSum.insert(root, 10);
		root=pairOfSum.insert(root, 20);
		root=pairOfSum.insert(root, 30);
		root=pairOfSum.insert(root, 40);
		root=pairOfSum.insert(root, 50);
		root=pairOfSum.insert(root, 60);
		root=pairOfSum.insert(root, 70);
		int givenSum=120;
		System.out.println("Sum: "+givenSum);
		pairOfSum.findPairOfGivenSum(root, givenSum);
	}

}
