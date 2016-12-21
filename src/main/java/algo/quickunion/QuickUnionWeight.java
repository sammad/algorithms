package algo.quickunion;

import java.util.Arrays;
import java.util.Scanner;

import algo.quickfind.Commands;

public class QuickUnionWeight {


	private Integer arraySize;
	private Integer[] rootArr;
	private Integer[] weight;
	public QuickUnionWeight(int numberOfInteger) {
		this.arraySize=numberOfInteger;
		rootArr = new Integer[arraySize];
		weight = new Integer[arraySize];
		
	}
	public void buildArray(Scanner scanner){
		for(int idx=0;idx<arraySize;idx++){
			rootArr[idx]=idx;
			weight[idx]=1;
		}
	}
	
	public void executeUserCommands(Scanner scanner) throws Exception {
		String command;
		while(true){
			System.out.println("Command=");
			long timeStart=System.currentTimeMillis();
			command = scanner.next();
			String[] commandArr=command.split("\\(");
			switch(Commands.valueOf(commandArr[0].toUpperCase())){
				
			case SHOW:showComponents();
			break;
			
			case UNION:union(command);
			break;
			
			case CONNECTED:connected(command);
			break;
			
			case HELP:showHelp(command);
			break;
			case EXIT:System.exit(0);
			
			default:continue;
			}
			
			long timeEnd=System.currentTimeMillis();
			System.out.println("Command finished in (millisec):"+Long.valueOf(timeEnd-timeStart));
		}
		
	}
	
	private void showHelp(String command) {
		int idx=1;
		System.out.println(String.valueOf(idx++)+". union(index1,index2) - Connects component at index1 to component at index2 and all its respected connected components");
		System.out.println(String.valueOf(idx++)+". connected(index1,index2) - Tells whether components are connected or not.");
		System.out.println(String.valueOf(idx++)+". show - Shows the integer array");
		
	}
	private void connected(String command) {
		Integer openingParenthesis = command.indexOf('(');
		Integer closingParenthesis = command.indexOf(')');
		String[] unionNum = command.substring(openingParenthesis+1, closingParenthesis).split(",");
		Integer num1 = Integer.valueOf(unionNum[0]);
		Integer num2 = Integer.valueOf(unionNum[1]);
		
		if(isConnected(num1, num2)){
			System.out.println("Components are connected");
		}else{
			System.out.println("Components are not connected");
		}
	}
	private boolean isConnected(Integer num1, Integer num2) {
		return root(num1)==root(num2);
	}
	
	private void union(String command) throws Exception {
		Integer openingParenthesis = command.indexOf('(');
		Integer closingParenthesis = command.indexOf(')');
		String[] unionNum = command.substring(openingParenthesis+1, closingParenthesis).split(",");
		Integer node1 = Integer.valueOf(unionNum[0]);
		Integer node2 = Integer.valueOf(unionNum[1]);
		if(node1>arraySize ||node2>arraySize){
			throw new Exception("Numbers are not in range");
		}

		if(!isConnected(node1, node2)){
			if(weight[root(node1)]>weight[root(node2)]){
				rootArr[node1] = root(node2);
				weight[rootArr[node1]]+=1;
			}else{
				rootArr[node2] = root(node1);
				weight[rootArr[node1]]+=1;
			}
		}

		showComponents();
	}
	
	private Integer root(Integer node) {
		Integer root =null;
		if(node.equals(rootArr[node])){
			root =node;
		}else{
			root=root(rootArr[node]);
		}
		return root;
	}
	
	
	
	private void showComponents() {
		System.out.print("Nodes:\t");
		Arrays.asList(rootArr).forEach(component->System.out.print(component+"\t"));
		System.out.println();
		System.out.print("Weights:");
		Arrays.asList(weight).forEach(component->System.out.print(component+"\t"));	
	}


}
