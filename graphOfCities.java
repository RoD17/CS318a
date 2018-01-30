package CS318a;

import java.util.*;

class graphOfCities
{

		HashMap<String, HashSet> City = new HashMap<String, HashSet>();
		HashSet<String> Neighbors = new HashSet<String>();

		int size, degree;

		public graphOfCities()
		{
		
		
		size = 0;
		degree = 0;
		}


	int getSize()
	{
		return size;
	}

	String getNeighbors()
	{
		Neighbors.toArray().toString();
	}

	int getDegree()
	{
		return degree;
	}

	boolean isEmpty()
	{
		if(size > 0)
			return false;
		else
			return true;
	}

	void addEdge(String from, String to)
	{
		if(City.containsKey(from) && Neighbors.contains(to))
		{
			throw new IllegalArguementException("That city is already a neighbor.");
		} else {
			City.put(from, Neighbor.add(to));
			degree++;
		}
	}

	void addVertex(String newCity)
	{
		if(City.containValue(newCity))
		{
			throw new IllegalArguementException("City already exists.");
		}
		else
		{
			City.put(newCity, new Neighbors<String>());
			size++;
		}
	}

	String printEdges()
	{
		return keySet();
	}

	String printVertices()
	{
		return entrySet();
	}

	void deleteEdge(String from, String to)
	{
		City.put(from, Neighbors.remove(to));
	}


}