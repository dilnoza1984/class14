class Main {
  public static void main(String[] args) {

    // call your method here

    whatYouCanDo(-12);

  }

  public static void whatYouCanDo(int age) {

    if(age<=0){
      System.out.println("Age cannot be 0 or negative.");
    }else if (age < 16) {
      System.out.println("You can't drive.");
    } else if (age <= 17) {
      System.out.println("You can drive but not vote.");
    } else if (age <= 24) {
      System.out.println("You can vote but not rent a car.");
    } else if (age <= 120) {
      System.out.println("You can do pretty much anything.");
    } else {
      System.out.println("Non-human age.");
    }
  }
  // create your method here
}