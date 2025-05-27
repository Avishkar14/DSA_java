class Solution {
    public static int subtractProductAndSum(int n) {
        int sum=0;
        int prod=1;
        while(n>0){

        int rem=n%10;
        int div=n/10;
        n=div;
        sum=sum+rem;
        prod=prod*rem;

        }
        int result = prod - sum;

        return result;
    }

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num=in.nextInt();
        subtractProductAndSum(num);
        System.out.println("Result :"+num);
    }
}
