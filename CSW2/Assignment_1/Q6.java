abstract class LibraryResource {
	private String title;
	private String author;

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

	public int getPageCount() {
		return pageCount;
	}

	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}

	public void displayDetails() {
		System.out.println("Page count: " + pageCount);
	}
}

class Magazine extends LibraryResource {
	String issueDate;

	public String getIssueDate() {
		return issueDate;
	}

	public void setIssueDate(String issueDate) {
		this.issueDate = issueDate;
	}

	public void displayDetails() {
		System.out.println("Issue Date: " + issueDate);
	}
}

class DVD extends LibraryResource {
	double duration;

	public double getDuration() {
		return duration;
	}

	public void setDuration(double duration) {
		this.duration = duration;
	}

	public void displayDetails() {
		System.out.println("Duration: " + duration + "hrs");
	}
}

public class Q6 {
	public static void main(String[] args) {
		Book b = new Book();
		Magazine m = new Magazine();
		DVD d = new DVD();
		b.setTitle("Advanced Engineering Mathematics");
		b.setAuthor("Abc");
		b.setPageCount(10);
		m.setIssueDate("10/02/2024");
		d.setDuration(2);
		System.out.println("Title:" + b.getTitle() + "\nAuthor:" + b.getAuthor());
		b.displayDetails();
		m.displayDetails();
		d.displayDetails();
	}
}

/*
 * Output--
 * Title:Advanced Engineering Mathematics
 * Author:Abc
 * Page count: 10
 * Issue Date: 10/02/2024
 * Duration: 2.0hrs
 */