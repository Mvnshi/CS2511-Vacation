// Munshi Abrar
// CS2511 Chapter 10 Individual Lab Assignment

import java.util.Scanner;
import java.text.DecimalFormat;

// Subclass
public class AllInclusive extends Vacation
{
	private String brand;
	private int rating;
	private double price;
	DecimalFormat money = new DecimalFormat("0.00");

	// constructor
	public AllInclusive( String destination,  String brand, int rating, double price)
	{
		super(destination);
		this.brand = brand;
		this.rating = rating;
		this.price = price;
	}

	// toString()
	public String toString()
	{
		return super.toString() + " Brand: " + brand + " Rating: " + rating + " Price: $" + money.format(price);
	}

	// Calculate cost method
    public double calcPrice()
    {
		return price;
    }
}

