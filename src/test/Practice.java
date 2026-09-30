/**
 * 
 */
package test;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 */
public class Practice
{
    public static void main(String[] args)
    {
        Personn p = new Personn("Helia", 23);
        p.printInfo();
        p.setAge(24);
        p.printInfo();

        Rectangle r = new Rectangle(5.4, 3.9);
        r.area();
        System.out.println("The area of the rectangle is " + r.area());
        System.out
                .println("The perimeter of the rectangle is " + r.perimeter());

        Empoloyee a = new Empoloyee("Helia", "Verkäufer", 970.43);
        a.printEmpployee();
        a.raiseSalary(2);
        a.printEmpployee();

        Book book1 = new Book("Java für Anfänger", "Lila Pride", "1-999-00");
        Book book2 = new Book("Where are you", "Mari Lara", "1-7899-7");

        Library l = new Library();
        l.addBook(book1);
        l.addBook(book2);
        l.printBooks();

    }

}

class Personn
{
    private String name;
    private int age;

    public Personn(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public String getName()
    {
        return name;
    }

    public int getAge()
    {
        return age;
    }

    public void printInfo()
    {
        System.out.println(getName() + " is " + getAge() + " years old.");
    }

}

class Rectangle
{
    private double width;
    private double height;

    public Rectangle(double width, double height)
    {
        this.width = width;
        this.height = height;
    }

    public void setWidth(double width)
    {
        this.width = width;
    }

    public void setHeight(double height)
    {
        this.height = height;
    }

    public double getWidth()
    {
        return width;
    }

    public double getHeight()
    {
        return height;
    }

    public double area()
    {
        return (width * height) / 2;
    }

    public double perimeter()
    {
        return 2 * (width + height);
    }

}

class Circle
{
    private double radius;

    public Circle(double radius)
    {
        this.radius = radius;
    }

    public void setRadius(double radius)
    {
        this.radius = radius;
    }

    public double getRadius()
    {
        return radius;
    }

    public double getArea()
    {
        return Math.PI * radius * radius;
    }

    public double getPerimeter()
    {
        return 2 * Math.PI * radius;
    }
}

class Empoloyee
{
    private String name;
    private String jobTitel;
    private double salary;

    public Empoloyee(String name, String jobTitel, double salary)
    {
        this.name = name;
        this.jobTitel = jobTitel;
        this.salary = salary;
    }

    public String getName()
    {
        return name;
    }

    public String getJobTitel()
    {
        return jobTitel;
    }

    public double getSalary()
    {
        return salary;
    }

    public void raiseSalary(double percentage)
    {
        salary = salary + salary * percentage / 100;
    }

    public void printEmpployee()
    {
        System.out.println(name + " is " + jobTitel + " and earns " + salary);

    }
}

class Book
{
    private String titel;
    private String author;
    private String isbn;

    public Book(String titel, String author, String isbn)
    {
        this.titel = titel;
        this.author = author;
        this.isbn = isbn;
    }

    public String getTitel()
    {
        return titel;
    }

    public String getAuthor()
    {
        return author;
    }

    public String getIsbn()
    {
        return isbn;
    }
}

class Library
{
    private List<Book> books = new ArrayList<Book>();

    public void addBook(Book book)
    {
        books.add(book);
    }

    public void removeBook(Book book)
    {
        books.remove(book);
    }

    public List<Book> getBooks()
    {
        return books;
    }

    public void printBooks()
    {
        for (Book book : books)
        {
            System.out.println(book.getTitel() + " is written by "
                    + book.getAuthor() + " the ISBN is " + book.getIsbn());
        }

    }
}