package dsa.stack;

public class Runner {

	public static void main(String[] args) {

		Stack nums = new Stack();
		nums.push(15);
		nums.push(1);
		System.out.println("Stack status : " + nums.isFull());
		nums.push(28);
		nums.push(31);

		nums.push(45);

		System.out.println("All data pushed into stack");

		System.out.println("Stack status : " + nums.isFull());
		nums.show();

		System.out.println(nums.pop());
		System.out.println(nums.pop());
		System.out.println(nums.pop());
		System.out.println(nums.pop());
		System.out.println(nums.pop());
		System.out.println(nums.pop());

	}

}
