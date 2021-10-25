fun main(args: Array<String>) {

    var diametro = 0
    var pi = 3.14
    var raio = 0
    var area = 0.0
    var perimetro = 0.0

    println("Digite o diâmetro do circulo: ")
    diametro = readLine()!!.toInt()

    raio = diametro / 2

    area = pi * (raio * raio)
    perimetro = 2 * pi * raio
}