fun main() {
    var healthPoints = 100
    val playerName = "Madrigal"
    val isBlessed = true
    val isImmortal = false
    var auraColor:String?=null
    val karma = (Math.pow(Math.random(), (110 - healthPoints) / 100.0) * 20 ).toInt()
    when(karma){
        in 0..5->  auraColor="red"
        in 6..10->  auraColor="oringe"
        in 11..15->  auraColor="purple"
        in 16..20->  auraColor="green"
    }
    val auraVisible = isBlessed && healthPoints > 50 || isImmortal
    if (auraVisible) {
        println("The aura color is: $auraColor ")
    } else {
        println("The aura color is: NONE")
    }



}
