package almacen;
//Clase de prueba COMPLETAR EL CÓDIGO DEL MÉTODO procesar Opción 
	import java.util.Scanner;

	public class TestAlmacen {
	


		static public void main(String[] argv) {

			Almacen1 prueba = new Almacen1();
			Scanner sc = new Scanner(System.in);
			int opcion;
			int num=0;
			
			mostrarMenu();
			opcion = sc.nextInt();
			while (opcion != 0) {
				if ( opcion==2 || opcion==3 || opcion==4) {
					System.out.println("INDICA EL VALOR QUE QUIERE: ");
					num = sc.nextInt();
					procesarOpcion(opcion, prueba, num);
				}else if (opcion==1 || opcion==5 || opcion==6||opcion==0) {
					procesarOpcion(opcion, prueba, num);
				}
				mostrarMenu();
				opcion = sc.nextInt();
			}
			sc.close();
			
		}

		static void mostrarMenu() {
			System.out.println("--- MENÚ DE  CONTROL DEL ALMACÉN -----");
			System.out.println(" 1.- Mostrar contenido del Almacén");
			System.out.println(" 2.- Poner un Valor  ");
			System.out.println(" 3.- Buscar un Valor ");

			System.out.println(" 4.- Borrar un Valor");
			System.out.println(" 5.- Contar posiciones ocupadas.");
			System.out.println(" 6.- Contar posiciones libres.");
			System.out.println(" 0.- Terminar");
	            System.out.print(" Introduzca una opción:[1-6]:");
		}
		// Procesa la opción introducida operando sobre el objeto Almacen1
		static void procesarOpcion(int opcion, Almacen1 parAlmacen, int numero) {
			// Completar......
			
			switch (opcion) {
			case 0:
				  System.out.println("Adios");
			case 1:
				  System.out.println(" Contenido del almacen: " +               parAlmacen.toString());
				  break;
			case 2:
				  System.out.println(" Añade un valor: " +                  	parAlmacen.ponValor(numero));
				  break;
			case 3:
				  System.out.println("");
				  System.out.println(" Busca un valor: " +                 		parAlmacen.estaValor(numero));
				  break;
			case 4:
				  System.out.println("");
				  System.out.println(" Borrar un valor: " +                 	parAlmacen.sacarValor(numero));
				  break;
			case 5:
				  System.out.println(" Posiciones ocupadas: " +                 parAlmacen.numPosicionesOcupadas());
				  break;
			case 6:
			      System.out.println(" Posiciones libres: " +                  parAlmacen.numPosicionesLibres());
			      break;
			}

		}

	}