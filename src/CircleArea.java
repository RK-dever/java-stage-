import java.util.Scanner;

public class CircleArea {
     static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         System.out.print("请输入圆的半径：");
         double r = sc.nextDouble();
         final double PI = 3.14159;
        double area = r * r * PI;
        System.out.println("圆的面积为：" + area);

    }
}
