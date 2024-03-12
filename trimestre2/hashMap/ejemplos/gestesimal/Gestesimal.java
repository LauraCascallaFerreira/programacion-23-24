package trimestre2.hashMap.ejemplos.gestesimal;

import java.util.ArrayList;
import java.util.Scanner;

public class Gestesimal {

    static Scanner s = new Scanner(System.in);
    static ArrayList<Articulo> articulos = new ArrayList<Articulo>();

	public static void main(String[] args) {

	    // Inicializa el array
	    

	    int opcion;
	    int stockIn;
	    double precioDeCompraIn;
	    double precioDeVentaIn;
	    String codigoIn = "";
	    String descripcionIn;

	    Scanner s = new Scanner(System.in);

	    // MENU ///////////////////////////////////////////////////////////////////
	    do {
	      pintaTitulo("G E S T E S I M A L");
	      System.out.println("1. Listado");
	      System.out.println("2. Alta");
	      System.out.println("3. Baja");
	      System.out.println("4. Modificación");
	      System.out.println("5. Entrada de mercancía");
	      System.out.println("6. Salida de mercancía");
	      System.out.println("7. Salir");
	      System.out.print("Introduzca una opción: ");
	      opcion = Integer.parseInt(s.nextLine());
	      
	      switch (opcion) {

	        // LISTADO ////////////////////////////////////////////////////////////
	        case 1:
	          pintaTitulo("LISTADO");
	          for(Articulo a : articulos) {
	              System.out.println(a);
	          }
	        break;

	        // ALTA ///////////////////////////////////////////////////////////////
	        case 2:
	          pintaTitulo("NUEVO ARTÍCULO");

                codigoIn=peticionCodigo();
	            
                System.out.println("DATOS DEL NUEVO ARTICULO");
                System.out.println("Código válido: "+codigoIn);

	            System.out.print("Descripcion: ");
	            descripcionIn = s.nextLine();

	            System.out.print("Precio de compra: ");
	            precioDeCompraIn = Double.parseDouble(s.nextLine());

	            System.out.print("Precio de venta: ");
	            precioDeVentaIn = Double.parseDouble(s.nextLine());
                
	            System.out.print("Stock: ");
	            stockIn = Integer.parseInt(s.nextLine());

	            // Crea el nuevo artículo
	            articulos.add(new Articulo(codigoIn, descripcionIn, precioDeCompraIn,
                precioDeVentaIn, stockIn));
	          //}
	        break;

	        // BAJA ///////////////////////////////////////////////////////////////
	        case 3:
	          pintaTitulo("BAJA");
	          
	          System.out.print("Por favor, introduzca el código del artículo: ");
	          codigoIn = s.nextLine();
	    
	          if (!existeCodigo(codigoIn)) {
	            System.out.println("Lo siento, el código introducido no existe.");
	          } else {
				//COMO OBTENGO UN OBJETO PARA UN CODIGO DETERMINADO
	            articulos.remove(posicionConCodigo(codigoIn));
	            System.out.println("Artículo borrado. Con codigo: "+codigoIn);  
	          }
	        break;
	          
	        // MODIFICACIÓN ///////////////////////////////////////////////////////
	        case 4:
	          pintaTitulo("MODIFICACIÓN");
	          
	          System.out.print("Por favor, introduzca el código del artículo: ");
	          codigoIn = s.nextLine();

	          if (!existeCodigo(codigoIn)) {
	            System.out.println("Lo siento, el código introducido no existe.");
	          } else {
				int i=posicionConCodigo(codigoIn);
				Articulo prov=articulos.get(i);
	            System.out.print("Introduzca los nuevos datos del artículo");
	            System.out.println(" o INTRO para dejarlos igual.");

				//NO DEJO TOCAR EL CODIGO
	            System.out.println("Código: " + prov.getCodigo());

	            
	            System.out.println("Descripción: " + prov.getDescripcion());
	            System.out.print("Nueva descripción: ");
	            descripcionIn = s.nextLine();
	            if (!descripcionIn.equals("")) {
	              prov.setDescripcion(descripcionIn);
	            }
	            
	            System.out.println("Precio de compra: " + prov.getPrecioDeCompra());
	            System.out.print("Nuevo precio de compra: ");
	            String precioDeCompraIntroducidoString = s.nextLine();
	            if (!precioDeCompraIntroducidoString.equals("")) {
	              prov.setPrecioDeCompra(Double.parseDouble(precioDeCompraIntroducidoString));
	            }
	            System.out.println("Precio de venta: " + prov.getPrecioDeVenta());
	            System.out.print("Nuevo precio de venta: ");
	            String precioDeVentaIntroducidoString = s.nextLine();
	            if (!precioDeVentaIntroducidoString.equals("")) {
	             	prov.setPrecioDeVenta(Double.parseDouble(precioDeVentaIntroducidoString));
	            }
	            System.out.println("Stock: " + prov.getStock());
	            System.out.print("Nuevo stock: ");
	            String stockIntroducidoString = s.nextLine();
	            if (!stockIntroducidoString.equals("")) {
	              prov.setStock(Integer.parseInt(stockIntroducidoString));
	            }
				articulos.set(i, prov);
	          }
	        break;
	  
	        // ENTRADA DE MERCANCÍA /////////////////////////////////////////////
	        case 5:
	            pintaTitulo("ENTRADA DE MERCANCÍA");
	            
	            System.out.print("Por favor, introduzca el código del artículo: ");
	            codigoIn = s.nextLine();
	        
	            if (!existeCodigo(codigoIn)) {
	              System.out.println("Lo siento, el código introducido no existe.");
	            } else {
	              int i = posicionConCodigo(codigoIn);
				  Articulo prov=articulos.get(i);

	              System.out.println("Entrada de mercancía del siguiente artículo: ");
	              System.out.println(prov);
				  
	              System.out.print("Introduzca el número de unidades que entran: ");
	              String stockIntroducidoString = s.nextLine();
	              prov.setStock(
	                Integer.parseInt(stockIntroducidoString) + prov.getStock());//comprobar
	              System.out.println("La mercancía ha entrado en el almacén.");  
				  System.out.println("Nuevo stock: "+prov.getStock());

				  articulos.set(i, prov);
	            }
	            
	        break;

	        // SALIDA DE MERCANCÍA ////////////////////////////////////////////
	        case 6:
	            pintaTitulo("SALIDA DE MERCANCÍA");
	              
	            System.out.print("Por favor, introduzca el código del artículo: ");
	            codigoIn = s.nextLine();

	            if (!existeCodigo(codigoIn)) {
	                System.out.println("Lo siento, el código introducido no existe.");
	            } else {
	                int i = posicionConCodigo(codigoIn);
					Articulo prov=articulos.get(i);

	                System.out.println("Salida de mercancía del siguiente artículo: ");
	                System.out.println(prov);
	                System.out.print("Introduzca el número de unidades que desea sacar del almacén: ");
	                stockIn = Integer.parseInt(s.nextLine());
	                if (prov.getStock() - stockIn > 0) {
	                  prov.setStock(prov.getStock() - stockIn);
	                  System.out.println("La mercancía ha salido del almacén.");
	            	} else {
	                  System.out.println("Lo siento, no se pueden sacar tantas unidades.");
	            	}
	            }
	        break;
	      	} // switch
	    } while (opcion != 7);
		s.close();
	  }

	  // FUNCIONES ////////////////////////////////////////////////////////////////

	  public static void guardarArticulos(){

	  }

	  /* Dice si existe o no un artículo con un determinado código.
	   * 
	   * @return true si existe el código y false si no existe
	   */
	  public static boolean existeCodigo(String codigo) {
	    for (Articulo a : articulos) {
	      if (a.getCodigo().equals(codigo)) {
	        return true;
	      }
	    }
	    return false;
	  }
	  
	  /**
	   * Pinta un título con subrayado.
	   */
	  public static void pintaTitulo(String titulo) {
	    System.out.println("\n" + titulo);
	    for (int i = 0; i < titulo.length(); i++) {
	      System.out.print("=");  
	    }
	    System.out.println();
	  }

	  /**
	   * Devuelve la posición dentro del array en la que se encuentra un artículo
	   * con un determinado código.
	   * Si el código no se encuentra, devuelve -1.
	   * 
	   * @return posición dentro del array en la que se encuentra un artículo
	   */
	  public static int posicionConCodigo(String codigo) {

	    for (int i = 0; i < articulos.size(); i++) {
	      if (articulos.get(i).getCodigo().equals(codigo)) {
	        return i;
	      }
	    }
	    return -1;
	}

    public static String peticionCodigo(){

        String codigoIn="";
        // Introducción de datos 
        System.out.println("Por favor, introduzca el codigo del artículo.");  
        System.out.print("Código: ");
        
        // Comprueba que el código introducido no se repita
        do {
          codigoIn = s.nextLine();
          if (existeCodigo(codigoIn)) {
            System.out.println("Ese código ya existe en la base de datos.");
            System.out.print("Introduzca otro código: ");
          }
        } while (existeCodigo(codigoIn));

        return codigoIn;
    }
}
