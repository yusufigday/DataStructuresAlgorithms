package yusufgun.Stack;


public class Demo {

    public static void main(String[] args) {

        Stack nums = new Stack();
        nums.pop();
        nums.push(10);
        nums.push(30);
        System.out.println(nums.pop());
        nums.push(40);
        nums.push(50);
        nums.push(60);
        System.out.println(nums.peek());


        nums.printStack();
    }

}
