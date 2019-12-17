package com.ms.algo.datastructures.trie;

import java.util.HashMap;
import java.util.Map;

public class TrieNode{

	private Map<Character,TrieNode> children;
	private Boolean isWordComplete;
	
	public TrieNode() {
		children = new HashMap<>();
		isWordComplete=Boolean.FALSE;
	}

	public Map<Character, TrieNode> getChildren() {
		return children;
	}

	public Boolean isWordComplete() {
		return isWordComplete;
	}

	public void setIsWordComplete(Boolean isWordComplete) {
		this.isWordComplete = isWordComplete;
	}
	
}
