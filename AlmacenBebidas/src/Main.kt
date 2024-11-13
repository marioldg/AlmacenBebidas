fun main() {
    // Crear el almacén
    val almacen = Almacen()

    // Crear bebidas
    val aguaMineral = AguaMineral(1, 2.0, 1.5, "AguaPura", "Manantial A")
    val cocaCola = BebidaAzucarada(2, 3.0, 1.2, "Coca-Cola", 10, true)  // Con promoción
    val fanta = BebidaAzucarada(3, 4.0, 1.1, "Fanta", 12, false)

    // Agregar bebidas al almacén
    almacen.agregarBebida(aguaMineral, 0, 0)
    almacen.agregarBebida(cocaCola, 1, 1)
    almacen.agregarBebida(fanta, 2, 2)

    // Mostrar una bebida
    almacen.mostrarBebida(2)


    println("Precio total de todas las bebidas: ${almacen.calcularPrecioTodasLasBebidas()} €")


    println("Precio total de la marca Coca-Cola: ${almacen.calcularPrecioPorMarca("Coca-Cola")} €")


    println("Precio total de la columna 1: ${almacen.calcularPrecioPorColumna(1)} €")

   
    almacen.eliminarBebida(2)
}
