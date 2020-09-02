public class Democope {
    public static void main(String[] args) {
        int sum=0;//不能被3整除的整数的和
        int num=0;//和大于等于2000的数
        for(int i=1;i<=100;i++){
            if(i%3==0)//判断是否能被3整除
            {
                continue;
            }
            sum+=i;
            if(sum>=2000)//判断是否跳出
            {
                num=i;
                break;
            }
        }
        System.out.println("这个数是："+num);
    }
}
