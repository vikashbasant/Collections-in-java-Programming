package in.co.decimal.coll.comparable.pojo;

public class StudentCollection implements Comparable<StudentCollection> {

	private int id;
	private String name;

	public StudentCollection() {
		// default constructor:
	}

	public StudentCollection(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}


	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "StudentCollection [id=" + id + ", name=" + name + "]";
	}

	@Override
	public int compareTo(StudentCollection that) {
		// for increasing order:
		return Integer.compare(this.id, that.id);

		// for decreasing order:
//		return Integer.compare(that.id, this.id);
	}

}
