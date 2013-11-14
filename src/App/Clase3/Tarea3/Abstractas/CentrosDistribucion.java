

package App.Clase3.Tarea3.Abstractas;

public abstract class CentrosDistribucion extends Distrito{
                public abstract void codigo();
                public abstract void ruc();        
                public abstract void razonSocial();
                public abstract void direccion();        
                public abstract void telefono();        
    
            public void  vender() {
                    System.out.println("Venta de medicamentos y cuidado personal");
                }
}
