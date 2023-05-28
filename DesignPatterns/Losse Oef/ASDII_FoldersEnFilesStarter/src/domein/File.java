package domein;

public class File {

	private String name;
	private int kbytes;

	public File(String name, int kbytes) {
		setName(name);
		setKBytes(kbytes);
	}

	public void print(int level) {
		String indent = "";
		for (int i = 0; i < level; i++) {
			indent += "\t";
		}
		System.out.println(indent + getName() + " (" + getKBytes() + " kb)");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKBytes() {
		return kbytes;
	}

	private void setKBytes(int bytes) {
		this.kbytes = bytes;
	}
}
