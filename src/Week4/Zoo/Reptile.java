package Week4.Zoo;

public class Reptile extends Animal{

  protected Reptile(String name) {
    this.name = name;
  }

  protected String breed() {
    return "laying eggs";
  }
}
