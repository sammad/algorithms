package algo.quickunion;

import java.util.Arrays;
import java.util.Scanner;

import algo.quickfind.Commands;

public class QuickUnion {


	private Integer arraySize;
	private Integer[] rootArr;
	public QuickUnion(int numberOfInteger) {
		this.arraySize=numberOfInteger;
		rootArr = new Integer[arraySize];
	}
	public void buildArray(Scanner scanner){
		for(int idx=0;idx<arraySize;idx++){
			rootArr[idx]=idx;
		}
	}
	
	public void executeUserCommands(Scanner scanner) throws Exception {
		String command;
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
			
			default:break;
			}
			
			long timeEnd=System.currentTimeMillis();
			System.out.println("Command finished in (millisec):"+Long.valueOf(timeEnd-timeStart));
		
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
		return getRoot(num1)==getRoot(num2);
	}
	
	private void union(String command) throws Exception {
		Integer openingParenthesis = command.indexOf('(');
		Integer closingParenthesis = command.indexOf(')');
		String[] unionNum = command.substring(openingParenthesis+1, closingParenthesis).split(",");
		Integer child = Integer.valueOf(unionNum[0]);
		Integer parent = Integer.valueOf(unionNum[1]);
		if(child>arraySize ||parent>arraySize){
			throw new Exception("Numbers are not in range");
		}
		 
		if(!isConnected(child, parent)){
			rootArr[child] = getRoot(parent);
		}
		
		showComponents();
	}
	
	private Integer getRoot(Integer node) {
		Integer root;
		if(node.equals(rootArr[node])){
			root =node;
		}else{
			root=getRoot(rootArr[node]);
		}
		return root;
	}
	private void showComponents() {
		Arrays.asList(rootArr).forEach(component->System.out.print(component+"\t"));	
	}


}
