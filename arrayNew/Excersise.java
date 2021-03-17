package arrayNew;

import java.util.Scanner;

public class Excersise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		int rows;
		int columns;
		int[][] scores;
		System.out.println("how many contestants");
		rows = keyboard.nextInt();
		keyboard.nextLine();
		scores = new int[rows][];
		
		for (int i = 0; i< scores.length; i++) {
			System.out.println("how many contestants for contestant " + (i + 1));
			columns = keyboard.nextInt();
			keyboard.nextLine();
			scores[i] = new int[columns];
			
		}
		//populate the array//
		for (int rows1 = 0; rows1< scores.length; rows1++) {
			for(int col = 0; col<scores[rows].length; col++) {
				System.out.println("enter the score of the contestants " + (rows1 + 1)+ "in contest" + (col + 1));
				scores[rows1][col] = keyboard.nextInt();
				keyboard.nextLine();
				
			}
			//display the score of every contestant//
						}
		}
	

}
