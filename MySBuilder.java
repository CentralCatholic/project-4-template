// CHS CS 0401
// MySBuilder class.  You must implement this class for Assignment 4.  A shell of
// the class is already provided -- you must fill in the method bodies.

// Note 1: All code for these methods must be your own!  Do not copy these methods
// from code on the internet.  If you do so it will be a violation of the student
// academic integrity code!

// Note 2: You may NOT use StringBuilder or StringBuffer or any similar class in
// any of these methods!  You also may not use String for anything other than the
// argument and return object types (when needed) - i.e. you may not create String 
// objects in order to use String methods to perform any of the methods here.

// Note 3: Some of the methods have additional requirements / restrictions.  Read
// the comments for each method carefully before implementing it.

public class MySBuilder extends SimpleSBuilder
{
	// Data is inherited
	// See SimpleSBuilder for inherited methods
	
	// Redefining inherited constructors to get correct type
	public MySBuilder(int capacity)
	{
		super(capacity);
	}
	
	public MySBuilder(String str)
	{
		super(str);
	}
	
	public MySBuilder(char [] str)
	{
		// Build a new MySBuilder from an array of char
		// Array length should be twice the length of str
	}
	
	public MySBuilder(MySBuilder old)
	{
		// Copy constructor
		// Array length should be twice the logical size of old
	}
	
	// For all append methods, if the additional characters will
	// fit in the array, just add them.  If they will not fit, resize
	// the array to twice the logical size of the resulting SBuilder
	// (so it is exactly 1/2 full following the operation)
	
	public MySBuilder append(String str)
	{
		// Append str to end of this MySBuilder
		// return this
	}
	
	public MySBuilder append(MySBuilder S)
	{
		// Append S to end of this MySBuilder
		// return this
	}
	
	public MySBuilder append(char [] str)
	{
		// append str to end of this MySBuilder
		// return this
	}
	
	public MySBuilder append(char c)
	{
		// append c to end of this MySBuilder
		// return this
	}
	
	public MySBuilder delete(int start, int end)
	{
		// delete characters from start (inclusive) to end (exclusive)
		// from this MySBuilder, shifting to fill in the gap.  If range
		// is invalid do nothing.
		// return this
	}
	
	public MySBuilder deleteCharAt(int index)
	{
		// delete char at index from this MySBuilder, shifting to fill in the 
		// gap.  If index is invalid do nothing
		// return this
	}
	
	public int indexOf(String str)
	{
		// return the beginning index where str matches a substring within
		// this MySBuidler.  If there is no match return -1.
	}

	public int indexOf(String str, int fromIndex)
	{
		// return the beginning index where str matches a substring within
		// this MySBuilder, starting the search at location fromIndex.
		// If there is no match return -1.
	}

	public MySBuilder insert(int offset, String str)
	{
		// insert str into this MySBuilder, beginning at index offset.  Shift
		// any existing characters to the right to make space.  If offset < 0
		// or offset > len do nothing.  If the array must be resized, it should
		// be twice the size of the resulting string.
		// return this
	}

	public MySBuilder insert(int offset, char [] str)
	{
		// Same as above but with array of char argument
	}
	
	public MySBuilder insert(int offset, char c)
	{
		// Same as above but with char argument
	}
	
	public MySBuilder insert(int offset, MySBuilder S)
	{
		// Same as above but with MySBuilder argument
	}

	public MySBuilder replace(int start, int end, String str)
	{
		// Remove the characters from start (inclusive) to end (exclusive)
		// and insert str starting at start.  Do not call delete followed
		// by insert, since this will require shifting twice within the 
		// array and is very inefficient.  You should shift only one time
		// (the direction depends on the relative lengths of the substring
		// removed vs the string inserted).  Note that if the lengths of
		// the removed and inserted strings are the same, you should not
		// shift at all.
		// return this
	}
	
	public String substring(int start, int end)
	{
		// return a new String which is the substring of this MySBuilder
		// from start (inclusive) to end (exclusive).  If the range is 
		// invalid return null
	}
	
	public String [] split(char delim)
	{
		// Simplified split method returns array of String which the delim
		// character will divide the MySBuilder into.  Be careful of special
		// cases where delim occurs in consecutive locations or at the front
		// or end of the MySBuilder.  In these cases the extra delim characters
		// should be ignored.  See examples in SBuilderTest.java.  You MAY NOT
		// use any predefined split() method or variant thereof to do this method.
		// It must be done from scratch on the underlying array of characters.
		// You may use an ArrayList<String> to store your temporary results, and
		// the ArrayList method toArray(T [] a) method to return them.  See the
		// ArrayList API for details.
	}
}
	