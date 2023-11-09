
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

  public String getName() {
    return name;
}

public void setName(String name) {
    this.name = name;
}

public String getOccupation() {
    return occupation;
}

public void setOccupation(String occupation) {
    this.occupation = occupation;
}

public int getAge() {
    return age;
}

public void setAge(int age) {
    this.age = age;
}
  

public void output() {
    System.out.println("User details: \nName = " + name + "\nOccupation = " + occupation + "\nAge = " + age);
}

}
