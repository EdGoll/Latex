import java.util.*;

public public class MainMusica {

    // No importa el tipo de Instrumento,
    // seguira funcionando debido a Polimorfismo:
  static void afinar(Instrumento i) {
	   i.tocar();
  }

  static void afinarTodo(Instrumento[] e) {
	   for(int i = 0; i < e.length; i++)
	     afinar(e[i]);
     }
  }
