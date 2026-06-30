package yusufgun.LinkedList;

public class Demo {

    public static void main(String[] args) {

        LinkedList nums = new LinkedList();

        nums.add(5);
        nums.add(9);
        nums.add(6);

        nums.addFirst(7);

        nums.printValues();

        nums.delete(9);

        nums.printValues();


    }

}
