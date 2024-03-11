package assignment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Question1_Solution_Main 
{

	public static void main(String[] args) 
	{
		Map<ProjectDetails,ArrayList<Employee>> hmap=new HashMap<>();

		ArrayList<Employee> elist1= new ArrayList<Employee>();
		ArrayList<Employee> elist2= new ArrayList<Employee>();
		ArrayList<Employee> elist3= new ArrayList<Employee>();

		ProjectSerializerDesrializer projectSerializerDeserializer=new ProjectSerializerDesrializer();

		ProjectDetails project1 = new ProjectDetails("P1","Music Synthesizer",23);
		ProjectDetails project2 = new ProjectDetails("P2","Vehicle Movement Tracker",13);
		ProjectDetails project3 = new ProjectDetails("P3","Liquid Viscosity Finder",15);
		Employee e1 = new Employee("E001","Harsha","9383993933","RTNagar",1000);
		Employee e2 = new Employee("E002","Harish","9354693933","Jayanagar",2000);
		Employee e3 = new Employee("E003","Meenal","9383976833","Malleswaram",1500);
		elist1.add(e1);
		elist1.add(e2);
		elist1.add(e3);
		Employee e4 = new Employee("E004","Sundar","9334593933","Vijayanagar",3000);
		Employee e5 = new Employee("E005","Suman","9383678933","Indiranagar",2000);
		Employee e6 = new Employee("E006","Suma","9385493933","KRPuram",1750);
		elist2.add(e4);
		elist2.add(e5);
		elist2.add(e6);
		Employee e7 = new Employee("E007","Chitra","9383978933","Koramangala",4000);
		Employee e8 = new Employee("E008","Suraj","9383992133","Malleswaram",3000);
		Employee e9 = new Employee("E009","Manu","9345193933","RTNagar",2000);
		elist3.add(e7);
		elist3.add(e8);
		elist3.add(e9);
		hmap.put(project1, elist1);
		hmap.put(project2, elist2);
		hmap.put(project3, elist3);

		projectSerializerDeserializer.projectSerializer(hmap);

		projectSerializerDeserializer.projectDeserialize();

	}
}
