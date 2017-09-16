  public static void main(String[] args) {
    // Declarar un Arreglo SIN INSTANCIAS es valido en Clases Abstractas
    Instrumento[] orquesta = new Instrumento[5];
    // Generar una INSTANCIA de una la Clase Abstracta no es valido
   // Instrumento nuevo = new Instrumento();
    int i = 0;
    orquesta[i++] = new Guitarra();
    orquesta[i++] = new Piano();
    orquesta[i++] = new Saxofon();
    orquesta[i++] = new Guzla();
    orquesta[i++] = new Ukelele();
    afinarTodo(orquesta);
  }
}
