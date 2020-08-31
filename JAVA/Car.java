import java.util.concurrent.Flow.Publisher;

class Car {

    // atributos
    Integer id;
    String license;
    Account driver; // porque hereda de la clase Account
    private Integer passegenger;

    // constructor
    public Car(String license, Account driver) {
        this.license = license;
        this.driver = driver;

    }

    // metodo para imprimir las propiedades del objeto
    void printDataCar() {
        if (passegenger != null) {











            System.out.println("License: " + license + "Diver: " + driver.name + "Passengers: " + passegenger);

        }
        // imprimo del conductor
    }

    // get
    public Integer getPassenger() {
        return passegenger;
    }

>>>>>>> Polimorfismo
    // permiten alterar este dato dentro de la clase
    public void setPassenger(Integer passenger) {
        // manejar la cantidad de pasajeros(validar)
        if (passenger == 4) {
            this.passegenger = passenger;

        } else {
            System.out.println("Necesitas asignar 4 pasajeros");
        }

    }

}