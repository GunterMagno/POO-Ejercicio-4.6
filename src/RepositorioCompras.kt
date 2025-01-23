class RepositorioCompras() {

    private val compras = mutableListOf<Compra>()

    fun agregarCompra(compra: Compra){compras.add(compra)}

    fun agregarCompra(cliente: Cliente,dia :Int,total:Double){compras.add(Compra(cliente,dia,total))}

    fun agregarCompra(nombre :String, calle :String, numero :Int, dia :Int, total :Double)
    {compras.add(Compra(Cliente(nombre,Domicilio(calle,numero)),dia,total))}

    fun domicilios(): List<Domicilio>{
        val conjuntoDomicilio = mutableSetOf<Domicilio>()
        for (compra in compras){conjuntoDomicilio.add(compra.cliente.domicilio)}
        return conjuntoDomicilio.toList()
    }

    fun domiciliosV1() = compras.map { it.cliente.domicilio }.toSet().toList()

}