object ControlStructures extends App {

  //else-if
  def partyAtHome(guests: Int, drinkAvailable: Boolean): Boolean =
    if guests > 15 then false
    else if drinkAvailable && guests < 14 then true;
    else false;

  println(partyAtHome(20, true));

  //pattern matching
  def greeting(name : String) : String = name match
    case "sejal" | "ami" => s"Hii $name"
    case _ => "Hii what's your name?"

  println(greeting("ami"));

  //challenge using if-else
  def competition1(result : Int): String =
    if result == 1 then "gold"
    else if result == 2 then "silver"
    else if result == 3 then "bronze"
    else "well done!"

  println(competition1(2));

  //challenge using pattern matching
  def competition2(result: Int) : String = result match
    case 1 => "gold"
    case 2 => "silver"
    case 3 => "bronze"
    case _ => "well done!"

  println(competition2(2));

}
