// test some of the most basic functions of stack and queue

public class test
{
	public static void main(String[] args)
	{
		QueueL que1 = new QueueL(5);
		que1.push(1);
		que1.push(2);
		que1.push(3);
		// que1.display();
		que1.pop();
		que1.pop();
		que1.pop();
		que1.pop();
		que1.push(1);
		que1.push(2);
		que1.push(3);
		que1.display();

		// que1.push(1);
		// que1.push(2);
		// que1.push(3);
		// que1.pop();
		// que1.pop();
		// // que1.pop();
		// que1.push(1);
		// System.out.println(que1.pop());
		// que1.display();
		// System.out.println(que1.tail+" "+que1.head);
		// que1.display();
	}
}

