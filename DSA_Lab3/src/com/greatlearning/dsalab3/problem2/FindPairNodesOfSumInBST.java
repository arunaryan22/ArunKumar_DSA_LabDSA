package com.greatlearning.dsalab3.problem2;

import java.util.HashSet;

public class FindPairNodesOfSumInBST {

	static class Node{
		int data;
		Node left;
		Node right;
		public Node(int data) {
			this.data=data;
			this.left=null;
			this.right=null;
		}
		
	}
	//method to create node
	static Node newNode(int data)
	{
		Node temp=new Node(data);
		return temp;
	}
	//method to insert nodes
	public Node insert(Node root, int data)
	{
		if(root==null)
			return newNode(data);
		if(data<root.data)
			root.left=insert(root.left, data);
		if(data>root.data)
			root.right=insert(root.right, data);
		return root;
	}
	
	//method to find the nodes pair for a given sum
	public boolean findPairforSum(Node root, int sum, HashSet<Integer> set)
	{
		if(root==null)
			return false;
		
		if(findPairforSum(root.left, sum, set))
				return true;
		
		if(set.contains(sum-root.data))
		{
			System.out.println("Pair found ("+(sum-root.data)+","+root.data+")");
			return true;
		}
		else
			set.add(root.data);
		return findPairforSum(root.right, sum, set);
		
	}
	
	public void findPairOfGivenSum(Node root, int sum)
	{
		HashSet<Integer> set=new HashSet<>();
		if(!findPairforSum(root, sum, set))
			System.out.println("Pair nodes do not exists ");
	}
		
	
}
