
import java.io.*;
public class Test {
 public void myMethod1() {
  try{
     myMethod2();
  }catch(ArithmeticException ex){
    System.out.println("Division por Cero. Ocurrida en myMethod2");
  }finally{
    System.out.println("Siempre entro aqui");
  }
 }
