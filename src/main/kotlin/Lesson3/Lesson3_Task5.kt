fun task5() {
    val moves = "D2-D4;0"
    val from = moves.substring(0,2)
    val to = moves.slice(3 .. 4)
    val move = moves.substring(6)
println(from)
    println(to)
    println(move)
}