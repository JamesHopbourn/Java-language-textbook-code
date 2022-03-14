class Phone {
    // 成员方法
    public void call(String name){
        System.out.println("给 " + name  + " 打电话");
    }
}

class newPhone extends Phone{
    @Override
    public void call(String name) {
        System.out.println("开启视频通话");
        super.call(name);
    }
}

public class PhoneExtends {
    public static void main(String[] args) {
        Phone p = new Phone();
        p.call("JamesHopbourn");
        System.out.println();
        newPhone np = new newPhone();
        np.call("JamesHopbourn");
    }
}
