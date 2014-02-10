// test some of the most basic functions of stack and queue

public class test
{
	public static void main(String[] args)
	{
		stackL stk1 = new stackL();
		// stk1.push(1);
		// stk1.push(2);
		// stk1.push(3);
		stk1.push('a');
		stk1.push('b');
		stk1.display();
		System.out.println("======================");
		System.out.println(stk1.pop()+""+stk1.pop());
		stk1.display();

		reverse rev = new reverse();
		String res = rev.reverseInt("abcdef");
		System.out.println(res);

		// stackX stk1 = new stackX(3);
		// stackX stk2 = new stackX(10);
		// stk2.displayStack();
		// stk2.pop();
		// stk1.push(1);
		// stk1.push(2);
		// stk1.push(3);
		// stk1.push(4);
		// stk1.push(5);
		// stk1.displayStack();
		// stk1.pop();
		// // System.out.println(stk1.pop());
		// stk1.displayStack();	

	}
}

