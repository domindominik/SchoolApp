package main;

import java.io.Serializable;

public class Pupil implements Serializable
{
    private String name;
    private String surname;
    private int age;
    private int id;

    public Pupil(String name, String surname, int age, int id)
    {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public String getSurname()
    {
        return surname;
    }

    public int getAge()
    {
        return age;
    }

    public int getId()
    {
        return id;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setSurname(String surname)
    {
        this.surname = surname;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public void printInfo()
    {
        System.out.println("Imię: " + name +
                ", Nazwisko: " + surname +
                ", Wiek: " + age +
                ", Numer: " + id);
    }
}
