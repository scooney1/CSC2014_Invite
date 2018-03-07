/**
 * Author:	Sam Cooney
 * Project:	Invite
 * Date:	Dec 6, 2017
 * I assert that the program I am submitting is the result of my own efforts.
 * General: 
 */

import java.util.Scanner;	// Import Scanner class.

public class Invite {	// Start Invite.

	public static void main(String[] args) {	// Start main.
		Box myBox = new Box(15);				// Instantiate object of class Box.
		Scanner scan = new Scanner(System.in);	// Instantiate object of class Scanner.
		PlaceCards myCards = new PlaceCards();	// Instantiate object of class PlaceCards.
		int size;	// Declare integer variable.
		
		System.out.println("Enter the number of guests: ");
		size = scan.nextInt();	// Scan in size.
		scan.nextLine();		// Skip a line.
		String[] guests = new String[size];	// Declare array of strings.
		System.out.println("Enter the names of your guests:");
		for(int i=0;i<size;i++) {	// Loop through array.
			
			int j = i + 1;	// Guest number.
			System.out.println("Guest " + j + ":");
			guests[i] = scan.nextLine();	// Scan in guest name.
		}
		
		System.out.println();	// Skip a line.
		for(int i=0;i<size;i++) {	// Loop through array.
			
			if(i%2 == 0) {	// Check for odd numbered guests (even numbered indices).
				
				System.out.println("Dear " + guests[i] + ",");
				System.out.println("Please come to the odd people's party to be held on December 23 at 6PM");
				System.out.println("RSVP by December 15");
				System.out.println("Sincerely,\nMr. and Mrs Santa Claus");
				System.out.println();
			}
		}
		
		for(int i=0;i<size;i++) {	// Loop through array.
			
			if(i%2 == 1) {	// Check for even numbered guests (odd numbered indices).
				
				System.out.println("Dear " + guests[i] + ",");
				System.out.println("Please come to the even people's party to be held on December 23 at 6PM");
				System.out.println("RSVP by December 15");
				System.out.println("Sincerely,\nMr. and Mrs Santa Claus");
				System.out.println();
			}
		}
		
		myCards.printSeats(guests, size);	// Call printSeats.
		
		System.out.println(myBox);	// Print box.
		
		scan.close();	// Close scan.
	}	// End main.

}	// End Invite.
