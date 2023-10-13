object Enum extends App {
  enum TrafficLight:
    case Red, Green, Amber

  import TrafficLight.*
  def defineSignal(light: TrafficLight): String =
    if light == Red then "stop"
    else if light == Green then "Go"
    else "ready"

  println(defineSignal(Red))

  def defineSignal2(light: TrafficLight): String = light match
    case TrafficLight.Red => "stop"
    case TrafficLight.Green => "go"
    case TrafficLight.Amber => "ready"

  println(defineSignal2(Green))

  //Enum with Parameters
  enum Health(meters: Int):
    case Swim extends Health(200)
    case Run extends Health(300)
    case Walk  extends Health (200)

  import Health.*
  def competition(health: Health): String = health match
    case Health.Swim => "nice swimmer"
    case Health.Run => "nice runner"
    case Health.Walk => "walk fast"

  println(competition(Swim))

  //challenge
  enum UnitedKingdom:
    case England, Wales, Scotland

  import UnitedKingdom.*
  def whereIam(city : UnitedKingdom): String = city match
    case UnitedKingdom.England => "I am in England"
    case UnitedKingdom.Wales => "I am in Wales"

  println(whereIam(Wales))

  def where(city: UnitedKingdom): String =
    if city == Scotland then "I am in scotland"
    else "byee"

  println(where(Scotland))

}
