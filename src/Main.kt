//TIP Press <shortcut raw="SHIFT"/> twice to open the Search Everywhere dialog and type <b>show whitespaces</b>,
// then press <shortcut raw="ENTER"/>. You can now see whitespace characters in your code.
fun main() {
    // 1 часть
    var helloWorld: String
    val NUM: Int = 0
    var word: String = "6"
    helloWorld = word + NUM
    println(helloWorld + NUM + word)

    if (NUM < 0) {
        println("Вы сохранили отрицательное число")
    } else if (NUM > 0) {
        println("Вы сохранили сохранили положительное число")
    } else {
        println("    Вы сохранили ноль")
    }

    // 3 часть
    var sun: Array<Double> = arrayOf(1.0, 2.0, 3.0, 4.0, -5.0, -6.0, 2.0, 1.0, -4.0, 0.5, -3.0, 4.0, -7.0, 9.0, -9.0)
    var gfd: Boolean = false
    var jhg: Double = 0.0
    var uyt: Int = 0
    for (i in sun) {
        if (i < 0) {
            gfd = true
        }

        if (gfd == true && i > 0) {
            jhg += i
            uyt += 1
        }
    }
    println(jhg / uyt)

    // 2 часть
    println(vae(25, 78.0))
    println(vae(2, -98.0))
    println(vae(5, 15.0))
    println(vae(259, 38.0))
    println(vae(245, 68.0))
    println(vae(75, 10.0))
}

fun vae(age: Int, asdf: Double): String {
    if (age in 20..45 && asdf in -20.0..30.0) {
        return "Можно идти гулять"
    }
    if (age < 20 && asdf in 0.0..28.0) {
        return "Можно идти гулять"
    }
    if (age > 40 && asdf in -10.0..25.0) {
        return "Можно идти гулять"
    } else {
        return "оставайся дома"
    }
}