package org.example;

public class Tester {
    private String name;
    private String surname;
    private int experienceInYears;
    private String englishLevel;
    private double salary;

    // Перегрузка конструкторов
    public Tester(String name, String surname, int experienceInYears, String englishLevel, double salary) {
        this.name = name;
        this.surname = surname;
        this.experienceInYears = experienceInYears;
        this.englishLevel = englishLevel;
        this.salary = salary;
    }

    public Tester(String name, String surname, int experienceInYears, String englishLevel) {
        this(name, surname, experienceInYears, englishLevel, 0);
    }

    public Tester(String name, String surname, int experienceInYears) {
        this(name, surname, experienceInYears, "Intermediate");
    }

    // Перегрузка методов
    public void printInfo() {
        System.out.println("Name: " + name);
        System.out.println("Surname: " + surname);
        System.out.println("Experience in years: " + experienceInYears);
        System.out.println("English level: " + englishLevel);
        System.out.println("Salary: " + salary);
    }

    public void printInfo(String message) {
        System.out.println(message);
        printInfo();
    }

    public void printInfo(boolean showSalary) {
        if (showSalary) {
            printInfo();
        } else {
            System.out.println("Name: " + name);
            System.out.println("Surname: " + surname);
            System.out.println("Experience in years: " + experienceInYears);
            System.out.println("English level: " + englishLevel);
        }
    }

    // Статический метод
    public static void printTesterInfo(Tester tester) {
        System.out.println("Tester information:");
        System.out.println("Name: " + tester.name);
        System.out.println("Surname: " + tester.surname);
        System.out.println("Experience in years: " + tester.experienceInYears);
        System.out.println("English level: " + tester.englishLevel);
        System.out.println("Salary: " + tester.salary);
    }
}

