object Ex19 extends App {
  val strWithDigits = "11fg rgre 45 **9 sdfv 343### "
  val strWithoutDigits = "dkmefwmfm wf $$# dfdf"

  val resStr1 = strWithDigits.forall(!_.isDigit)
  val resStr2 = strWithoutDigits.forall(!_.isDigit)

  println(strWithDigits + " " + resStr1)
  println(strWithoutDigits + " " + resStr2)
}

/*
* Определяем две строки с только символами и с цифрами
*
* Строку можно рассматривать как List[Char] и использовать на ней метод forall, принимающий функцию Char => Boolean
* если для всех элементов списка выполняется это условие, тогда возвращается true, иначе false. Здесь же используем сокращенное обозначение
* для функции - вместо char => !char.isDigit пишем !_.isDigit
*
* Метод isDigit проверяет является ли Char цифрой
*/