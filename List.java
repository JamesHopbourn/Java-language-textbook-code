import java.util.ArrayList;
import java.util.Iterator;

public class List{
  public static void main(String[] args) {
    ArrayList<Integer> arrayListInteger = new ArrayList<Integer>();
    ArrayList<Double> arrayListDouble = new ArrayList<Double>();
    ArrayList<String> arrayListString = new ArrayList<String>();

    arrayListInteger.add(1);
    arrayListInteger.add(2);

    arrayListDouble.add(3.0);
    arrayListDouble.add(4.0);

    arrayListString.add("Hello");
    arrayListString.add("World");

    // 特定元素取值
    Integer test = arrayListInteger.get(1);
    System.out.println("position of 1: " + test);

    // int 游标遍历
    Iterator<Integer> cursor1 = arrayListInteger.iterator();
    while(cursor1.hasNext()){
      Integer next = cursor1.next();
      System.out.println("next: " + next);
    }
    System.out.println("size of arrayListInteger: " + arrayListInteger.size());

    // double 游标遍历 删除元素
    Iterator<Double> cursor2 = arrayListDouble.iterator();
    while(cursor2.hasNext()){
      Double next = cursor2.next();
      System.out.println(next);
      cursor2.remove();
    }
    System.out.println("size of arrayListDouble: " + arrayListDouble.size());

    // 普通遍历
    for (int i = 0 ; i < arrayListDouble.size() ; i++) {
      System.out.println(arrayListDouble.get(i));
    }

    // 增强遍历
    for (int item : arrayListInteger){
      System.out.println(item);
    }

    for (String str : arrayListString){
      System.out.println(str);
    }
  }
}