import java.util.*;

public abstract class Instrumento {
    public abstract void tocar();
    public String tipo() {
	return "Instrumento";
    }
    public abstract void afinar();
}
