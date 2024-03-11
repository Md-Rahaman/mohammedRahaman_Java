package assignment;

public class Producer
{
	Thread1 t1;
	public Producer(Thread1 t1) 
	{
		this.t1=t1;
	}
	public void serializer() 
	{
		synchronized (t1.getMonitor()) 
		{
			t1.serializer();
			t1.getMonitor().notify();
		}

	}






}
