package contactApp;

/**
 * @author Eduardo Campos
 */

public class Contact {

  private String name;
  private String mobile;
  private String work;
  private String home;
  private String city;
  private int index;

  public Contact() {
  }

  public Contact(String name, String mobile, String work, String home, String city) {
    this.name = name;
    this.mobile = mobile;
    this.work = work;
    this.home = home;
    this.city = city;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getMobile() {
    return mobile;
  }

  public void setMobile(String mobile) {
    this.mobile = mobile;
  }

  public String getWork() {
    return work;
  }

  public void setWork(String work) {
    this.work = work;
  }

  public String getHome() {
    return home;
  }

  public void setHome(String home) {
    this.home = home;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public int getIndex() {
    return index;
  }

  public void setIndex(int index) {
    this.index = index;
  }

  @Override
  public String toString() {
    return index + ". <" + name + "> " + "(mobile='" + mobile + '\'' + ", work='" + work + '\''
        + ", home='" + home + '\'' + ", city='" + city + '\'' + ")";
  }
}
