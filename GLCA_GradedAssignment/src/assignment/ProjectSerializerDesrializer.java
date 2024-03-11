package assignment;
import java.util.Map;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
public class ProjectSerializerDesrializer
{
	public void projectSerializer(Map<ProjectDetails,ArrayList<Employee>> hmap)
	{
		synchronized (this) 
		{
			try 
			{
				FileOutputStream fo=new FileOutputStream("employeeProjectData");
				ObjectOutputStream oos=new ObjectOutputStream(fo);
				oos.writeObject(hmap);
				System.out.println("Data Serialization Successfull");
				oos.flush();
				fo.flush();
				oos.close();
				fo.close();
			}
			catch(IOException e)
			{
				e.printStackTrace();
			}
		}
	}
	public void projectDeserialize()
	{
		synchronized (this) 
		{
			try 
			{
				FileInputStream fo=new FileInputStream("employeeProjectData");
				ObjectInputStream ooi=new ObjectInputStream(fo);
				Map<ProjectDetails,ArrayList<Employee>> hmap =(Map<ProjectDetails,ArrayList<Employee>>)ooi.readObject();

				for(Map.Entry<ProjectDetails, ArrayList<Employee>> entry:hmap.entrySet())
				{
					System.out.println("Deserialized Data : ");
					System.out.println("The Project "+entry.getKey()+" Has the following Employees");
					System.out.println("Employees .............");
					for(Employee obj:entry.getValue())
					{
						System.out.println(obj);
					}
					System.out.println();
				}
				ooi.close();
				fo.close();

			}
			catch(IOException  e)
			{
				e.printStackTrace();
			}
			catch(ClassNotFoundException e)
			{
				e.printStackTrace();
			}
		}
	}

}

