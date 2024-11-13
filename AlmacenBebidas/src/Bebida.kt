open class Bebida (
    val idBebida: Int,
    val cantidad:Double,
    val precio:Double,
    val marca:String

    ){
    override fun toString(): String {
        return "ID:$idBebida, Cantidad: $cantidad L,Precio:$precio EUROS, Marca: $marca"
}
}