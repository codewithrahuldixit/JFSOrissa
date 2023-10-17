package com.rahul.jfs.coupling;

import java.util.Stack;

public class StackDemo {
public static void main(String[] args) {
	/*Collection Stack
	Stack<Circle> stack = new Stack<Circle>();
	stack.push(new Circle (45));
	stack.push(new Circle (43));
	stack.push(new Circle (21));
	stack.push(new Circle (59));
	System.out.println(stack);*/
	// TODO Auto-generated method stub
	
			int i;
			int j;
			
			java.util.Scanner sc = new java.util.Scanner(System.in);
					 
					System.out.println("Enter a  Number ");
					int num = sc.nextInt();
					
					for(i=0;i<num;i++)
							 {
						for(j=i+1;j<num;j++)
						{
							if(i==j)
							{
								
								System.out.println("Duplicate number ");
								
							}
						}
						
					}
			
					

}
}
