
public class User {
String name, occupation;
int age;

public User(String name, String occupation, int age) {
    
    this.name = name;
    this.age = age;
    this.occupation = occupation;
}

public User() {
   name = "";
   occupation = "";
   age = 0;
}


public void output() {
    System.out.println("User details: \nName = " + name + "\nOccupation = " + occupation + "\nAge = " + age);
}

}
