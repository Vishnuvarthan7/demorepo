import java.util.ArrayList;

import org.testng.annotations.Test;

public class streams {
  @Test      
    public void regular(){
			
			ArrayList<String> namelist=new ArrayList<String>();
			namelist.add("vishnu");
			namelist.add("arun");
			namelist.add("ais");
			namelist.add("ariv");
			namelist.add("suresh");
			System.out.println(namelist);
			int count=0;
			for(int i=0;i<namelist.size();i++)
			{
				String name = namelist.get(i);
				if(name.startsWith("a"))
				{
					count++;
				}
			}
			System.out.println(count);
	}

}