
package App.Clase3.interfases.posicion;


public class Carro implements Position {

        private int numeropuertas;
        private String color;
        
        private double longitud;  /*variable longitud/latitud se puede cambiar*/
        private double latitud;
        
        /**constructor e instaciamos*/
        public Carro(double longitud, double latitud) {
            this.longitud = longitud;   /*this.longitud clase*/
            this.latitud = latitud;
        }
        

    public int getNumeropuertas() {
        return numeropuertas;
    }

    public void setNumeropuertas(int numeropuertas) {
        this.numeropuertas = numeropuertas;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public double getLongitud() {
       return this.longitud;
    }

    @Override
    public double getLatitud() {
       return this.latitud;
    }
        
        
    }

