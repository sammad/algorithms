package com.ms.algo.datastructures.binarytree;

import java.util.ArrayList;
import java.util.List;

public class BinaryTree<T extends Comparable<T>> {

	private BinaryTreeNode<T> root;
	private List<T> preOrderList = new ArrayList<>();
	private List<T> inOrderList = new ArrayList<>();
	private List<T> postOrderList = new ArrayList<>();
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

	public void inOrderTraverse(){
		inOrderTraversal(root);
	}
	private void inOrderTraversal(BinaryTreeNode<T> root){
		if(root!=null){
			inOrderTraversal(root.getLeft());
			inOrderList.add(root.getData());
			inOrderTraversal(root.getRight());
		}
	}
	public void preOrderTraverse(){
		preOrderTraversal(root);
	}
	private void preOrderTraversal(BinaryTreeNode<T> root){
		if(root!=null){
			preOrderList.add(root.getData());
			preOrderTraversal(root.getLeft());
			preOrderTraversal(root.getRight());
		}
	}
	public void postOrderTraverse(){
		postOrderTraversal(root);
	}
	private void postOrderTraversal(BinaryTreeNode<T> root){
		if(root!=null){
			postOrderTraversal(root.getLeft());
			postOrderTraversal(root.getRight());
			postOrderList.add(root.getData());
		}
	}

	
	public List<T> getPreOrderList() {
		return preOrderList;
	}


	public void setPreOrderList(List<T> preOrderList) {
		this.preOrderList = preOrderList;
	}


	public List<T> getInOrderList() {
		return inOrderList;
	}


	public void setInOrderList(List<T> inOrderList) {
		this.inOrderList = inOrderList;
	}


	public List<T> getPostOrderList() {
		return postOrderList;
	}


	public void setPostOrderList(List<T> postOrderList) {
		this.postOrderList = postOrderList;
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
		bt.inOrderTraverse();
		bt.preOrderTraverse();
		bt.postOrderTraverse();
		System.out.println("InOrder="+bt.inOrderList);
		System.out.println("PreOrder="+bt.preOrderList);
		System.out.println("PostOrder="+bt.postOrderList);
	}
}
