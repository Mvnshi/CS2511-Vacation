// Munshi Abrar
// CS2511 Chapter 10 Individual Lab Assignment

import java.util.Scanner;
import java.text.DecimalFormat;

public class VacationClient
{
	public static void main( String [] args )
	{
		// 1) Declare Array
		Vacation [] cellBills;
		int total;

		Scanner scan = new Scanner( System.in );

		// 1) Allocate Storage
		cellBills = new Vacation[4];

		cellBills[0] = new AllInclusive( "China", "Delta", 5, 500);
		cellBills[1] = new Piecemeal( "Canada", 75, 15.5, 450);
		cellBills[2] = new AllInclusive( "Italy", "JetBlue", 4, 855.75);
		cellBills[3] = new Piecemeal( "USA", 90.10, 25, 300);

		// 4) Print the state of each element
		for ( int i = 0; i < cellBills.length; i++ )
		{
			System.out.println( "Trip "+ (i+1) + " Details");
			System.out.println( cellBills[i].toString() );
			System.out.println( );
		}

		// 5) Print total costs for each vacation
		System.out.println("The Prices are:" );
		for ( int i = 0; i < cellBills.length; i++ )
		{
			DecimalFormat money = new DecimalFormat("0.00");
			System.out.println( "Vacation " + (i+1) + ": $" + money.format(cellBills[i].calcPrice( )));
			System.out.println( );
		}
	}
}
