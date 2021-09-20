public class E223 {
  public static void main(String args[]) {
    String str = "Java 语言教程";
    System.out.println("原始字符串：" + str);
    int len = str.length();
    StringBuffer rev_str = new StringBuffer(len);
    for (int i = len - 1; i >= 0; i--) {
      rev_str.append(str.charAt(i));
    }
    System.out.println("逆序字符串：" + rev_str);
  }
}
