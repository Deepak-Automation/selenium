package selenium;

import java.util.*;


class StudentTest{
	
	String name;
	int roll;
	String project;
	StudentTest(String name,int roll, String project){
		this.name=name;
		this.roll=roll;
		this.project=project;
	}
	
}

public class ArraylistOperations<E> {
	
	
	public static void main(String[] args) {
		
	
	StudentTest s1 =new StudentTest("Deepak",20,"QA");
	StudentTest s2 =new StudentTest("Ram",10,"dev");
	StudentTest s3 =new StudentTest("tom",24,"test");
	
	ArrayList<StudentTest> al = new ArrayList<StudentTest>();
	al.add
//	al.add(s1);
//	al.add(s2);
//	al.add(s3);
//	
//	Iterator<StudentTest> itr = al.iterator();
//	while(itr.hasNext()){
//		StudentTest st = itr.next();
//		System.out.println(st.name);
//		System.out.println(st.roll);
//		System.out.println(st.project);
//	}	
}
}


//public static void main(String[] args) {
//
//ArrayList<String> ar = new ArrayList<String>();
//ar.add("Deepak");
//ar.add("My");
//ar.add("name");
//ar.add("is");
//Iterator<String> it = ar.iterator();
//while(it.hasNext()){
//	System.out.println(it.next());
//}
//
//}