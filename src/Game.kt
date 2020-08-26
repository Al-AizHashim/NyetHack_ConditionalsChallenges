fun main() {
    var healthPoints = 100
    val playerName = "Madrigal"
    val isBlessed = true
    when(healthPoints){
        100-> println("$playerName is in excellent condition!")
        in 90..99-> println("$playerName has a view scratches.")
        in 75..89->{
            if (isBlessed) {
                println("$playerName has some minor wounds but is healing quite quickly")
            } else { println("$playerName has some minor wounds.")
            }
        }
        in 15..74-> println("$playerName looks pretty hurt")
        in 0..14-> println("$playerName is in awful condition")
    }
    println("The plyer name is: $playerName and the health points is:$healthPoints")

}