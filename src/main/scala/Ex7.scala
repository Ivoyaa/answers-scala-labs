object Ex7 extends App {
  class Account(n: Double) {
    var num: Double = 0.0

    def add() = num + n
  }

  object Account {
    var number = 5

    def apply(n: Double) = new Account(n)
  }

  val acc = Account(20.0)
  println(acc.num)
  println(acc.add())
  println(Account.number)
}

/*
*  Ex7 extends App - точка входа в приложение
* Account - класс
* num - мутабельное поле класса Account типа Double
* n - иммутабельное поле класса Account типа Double
* add - метод без параметров, прибавляющее к полю num - число n
*
* object Account - объект компаньон класса Account, содержит поле мутабельное поле типа Int
* и определяет метод apply - синтаксический сахар, позволяющий не писать ключевое слово new при создании экземплера класса
*
* далее мы создаем экземпляр класс и определяем его в иммутабельном поле acc и
* в println-ах вызываем геттер поля num, вызыввем метод add() и вызываем поле объекта-компаньона number
*
* */