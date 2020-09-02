public class Demo2 {
    public static void main(String[] args) {
        int sum = 0;
        int sum1 = 0;
        for(int i=1;i<=100;i++){
            if(i%7==0){
                continue;
            }else{
                sum = sum+i;
            }
        }
        for(int j=1;j<=100;j++){
            sum1 = sum1+j;
        }
        System.out.println("sum的值为"+sum);
        System.out.println("sum1的值为"+sum1);
        System.out.println("-----------------");
        int sum2 = 0;
        for(int k = 1;k<=100;k++){
            if(k%3!=0){
                sum2 = sum2+k;
                if(sum2>2000){
                    System.out.println("sum的值为"+sum2);
                    System.out.println("k的值"+k);
                    break;
                }
            }else{
                continue;
            }
        }
        System.out.println("-----------------");
        int sum3 = 0;
        for(int a = 200;a<=300;a++){
            if(a%2!=0){
                sum3 = sum3+a;
            }else{
                continue;
            }
        }
        System.out.println("200到300之间所有奇数的和为："+sum3);
        System.out.println("-----------------");
        int sum4 = 0;
        for(int b = 200;b<=300;b++){
            if(b%7==0){
                System.out.println("200-300之间 第一个能被7整除的数"+b);
                break;
            }else{
                continue;
            }
        }
    }
}
