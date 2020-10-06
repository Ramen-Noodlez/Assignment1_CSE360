package cse360assignment02;

/*
 * allows an integer perform add and subtract operations while tracking history of each operation.
 */
public class AddingMachine
{
  private int total;
  private String history;
  
  /*
   * constructor to instantiate total as 0
   */
  public AddingMachine()
  {
    total = 0;
    history = "0";
  }
  
  /*
   * get the current total value
   * @return current total value 
   */
  public int getTotal()
  {
    return total;
  }
  
  /*
   * add a value to the total
   * @param value to be added to total
   */
  public void add(int value) 
  {
	  total += value;
	  history += " + " + value;
  }

  /*
   * subtract a value to the total
   * @param value to be subtracted to total
   */
  public void subtract(int value)
  {
	  total -= value;
	  history += " - " + value;
  }

  /*
   * create a string representing the history of every add/subtract made to total
   * @return string representing history of the program
   */
  public String toString() 
  {
    return history;
  }

  /*
   * clear the memory of the program
   */
  public void clear()
  {
	  total = 0;
	  history = "0";
  }
}