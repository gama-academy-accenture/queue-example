package app;

public class File implements Comparable<File>{
	String name;
	String extension;
	Double size;
	
	public File(String name, String extension, Double size) {
		this.name = name;
		this.extension = extension;
		this.size = size;
	}
	
	public String toString() {
		return name + "." + extension + " " + size + " kB";
	}
	
	public int compareTo(File o) {
		return (this.size.compareTo(o.size));
	}
}

