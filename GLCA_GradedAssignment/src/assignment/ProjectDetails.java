package assignment;

import java.io.Serializable;

public class ProjectDetails implements Serializable 
{
	private static final long serialVersionUID=1546;

	private String projectCode;
	private String projectName;
	private int projectStrength;

	public ProjectDetails(String projectCode,String projectName,int projectStrength) 
	{
		this.projectCode=projectCode;
		this.projectName=projectName;
		this.projectStrength=projectStrength;
	}

	public String getProjectCode() 
	{
		return projectCode;
	}

	public void setProjectCode(String projectCode) 
	{
		this.projectCode = projectCode;
	}

	public String getProjectName() 
	{
		return projectName;
	}

	public void setProjectName(String projectName)
	{
		this.projectName = projectName;
	}

	public int getProjectStrength() 
	{
		return projectStrength;
	}

	public void setProjectStrength(int projectStrength) 
	{
		this.projectStrength = projectStrength;
	}


	@Override
	public String toString() 
	{
		return "\n"+"Project [projectCode="+projectCode+", projectName="+projectName+", projectStrength="+projectStrength ;
	}


}
