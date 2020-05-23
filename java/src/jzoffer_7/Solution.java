package jzoffer_7;

/**
 * Created by Administrator on 2020/5/22.
 */
public class Solution {
    public int Fibonacci(int n) {
        if(n == 0){
            return 0;
        }
        if(n == 1){
            return 1;
        }
        int a = 0;//
        int b = 1;
        for(int i=2; i<=n;i++){
            b = b + a;
            a = b - a;
        }
        return b;
    }
}
