class Proyecto{
    var id=0;
    var nombre ="";
    var descripcion="";
    var fecha="";
    var tecnologias="";
    var rutaFoto="";


    constructor(
        id:Int,
        nombre: String,
        descripcion: String,
        fecha: String,
        tecnologias: String,
        rutaFoto: String,

    ) {
        this.id = id
        this.nombre = nombre
        this.descripcion = descripcion
        this.fecha = fecha
        this.tecnologias = tecnologias
        this.rutaFoto = rutaFoto

    }
}