// Munshi Abrar
// CS2511 Chapter 10 Individual Lab Assignment

import java.util.Scanner;
import java.text.DecimalFormat;

// Subclass
public class Piecemeal extends Vacation
{
	private double hotel;
	private double meal;
	private double airfare;
	DecimalFormat money = new DecimalFormat("0.00");

	// constructor
	public Piecemeal( String destination,  double hotel, double meal, double airfare)
	{
		super(destination);
		this.hotel = hotel;
		this.meal = meal;
		this.airfare = airfare;
	}

	// toString()
	public String toString()
	{
		return super.toString() + " Hotel: $" + money.format(hotel) + " Meal: $" + money.format(meal) + " Airfare: $" + money.format(airfare);
	}

	// Calculate cost method
    public double calcPrice()
    {
	return hotel + meal + airfare;
    }
}

