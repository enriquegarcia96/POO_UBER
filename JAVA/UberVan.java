import java.util.ArrayList;
import java.util.Map;

class UberVan extends Car {

     Map<String, Map<String, Integer>> typeCarAccepted;
     ArrayList<String> seatsMaterial;
     private Integer passenger;

     public UberVan(String license, Account driver, Map<String, Map<String, Integer>> typeCarAccepted,
               ArrayList<String> seatsMaterial) {
          super(license, driver);
          this.typeCarAccepted = typeCarAccepted;
          this.seatsMaterial = seatsMaterial;
     }

     // constructor
     public UberVan(String license, Account driver) {
          super(license, driver);

     }

     // sobre escribo el metodo que probiene de la clase padre (Car)
     // todo: estoy aplicando el polimorfismo
     @Override
     public void setPassenger(Integer passenger) {

          // manejar la cantidad de pasajeros(validar)
          if (passenger == 6) {
               this.passenger = passenger;
          } else {
               System.out.println("Necesitas asignar 6 pasajeros");
          }
     }

}