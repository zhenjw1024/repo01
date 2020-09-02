import java.util.Scanner;
import java.util.Random;
public class Demo1 {
    public static void main(String [] args){
        System.out.println("HelloWorld");
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入x的值：");
        int x = sc.nextInt();
        int y=0;
        if(x==0){
            y = 2*x;
        }else if(x>0){
            y=3*x+1;
        }else if(x<0){
            y=3*x-1;
        }
        System.out.print("y的值为："+y);
        System.out.println("---------------");
        Random r = new Random();
        int num = r.nextInt(100)+1;
        int sum = 0;
        while(true){
            sum++;
            Scanner sc1 = new Scanner(System.in);
            System.out.println("请输入1到100的整数");
            int a = sc1.nextInt();
            if(a>num){
                System.out.println("输的数太大");
            }else if(a<num){
                System.out.println("输入的数太小");
            }else{
                System.out.println("猜对了");
                break;
            }
        }
        System.out.println("总共才了"+sum+"次。");
    }
}
