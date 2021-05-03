import java.io.BufferedReader;
import java.text.DecimalFormat;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.InputMismatchException;
import java.util.Scanner;

import solar.Main3DSolarSystem;

public class SolarSystemWikiMain {
	static final double UA = 150000000; //constante valor unidades astronomicas
	static final double AL = 9460730472580.8;//constante valor años luz



	
	public static void main (String[] args) {    
		try {
				Scanner sn = new Scanner(System.in);//Menú principal
				boolean salir = false;
				int opcion; //Guardaremos la opcion del usuario
				while(!salir){
						System.out.println("1.- Ver informacion de planetas y sus satelites");
						System.out.println("2.- Ver informacion de planetas enanos y sus satelites");
						System.out.println("3.- Distancia media de planetas Y planetas enanos al Sol");
						System.out.println("4.- Distancia entre planetas");
						System.out.println("5.-	Sistema solar 3D");
					opcion = sn.nextInt();
					switch(opcion){
					case 1: //Menu de nformación de planetas
						while(!salir){
							System.out.println("1.- Mercurio");
							System.out.println("2.- Venus");
							System.out.println("3.- Tierra");
							System.out.println("4.- Marte");
							System.out.println("5.- Jupiter");
							System.out.println("6.- Saturno");
							System.out.println("7.- Urano");
							System.out.println("8.- Neptuno");
							System.out.println("9.- Salir");
							opcion = sn.nextInt();
							switch(opcion){
							case 1:
								 String mercurio = "src\\CPlanetas\\Mercurio.txt";
							        //Declarar una variable BufferedReader
							        BufferedReader M = null;
							        try {
							           //Crear un objeto BufferedReader al que se le pasa 
							           //   un objeto FileReader con el nombre del fichero
							           M = new BufferedReader(new FileReader(mercurio));
							           //Leer la primera línea, guardando en un String
							           String texto = M.readLine();
							           //Repetir mientras no se llegue al final del fichero
							           while(texto != null)
							           {
							               //Hacer lo que sea con la línea leída
							               System.out.println(texto);
							               //Leer la siguiente línea
							               texto = M.readLine();
							           }
							        }
							        catch (FileNotFoundException e) {
							            System.out.println("Error: Fichero no encontrado");
							            System.out.println(e.getMessage());
							        }
							        catch(Exception e) {
							            System.out.println("Error de lectura del fichero");
							            System.out.println(e.getMessage());
							        }
							        finally {
							            try {
							                if(M != null)
							                    M.close();
							            }
							            catch (Exception e) {
							                System.out.println("Error al cerrar el fichero");
							                System.out.println(e.getMessage());
							            			}
							        			}
								break;
							case 2:
								String venus = "src\\CPlanetas\\Venus.txt";
						        //Declarar una variable BufferedReader
						        BufferedReader v = null;
						        try {
						           //Crear un objeto BufferedReader al que se le pasa 
						           //   un objeto FileReader con el nombre del fichero
						           v = new BufferedReader(new FileReader(venus));
						           //Leer la primera línea, guardando en un String
						           String texto = v.readLine();
						           //Repetir mientras no se llegue al final del fichero
						           while(texto != null)
						           {
						               //Hacer lo que sea con la línea leída
						               System.out.println(texto);
						               //Leer la siguiente línea
						               texto = v.readLine();
						           }
						        }
						        catch (FileNotFoundException e) {
						            System.out.println("Error: Fichero no encontrado");
						            System.out.println(e.getMessage());
						        }
						        catch(Exception e) {
						            System.out.println("Error de lectura del fichero");
						            System.out.println(e.getMessage());
						        }
						        finally {
						            try {
						                if(v != null)
						                    v.close();
						            }
						            catch (Exception e) {
						                System.out.println("Error al cerrar el fichero");
						                System.out.println(e.getMessage());
						            			}
						        			}
								break;
							case 3:
								String tierra = "src\\CPlanetas\\Tierra.txt";
						        //Declarar una variable BufferedReader
						        BufferedReader T = null;
						        try {
						           //Crear un objeto BufferedReader al que se le pasa 
						           //   un objeto FileReader con el nombre del fichero
						           T = new BufferedReader(new FileReader(tierra));
						           //Leer la primera línea, guardando en un String
						           String texto = T.readLine();
						           //Repetir mientras no se llegue al final del fichero
						           while(texto != null)
						           {
						               //Hacer lo que sea con la línea leída
						               System.out.println(texto);
						               //Leer la siguiente línea
						               texto = T.readLine();
						           }
						        }
						        catch (FileNotFoundException e) {
						            System.out.println("Error: Fichero no encontrado");
						            System.out.println(e.getMessage());
						        }
						        catch(Exception e) {
						            System.out.println("Error de lectura del fichero");
						            System.out.println(e.getMessage());
						        }
						        finally {
						            try {
						                if(T != null)
						                    T.close();
						            }
						            catch (Exception e) {
						                System.out.println("Error al cerrar el fichero");
						                System.out.println(e.getMessage());
						            			}
						        			}
								break;
							case 4:
								String marte = "src\\CPlanetas\\Marte.txt";
						        //Declarar una variable BufferedReader
						        BufferedReader Ma = null;
						        try {
						           //Crear un objeto BufferedReader al que se le pasa 
						           //   un objeto FileReader con el nombre del fichero
						           Ma = new BufferedReader(new FileReader(marte));
						           //Leer la primera línea, guardando en un String
						           String texto = Ma.readLine();
						           //Repetir mientras no se llegue al final del fichero
						           while(texto != null)
						           {
						               //Hacer lo que sea con la línea leída
						               System.out.println(texto);
						               //Leer la siguiente línea
						               texto = Ma.readLine();
						           }
						        }
						        catch (FileNotFoundException e) {
						            System.out.println("Error: Fichero no encontrado");
						            System.out.println(e.getMessage());
						        }
						        catch(Exception e) {
						            System.out.println("Error de lectura del fichero");
						            System.out.println(e.getMessage());
						        }
						        finally {
						            try {
						                if(Ma != null)
						                    Ma.close();
						            }
						            catch (Exception e) {
						                System.out.println("Error al cerrar el fichero");
						                System.out.println(e.getMessage());
						            			}
						        }
								break;
							case 5:
								String jupiter = "src\\CPlanetas\\Jupiter.txt";
						        //Declarar una variable BufferedReader
						        BufferedReader J = null;
						        try {
						           //Crear un objeto BufferedReader al que se le pasa 
						           //   un objeto FileReader con el nombre del fichero
						           J = new BufferedReader(new FileReader(jupiter));
						           //Leer la primera línea, guardando en un String
						           String texto = J.readLine();
						           //Repetir mientras no se llegue al final del fichero
						           while(texto != null)
						           {
						               //Hacer lo que sea con la línea leída
						               System.out.println(texto);
						               //Leer la siguiente línea
						               texto = J.readLine();
						           }
						        }
						        catch (FileNotFoundException e) {
						            System.out.println("Error: Fichero no encontrado");
						            System.out.println(e.getMessage());
						        }
						        catch(Exception e) {
						            System.out.println("Error de lectura del fichero");
						            System.out.println(e.getMessage());
						        }
						        finally {
						            try {
						                if(J != null)
						                    J.close();
						            }
						            catch (Exception e) {
						                System.out.println("Error al cerrar el fichero");
						                System.out.println(e.getMessage());
						            			}
						        			}
								break;
							case 6:
								String saturno = "src\\CPlanetas\\Saturno.txt";
						        //Declarar una variable BufferedReader
						        BufferedReader S = null;
						        try {
						           //Crear un objeto BufferedReader al que se le pasa 
						           //   un objeto FileReader con el nombre del fichero
						           S = new BufferedReader(new FileReader(saturno));
						           //Leer la primera línea, guardando en un String
						           String texto = S.readLine();
						           //Repetir mientras no se llegue al final del fichero
						           while(texto != null)
						           {
						               //Hacer lo que sea con la línea leída
						               System.out.println(texto);
						               //Leer la siguiente línea
						               texto = S.readLine();
						           }
						        }
						        catch (FileNotFoundException e) {
						            System.out.println("Error: Fichero no encontrado");
						            System.out.println(e.getMessage());
						        }
						        catch(Exception e) {
						            System.out.println("Error de lectura del fichero");
						            System.out.println(e.getMessage());
						        }
						        finally {
						            try {
						                if(S != null)
						                    S.close();
						            }
						            catch (Exception e) {
						                System.out.println("Error al cerrar el fichero");
						                System.out.println(e.getMessage());
						            			}
						        			}							
								break;
							case 7:
								String urano = "src\\CPlanetas\\Urano.txt";
						        //Declarar una variable BufferedReader
						        BufferedReader U = null;
						        try {
						           //Crear un objeto BufferedReader al que se le pasa 
						           //   un objeto FileReader con el nombre del fichero
						           U = new BufferedReader(new FileReader(urano));
						           //Leer la primera línea, guardando en un String
						           String texto = U.readLine();
						           //Repetir mientras no se llegue al final del fichero
						           while(texto != null)
						           {
						               //Hacer lo que sea con la línea leída
						               System.out.println(texto);
						               //Leer la siguiente línea
						               texto = U.readLine();
						           }
						        }
						        catch (FileNotFoundException e) {
						            System.out.println("Error: Fichero no encontrado");
						            System.out.println(e.getMessage());
						        }
						        catch(Exception e) {
						            System.out.println("Error de lectura del fichero");
						            System.out.println(e.getMessage());
						        }
						        finally {
						            try {
						                if(U != null)
						                    U.close();
						            }
						            catch (Exception e) {
						                System.out.println("Error al cerrar el fichero");
						                System.out.println(e.getMessage());
						            			}
						        			}														
								break;
							case 8:
								String neptuno = "src\\CPlanetas\\Neptuno.txt";
						        //Declarar una variable BufferedReader
						        BufferedReader N = null;
						        try {
						           //Crear un objeto BufferedReader al que se le pasa 
						           //   un objeto FileReader con el nombre del fichero
						           N = new BufferedReader(new FileReader(neptuno));
						           //Leer la primera línea, guardando en un String
						           String texto = N.readLine();
						           //Repetir mientras no se llegue al final del fichero
						           while(texto != null)
						           {
						               //Hacer lo que sea con la línea leída
						               System.out.println(texto);
						               //Leer la siguiente línea
						               texto = N.readLine();
						           }
						        }
						        catch (FileNotFoundException e) {
						            System.out.println("Error: Fichero no encontrado");
						            System.out.println(e.getMessage());
						        }
						        catch(Exception e) {
						            System.out.println("Error de lectura del fichero");
						            System.out.println(e.getMessage());
						        }
						        finally {
						            try {
						                if(N != null)
						                    N.close();
						            }
						            catch (Exception e) {
						                System.out.println("Error al cerrar el fichero");
						                System.out.println(e.getMessage());
						            			}
						        			}
								break;
							case 9:
								salir=true;
								break;
							default:
								System.out.println();
							}
						}
						break;
					case 2: //Menu de información de planetas enanos
						while(!salir){
							System.out.println("1.- Pluton");
							System.out.println("2.- Ceres");
							System.out.println("3.- Heris");
							System.out.println("4.- Makemake");
							System.out.println("5.- Haumea");
							System.out.println("6.- Salir");
							opcion = sn.nextInt();
							switch(opcion){
							case 1:
								String pluton = "src\\CPlanetasEnanos\\pluton.txt";
						        //Declarar una variable BufferedReader
						        BufferedReader p = null;
						        try {
						           //Crear un objeto BufferedReader al que se le pasa 
						           //   un objeto FileReader con el nombre del fichero
						           p = new BufferedReader(new FileReader(pluton));
						           //Leer la primera línea, guardando en un String
						           String texto = p.readLine();
						           //Repetir mientras no se llegue al final del fichero
						           while(texto != null)
						           {
						               //Hacer lo que sea con la línea leída
						               System.out.println(texto);
						               //Leer la siguiente línea
						               texto = p.readLine();
						           }
						        }
						        catch (FileNotFoundException e) {
						            System.out.println("Error: Fichero no encontrado");
						            System.out.println(e.getMessage());
						        }
						        catch(Exception e) {
						            System.out.println("Error de lectura del fichero");
						            System.out.println(e.getMessage());
						        }
						        finally {
						            try {
						                if(p != null)
						                    p.close();
						            }
						            catch (Exception e) {
						                System.out.println("Error al cerrar el fichero");
						                System.out.println(e.getMessage());
						            			}
						        			}
								break;
							case 2:
								String ceres = "src\\CPlanetasEnanos\\ceres.txt";
						        //Declarar una variable BufferedReader
						        BufferedReader c = null;
						        try {
						           //Crear un objeto BufferedReader al que se le pasa 
						           //   un objeto FileReader con el nombre del fichero
						           c = new BufferedReader(new FileReader(ceres));
						           //Leer la primera línea, guardando en un String
						           String texto = c.readLine();
						           //Repetir mientras no se llegue al final del fichero
						           while(texto != null)
						           {
						               //Hacer lo que sea con la línea leída
						               System.out.println(texto);
						               //Leer la siguiente línea
						               texto = c.readLine();
						           }
						        }
						        catch (FileNotFoundException e) {
						            System.out.println("Error: Fichero no encontrado");
						            System.out.println(e.getMessage());
						        }
						        catch(Exception e) {
						            System.out.println("Error de lectura del fichero");
						            System.out.println(e.getMessage());
						        }
						        finally {
						            try {
						                if(c != null)
						                    c.close();
						            }
						            catch (Exception e) {
						                System.out.println("Error al cerrar el fichero");
						                System.out.println(e.getMessage());
						            			}
						        			}
								break;
							case 3:
								String heris = "src\\CPlanetasEnanos\\heris.txt";
						        //Declarar una variable BufferedReader
						        BufferedReader h = null;
						        try {
						           //Crear un objeto BufferedReader al que se le pasa 
						           //   un objeto FileReader con el nombre del fichero
						           h = new BufferedReader(new FileReader(heris));
						           //Leer la primera línea, guardando en un String
						           String texto = h.readLine();
						           //Repetir mientras no se llegue al final del fichero
						           while(texto != null)
						           {
						               
						               System.out.println(texto);
						               //Leer la siguiente línea
						               texto = h.readLine();
						           }
						        }
						        catch (FileNotFoundException e) {
						            System.out.println("Error: Fichero no encontrado");
						            System.out.println(e.getMessage());
						        }
						        catch(Exception e) {
						            System.out.println("Error de lectura del fichero");
						            System.out.println(e.getMessage());
						        }
						        finally {
						            try {
						                if(h != null)
						                    h.close();
						            }
						            catch (Exception e) {
						                System.out.println("Error al cerrar el fichero");
						                System.out.println(e.getMessage());
						            			}
						        			}
								break;
							case 4:
								String makemake = "src\\CPlanetasEnanos\\makemake.txt";
						        //Declarar una variable BufferedReader
						        BufferedReader m = null;
						        try {
						           //Crear un objeto BufferedReader al que se le pasa 
						           //   un objeto FileReader con el nombre del fichero
						           m = new BufferedReader(new FileReader(makemake));
						           //Leer la primera línea, guardando en un String
						           String texto = m.readLine();
						           //Repetir mientras no se llegue al final del fichero
						           while(texto != null)
						           {
						               //Hacer lo que sea con la línea leída
						               System.out.println(texto);
						               //Leer la siguiente línea
						               texto = m.readLine();
						           }
						        }
						        catch (FileNotFoundException e) {
						            System.out.println("Error: Fichero no encontrado");
						            System.out.println(e.getMessage());
						        }
						        catch(Exception e) {
						            System.out.println("Error de lectura del fichero");
						            System.out.println(e.getMessage());
						        }
						        finally {
						            try {
						                if(m != null)
						                    m.close();
						            }
						            catch (Exception e) {
						                System.out.println("Error al cerrar el fichero");
						                System.out.println(e.getMessage());
						            			}
						        			}
								break;
							case 5:
								String haumea = "src\\CPlanetasEnanos\\haumea.txt";
						        //Declarar una variable BufferedReader
						        BufferedReader ha = null;
						        try {
						           //Crear un objeto BufferedReader al que se le pasa 
						           //   un objeto FileReader con el nombre del fichero
						           ha = new BufferedReader(new FileReader(haumea));
						           //Leer la primera línea, guardando en un String
						           String texto = ha.readLine();
						           //Repetir mientras no se llegue al final del fichero
						           while(texto != null)
						           {
						               //Hacer lo que sea con la línea leída
						               System.out.println(texto);
						               //Leer la siguiente línea
						               texto = ha.readLine();
						           }
						        }
						        catch (FileNotFoundException e) {
						            System.out.println("Error: Fichero no encontrado");
						            System.out.println(e.getMessage());
						        }
						        catch(Exception e) {
						            System.out.println("Error de lectura del fichero");
						            System.out.println(e.getMessage());
						        }
						        finally {
						            try {
						                if(ha != null)
						                    ha.close();
						            }
						            catch (Exception e) {
						                System.out.println("Error al cerrar el fichero");
						                System.out.println(e.getMessage());
						            			}
						        			}
								break;
							case 6:
								salir=true;
								break;
							default:
								System.out.println();
							}
						}
					case 3: //Menu de distancias de planetas al sol
						while(!salir){
							System.out.println("1.- Mercurio");
							System.out.println("2.- Venus");
							System.out.println("3.- Tierra");
							System.out.println("4.- Marte");
							System.out.println("5.- Jupiter");
							System.out.println("6.- Saturno");
							System.out.println("7.- Urano");
							System.out.println("8.- Neptuno");
							System.out.println("9.- Pluton");
							System.out.println("10.- Ceres");
							System.out.println("11.- Heris");
							System.out.println("12.- Makemake");
							System.out.println("13.- Salir");
							opcion = sn.nextInt();
							switch(opcion){
							case 1:
								System.out.println("-----------------" + "MERCURIO" + "-----------------");
								double am = 6.97*Math.pow(10, 7), pm = 4.60*Math.pow(10, 7);
								double sumam = am + pm;
								double resultadom = sumam /2;
								System.out.println("Distancia al sol: "  + EliminarNotaciónCientifica(am) + " + " + EliminarNotaciónCientifica(pm) + " /2 " + " = " + EliminarNotaciónCientifica(resultadom) + "Km");
								double conversionm = resultadom / UA;
								System.out.println("Conversión a UA: " + conversionm + " UA");
								System.out.println("*UA son unidades astronomicas, 1 UA es aproximadamente el equivalente a la distancia media entre la tierra y el sol (150.000.000 Km)*");
								double conversionAm = resultadom / AL;
								System.out.println("Conversión a AL: " + EliminarNotaciónCientifica(conversionAm) + " AL");
								System.out.println("*AL son años luz, aproximadamente un año luz equivale a 9.460.730.472.580,8 Km*");
								break;
							case 2:
								System.out.println("-----------------" + "VENUS" + "-----------------");
								double av = 1.089*Math.pow(10, 8), pv = 1.075*Math.pow(10, 8);
								double sumav = av + pv;
								double resultadov = sumav /2;
								System.out.println("Distancia al sol: " + EliminarNotaciónCientifica(av) + " + " + EliminarNotaciónCientifica(pv) + " /2 " + " = " + EliminarNotaciónCientifica(resultadov) + "Km");
								double conversionv = resultadov / UA;
								System.out.println("Conversión a UA: " + conversionv + " UA");
								System.out.println("*UA son unidades astronomicas, 1 UA es aproximadamente el equivalente a la distancia media entre la tierra y el sol (150.000.000 Km)*");
								double conversionAv = resultadov / AL;
								System.out.println("Conversión a AL: " + EliminarNotaciónCientifica(conversionAv) + " AL");
								System.out.println("*AL son años luz, aproximadamente un año luz equivale a 9.460.730.472.580,8 Km*");
								break;
							case 3:
								System.out.println("-----------------" + "TIERRA" + "-----------------");
								double at = 1.521*Math.pow(10, 8), pt = 1.471*Math.pow(10, 8);
								double sumat = at + pt;
								double resultadot = sumat /2;
								System.out.println("Distancia al sol: " + EliminarNotaciónCientifica(at) + " + " + EliminarNotaciónCientifica(pt) + " /2 " + " = " + EliminarNotaciónCientifica(resultadot) + "Km");
								double conversiont = resultadot / UA;
								System.out.println("Conversión a UA: " + conversiont + " UA");
								System.out.println("*UA son unidades astronomicas, 1 UA es aproximadamente el equivalente a la distancia media entre la tierra y el sol (150.000.000 Km)*");
								double conversionAt = resultadot / AL;
								System.out.println("Conversión a AL: " + EliminarNotaciónCientifica(conversionAt) + " AL");
								System.out.println("*AL son años luz, aproximadamente un año luz equivale a 9.460.730.472.580,8 Km*");
								break;
							case 4:
								System.out.println("-----------------" + "MARTE" + "-----------------");
								double ame = 2.491*Math.pow(10, 8), pme = 2.067*Math.pow(10, 8);
								double sumame = ame + pme;
								double resultadome = sumame /2;
								System.out.println("Distancia al sol: " + EliminarNotaciónCientifica(ame) + " + " + EliminarNotaciónCientifica(pme) + " /2 " + " = " + EliminarNotaciónCientifica(resultadome) + "Km");
								double conversionme = resultadome / UA;
								System.out.println("Conversión a UA: " + conversionme + " UA");
								System.out.println("*UA son unidades astronomicas, 1 UA es aproximadamente el equivalente a la distancia media entre la tierra y el sol (150.000.000 Km)*");
								double conversionAme = resultadome / AL;
								System.out.println("Conversión a AL: " + EliminarNotaciónCientifica(conversionAme) + " AL");
								System.out.println("*AL son años luz, aproximadamente un año luz equivale a 9.460.730.472.580,8 Km*");
								break;
							case 5:
								System.out.println("-----------------" + "JUPITER" + "-----------------");
								double aj = 8.157*Math.pow(10, 8),  pj = 7.409*Math.pow(10, 8);
								double sumaj = aj + pj;
								double resultadoj = sumaj /2;
								System.out.println("Distancia al sol: " + EliminarNotaciónCientifica(aj) + " + " + EliminarNotaciónCientifica(pj) + " /2 " + " = " + EliminarNotaciónCientifica(resultadoj) + "Km");
								double conversionj = resultadoj / UA;
								System.out.println("Conversión a UA: " + conversionj + " UA");
								System.out.println("*UA son unidades astronomicas, 1 UA es aproximadamente el equivalente a la distancia media entre la tierra y el sol (150.000.000 Km)*");
								double conversionAj = resultadoj / AL;
								System.out.println("Conversión a AL: " + EliminarNotaciónCientifica(conversionAj) + " AL");
								System.out.println("*AL son años luz, aproximadamente un año luz equivale a 9.460.730.472.580,8 Km*");
								break;
							case 6:
								System.out.println("-----------------" + "SATURNO" + "-----------------");
								double as = 1.503*Math.pow(10, 9), ps = 1.348*Math.pow(10, 9);
								double sumasa = as + ps;
								double resultadosa = sumasa /2;
								System.out.println("Distancia al sol: " + EliminarNotaciónCientifica(as) + " + " + EliminarNotaciónCientifica(ps) + " /2 " + " = " + EliminarNotaciónCientifica(resultadosa) + "Km");
								double conversionsa = resultadosa / UA;
								System.out.println("Conversión a UA: " + conversionsa + " UA");
								System.out.println("*UA son unidades astronomicas, 1 UA es aproximadamente el equivalente a la distancia media entre la tierra y el sol (150.000.000 Km)*");
								double conversionAsa = resultadosa / AL;
								System.out.println("Conversión a AL: " + EliminarNotaciónCientifica(conversionAsa) + " AL");
								System.out.println("*AL son años luz, aproximadamente un año luz equivale a 9.460.730.472.580,8 Km*");
								break;
							case 7:
								System.out.println("-----------------" + "URANO" + "-----------------");
								double au = 3.003*Math.pow(10, 9), pu = 2.739*Math.pow(10, 9);
								double sumau = au + pu;
								double resultadou = sumau /2;
								System.out.println("Distancia al sol: " + EliminarNotaciónCientifica(au) + " + " + EliminarNotaciónCientifica(pu) + " /2 " + " = " + EliminarNotaciónCientifica(resultadou) + "Km");
								double conversionu = resultadou / UA;
								System.out.println("Conversión a UA: " + conversionu + " UA");
								System.out.println("*UA son unidades astronomicas, 1 UA es aproximadamente el equivalente a la distancia media entre la tierra y el sol (150.000.000 Km)*");
								double conversionAu = resultadou / AL;
								System.out.println("Conversión a AL: " + EliminarNotaciónCientifica(conversionAu) + " AL");
								System.out.println("*AL son años luz, aproximadamente un año luz equivale a 9.460.730.472.580,8 Km*");
								break;
							case 8:
								System.out.println("-----------------" + "NEPTUNO" + "-----------------");
								double an = 4.546*Math.pow(10, 9), pn = 4.456*Math.pow(10, 9);
								double suman = an + pn;
								double resultadon = suman /2;
								System.out.println("Distancia al sol: " + EliminarNotaciónCientifica(an) + " + " + EliminarNotaciónCientifica(pn) + " /2 " + " = " + EliminarNotaciónCientifica(resultadon) + "Km");
								double conversionn = resultadon / UA;
								System.out.println("Conversión a UA: " + conversionn + " UA");
								System.out.println("*UA son unidades astronomicas, 1 UA es aproximadamente el equivalente a la distancia media entre la tierra y el sol (150.000.000 Km)*");
								double conversionAn = resultadon / AL;
								System.out.println("Conversión a AL: " + EliminarNotaciónCientifica(conversionAn) + " AL");
								System.out.println("*AL son años luz, aproximadamente un año luz equivale a 9.460.730.472.580,8 Km*");
								break;
							case 9:
								System.out.println("-----------------" + "PLUTON" + "-----------------");
								double aP = 7.380*Math.pow(10, 9), pP = 4.447*Math.pow(10, 9);
								double sumaP = aP + pP;
								double resultadoP = sumaP /2;
								System.out.println("Distancia al sol: " + EliminarNotaciónCientifica(aP) + " + " + EliminarNotaciónCientifica(pP) + " /2 " + " = " + EliminarNotaciónCientifica(resultadoP) + "Km");
								double conversionP = resultadoP / UA;
								System.out.println("Conversión a UA: " + conversionP + " UA");
								System.out.println("*UA son unidades astronomicas, 1 UA es aproximadamente el equivalente a la distancia media entre la tierra y el sol (150.000.000 Km)*");
								double conversionAP = resultadoP / AL;
								System.out.println("Conversión a AL: " + EliminarNotaciónCientifica(conversionAP) + " AL");
								System.out.println("*AL son años luz, aproximadamente un año luz equivale a 9.460.730.472.580,8 Km*");
								break;
							case 10:
								System.out.println("-----------------" + "CERES" + "-----------------");
								double aC = 4.472975*Math.pow(10, 8), pC = 3.814746*Math.pow(10, 8);
								double sumaC = aC + pC;
								double resultadoC = sumaC /2;
								System.out.println("Distancia al sol: " + EliminarNotaciónCientifica(aC) + " + " + EliminarNotaciónCientifica(pC) + " /2 " + " = " + EliminarNotaciónCientifica(resultadoC) + "Km");
								double conversionC = resultadoC / UA;
								System.out.println("Conversión a UA: " + conversionC + " UA");
								System.out.println("*UA son unidades astronomicas, 1 UA es aproximadamente el equivalente a la distancia media entre la tierra y el sol (150.000.000 Km)*");
								double conversionAC = resultadoC / AL;
								System.out.println("Conversión a AL: " + EliminarNotaciónCientifica(conversionAC) + " AL");
								System.out.println("*AL son años luz, aproximadamente un año luz equivale a 9.460.730.472.580,8 Km*");
								break;
							case 11:
								System.out.println("-----------------" + "HERIS" + "-----------------");
								double aE = 14594.512904*Math.pow(10, 6), pE = 5765.732799*Math.pow(10, 6);
								double sumaE = aE + pE;
								double resultadoE = sumaE /2;
								System.out.println("Distancia al sol: " + EliminarNotaciónCientifica(aE) + " + " + EliminarNotaciónCientifica(pE) + " /2 " + " = " + EliminarNotaciónCientifica(resultadoE) + "Km");
								double conversionE = resultadoE / UA;
								System.out.println("Conversión a UA: " + conversionE + " UA");
								System.out.println("*UA son unidades astronomicas, 1 UA es aproximadamente el equivalente a la distancia media entre la tierra y el sol (150.000.000 Km)*");
								double conversionAE = resultadoE / AL;
								System.out.println("Conversión a AL: " + EliminarNotaciónCientifica(conversionAE) + " AL");
								System.out.println("*AL son años luz, aproximadamente un año luz equivale a 9.460.730.472.580,8 Km*");
								break;
							case 12:
								System.out.println("-----------------" + "MAKEMAKE" + "-----------------");
								double aM = 7894.762625*Math.pow(10, 6), pM = 5671.928586*Math.pow(10, 6);
								double sumaM = aM + pM;
								double resultadoM = sumaM /2;
								System.out.println("Distancia al sol: " + EliminarNotaciónCientifica(aM) + " + " + EliminarNotaciónCientifica(pM) + " /2 " + " = " + EliminarNotaciónCientifica(resultadoM) + "Km");
								double conversionM = resultadoM / UA;
								System.out.println("Conversión a UA: " + conversionM + " UA");
								System.out.println("*UA son unidades astronomicas, 1 UA es aproximadamente el equivalente a la distancia media entre la tierra y el sol (150.000.000 Km)*");
								double conversionAM = resultadoM / AL;
								System.out.println("*AL son años luz, aproximadamente un año luz equivale a 9.460.730.472.580,8 Km*");
								break;
							case 13:
								salir=true;
								break;
							default:
								System.out.println();
							}
						}
					case 4: //Menu de distancias interplanetarias
						while(!salir){
							System.out.println("1.- Mercurio");
							System.out.println("2.- Venus");
							System.out.println("3.- Tierra");
							System.out.println("4.- Marte");
							System.out.println("5.- Jupiter");
							System.out.println("6.- Saturno");
							System.out.println("7.- Urano");
							System.out.println("8.- Neptuno");
							System.out.println("9.- Pluton");
							System.out.println("10.- Ceres");
							System.out.println("11.- Heris");
							System.out.println("12.- Makemake");
							System.out.println("13.- Salir");
							opcion = sn.nextInt();
							switch(opcion){
							case 1:
								//Mercurio a todos los planetas	
								System.out.println("-----------DISTANCIA: MERCURIO - VENUS-----------");
								
								System.out.println("-----------DISTANCIA: MERCURIO - TIERRA-----------");
								
								System.out.println("-----------DISTANCIA: MERCURIO - MARTE-----------");

								
								System.out.println("-----------DISTANCIA: MERCURIO - JUPITER-----------");
								
								System.out.println("-----------DISTANCIA: MERCURIO - SATURNO-----------");
								
								System.out.println("-----------DISTANCIA: MERCURIO - URANO-----------");
								
								System.out.println("-----------DISTANCIA: MERCURIO - NEPTUNO-----------");
								
								System.out.println("-----------DISTANCIA: MERCURIO - CERES-----------");
								
								System.out.println("-----------DISTANCIA: MERCURIO - PLUTON-----------");
								
								System.out.println("-----------DISTANCIA: MERCURIO - MAKEMAKE-----------");
								
								System.out.println("-----------DISTANCIA: MERCURIO - HERIS-----------");
								
								break;
							case 2://Venus a todos los planetas
								System.out.println("-----------DISTANCIA: VENUS - MERCURIO-----------");
								
								System.out.println("-----------DISTANCIA: VENUS - TIERRA-----------");
								
								System.out.println("-----------DISTANCIA: VENUS - MARTE-----------");
								
								System.out.println("-----------DISTANCIA: VENUS - JUPITER-----------");
								
								System.out.println("-----------DISTANCIA: VENUS - SATURNO-----------");
								
								System.out.println("-----------DISTANCIA: VENUS - URANO-----------");
								
								System.out.println("-----------DISTANCIA: VENUS - NEPTUNO-----------");
								
								System.out.println("-----------DISTANCIA: VENUS - CERES-----------");
								
								System.out.println("-----------DISTANCIA: VENUS - PLUTON-----------");
								
								System.out.println("-----------DISTANCIA: VENUS - MAKEMAKE-----------");
								
								System.out.println("-----------DISTANCIA: VENUS - HERIS-----------");
								
								break;
							case 3://Tierra a todos los planetas
								System.out.println("-----------DISTANCIA: TIERRA - MERCURIO-----------");
								
								System.out.println("-----------DISTANCIA: TIERRA - VENUS -----------");
								
								System.out.println("-----------DISTANCIA: TIERRA - MARTE-----------");
								
								System.out.println("-----------DISTANCIA: TIERRA - JUPITER-----------");
								
								System.out.println("-----------DISTANCIA: TIERRA - SATURNO-----------");
								
								System.out.println("-----------DISTANCIA: TIERRA - URANO-----------");
								
								System.out.println("-----------DISTANCIA: TIERRA - NEPTUNO-----------");
								
								System.out.println("-----------DISTANCIA: TIERRA - CERES-----------");
								
								System.out.println("-----------DISTANCIA: TIERRA - PLUTON-----------");
								
								System.out.println("-----------DISTANCIA: TIERRA - MAKEMAKE-----------");
								
								System.out.println("-----------DISTANCIA: TIERRA - HERIS-----------");
								
								break;
							case 4://MARTE
								System.out.println("-----------DISTANCIA: MARTE - MERCURIO-----------");
								
								System.out.println("-----------DISTANCIA: MARTE - VENUS -----------");
								
								System.out.println("-----------DISTANCIA: MARTE - TIERRA-----------");
								
								System.out.println("-----------DISTANCIA: MARTE - JUPITER-----------");
								
								System.out.println("-----------DISTANCIA: MARTE - SATURNO-----------");
							
								System.out.println("-----------DISTANCIA: MARTE - URANO-----------");
								
								System.out.println("-----------DISTANCIA: MARTE - NEPTUNO-----------");
						
								System.out.println("-----------DISTANCIA: MARTE - CERES-----------");
							
								System.out.println("-----------DISTANCIA: MARTE - PLUTON-----------");
								
								System.out.println("-----------DISTANCIA: MARTE - MAKEMAKE-----------");
								
								System.out.println("-----------DISTANCIA: MARTE - HERIS-----------");
							
								break;
							case 5://JUPITER
								System.out.println("-----------DISTANCIA: JUPITER - MERCURIO-----------");
								
								System.out.println("-----------DISTANCIA: JUPITER - VENUS -----------");

								System.out.println("-----------DISTANCIA: JUPITER - TIERRA-----------");

								System.out.println("-----------DISTANCIA: JUPITER - MARTE-----------");

								System.out.println("-----------DISTANCIA: JUPITER - SATURNO-----------");

								System.out.println("-----------DISTANCIA: JUPITER - URANO-----------");

								System.out.println("-----------DISTANCIA: JUPITER - NEPTUNO-----------");
								
								System.out.println("-----------DISTANCIA: JUPITER - CERES-----------");
								
								System.out.println("-----------DISTANCIA: JUPITER - PLUTON-----------");
								
								System.out.println("-----------DISTANCIA: JUPITER - MAKEMAKE-----------");
							
								System.out.println("-----------DISTANCIA: JUPITER - HERIS-----------");
							
								break;
							case 6://SATURNO
								System.out.println("-----------DISTANCIA: SATURNO - MERCURIO-----------");
							
								System.out.println("-----------DISTANCIA: SATURNO - VENUS -----------");
								
								System.out.println("-----------DISTANCIA: SATURNO - TIERRA-----------");
								
								System.out.println("-----------DISTANCIA: SATURNO - MARTE-----------");
								
								System.out.println("-----------DISTANCIA: SATURNO - JUPITER-----------");
							
								System.out.println("-----------DISTANCIA: SATURNO - URANO-----------");
							
								System.out.println("-----------DISTANCIA: SATURNO - NEPTUNO-----------");
							
								System.out.println("-----------DISTANCIA: SATURNO - CERES-----------");
								
								System.out.println("-----------DISTANCIA: SATURNO - PLUTON-----------");
								
								System.out.println("-----------DISTANCIA: SATURNO - MAKEMAKE-----------");
								
								System.out.println("-----------DISTANCIA: SATURNO - HERIS-----------");
								
								break;
							case 7://URANO
						
								break;
							case 8://NEPTUNO
				
								break;
							case 9://CERES
					
								break;
							case 10://PLUTON
							
								break;
							case 11://MAKEMAKE
								
								break;
							case 12://HERIS
								
								break;
							case 13:
								salir=true;
								break;
							default:
								System.out.println();
								break;
								}
							}
					case 5: //Menu de planetas de el sistema solar 3D
						while(!salir){
							System.out.println("1.- Sistema solar 3D");
							System.out.println("2.- Salir");
							opcion = sn.nextInt();
							switch(opcion){
							case 1:
								Main3DSolarSystem.main(args);
								break;
							case 2:
								salir=true;
								break;
							default:
								System.out.println();
								break;
									}
								}
							}
						}
					}catch (InputMismatchException e) {
						System.out.println("Debes insertar un número entero!");
					}
				}
	
	//Metodo para eliminar notación cientifica
	  public static String EliminarNotaciónCientifica(double Número) {
	  return new DecimalFormat("#.####################################").format(Número);
  } 
}
					

