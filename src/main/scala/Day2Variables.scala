object Day2Variables extends App {
  val myName = "Evija"
  println(myName)

var myJob = "coordinator"
  println (myJob)

  myJob = "programmer"
  println(myJob)

  val myCar: String = "VW"
  println(myCar)

  val myNumber = 42

  val myPi = 3.1415

  val bigNum = 2_000_000_000
  println(bigNum)

  val reallyBigNum  = bigNum * 3
  println(reallyBigNum)

  println(Math.pow(2, 32))

  println(bigNum + 500_000_000)

  println(Math.pow(2, 31)) // maximum

  val myLongVal = 8_000_000_000L
  println(myLongVal)

  val isLate = true // boolean
  val isTired = false
  println(isLate, isTired)

  println(myName.getClass, myNumber.getClass, myPi.getClass, myJob.getClass)
}
