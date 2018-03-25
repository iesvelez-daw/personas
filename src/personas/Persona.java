package personas;

class Persona {

/*
-----------------------------------------------------------------
   ESTADO: Atributos (Variables)
-----------------------------------------------------------------
*/
  protected String nombre;
  protected int edad;
  protected String localidad;
  protected static int cantidad = 0;



/*
-----------------------------------------------------------------
   COMPORTAMIENTO: Métodos (Funciones)
-----------------------------------------------------------------
*/

Persona(){
    cantidad += 1;
  }


Persona (String nombre, int edad) {
    this.nombre = nombre;
    this.edad = edad;
    cantidad += 1;
  }


  Persona (String nombre, int edad, String localidad) {
    this(nombre, edad);
    this.localidad = localidad;
  }



  void saluda () {
    System.out.println ("Hola, me llamo " + this.nombre + ", y tengo " + this.edad + " años y vivo en " + this.localidad);
  }

  void saluda (boolean localidad) {
    if (localidad) 
      System.out.println ("Hola, me llamo " + this.nombre + ", y tengo " + this.edad + " años, y vivo en " + this.localidad);
    else
      System.out.println ("Hola, me llamo " + this.nombre + ", y tengo " + this.edad + " años");

 }


}
