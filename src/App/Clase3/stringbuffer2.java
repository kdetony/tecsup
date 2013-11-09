
package App.Clase3;


public class stringbuffer2 {

    public static void main(String[] args) {
      stringbuffer2.buffer3();
    }
     public static void buffer3() {
         StringBuffer sb = new StringBuffer("Java Basico Tecsup Lima");
        sb.insert(11," en");
        sb.delete(21,sb.length());
        System.out.println(sb);
                 
     }
    
}
