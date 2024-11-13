class Almacen {
    private val estanteria=Array(5){ arrayOfNulls<Bebida>(5) }
    private val bebidas= mutableMapOf<Int,Bebida>()

    fun agregarBebida(bebida: Bebida, fila: Int, columna:Int){
        if(bebidas.containsKey(bebida.idBebida)){
            println("Bebida con ID ${bebida.idBebida} ya existe")
            return
        }

        if(estanteria[fila][columna]!=null){
            println("Espacio ocupado en la estanteria en posicion($fila,$columna).")
            return
        }
    }

    fun eliminarBebida(idBebida: Int){
        val bebida= bebidas.remove(idBebida) ?: run {
            println("No se encontro bebida con su ID $idBebida")
            return
        }
        for(i in 0 until 5){
            for(j in 0 until 5){
                if(estanteria[i][j] == bebida){
                    estanteria[i][j] == null
                    println("Bebida con ID $idBebida eliminada")
                    return
                }
            }
        }
    }

    fun mostrarBebida(idBebida: Int){
        val bebida= bebidas[idBebida]
        if(bebida!=null){
            println(bebida)
        }else{
            println("No se encontro bebida con su ID $idBebida")
        }
    }

    fun calcularPrecioTodasLasBebidas():Double{
        var total=0.0
        bebidas.values.forEach{
            total += if( it is BebidaAzucarada){
                it.calcularPrecio() * it.cantidad
            }else{
                it.precio * it.cantidad
            }
        }
        return total
    }

    fun calcularPrecioPorMarca(marca: String): Double {
        var total = 0.0
        bebidas.values.filter { it.marca == marca }.forEach {
            total += if (it is BebidaAzucarada) {
                it.calcularPrecio() * it.cantidad
            } else {
                it.precio * it.cantidad
            }
        }
        return total
    }

    fun calcularPrecioPorColumna(columna: Int):Double{
        if(columna !in 0..4){
            println("Columna fuera de rango")
            return 0.0
        }
        var total=0.0
        for(i in 0 until 5){
            estanteria[i][columna]?.let {
                total+=if(it is BebidaAzucarada){
                    it.calcularPrecio()*it.cantidad
                }else{
                    it.precio*it.cantidad
                }
            }
        }
        return total
    }



}