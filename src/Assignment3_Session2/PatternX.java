package Assignment3_Session2; // package declared for creating pattern X

public class PatternX { // class declared PatternX with main method

	public static void main(String[] args) { // Static method where the program execution starts
		
		
		int rowNum=5;   //  Integer variable initialized for Row number
		int colNum=5;   //  Integer variable initialized for Column number
		
		char star = '*';  // Star variable initialized for creating the pattern X
		
		for(int row=0;row<rowNum;row++)  // For loop for number of rows in the patter
		{
			int numChar = 0;  // Declared and initialized for storing how many character are printed in each line
			for(int col=0;col<colNum;col++) //nested loop for iterating columns
			{
				if(row==col || col == colNum-row-1) // condition to print appropriate position of character
				{				
				System.out.print(star);	// Printing character
				numChar++;
				}
				else
					System.out.print("_");   // printing underscore otherwise
				if((numChar==2 && row!=2) || (numChar==1 && row==2))
					break;
			   }
			System.out.print("\n");    // Break line after each row
			
		} // end of for Loop
			

	}  // End of Main function

}   // End of class
