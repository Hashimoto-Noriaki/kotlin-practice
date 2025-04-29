fun main(){
    val animal1 = listOf("犬","猫")
    val animal2 = listOf("サル","コアラ")
    val parent_animal = listOf(animal1,animal2)

    println(parent_animal[0][0])
    println(parent_animal[0][1])
    println(parent_animal[1][0])
    println(parent_animal[1][1])
}