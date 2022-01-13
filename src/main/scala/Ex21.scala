object Ex21 extends App {
  val list = List(1, 2, 3, 4, 5)

  val (lessThan10, higherThan10) = list.partition(num => num * num <= 10)

  println(lessThan10)
  println(higherThan10)
}

/*
 * Создаем изначальный список list
 *
 * Метод partition на этом списке принимает функцию из Int в Boolean, по этой функции
 * элементы списка делятся на два списка, для которых условие выполняется и не выполняется.
 * Этот метод вохвращает Tuple2[List[Int], List[Int]]
 *
 * Здесь исплользуем метод unapply на Tuple2 ("val (..., ...) = ..") для разделения сразу на две переменных - lessThan10 и higherThan10
 *
 *  */
