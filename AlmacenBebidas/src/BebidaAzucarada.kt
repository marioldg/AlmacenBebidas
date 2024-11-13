class BebidaAzucarada (
    idBebida:Int,
    cantidad:Double,
    precio:Double,
    marca:String,
    val porcentajeAzucar:Int,
    val tienePromocion:Boolean = false):Bebida(idBebida,cantidad,precio,marca){
    fun calcularPrecio():Double{
        return if(tienePromocion){
            precio*0.9
        }else{
            precio
        }
    }

    override fun toString(): String {
        return "${super.toString()},Azucar: $porcentajeAzucar%,Promocion: ${if (tienePromocion)"Si" else "No"}"
    }
}
