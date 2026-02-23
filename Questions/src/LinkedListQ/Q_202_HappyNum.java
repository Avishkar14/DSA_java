package LinkedListQ;
//Solving Q : https://leetcode.com/problems/happy-number/
// Using the LL cycle detection way i.e; use fast and slow pointers

public class Q_202_HappyNum {
    public static void main(String[] args) {
        System.out.println(isHappyNum(16));
    }

    public static boolean isHappyNum(int num){
        int fast = num , slow = num;

        do{
            fast = findSq(findSq(fast));
            slow = findSq(slow);

            if( fast == 1){
                return true;
            }

        }while( fast != slow);

        return false;
    }

    public static int findSq( int num){
        int ans = 0;
        while( num > 0){
            int rem = num % 10;
            ans += rem*rem;
            num /= 10;
        }
        return ans;
    }
}
