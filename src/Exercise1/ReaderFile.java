package Exercise1;

import java.io.*;
import java.util.ArrayList;
import java.util.Optional;

public class ReaderFile {

  public void readFile() {
    String[] arrayLine;
    BufferedReader br = null;
    ArrayList<Person> personList = new ArrayList<Person>();

    try {
      br = new BufferedReader(new FileReader("C:/Users/andres.vazquez/Desktop/PersonsFile.txt"));
      String line;
      while ((line = br.readLine()) != null) {
        // System.out.println(line);
        arrayLine = line.split(":");
        Optional<Integer> age =
            arrayLine.length <= 2 ? Optional.empty() : Optional.of(Integer.parseInt(arrayLine[2]));
        // System.out.println(arrayLine[0] + arrayLine[1] + age );

        Person person =
            new Person(arrayLine[0], arrayLine[1].equals("") ? "Unknown" : arrayLine[1], age);
        personList.add(person);
      }
      br.close();
      personList.stream()
          .filter(
              person -> {
                if (person.getAge().isEmpty()) {
                  return false;
                } else {
                  return person.getAge().get() < 25;
                }
              })
          .forEach(p -> System.out.println(p));

    } catch (IOException e) {
      System.out.println(e + "Error trying to read file");
    }
  }
}
