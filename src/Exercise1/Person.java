package Exercise1;

import java.util.Optional;

public class Person {
  private String name;
  private String city;
  private Optional<Integer> age;

  public Person(String name, String city, Optional<Integer> age) {
    this.name = name;
    this.city = city;
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public Optional<Integer> getAge() {
    return age;
  }

  public void setAge(Optional<Integer> age) {
    this.age = age;
  }

  public String toString() {
    return "name: " + name + " City: " + city + " Age: " + age.get();
  }
}
