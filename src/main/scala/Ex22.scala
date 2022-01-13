object Ex22 extends App {
  val list = List(-1, 2, 10, -50, -500, 25)

  println(list.exists(_.abs > 100))
}

/*
* метод exists возвращает Boolean:
* true если хотя бы 1 элемент соответствует заданному условию и
* false - если ни один не соответствует
 */
