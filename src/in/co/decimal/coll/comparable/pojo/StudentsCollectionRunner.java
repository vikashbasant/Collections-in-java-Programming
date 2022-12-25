package in.co.decimal.coll.comparable.pojo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class DescendingStudentComparator implements Comparator<StudentCollection> {

	@Override
	public int compare(StudentCollection student1, StudentCollection student2) {
		return Integer.compare(student2.getId(), student1.getId());
	}

}

class AsscendingStudentComparator implements Comparator<StudentCollection> {

	@Override
	public int compare(StudentCollection student1, StudentCollection student2) {
		return Integer.compare(student1.getId(), student2.getId());
	}

}
public class StudentsCollectionRunner {
	public static void main(String[] args) {
		List<StudentCollection> students = List.of(new StudentCollection(9, "Ranga"),
				new StudentCollection(100, "Vikky"), new StudentCollection(96, "lala"));

		List<StudentCollection> studentAl = new ArrayList<>(students);
		System.out.println(studentAl.toString());

		Collections.sort(studentAl);
		System.out.println("Asc " + studentAl);

		Collections.sort(studentAl, new DescendingStudentComparator());
		System.out.println("Dsc " + studentAl);

		// or another ways:
		studentAl.sort(new DescendingStudentComparator());
		System.out.println("Dsc " + studentAl);
	}
}