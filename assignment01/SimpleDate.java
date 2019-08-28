package assignment01;
/**
 *
 *
 * @author CS 140
 *
 */
public class SimpleDate {
	private int year;
  private int month;
  private int day;

  public static SimpleDate of(int yr, int m, int d){
    var returnValue = new SimpleDate();
    returnValue.year = yr;
    returnValue.month = m;
    returnValue.day = d;

    return returnValue;
  }

  public boolean before(SimpleDate other){
    if (year < other.year){
      return true;
    }
    else if (year == other.year && month < other.month){
      return true;
    }
    else if (year == other.year && month == other.month && day < other.day){
      return true;
    }
    else{
      return false;
    }
  }

  @Override
	public String toString() {
		return String.format("%d/%d/%d", year, month, day);
	}

}
