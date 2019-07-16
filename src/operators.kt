fun main(){
    println("2 > 1 is ${2 > 1}")
    println("2 < 1 is ${2 < 1}")
    println("1 >= 1 is ${1 >= 1}")

    println("1 == 1 is ${1 == 1}")
    println("1 == 2 is ${1 == 2}")
    println("1 != 2 is ${1 != 2}")
//    Logical NOT Operator
    println("!(2 > 1) is ${!(2 > 1)}")
//    Logical AND Operator
    println("true && false = ${true && false}")
    /*
    * true && true = true
    * true && false = false
    * false && true = false
    * false && false = false
    * */
//    Logical OR Operator
    println("true || false = ${true || false}")
    /*
    * true || true = true
    * true || false = true
    * false || true = true
    * false || false = false
    * */
    val condition = (2 > 1) || (3 > 2) && (2 > 3)
    println(condition)

}
/*
*   Output =>
* 2 > 1 is true
2 < 1 is false
1 >= 1 is true
1 == 1 is true
1 == 2 is false
1 != 2 is true
!(2 > 1) is false
true && false = false
true || false = true
true
* */