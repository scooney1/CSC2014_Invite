/**
 * Author:	Sam Cooney
 * Project:	Invite
 * Date:	Dec 6, 2017
 * I assert that the program I am submitting is the result of my own efforts.
 * General: 
 */

public class PlaceCards {	// Start PlaceCards.

	public PlaceCards() {	// Constructor method.
		
	}	// End constructor.
	
	public void printSeats(String[] guests, int size) {	// Method printSeats.
		
		for(int i=0;i<size;i++) {	// Loop through array.
			
			if(i%2 == 0) {	// Check for odd numbered guests (even numbered indices).
				
				System.out.println("Welcome to the Odd Party");
				System.out.println("Dear Guest: " + guests[i]);
				System.out.println("Your table number is: ");
				System.out.println();
			}
		}
		
		for(int i=0;i<size;i++) {	// Loop through array.
	
			if(i%2 == 1) {	// Check for even numbered guests (odd numbered indices).
				
				System.out.println("Welcome to the Even Party");
				System.out.println("Dear Guest: " + guests[i]);
				System.out.println("Your table number is: ");
				System.out.println();
			}
		}
	}	// End method.

}	// End PlaceCards.
