import java.util.Scanner;

public class ScoreLevel {
    static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入你的成绩：");
        double score = sc.nextDouble();
        if(score>100){
            System.out.println("您输入的成绩不合理，值应当在0~100之间");
        }else if (score>=90){
            System.out.println("成绩：" + score + "等级:优" );
        }else if (score>=80){
            System.out.println("成绩：" + score + "等级:良" );
        }else if (score>=60){
            System.out.println("成绩：" + score + "等级:及格" );
        }else if (score<0){
            System.out.println("您输入的成绩不合理，值应当在0~100之间");
        }else{
            System.out.println("成绩：" + score + "等级:不及格" );
        }
    }
}
