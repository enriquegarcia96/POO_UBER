import java.util.concurrent.Flow.Publisher;

class Car {

    // atributos
    private Integer id;
    private String license;
    private Account driver; // porque hereda de la clase Account
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
    }

    public Integer getPassenger() {
        return passegenger;
    }

    // permiten alterar este dato dentro de la clase
    public void setPassenger(Integer passenger) {
        // manejar la cantidad de pasajeros(validar)
        if (passenger == 4) {
            this.passegenger = passenger;

        } else {
            System.out.println("Necesitas asignar 4 pasajeros");
        }

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public Account getDriver() {
        return driver;
    }

    public void setDriver(Account driver) {
        this.driver = driver;
    }

}