package TestOtionals;

import java.util.Optional;

public class TestOptional {
  public static void main(String args[]) {
    String text = "this is a test text";
    //text = null;

    // Instanciamos Optional para evaluar valores en variables por si llegan null
    Optional<String> optionalValue = Optional.ofNullable(text);
    var name = optionalValue.orElse("Unknown");
    System.out.println(name);
    // String vacio "" no lo toma como null.
    // Utilizamos isEmpty() para evaluar si llega null.
    System.out.println(optionalValue.isEmpty() ? "is null" : text);
  }
}
