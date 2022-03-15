interface SpeakEnglish{
    public abstract void speak();
}

abstract class Person{
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public abstract void eat();
}

abstract class Coach extends Person{
    public Coach() {
    }

    public Coach(String name, int age) {
        super(name, age);
    }

    public abstract void teach();
}

abstract class Player extends Person{
    public Player() {
    }

    public Player(String name, int age) {
        super(name, age);
    }

    public abstract void study();
}

class BaskballCoach extends Coach{
    public BaskballCoach() {
    }

    public BaskballCoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void teach() {
        System.out.println("篮球教练开始教学");
    }

    @Override
    public void eat() {
        System.out.println("篮球教练用餐");
    }
}

class PingPangCoach extends Coach implements SpeakEnglish{
    public PingPangCoach() {
    }

    public PingPangCoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void teach() {
        System.out.println("乒乓球教练开始教学");
    }

    @Override
    public void eat() {
        System.out.println("乒乓球教练用餐");
    }

    @Override
    public void speak() {
        System.out.println("乒乓球教练说英语");
    }
}

class BaskBallPlayer extends Player implements SpeakEnglish{
    public BaskBallPlayer() {
    }

    public BaskBallPlayer(String name, int age) {
        super(name, age);
    }

    @Override
    public void study() {
        System.out.println("篮球运动员练习投篮");
    }

    @Override
    public void eat() {
        System.out.println("篮球运动员用餐");
    }

    @Override
    public void speak() {
        System.out.println("篮球运动员说英语");
    }
}

class PingPongPlayer extends Player implements SpeakEnglish{
    public PingPongPlayer() {
    }

    public PingPongPlayer(String name, int age) {
        super(name, age);
    }

    @Override
    public void study() {
        System.out.println("乒乓球运动员学习发球和接球");
    }

    @Override
    public void eat() {
        System.out.println("乒乓球运动员用餐");
    }

    @Override
    public void speak() {
        System.out.println("乒乓球运动员说英语");
    }
}

public class Games {
    public static void main(String[] args) {
        // 乒乓球运动员
        PingPongPlayer ppp = new PingPongPlayer();
        ppp.setName("王皓");
        ppp.setAge(20);
        System.out.println(ppp.getName() + " " + ppp.getAge());
        ppp.eat();
        ppp.study();
        ppp.speak();

        System.out.println();

        // 篮球运动员
        BaskBallPlayer bbp = new BaskBallPlayer();
        bbp.setName("姚明");
        bbp.setAge(35);
        System.out.println(bbp.getName() + " " + bbp.getAge());
        bbp.eat();
        bbp.study();
        bbp.speak();
    }
}
