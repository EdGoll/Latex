import java.util.*;

public class Saxofon extends Instrumento {
    public void tocar() {
	System.out.println("Saxofon.tocar()");
    }
    public String tipo() { return "Saxofon"; }
    public void afinar() {}
}
