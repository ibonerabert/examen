

/**
 * Write a description of class doc here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public interface doc
{
   
   // Devuelve el contenido de la fila x del fichero de texto con ruta absoluta file.
   /** @param tiene dos parametro uno es la x es el contenido de filas
    * @param file es el archivo
    * @return el numero de filas y el archivo
    */
   public abstract String obtenerLinea(int x, String file);
   
   /**entrada:direccion es un String
    * precondicion:
    * potscondicion:
    * salida: latidud y altitud los dos son un float
    */
   /** el metodo calcula la latitud y altitud de la direccion que has introducido
    * @param String direccion
    * @return devuelve dos float con la latitud y altitud 
    */
   public void metodo(String direccion);
   
   
   
       
    
}
