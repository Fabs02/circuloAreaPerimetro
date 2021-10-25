fun main(args: Array<String>) {

    var diametro = 0
    var pi = 3.14
    var raio = 0
    var area = 0.0
    var perimetro = 0.0

    print("Digite o diâmetro do circulo: ")
    diametro = readLine()!!.toInt()

    raio = diametro / 2
    raio.toDouble()

    area = pi * (raio * raio)
    area.toDouble()

    perimetro = 2 * pi * raio
    perimetro.toDouble()

    println("A área do circulo é: $area, e o perimetro do circulo: $perimetro")
}