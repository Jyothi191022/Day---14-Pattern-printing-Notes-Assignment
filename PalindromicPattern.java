package com.codegnan.patternexamples;

public class PalindromicPattern {

	public static void main(String[] args) {
		//outer for loop for rows
		int rows = 5;
		for(int i =1;i<=rows;i++ ) {
			//inner for loop for columns
			//for(int j =rows; j>i;j--) {
			//	System.out.print(" ");
			//}
			for(int j =1;j<=i;j++) {
				System.out.print(j + " ");
			}
			for (int j = i-1;j>=1;j--) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

}


/* 
* * * * *
*       *
*       *
*       *
* * * * * */

/* 2. 
    *
   *  *
  *    *
 *      *
*        *
 *      *
  *    *
   *  *
    *
*/

/* 3.

         *
       *   *
     *       *
   *           *
 * * * * * * *  *

*/