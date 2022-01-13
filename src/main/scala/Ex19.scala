object Ex19 extends App {
  val strWithDigits = "11fg rgre 45 **9 sdfv 343### "
  val strWithoutDigits = "dkmefwmfm wf $$# dfdf"

  val resStr1 = strWithDigits.forall(!_.isDigit)
  val resStr2 = strWithoutDigits.forall(!_.isDigit)

  println(strWithDigits + " " + resStr1)
  println(strWithoutDigits + " " + resStr2)
}
