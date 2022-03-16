import java.util.Scanner;

class ScoreException extends Exception{
    public ScoreException() {
    }

    public ScoreException(String message) {
        super(message);
    }
}

class Teacher {
    public void checkScore(int score) throws ScoreException {
        if(score < 0 || score > 100){
            throw new ScoreException("分数输入有误");
        }else{
            System.out.println("分数正常");
        }
    }
}
public class customDealWithError {
    public static void main(String[] args) {
    while (true){
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入分数：");
        int score = sc.nextInt();

        Teacher t1 = new Teacher();
        try {
            t1.checkScore(score);
        }catch (ScoreException e){
            e.printStackTrace();
            System.exit(0);
        }
    }
    }
}
