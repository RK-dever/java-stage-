public class LoopDemo {
    static void main(String[] args){
        int n = 0;
        for(int i=1;i<=100;i++){
             n = n + i;
        }
        System.out.println(n);
        System.out.println();

        for(int i = 1;i<=9;i++){
            for(int j = 1;j<=i;j++){
                System.out.print(j+"*"+i+"="+(j*i)+"  ");
            }
            System.out.println();
        }
        
    }

}
