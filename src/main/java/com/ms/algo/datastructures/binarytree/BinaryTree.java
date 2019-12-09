package com.ms.algo.datastructures.binarytree;

public class BinaryTree<T extends Comparable<T>> {

	private BinaryTreeNode<T> root;
	public void insertNode(T data) {
		if(root==null) {
			root= new BinaryTreeNode<>(data);
		}else { 
			addNodeToTree(data, root);
		}
		
	}
	
	
	private void addNodeToTree(T data, BinaryTreeNode<T> treeNode) {
		if(data.compareTo(treeNode.getData())>0) {
			if(treeNode.getRight()!=null) {
				addNodeToTree(data, treeNode.getRight());
			}else {
				treeNode.setRight(new BinaryTreeNode<>(data));
			}
		}else {
			if(treeNode.getLeft()!=null) {
				addNodeToTree(data, treeNode.getLeft());
			}else {
				treeNode.setLeft(new BinaryTreeNode<>(data));
			}
		}
		
	}


	public void deleteNode(T data) {
		
	}
	
	public boolean searchNode(T data) {
		return false;
	}
	
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("BinaryTree [root=");
		builder.append(root);
		builder.append("]");
		return builder.toString();
	}


	public static void main(String[] args) {
		BinaryTree<Integer> bt = new BinaryTree<>();
		bt.insertNode(7);
		bt.insertNode(6);
		bt.insertNode(3);
		bt.insertNode(10);
		bt.insertNode(9);
		bt.insertNode(11);
		bt.insertNode(5);
		bt.insertNode(4);
		System.out.println(bt);
	}
}
