class Dog {

  String name;
  String ownerName;
  // Constructor
  public Dog() {}

  public Dog(String name) {
    this.name = name;
  }

  public String getName() {
    if (name == null) {
      return "STREET DOG";
    }
    return name;
  }

  public void setOwnerName(String ownerName) {
    this.ownerName = ownerName;
  }

  public String getOwnerName() {
    if (ownerName == null) {
      return "NO OWNER";
    }
    return ownerName;
  }
}
