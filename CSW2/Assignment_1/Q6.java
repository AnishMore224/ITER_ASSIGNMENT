abstract class LibraryResource {
	private String title;
	private String author;

	LibraryResource(String title, String author) {
		this.title = title;
		this.author = author;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	abstract void displayDetails();
}

class Book extends LibraryResource {
	int pageCount;

	Book(String title, String author, int pageCount) {
		super(title, author);
		this.pageCount = pageCount;
	}

	public int getPageCount() {
		return pageCount;
	}

	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}

	public void displayDetails() {
		System.out.println("Title:" + getTitle() + " Author:" + getAuthor() + " Page count: " + pageCount);
	}
}

class Magazine extends LibraryResource {
	String issueDate;

	Magazine(String title, String author, String issueDate) {
		super(title, author);
		this.issueDate = issueDate;

	}

	public String getIssueDate() {
		return issueDate;
	}

	public void setIssueDate(String issueDate) {
		this.issueDate = issueDate;
	}

	public void displayDetails() {
		System.out.println("Title:" + getTitle() + " Author:" + getAuthor() + " Issue Date: " + issueDate);
	}
}

class DVD extends LibraryResource {
	double duration;

	DVD(String title, String author, double duration) {
		super(title, author);
		this.duration = duration;
	}

	public double getDuration() {
		return duration;
	}

	public void setDuration(double duration) {
		this.duration = duration;
	}

	public void displayDetails() {
		System.out.println("Title:" + getTitle() + " Author:" + getAuthor() + " Duration: " + duration + "hrs");
	}
}

public class Q6 {
	public static void main(String[] args) {
		Book b = new Book("Advanced Engineering Mathematics", "ABC", 10);
		Magazine m = new Magazine("Advanced Engineering Mathematics", "ABC", "10/02/2004");
		DVD d = new DVD("Advanced Engineering Mathematics", "ABC", 3);
		b.displayDetails();
		m.displayDetails();
		d.displayDetails();
	}
}

/*
 * Output--
 * Title:Advanced Engineering Mathematics Author:ABC Page count: 10
 * Title:Advanced Engineering Mathematics Author:ABC Issue Date: 10/02/2004
 * Title:Advanced Engineering Mathematics Author:ABC Duration: 3.0hrs
 */