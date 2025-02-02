

fun main() {
    val repositorioCompras = RepositorioCompras()

    val cliente1 = Cliente("Juan Pérez", Domicilio("Av. Patatas con mayo", 123))
    val cliente2 = Cliente("María Gómez", Domicilio("Calle alonso", 456))

    repositorioCompras.agregarCompra(cliente1, 5, 150.0)
    repositorioCompras.agregarCompra(cliente2, 10, 200.0)

    println("Domicilios únicos de clientes:")
    repositorioCompras.domicilios().forEach { println(it.dirCompleta()) }
}