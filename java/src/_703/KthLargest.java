package _703;

import java.util.PriorityQueue;
import java.util.Random;

class KthLargest {

    public static PriorityQueue<Integer> queue;
    public static int length;

    public KthLargest(int k, int[] nums) {
        length = k;
        queue = new PriorityQueue<>(k);
        if(nums.length == 0) return;
        for (int num : nums) {
            if(queue.size() < k){
                queue.add(num);
            }else{
                if(num > queue.peek()){
                    queue.poll();
                    queue.add(num);
                }
            }
        }
    }

    public int add(int val) {
        if(queue.size() < length){
            queue.add(val);
        }else{
            if(queue.peek() < val) {
                queue.poll();
                queue.add(val);
            }
        }
        return queue.peek();
    }

    public static void main(String[] args) {
        int [] nums = {};
        KthLargest obj = new KthLargest(3,nums);
        System.out.println(obj.add(-3));
        System.out.println(obj.add(-2));
        System.out.println(obj.add(-4));
        System.out.println(obj.add(0));
        System.out.println(obj.add(4));
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */
