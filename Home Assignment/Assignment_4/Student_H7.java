package Assignment_4;
public class Student_H7{
	private long id;
	private String name;
	private String courseName;
	private double courseDuration;
	public Student_H7() {
		// TODO Auto-generated constructor stub
		this.id = 0L;
		this.name = "";
		this.courseName = "";
		this.courseDuration = 0.0;
		
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public double getCourseDuration() {
		return courseDuration;
	}
	public void setCourseDuration(double courseDuration) {
		this.courseDuration = courseDuration;
	}
	public String toString() {
		return "Student[ID: "+id+" ,Name: "+name+" ,Course Name: "+courseName+", Course Duration: "+courseDuration+" Years.]";
	}
	protected void finalize() throws Throwable{
		System.out.println("Garbage collected: " + name);
	}
	
      public static void main(String[] args) {
		Student_H7 s1 = new Student_H7();
		s1.setId(101);
		s1.setName("Aman");
		s1.setCourseName("CSE");
		s1.setCourseDuration(4);
		
		Student_H7 s2 = new Student_H7();
		s2.setId(102);
		s2.setName("Amlan");
		s2.setCourseName("CSIT");
		s2.setCourseDuration(4);
		
		System.out.println(s1.toString());
		System.out.println(s2.toString());
		Runtime runtime = Runtime.getRuntime();
		System.out.println("Total Memory before Garbage Collection: " + runtime.totalMemory());
		System.out.println("Total Memory before Garbage Collection: " + runtime.freeMemory());
		runtime.gc();
		
		System.out.println("Total Memory: " + runtime.totalMemory());
		System.out.println("Free Memory: " + runtime.freeMemory());
		System.out.println("Used Memory: " + (runtime.totalMemory() - runtime.freeMemory()));
		
		s1 = null;
		s2 = null;
		System.gc();
	
	}
}
