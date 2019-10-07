public class Ej23Tema4 {
  public static void main (String [] args) {
    
    System.out.println("Introduzca:");
    System.out.println("Base imponible:");
    double baseImponible = Double.parseDouble(System.console().readLine());
    
    System.out.println("Tipo de IVA (general, reducido o superreducido):");
    String tipoIVA = System.console().readLine();
    
    System.out.println("Código promocional (nopro, mitad, meno5 o 5porc):");
    String codigoPromo = System.console().readLine();
    
    int IVA = 0;
    
    switch(tipoIVA) {
      
      case "general":
        IVA = 21;
        break;
        
      case "reducido":
        IVA = 10;
        break;
        
      case "superreducido":
        IVA = 4;
        break;
        
      default:
        System.out.println("Error");
    }
    
    double iva = baseImponible * IVA / 100;
    double precio = baseImponible + iva;
    
    double descuento = 0;
    
    switch(codigoPromo) {
      case "nopro":
        break;
        
      case "mitad":
        descuento = precio / 2;
        break;
        
      case "meno5":
        descuento = 5;
        break;
        
      case "5porc":
        descuento = precio * 0.05;
        break;
        
      default:
        System.out.println("Error");
    }
    
    double total = precio - descuento;
    
    System.out.println("Base Imponible " + baseImponible);
    System.out.println("Tipo de IVA " + IVA);
    System.out.println("Aumento por el IVA " +  iva);
    System.out.println("Precio con IVA " + precio);
    System.out.println("Descuento por la promoción " + descuento);
    System.out.println("Total " + total);
  }
}
