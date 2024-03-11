package assignment;

public class Consumer
{
	Thread1 t1;
	public Consumer(Thread1 t1) 
	{
		this.t1=t1;

	}
	public void deserializer() 
	{
		synchronized (t1.getMonitor()) 
		{

			try 
			{
				t1.getMonitor().wait();
				t1.deserializer();
			} 
			catch (InterruptedException e) 
			{
				e.printStackTrace();
			}


		}
	}

}
