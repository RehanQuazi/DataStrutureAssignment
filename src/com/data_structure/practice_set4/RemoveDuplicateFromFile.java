package com.data_structure.practice_set4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashSet;

import java.util.Iterator;

class NamePair{
	private String firstName;
	private String secondName;
	public NamePair(String line) {
		String [] names=line.split(",");
		this.firstName = names[0];
		this.secondName = names[1];
	}
	
	@Override
	public boolean equals(Object obj) {
		
		NamePair np = (NamePair) obj;
		if(this.firstName.equals(np.firstName)&&this.secondName.equals(np.secondName))
		return true;
		else if(this.firstName.equals(np.secondName)&&this.secondName.equals(np.firstName))
			return true;
		return false;
	}
	public String getLine() {
		return this.firstName+","+this.secondName;
	}
	
	
}
public class RemoveDuplicateFromFile {
	
	static LinkedHashSet<NamePair> set;
	
	static void removeDuplicates(BufferedReader file) throws IOException {
		set=new LinkedHashSet<NamePair>();
		NamePair name=null;
		String line=file.readLine();
		if(set.size()==0) {
			set.add(new NamePair(line));
		}
		
		while(line!=null)
		{
			boolean duplicate=false;
			name=new NamePair(line);
			Iterator<NamePair> itr=set.iterator();
			while(itr.hasNext()) {
				NamePair obj=itr.next();
				if(name.equals(obj)) {
					duplicate=true;
					break;
				}
			}
			if(!duplicate) 
				set.add(name);
			line=file.readLine();
		}
		
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader reader=new BufferedReader(new FileReader("D:\\Educational\\2020\\Courses\\DataAlgo\\DataStructure\\src\\com\\problems\\practice_set_4\\data.txt"));
		removeDuplicates(reader);
	   for(NamePair np:set) {
		   System.out.println(np.getLine());
	   }
	}

}
