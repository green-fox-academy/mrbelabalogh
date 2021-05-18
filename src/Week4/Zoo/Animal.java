package Week4.Zoo;

public abstract class Animal {
  protected String name;

  protected Animal() {
  }

  protected String getName() {
    return name;

  }

  protected void setName(String name) {
    if (name == "Mammal") {
      throw new IllegalArgumentException();
    }
    this.name = name;
  }

  protected String breed() {
    return null;
  }
}
