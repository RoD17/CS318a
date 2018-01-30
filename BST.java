import java.util.*;

public class BSTofIntegers
{

	private int root, left, right, parent, size;

	public static void main(String[]args)
	{

	}

	private BSTofIntegers()
	{

		protected int element, parent, leftChild, rightChild;

	}

	public BSTofIntegers(int[] nodes)
	{
		element = nodes;
	}

	public boolean compare(int a, int b)
	{
		int diff = a - b;
		if(diff > 0)
			return true;
		else
			return false;
	}

	public void insert(int num) // inserts a new element into a tree, if the tree already had e, prints an error
	{


	}

	public boolean search(int num) // returns true if e is in the tree, false otherwise 
	{

	}

	public void delete(int num) // if e exists in the tree, deletes it and balances the tree, otherwise prints an error
	{

	}

	public void printPostOrder()
	{

	}

	public void printInOrder()
	{

	}

	public void printPreOrder()
	{

	}

	public boolean isLeaf(int[] array, int index)
	{
		if(getLeftChild(array,index) == null && getRightChild(array,index) == null)
			return true;
		else
			return false;
	}

	public int getRoot(int[] array)
	{
		return array[0];
	}

	public int getLeftChild(int[] array int index)
	{
		return array[(index*2)+1];
	}

	public int getRightChild(int[] array int index)
	{
		return array[(index*2)+2];
	}

	public int getParent(int[] array int index)
	{
		return array[(index-1)/2];
	}

	public boolean isEmpty()
	{
		if(size > 0)
			return false;
		else
			return true;
	}


}