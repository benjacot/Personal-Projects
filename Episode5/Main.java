class Main {
  public static void main(String[] args) {
    // Dog Fido
    Dog fido = new Dog("Fido");
    fido.setOwnerName("Frank");

    // Dog Goofy
    Dog goofy = new Dog("Goofy");
    goofy.setOwnerName("Mickey");

    // Dog Spot
    Dog spot = new Dog("Spot");
    /* spot has no owner */

    // Street Dog (no name, no owner)
    Dog streetDog = new Dog();


    // Print Fido
    System.out.print(fido.getName() + " ");
    System.out.print("is owned by " + fido.getOwnerName());
    // Print separator line
    System.out.println();
    // Print Goofy
    System.out.print(goofy.getName() + " ");
    System.out.print("is owned by " + goofy.getOwnerName());
    // Print separator line
    System.out.println();
    // Print Spot
    System.out.print(spot.getName() + " ");
    System.out.print("is owned by " + spot.getOwnerName());
    // Print separator line
    System.out.println();
    // Print Street Dog
    System.out.print(streetDog.getName() + " ");
    System.out.print("is owned by " + streetDog.getOwnerName());
  }
}
