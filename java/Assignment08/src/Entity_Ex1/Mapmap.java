package Entity_Ex1;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Mapmap {
	static Map<Integer, String> students = new HashMap<>();
	public static void map() {
	
		
		students.put(1, "NVA");
		students.put(2, "NVB");
		students.put(3, "NVC");
		students.put(4, "NVD");
		
		// In ra các key của students
		System.out.println(students.keySet());
		//In ra value của students
		System.out.println(students.values());
		//In ra danh sách students được sắp xếp theo tên của student
				
		//Chuyển đổi map students sang set
		Set<String> set = new HashSet<>();
		for(int i=0; i< students.size(); i++) {
			set.add(students.get(i));
				System.out.println(set);
		}
	}
	//In ra danh sách students được sắp xếp theo tên của student
//	public void sapxep() {
//		Collections.sort((List<T>) students);
//		System.out.println(students);
//	}
}
