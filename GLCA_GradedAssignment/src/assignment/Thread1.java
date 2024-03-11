package assignment;
import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;
public class Thread1 implements Runnable 
{
	Map<ProjectDetails,ArrayList<Employee>> hmap=new HashMap<>();
	ProjectSerializerDesrializer pr=new ProjectSerializerDesrializer();
	private Object monitor; 
	private boolean serializationStatus=false;

	public Thread1(Map<ProjectDetails,ArrayList<Employee>> hmap,Object monitor) 
	{
		this.hmap=hmap;
		this.monitor=monitor;
		new Thread(this).start();
	}

	public void serializer()
	{
		synchronized (monitor) 
		{
			System.out.println("Serialize called by Producer\r\n"
					+ "\r\n"
					+ "Serialized Data :"+"\n");
			pr.projectSerializer(hmap);
			System.out.println(hmap);
			System.out.println();
			serializationStatus=true;
			monitor.notify();
		}
	}

	public  void deserializer()
	{
		synchronized (monitor) 
		{
			try 
			{
				while(!serializationStatus)
				{
					monitor.wait();
				}
				serializationStatus=false;
				System.out.println("DeSerialize Called by Consumer\r\n");
				pr.projectDeserialize();
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}
	}

	public Object getMonitor() 
	{
		return monitor;
	}

	@Override
	public void run() 
	{
		serializer();
		deserializer();
	}







}
