package com.ms.algo.datastructures.binarytree;

public class BinaryTreeNode<T extends Comparable<T>> {

	private T data;
	private BinaryTreeNode<T> left;
	private BinaryTreeNode<T> right;
	public BinaryTreeNode(T data) {
		this.data=data;
		this.left =null;
		this.right = null;
	}
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
	public BinaryTreeNode<T> getLeft() {
		return left;
	}
	public void setLeft(BinaryTreeNode<T> left) {
		this.left = left;
	}
	public BinaryTreeNode<T> getRight() {
		return right;
	}
	public void setRight(BinaryTreeNode<T> right) {
		this.right = right;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("BinaryTreeNode [data=");
		builder.append(data);
		builder.append(", left=");
		builder.append(left);
		builder.append(", right=");
		builder.append(right);
		builder.append("]");
		return builder.toString();
	}
	
}
