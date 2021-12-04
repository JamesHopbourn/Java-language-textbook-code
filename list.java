import java.util.ArrayList;

public class list{
    public static void main(String[] args) {
        ArrayList<String> sites = new ArrayList<String>();
        sites.add("Google");
        sites.add("Runoob");
        sites.add("Taobao");
        sites.add("Weibo");
        System.out.println(sites);
        System.out.println(sites.size());
        System.out.println(sites.get(2));
        for (String i : sites) {
            System.out.println(i);
        }
    }
}
