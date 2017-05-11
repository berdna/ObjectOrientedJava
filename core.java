Defining Classes and Creating Objects 

A class is a type of data
We can define classes 

An object is one such piece of data

Defining a Class - 
SimpleLocation.java
// Class declaration
public class SimpleLocation // initializes the new class
{ // definition of the class in the curly brace
	public double latitute;  //Member variables:
	public double longitude; // data the objects need to store
 	// Methods below
	//Contstructor : Method to create a new object
	public SimpleLocation(double lat, double lon) 
	{
		this.latitude = lat; 
		this.longitude = lon;
	}
	public double distance(SimpleLocation other)
	{
		return getDist(this.latitude, this.longitude,
					   other.latitude, other.longitude);
	}
}

LocationTester.java

public class LocationTester
{
	public static void main(String[] args)
	{
		SimpleLocation ucsd =
		new SimpleLocation(32.9, -117.2);
		SimpleLocation lima =
		new SimpleLocation(-12.0, -77.0);

		System.out.println(usd.distance(lima))
	}
}
updating
