object Collections extends App {

  //case class implementation
  case class Employee(name: String, age: Int);

  //create object
  val developer = new Employee("sheetal", 23);
  println(developer)
  println(developer.name)

  //Equals, hashcode, toString
  val devrel = new Employee("aditya", 24)
  println(devrel)
  println(devrel.toString)

  val developer1 = new Employee("sheetal", 23)
  println(developer == developer1) //true because hashcode is gonna check which is same for case
  // class if you remove case keyword it is gonna be false

  //Companion objects
  val analyst = Employee("aadi", 30)
  println(analyst) // without new keyword

  //Case object (not companion objects)
  case object Person {
    def details = "details!"
  }
  println(Person.details)

}
