object Ex11 extends App {
  var array2d = Array.ofDim[Int](2, 3)
  var array3d = Array.ofDim[Int](2, 3, 2)

  for {
    firstDim  <- 0 to 1
    secondDim <- 0 to 2
  } {
    array2d(firstDim)(secondDim) = 1
    print(array2d(firstDim)(secondDim) + " ")
  }

  print("\n")

  for {
    firstDim  <- 0 to 1
    secondDim <- 0 to 2 if secondDim != 1
    thirdDim  <- 0 to 1
  } {
    array3d(firstDim)(secondDim)(thirdDim) = 3
    print(array3d(firstDim)(secondDim)(thirdDim) + " ")
  }
}

/*
* Создаем два массива целочисленного типа array2d (2D), array3d (3D)
* Использую for-comprehension проходимся по обоим измерениям массива array2d (0 to 1 - синтаксический сахар для создания Range(0,1))
* присваиваем новые значения и выводим их в консоль
* Затем печатаем \n для переода на новую строку в консоли
* и делаем анлаогичные дейтсвия для array3d, однако в этот раз для всех чисел со второй координатой не равной 1
*/
