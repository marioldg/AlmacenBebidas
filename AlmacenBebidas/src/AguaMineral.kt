class AguaMineral (
    idBebida:Int,
    cantidad:Double,
    precio:Double,
    marca:String,
    val origen:String):Bebida(idBebida,cantidad,precio,marca){
    override fun toString(): String {
        return "${super.toString()},Origen:$origen"
    }
}