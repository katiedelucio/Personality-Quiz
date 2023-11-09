/* C211 Project, Group 1 
 * author: Katie DeLucio
 * 11/9/2023
 * User class to create and hold user information for the quiz */

public class User {
    String name, occupation;
    int age;

    // constructor
    public User(String name, String occupation, int age) {
        this.name = name;
        this.age = age;
        this.occupation = occupation;
    }

    // default constructor
    public User() {
        name = "";
        occupation = "";
        age = 0;
    }

    // getter name
    public String getName() {
        return name;
    }

    // setter name
    public void setName(String name) {
        this.name = name;
    }

    // getter occupation
    public String getOccupation() {
        return occupation;
    }

    // setter occupation
    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    // getter age
    public int getAge() {
        return age;
    }

    // setter age
    public void setAge(int age) {
        this.age = age;
    }

    // print user info
    public void output() {
        System.out.println("User details: \nName = " + name + "\nOccupation = " + occupation + "\nAge = " + age);
    }

}
