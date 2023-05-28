package domein;

import java.util.ArrayList;
import java.util.List;

public class Directory {
	private String name;
	private List<Object> files;

	public Directory(String name) {
		setName(name);
		files = new ArrayList<>();
	}

	public void add(Object obj) {
		files.add(obj);
	}

	public void print(int level) {
		String indent = "";
		for (int i = 0; i < level; i++)
			indent += "\t";
		System.out.println(indent + "Directory : " + getName());
		level++;
		for (Object obj : files) {
			if (obj instanceof Directory directory)
				directory.print(level);
			else
				((File) obj).print(level);
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
