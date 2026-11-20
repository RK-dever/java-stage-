import java.util.Scanner;

public class Demo {
    static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入您的姓名：");
        String name = sc.next();
        Scanner ss = new Scanner(System.in);
        System.out.print("请输入您的成绩：");
        double grade = ss.nextDouble();
        System.out.println(name + "您的成绩是：" + grade);
    }
}
