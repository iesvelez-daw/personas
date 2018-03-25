package personas;

class Profesor extends Persona {

    // Estado - Atributos
    String especialidad;

    // Comportamiento - Métodos
    Profesor (String nombre, int edad, String especialidad){
      this.nombre = nombre;
      this.edad = edad;
      this.especialidad = especialidad;
    }
}
