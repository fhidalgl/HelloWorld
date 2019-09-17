object Hello extends App {
  def square (x: Double):Double = {
    val y = x + 1

    y + y
  }

  println("Hello, " + "Scala!")

  println("Hello, Scala!".size)

  println(1.to(10))

  println("Hola mundo!".toUpperCase)

  val radius = 10
  val pi = 3.1415998

  println("Area = " + pi * radius * radius)

  println( square(2))
}
