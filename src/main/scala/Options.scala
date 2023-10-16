object Options extends App {
  //Options(Some or None) - return type of find
  val lst = List(1, 2, 3)
  println(lst.find(_ > 5)) //None
  println(lst.find(_ > 1)) //Some
  println(lst.find(_ > 1).get) //Some values
  println(lst.isEmpty)

  //if it is set to Some value
  val middleName: Option[String] = Some("Muna")
  println(middleName.map(word => word.toUpperCase()))

  //if it is set to None value
  val name: Option[String] = None
  println(name.map(word => word.toUpperCase()))

  //flat map
  case class Rating(googleRating: Option[Int])
  case class Film(name: String, rating: Option[Rating])

  val film = Film("Sultan", Some(Rating(Some(5))))
  println(film.name)
  println(film.rating)
  println(film.rating.map(rating => rating.googleRating))

  //we don't want to see option of option of something
  println(film.rating.flatMap(rating => rating.googleRating))

  //Comprehensions
  case class Rating2(googleRating: Option[Int], netflixRating: Option[Int])
  case class Film2(name: String, rating: Option[Rating2])

  val temp: Film2 = Film2("Sultan", Some(Rating2(Some(2), Some(4)))) // what if rating is None

  val averageRating = for {
    sultan <- temp.rating
    google <-  sultan.googleRating
    netflix <- sultan.netflixRating
    average = (google + netflix) / 2
  } yield average

  println(averageRating)

  //challenge
  case class TicketPrice(standardTicketPrice: Int, firstClassTicketPrice: Option[Int])
  //using flat map
  def getFirstClassTicketPrice(ticketPrice: Option[TicketPrice]): Option[Int] =
    ticketPrice.flatMap(tp => tp.firstClassTicketPrice)

  val londonToParis = TicketPrice(20, Some(200))
  println(getFirstClassTicketPrice(Some(londonToParis)))

  //using comprehensions
  def getFirstClassTicketPrice2(ticketPrice: Option[TicketPrice]): Option[Int] =
    for {
      p <- ticketPrice
      firstClass <- p.firstClassTicketPrice
    } yield firstClass
  end getFirstClassTicketPrice2

  println(getFirstClassTicketPrice2(Some(londonToParis)))

}
