/*
package Week4.CloneTest;

import java.util.ArrayList;

class Programmer implements Cloneable {

  private static final Logger logger = LoggerFactory.getLogger(Programmer.class);
  private String name;
  private int age;
  private List certifications;

  public Programmer(String name, int age) {
    this.name = name;
    this.age = age;
    this.certifications = new ArrayList();
  }

  public int getAge() {
    return age;
  }


  public void setAge(int age) {
    this.age = age;
  }


  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public void addCertificates(String certs) {
    certifications.add(certs);
  }


  @Override
  public String toString() {
    return String.format("%s, %d, Certifications: %s", name, age, certifications.toString());
  }


  @Override
  protected Programmer clone() {
    Programmer clone = null;
    try {
      clone = (Programmer)
          super.clone();
      clone.certifications = new ArrayList(certifications);

      //deep copying }catch(CloneNotSupportedException cns){ logger.error("Error while cloning programmer", cns); } return clone; } }

      //Read more: https://javarevisited.blogspot.com/2015/01/java-clone-tutorial-part-2-overriding-with-mutable-field-example.html#ixzz6tL4RxmzJ
    } catch (CloneNotSupportedException e) {
      e.printStackTrace();
    }
    return clone;
  }
}


 */