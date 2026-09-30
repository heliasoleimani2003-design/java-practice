/**
 * 
 */
package test;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

/**
 * 
 */
public class Practice2
{
    public static void main(String[] args)
    {
        Student s = new Student("Helia", 3);
        s.addCourse("DB");
        s.addCourse("Java");
        s.addCourse("Math");

        s.printStudent();
        System.out.println();

        Airplane airplane = new Airplane("CDE1987", "Berlin",
                LocalTime.of(8, 30));
        airplane.delay(10);
        airplane.checkDelay();
        System.out.println(airplane.getScheduledDeparture());

    }

}

class Bank
{
    public static final String NAME = "Sparkasse";
    private List<Account> accounts = new ArrayList<Account>();

    public void addAccount(Account account)
    {
        accounts.add(account);
    }

    public void removeAccount(Account account)
    {
        accounts.remove(account);
    }

    public List<Account> getAccounts()
    {
        return accounts;
    }

}

class Account
{
    private String name;
    private int age;
    private String password;
    private double accountStatus = 50;

    Account(String name, int age, String password)
    {
        this.name = name;
        this.age = age;
        this.password = password;

    }

    public String getName()
    {
        return name;
    }

    public int getAge()
    {
        return age;
    }

    public void deposite(double amount)
    {
        accountStatus = accountStatus + amount;
    }

    public void withdraw(double amount)
    {
        if (accountStatus >= amount && amount > 0)
        {
            accountStatus = accountStatus - amount;
        } else
        {
            System.out.println("The account balance is not sufficient.");
        }

    }

    public double getAccountStatus()
    {
        return accountStatus;
    }

}

class Student
{
    private String name;
    private int grade;
    private List<String> courses = new ArrayList<String>();

    public Student(String name, int grade)
    {
        this.name = name;
        this.grade = grade;
    }

    public String getName()
    {
        return name;
    }

    public int getGrade()
    {
        return grade;
    }

    public void addCourse(String course)
    {
        courses.add(course);
    }

    public void removeCourse(String course)
    {
        courses.remove(course);
    }

    public List<String> getCourses()
    {
        return courses;
    }

    public void printStudent()
    {
        System.out.println("The name of the student: " + name);
        System.out.println("The grade of the student: " + grade);
        for (String course : courses)
        {
            System.out.println("The courses that the student has : " + course);
        }
    }

}

class Airplane
{
    private String flightNumber;
    private String destination;
    private LocalTime scheduledDeparture;
    private int delayTime;

    public Airplane(String flightNummer, String destination,
            LocalTime scheduledDeparture)
    {
        this.flightNumber = flightNummer;
        this.destination = destination;
        this.scheduledDeparture = scheduledDeparture;
    }

    public String getFlightNummer()
    {
        return flightNumber;
    }

    public String getDestination()
    {
        return destination;
    }

    public LocalTime getScheduledDeparture()
    {
        return scheduledDeparture;
    }

    public void delay(int delayTime)
    {
        this.delayTime = delayTime;
        this.scheduledDeparture = this.scheduledDeparture
                .plusMinutes(delayTime);
    }

    public void checkDelay()
    {
        if (delayTime == 0)
        {
            System.out.println("The flight: " + flightNumber + " is on time.");
        } else
        {
            System.out.println("The flight: " + flightNumber + " is delyed "
                    + delayTime + " minutes.");
        }
    }
}