import scala.math._

object Ex8 extends App {

  class Circle(radius: Double) {
    def area: Double = Circle.calculateArea(radius)
  }

  object Circle {
    def calculateArea(radius: Double): Double =
      Pi * pow(radius, 2)
  }

  val circle = new Circle(5.0)
  println(circle.area)
  println(Circle.calculateArea(5.0))
}

/*
* Статический метод - это метод объявляемый в объекте или в объекте-спутнике.
* Для его использования не нужно создавать экземпляров классов.
* Примером такого метода может служить метод calculateArea, объявленный в
* объекте-спутнике класса Circle
* Для вычисления площади импортируем из стандартной библиотеки scala.math поле Pi
* и функцию pow, которые тоже являются статическими методами, объявленными на объекте math
* Распечатаем результат методом println, статическим методом, определенным на объекте Predef
 */
