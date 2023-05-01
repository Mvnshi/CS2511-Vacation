// Munshi Abrar
// CS2511 Chapter 10 Individual Lab Assignment

//Abstract Superclass
public abstract class Vacation
{
	private String destination;

	public Vacation(String newDestination)
	{
		setDestination ( newDestination);
	}

	public String getDestination()
	{
		return destination;
	}

	public void setDestination(String newDestination)
	{
		destination = newDestination;
	}

	public String toString()
	{
		return "Destination: " + destination;
	}

	public abstract double calcPrice();
}