fun task5() {
    val moves = "D2-D4;0"
    val result = moves.split("-",";")
    val from = result[0]
    val to = result[1]
    val step = result[2]
    println(from)
    println(to)
    println(step)
}

fun main(){
    task5()
}