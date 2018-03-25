package personas;

class Alumno extends Persona {

  // Estado - Atributos
  String curso;
  static int cantidad = 0;



  // Comportamiento - Métodos
  Alumno (String nombre, int edad, String curso) {
    super.nombre = nombre;
    super.edad = edad;
    //super(nombre, edad);
    this.curso = curso;
    this.cantidad += 1;
  }


  @Override
  void saluda () {
    super.saluda();
    System.out.println ("Buenas, que tal?");
    System.out.println ("Soy alumno del grupo " + this.curso);
  }

}

