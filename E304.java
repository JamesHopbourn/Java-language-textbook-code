class MyTime {
  private int hour, minute, second;
  MyTime() {
    int hour;
    int minute;
    int second;
  }

  MyTime(int hh, int mm) {
    hour = (hh >= 0 && hh < 24) ? hh : 0;
    minute = (mm >= 0 && mm < 59) ? mm : 0;
    second = 0;
  }

  MyTime(int hh, int mm, int ss) {
    hour = (hh >= 0 && hh < 24) ? hh : 0;
    minute = (mm >= 0 && mm < 59) ? mm : 0;
    second = (ss >= 0 && ss < 59) ? ss : 0;
  }

  public void printTime() {
    //    hour = (hour>0&&hour <10)?"0"+hour:hour+2;
    System.out.println("0" + hour + ":" + minute + ":" + second);
  };
}

public class E304 {
  public static void main(String args[]) {
    MyTime t1 = new MyTime();
    t1.printTime();
    MyTime t2 = new MyTime(9, 45);
    t2.printTime();
    MyTime t3 = new MyTime(9, 45, 55);
    t3.printTime();
  }
}
