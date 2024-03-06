/**
 * The Person class represents an individual with various attributes such as name, surname, profession, age, sex, and height.
 * It provides methods to access and modify these attributes and to retrieve information about the person.
 */
public class Person {
    private String name; // Stores the first name of the person
    private String surname; // Stores the last name of the person
    String profession; // Stores the profession of the person
    String sex; // Stores the sex of the person
    private int age; // Stores the age of the person
    double height; // Stores the height of the person

    /**
     * Retrieves the first name of the person.
     */
    String getName() {
        return name;
    }

    /**
     * Sets the first name of the person.
     * If the length of the provided name exceeds 10 characters, it is truncated to 10 characters.
     */
    void setName(String name) {
        if (name.length() > 10) {
            this.name = name.substring(0, 10);
        } else {
            this.name = name;
        }
    }

    /**
     * Retrieves the last name of the person.
     */
    String getSurname() {
        return surname;
    }

    /**
     * Sets the last name of the person.
     * If the length of the provided surname exceeds 20 characters, it is truncated to 20 characters.
     */
    void setSurname(String surname) {
        if (surname.length() > 20) {
            this.surname = surname.substring(0, 20);
        } else {
            this.surname = surname;
        }
    }

    /**
     * Retrieves the age of the person.
     */
    int getAge() {
        return age;
    }

    /**
     * Sets the age of the person.
     * If the provided age is less than or equal to 70, it is set as the person's age.
     */
    void setAge(int age) {
        if (age > 70) {
            this.age = age;
        } else {
            this.age = age;
        }
    }

    /**
     * Retrieves the full name of the person by combining the first name and last name.
     */
    String getFullName() {
        return name + " " + surname;
    }

    /**
     * Retrieves detailed information about the person, including full name, sex, profession, age, and height.
     */
    String getFullInfo() {
        return getFullName() + " (" + sex + ") "  + " is a " + profession + " and is " + age + " years old and is " + height + "cm tall.";
    }
}
