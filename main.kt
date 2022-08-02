class Choosing a Candy Based on Craving {
}


class Chocolates()

fun askChocolate() {
    majorBrands = ["3 Musketeers","Almond Joy","Baby Ruth","Butterfinger","Cadbury","Heath","Kinder","Lindor",
    "M&M's","Milky Way","Reese's","Snicker's","Toblerone","Twix"]
    for (m in majorBrands) {
        println(m)
    }
    val chosenChocolate = readLine()
    println("I have decided to pick" + $chosenChocolate + ".")
}