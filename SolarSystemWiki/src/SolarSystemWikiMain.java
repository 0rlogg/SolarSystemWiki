import java.io.BufferedReader;
import java.text.DecimalFormat;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

import solar.Main3DSolarSystem;

public class SolarSystemWikiMain {
	static final double UA = 150000000; 
	static final double AL = 9460730472580.8;
	
	public static void main (String[] args) {    
		
				Scanner sn = new Scanner(System.in);
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
					case 1: //Informaci�n de planetas
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
							           //Leer la primera l�nea, guardando en un String
							           String texto = M.readLine();
							           //Repetir mientras no se llegue al final del fichero
							           while(texto != null)
							           {
							               //Hacer lo que sea con la l�nea le�da
							               System.out.println(texto);
							               //Leer la siguiente l�nea
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
						           //Leer la primera l�nea, guardando en un String
						           String texto = v.readLine();
						           //Repetir mientras no se llegue al final del fichero
						           while(texto != null)
						           {
						               //Hacer lo que sea con la l�nea le�da
						               System.out.println(texto);
						               //Leer la siguiente l�nea
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
						           //Leer la primera l�nea, guardando en un String
						           String texto = T.readLine();
						           //Repetir mientras no se llegue al final del fichero
						           while(texto != null)
						           {
						               //Hacer lo que sea con la l�nea le�da
						               System.out.println(texto);
						               //Leer la siguiente l�nea
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
						           //Leer la primera l�nea, guardando en un String
						           String texto = Ma.readLine();
						           //Repetir mientras no se llegue al final del fichero
						           while(texto != null)
						           {
						               //Hacer lo que sea con la l�nea le�da
						               System.out.println(texto);
						               //Leer la siguiente l�nea
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
						           //Leer la primera l�nea, guardando en un String
						           String texto = J.readLine();
						           //Repetir mientras no se llegue al final del fichero
						           while(texto != null)
						           {
						               //Hacer lo que sea con la l�nea le�da
						               System.out.println(texto);
						               //Leer la siguiente l�nea
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
						           //Leer la primera l�nea, guardando en un String
						           String texto = S.readLine();
						           //Repetir mientras no se llegue al final del fichero
						           while(texto != null)
						           {
						               //Hacer lo que sea con la l�nea le�da
						               System.out.println(texto);
						               //Leer la siguiente l�nea
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
						           //Leer la primera l�nea, guardando en un String
						           String texto = U.readLine();
						           //Repetir mientras no se llegue al final del fichero
						           while(texto != null)
						           {
						               //Hacer lo que sea con la l�nea le�da
						               System.out.println(texto);
						               //Leer la siguiente l�nea
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
						           //Leer la primera l�nea, guardando en un String
						           String texto = N.readLine();
						           //Repetir mientras no se llegue al final del fichero
						           while(texto != null)
						           {
						               //Hacer lo que sea con la l�nea le�da
						               System.out.println(texto);
						               //Leer la siguiente l�nea
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
					case 2: //Informaci�n de planetas enanos
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
						           //Leer la primera l�nea, guardando en un String
						           String texto = p.readLine();
						           //Repetir mientras no se llegue al final del fichero
						           while(texto != null)
						           {
						               //Hacer lo que sea con la l�nea le�da
						               System.out.println(texto);
						               //Leer la siguiente l�nea
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
						           //Leer la primera l�nea, guardando en un String
						           String texto = c.readLine();
						           //Repetir mientras no se llegue al final del fichero
						           while(texto != null)
						           {
						               //Hacer lo que sea con la l�nea le�da
						               System.out.println(texto);
						               //Leer la siguiente l�nea
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
						           //Leer la primera l�nea, guardando en un String
						           String texto = h.readLine();
						           //Repetir mientras no se llegue al final del fichero
						           while(texto != null)
						           {
						               //Hacer lo que sea con la l�nea le�da
						               System.out.println(texto);
						               //Leer la siguiente l�nea
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
						           //Leer la primera l�nea, guardando en un String
						           String texto = m.readLine();
						           //Repetir mientras no se llegue al final del fichero
						           while(texto != null)
						           {
						               //Hacer lo que sea con la l�nea le�da
						               System.out.println(texto);
						               //Leer la siguiente l�nea
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
						           //Leer la primera l�nea, guardando en un String
						           String texto = ha.readLine();
						           //Repetir mientras no se llegue al final del fichero
						           while(texto != null)
						           {
						               //Hacer lo que sea con la l�nea le�da
						               System.out.println(texto);
						               //Leer la siguiente l�nea
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
					case 3: //Distancias de planetas al sol
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
								double am = 6.97*Math.pow(10, 7);//afelio Mercurio
								double pm = 4.60*Math.pow(10, 7);//perihelio Mercurio
								double sumam = am + pm;
								double resultadom = sumam /2;
								System.out.println("Distancia al sol: "  + EliminarNotaci�nCientifica(am) + " + " + EliminarNotaci�nCientifica(pm) + " /2 " + " = " + EliminarNotaci�nCientifica(resultadom) + "Km");
								double conversionm = resultadom / UA;
								System.out.println("Conversi�n a UA: " + conversionm + " UA");
								System.out.println("*UA son unidades astronomicas, 1 UA es aproximadamente el equivalente a la distancia media entre la tierra y el sol (150.000.000 Km)*");
								double conversionAm = resultadom / AL;
								System.out.println("Conversi�n a AL: " + EliminarNotaci�nCientifica(conversionAm) + " AL");
								System.out.println("*AL son a�os luz, aproximadamente un a�o luz equivale a 9.460.730.472.580,8 Km*");
								break;
							case 2:
								System.out.println("-----------------" + "VENUS" + "-----------------");
								double av = 1.089*Math.pow(10, 8);
								double pv = 1.075*Math.pow(10, 8);
								double sumav = av + pv;
								double resultadov = sumav /2;
								System.out.println("Distancia al sol: " + EliminarNotaci�nCientifica(av) + " + " + EliminarNotaci�nCientifica(pv) + " /2 " + " = " + EliminarNotaci�nCientifica(resultadov) + "Km");
								double conversionv = resultadov / UA;
								System.out.println("Conversi�n a UA: " + conversionv + " UA");
								System.out.println("*UA son unidades astronomicas, 1 UA es aproximadamente el equivalente a la distancia media entre la tierra y el sol (150.000.000 Km)*");
								double conversionAv = resultadov / AL;
								System.out.println("Conversi�n a AL: " + EliminarNotaci�nCientifica(conversionAv) + " AL");
								System.out.println("*AL son a�os luz, aproximadamente un a�o luz equivale a 9.460.730.472.580,8 Km*");
								break;
							case 3:
								System.out.println("-----------------" + "TIERRA" + "-----------------");
								double at = 1.521*Math.pow(10, 8);
								double pt = 1.471*Math.pow(10, 8);
								double sumat = at + pt;
								double resultadot = sumat /2;
								System.out.println("Distancia al sol: " + EliminarNotaci�nCientifica(at) + " + " + EliminarNotaci�nCientifica(pt) + " /2 " + " = " + EliminarNotaci�nCientifica(resultadot) + "Km");
								double conversiont = resultadot / UA;
								System.out.println("Conversi�n a UA: " + conversiont + " UA");
								System.out.println("*UA son unidades astronomicas, 1 UA es aproximadamente el equivalente a la distancia media entre la tierra y el sol (150.000.000 Km)*");
								double conversionAt = resultadot / AL;
								System.out.println("Conversi�n a AL: " + EliminarNotaci�nCientifica(conversionAt) + " AL");
								System.out.println("*AL son a�os luz, aproximadamente un a�o luz equivale a 9.460.730.472.580,8 Km*");
								break;
							case 4:
								System.out.println("-----------------" + "MARTE" + "-----------------");
								double ame = 2.491*Math.pow(10, 8);
								double pme = 2.067*Math.pow(10, 8);
								double sumame = ame + pme;
								double resultadome = sumame /2;
								System.out.println("Distancia al sol: " + EliminarNotaci�nCientifica(ame) + " + " + EliminarNotaci�nCientifica(pme) + " /2 " + " = " + EliminarNotaci�nCientifica(resultadome) + "Km");
								double conversionme = resultadome / UA;
								System.out.println("Conversi�n a UA: " + conversionme + " UA");
								System.out.println("*UA son unidades astronomicas, 1 UA es aproximadamente el equivalente a la distancia media entre la tierra y el sol (150.000.000 Km)*");
								double conversionAme = resultadome / AL;
								System.out.println("Conversi�n a AL: " + EliminarNotaci�nCientifica(conversionAme) + " AL");
								System.out.println("*AL son a�os luz, aproximadamente un a�o luz equivale a 9.460.730.472.580,8 Km*");
								break;
							case 5:
								System.out.println("-----------------" + "JUPITER" + "-----------------");
								double aj = 8.157*Math.pow(10, 8);
								double pj = 7.409*Math.pow(10, 8);
								double sumaj = aj + pj;
								double resultadoj = sumaj /2;
								System.out.println("Distancia al sol: " + EliminarNotaci�nCientifica(aj) + " + " + EliminarNotaci�nCientifica(pj) + " /2 " + " = " + EliminarNotaci�nCientifica(resultadoj) + "Km");
								double conversionj = resultadoj / UA;
								System.out.println("Conversi�n a UA: " + conversionj + " UA");
								System.out.println("*UA son unidades astronomicas, 1 UA es aproximadamente el equivalente a la distancia media entre la tierra y el sol (150.000.000 Km)*");
								double conversionAj = resultadoj / AL;
								System.out.println("Conversi�n a AL: " + EliminarNotaci�nCientifica(conversionAj) + " AL");
								System.out.println("*AL son a�os luz, aproximadamente un a�o luz equivale a 9.460.730.472.580,8 Km*");
								break;
							case 6:
								System.out.println("-----------------" + "SATURNO" + "-----------------");
								double as = 1.503*Math.pow(10, 9);
								double ps = 1.348*Math.pow(10, 9);
								double sumasa = as + ps;
								double resultadosa = sumasa /2;
								System.out.println("Distancia al sol: " + EliminarNotaci�nCientifica(as) + " + " + EliminarNotaci�nCientifica(ps) + " /2 " + " = " + EliminarNotaci�nCientifica(resultadosa) + "Km");
								double conversionsa = resultadosa / UA;
								System.out.println("Conversi�n a UA: " + conversionsa + " UA");
								System.out.println("*UA son unidades astronomicas, 1 UA es aproximadamente el equivalente a la distancia media entre la tierra y el sol (150.000.000 Km)*");
								double conversionAsa = resultadosa / AL;
								System.out.println("Conversi�n a AL: " + EliminarNotaci�nCientifica(conversionAsa) + " AL");
								System.out.println("*AL son a�os luz, aproximadamente un a�o luz equivale a 9.460.730.472.580,8 Km*");
								break;
							case 7:
								System.out.println("-----------------" + "URANO" + "-----------------");
								double au = 3.003*Math.pow(10, 9);
								double pu = 2.739*Math.pow(10, 9);
								double sumau = au + pu;
								double resultadou = sumau /2;
								System.out.println("Distancia al sol: " + EliminarNotaci�nCientifica(au) + " + " + EliminarNotaci�nCientifica(pu) + " /2 " + " = " + EliminarNotaci�nCientifica(resultadou) + "Km");
								double conversionu = resultadou / UA;
								System.out.println("Conversi�n a UA: " + conversionu + " UA");
								System.out.println("*UA son unidades astronomicas, 1 UA es aproximadamente el equivalente a la distancia media entre la tierra y el sol (150.000.000 Km)*");
								double conversionAu = resultadou / AL;
								System.out.println("Conversi�n a AL: " + EliminarNotaci�nCientifica(conversionAu) + " AL");
								System.out.println("*AL son a�os luz, aproximadamente un a�o luz equivale a 9.460.730.472.580,8 Km*");
								break;
							case 8:
								System.out.println("-----------------" + "NEPTUNO" + "-----------------");
								double an = 4.546*Math.pow(10, 9);
								double pn = 4.456*Math.pow(10, 9);
								double suman = an + pn;
								double resultadon = suman /2;
								System.out.println("Distancia al sol: " + EliminarNotaci�nCientifica(an) + " + " + EliminarNotaci�nCientifica(pn) + " /2 " + " = " + EliminarNotaci�nCientifica(resultadon) + "Km");
								double conversionn = resultadon / UA;
								System.out.println("Conversi�n a UA: " + conversionn + " UA");
								System.out.println("*UA son unidades astronomicas, 1 UA es aproximadamente el equivalente a la distancia media entre la tierra y el sol (150.000.000 Km)*");
								double conversionAn = resultadon / AL;
								System.out.println("Conversi�n a AL: " + EliminarNotaci�nCientifica(conversionAn) + " AL");
								System.out.println("*AL son a�os luz, aproximadamente un a�o luz equivale a 9.460.730.472.580,8 Km*");
								break;
							case 9:
								System.out.println("-----------------" + "PLUTON" + "-----------------");
								double aP = 7.380*Math.pow(10, 9);
								double pP = 4.447*Math.pow(10, 9);
								double sumaP = aP + pP;
								double resultadoP = sumaP /2;
								System.out.println("Distancia al sol: " + EliminarNotaci�nCientifica(aP) + " + " + EliminarNotaci�nCientifica(pP) + " /2 " + " = " + EliminarNotaci�nCientifica(resultadoP) + "Km");
								double conversionP = resultadoP / UA;
								System.out.println("Conversi�n a UA: " + conversionP + " UA");
								System.out.println("*UA son unidades astronomicas, 1 UA es aproximadamente el equivalente a la distancia media entre la tierra y el sol (150.000.000 Km)*");
								double conversionAP = resultadoP / AL;
								System.out.println("Conversi�n a AL: " + EliminarNotaci�nCientifica(conversionAP) + " AL");
								System.out.println("*AL son a�os luz, aproximadamente un a�o luz equivale a 9.460.730.472.580,8 Km*");
								break;
							case 10:
								System.out.println("-----------------" + "CERES" + "-----------------");
								double aC = 4.472975*Math.pow(10, 8);
								double pC = 3.814746*Math.pow(10, 8);
								double sumaC = aC + pC;
								double resultadoC = sumaC /2;
								System.out.println("Distancia al sol: " + EliminarNotaci�nCientifica(aC) + " + " + EliminarNotaci�nCientifica(pC) + " /2 " + " = " + EliminarNotaci�nCientifica(resultadoC) + "Km");
								double conversionC = resultadoC / UA;
								System.out.println("Conversi�n a UA: " + conversionC + " UA");
								System.out.println("*UA son unidades astronomicas, 1 UA es aproximadamente el equivalente a la distancia media entre la tierra y el sol (150.000.000 Km)*");
								double conversionAC = resultadoC / AL;
								System.out.println("Conversi�n a AL: " + EliminarNotaci�nCientifica(conversionAC) + " AL");
								System.out.println("*AL son a�os luz, aproximadamente un a�o luz equivale a 9.460.730.472.580,8 Km*");
								break;
							case 11:
								System.out.println("-----------------" + "HERIS" + "-----------------");
								double aE = 14594.512904*Math.pow(10, 6);
								double pE = 5765.732799*Math.pow(10, 6);
								double sumaE = aE + pE;
								double resultadoE = sumaE /2;
								System.out.println("Distancia al sol: " + EliminarNotaci�nCientifica(aE) + " + " + EliminarNotaci�nCientifica(pE) + " /2 " + " = " + EliminarNotaci�nCientifica(resultadoE) + "Km");
								double conversionE = resultadoE / UA;
								System.out.println("Conversi�n a UA: " + conversionE + " UA");
								System.out.println("*UA son unidades astronomicas, 1 UA es aproximadamente el equivalente a la distancia media entre la tierra y el sol (150.000.000 Km)*");
								double conversionAE = resultadoE / AL;
								System.out.println("Conversi�n a AL: " + EliminarNotaci�nCientifica(conversionAE) + " AL");
								System.out.println("*AL son a�os luz, aproximadamente un a�o luz equivale a 9.460.730.472.580,8 Km*");
								break;
							case 12:
								System.out.println("-----------------" + "MAKEMAKE" + "-----------------");
								double aM = 7894.762625*Math.pow(10, 6);
								double pM = 5671.928586*Math.pow(10, 6);
								double sumaM = aM + pM;
								double resultadoM = sumaM /2;
								System.out.println("Distancia al sol: " + EliminarNotaci�nCientifica(aM) + " + " + EliminarNotaci�nCientifica(pM) + " /2 " + " = " + EliminarNotaci�nCientifica(resultadoM) + "Km");
								double conversionM = resultadoM / UA;
								System.out.println("Conversi�n a UA: " + conversionM + " UA");
								System.out.println("*UA son unidades astronomicas, 1 UA es aproximadamente el equivalente a la distancia media entre la tierra y el sol (150.000.000 Km)*");
								double conversionAM = resultadoM / AL;
								System.out.println("*AL son a�os luz, aproximadamente un a�o luz equivale a 9.460.730.472.580,8 Km*");
								break;
							case 13:
								salir=true;
								break;
							default:
								System.out.println();
							}
						}
					case 4: //Distancias interplanetarias
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
								
								
								break;
							case 2://Venus a todos los planetas
								break;
							case 3://Tierra a todos los planetas
								break;
							case 4://MARTE
								break;
							case 5://JUPITER
								break;
							case 6://SATURNO
								break;
							case 7://URANO
								break;
							case 8://NEPTUNO
								break;
							case 9://PLUTON
								break;
							case 10://CERES
								break;
							case 11://ERIS
								break;
							case 12://MAKEMAKE
								break;
							case 13:
								salir=true;
								break;
							default:
								System.out.println();
								break;
								}
							}
					case 5: //Planetas sistema solar 3D
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
				}
	
	//Metodo para eliminar notaci�n cientifica
	  public static String EliminarNotaci�nCientifica(double N�mero) {
	  return new DecimalFormat("#.####################################").format(N�mero);
  } 
}
					
