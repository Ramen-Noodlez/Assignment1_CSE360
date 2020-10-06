/**
 * @author Derek Ratliff
 * Student ID: 1214386212
 * Date: 5 October 2020 21:27
 */

package cse360assignment02;

/**
 * allows an integer perform add and subtract operations while tracking history of each operation.
 */
public class AddingMachine
{
  private int total;
  private String history;
  
  /**
   * constructor to instantiate total as 0 and history to "0" for further tracking
   */
  public AddingMachine()
  {
    total = 0;
    history = "0";
  }
  
  /**
   * get the current total value
   * @return current total value 
   */
  public int getTotal()
  {
    return total;
  }
  
  /**
   * add a value to the total and record the addition and value to the history string
   * @param value to be added to total
   */
  public void add(int value) 
  {
	  total += value;
	  history += " + " + value;
  }

  /**
   * subtract a value to the total and record the subtraction and value to the history string
   * @param value to be subtracted to total
   */
  public void subtract(int value)
  {
	  total -= value;
	  history += " - " + value;
  }

  /**
   * return the string containing the history of all operations of the object
   * @return string representing history of the program
   */
  public String toString() 
  {
    return history;
  }

  /**
   * "clear" the memory of the program by setting 'total' and 'history' to their default constructor value
   */
  public void clear()
  {
	  total = 0;
	  history = "0";
  }
}