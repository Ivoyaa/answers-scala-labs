object Ex11 extends App {
  var array2d = Array.ofDim[Int](2, 3)
  var array3d = Array.ofDim[Int](2, 3, 2)

  for {
    firstDim  <- 0 to 1
    secondDim <- 0 to 2
  } {
    array2d(firstDim)(secondDim) = 1
    println(s"Arr2D($firstDim)($secondDim): ${array2d(firstDim)(secondDim)}")
  }

  for {
    firstDim  <- 0 to 1
    secondDim <- 0 to 2
    thirdDim  <- 0 to 1
  } {
    if (secondDim != 1) array3d(firstDim)(secondDim)(thirdDim) = 3
    else array3d(firstDim)(secondDim)(thirdDim) = 2
    println(s"Arr3D($firstDim)($secondDim)($thirdDim): ${array3d(firstDim)(secondDim)(thirdDim)}")
  }
}

/*
 Создаем два массива целочисленного типа array2d (2D), array3d (3D)
 Использую for-comprehension проходимся по обоим измерениям массива array2d (0 to 1 - синтаксический сахар для создания Range(0,1))
 присваиваем новые значения и выводим их в консоль

 Делаем анлаогичные дейтсвия для array3d, в этот раз для всех чисел со второй координатой не равной 1 присваиваем число 3 иначе присваиваем число2
 */
