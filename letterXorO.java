package com.bridgelabz;

import java.util.Scanner;;

public class letterXorO {
	public static void letterXorO(char a) {
		char[] b = new char[2];
		switch(a)
		{
		case 'X':
		case 'x':
			b[0] = 'X';
			b[1] = 'O';
			break;
			
		case 'O':
		case 'o':
			b[0] = 'O';
			b[1] = 'X';
			break;
			
		default:
			System.out.println("Wrong input !!");
			break;
		}
		
		System.out.println("PLAYER : "+ b[0]);
		System.out.println("CPU : "+ b[1]);
	}
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.print(" Choose 'X' or 'O' :");
		char a = s.next().charAt(0);
		letterXorO(a);
		s.close();
	}
	
}

