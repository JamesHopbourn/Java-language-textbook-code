import java.util.Calendar;

class myDate {
  public int year = 2020;
  public int month =1;
  public int day = 1;

  myDate() {
    Calendar cal = Calendar.getInstance();
    this.year = cal.get(Calendar.YEAR);
    this.month = cal.get(Calendar.MONTH) + 1;
    this.day = cal.get(Calendar.DATE);
  }

  myDate(int year, int month, int day) {
    this.year = year;
    this.month = month;
    this.day = day;
  }

  public void printInfo() {
    System.out.println(year + "-" + month + "-" + day);
  }
}
