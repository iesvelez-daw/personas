package personas;

class Personas {

  public static void main (String[] args) {
    Persona jose = new Persona ();

    Persona juan;


    juan = new Persona ("Juan Farfan", 40, "Écija");
    Alumno pepito = new Alumno("Pepito Llamas", 20, "Córdoba");
    Profesor pepon = new Profesor("D. José Ramos", 40, "Informática");

    pepito.nombre = "Pepito Ramírez";
    pepito.saluda();
    pepon.saluda();


    Persona pepe = new Persona ("Pepe Gónzalez", 32);
    Persona ana  = new Persona ("Ana Pérez", 12);
    Persona eva  = new Persona ("Eva López", 10);

    Alumno jaime = new Alumno ("Jaime Pérez", 30, "1ESOA");


    pepe.nombre = "José Muñoz";
    pepe.edad = 190;

    pepe.saluda();
    eva.saluda();
    ana.saluda();

    jaime.saluda();

    juan.saluda();
    juan.saluda(true);
    jose.saluda();

    System.out.println ("\nHay " + Persona.cantidad + " personas"); 
    System.out.println ("\nHay " + Alumno.cantidad + " alumnos"); 

  }


}
