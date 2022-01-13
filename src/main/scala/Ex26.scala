object Ex26 extends App {

  def removeFirstAndLast(list: List[Any]): List[Any] =
    list match {
      case head :: Nil => List()
      case head :: tail => tail.reverse.tail.reverse
      case _ => List()
    }

  val list = List(1, 2, 3, 4, 5)

  println(removeFirstAndLast(list))
  /*
  * Первый случай - случай списка из одного элемента - его нужно рассматривать отдельно, т.к. метод
  * tail на Nil выбросит ошибку
  * Второй случай - список из как минимум 2 элементов, tail - список с как минимумом 1 элементом
  * Третий случай - пустой список
   */
}
