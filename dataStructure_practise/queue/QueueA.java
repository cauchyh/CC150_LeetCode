// achieve the queue by array

public class QueueA
{
	private int maxSize;
	private long qArray[]; // achieve the function by using the array
	public int head;
	public int tail;	
	private int itemNum; 
	// since the head might be beyond the tail, it is necessary to 
	// it is necessary to introduce a counter to check record the exact 
	// item number of the queue as to implement isEmpty and isFull

	public QueueA(int maxS) 
	{
		maxSize = maxS; // user has to decide the size of the queue
		qArray = new long[maxSize];
		head = 0;
		tail = 0;
		itemNum = 0;
	}

	public QueueA()
	{
		System.out.println("Need to assign the size of the queue.");
	}

	private int increase(int data)
	{
		if (data == maxSize-1)
		{
			return 0;
		}
		else
		{
			// data = data+1;
			return (++data);
		}
	}

	public boolean isEmpty()
	{
		return (itemNum == 0);
	}

	public boolean isFull()
	{
		return (itemNum == maxSize);
	}

	public void push(long data)
	{
		if (isFull())
		{
			System.out.println("Failed. Queue is full.");
			return;
		}
		else
		{
			// System.out.println(head);
			qArray[head] = data;	
			head = increase(head);
			itemNum++;
		}
	}	

	public long pop()
	{
		if (isEmpty())
		{
			System.out.println("Failed. Queue is empty");
			return 0;
		}
		else
		{
			long res = qArray[tail];
			tail = increase(tail);
			itemNum--;
			return res;
		}
	}

	public void display()
	{
		System.out.println("itemNum: " + itemNum);
		System.out.println("head, tail: "+ (head-1) + ", " + tail);
		if (isEmpty())
		{
			System.out.println("Failed. Queue is empty.");
		}
		else if (head > tail)
		{
			for (int i=head-1; i>=tail; i--)
			{
				System.out.println(qArray[i]);
			}
		}
		else // head < tail
		{
			for (int i=head-1; i>=0; i--)
			{
				System.out.println(qArray[i]);
			}

			for (int i=maxSize-1; i>=tail; i--)
			{
				System.out.println(qArray[i]);
			}
		}
	}
}

















