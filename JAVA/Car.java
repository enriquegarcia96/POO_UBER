class Car {

    // atributos
    Integer id;
    String license;
    Account driver; // porque hereda de la clase Account
    Integer passegenger;

    // constructor
    public Car(String license, Account driver) {
        this.license = license;
        this.driver = driver;
    }

    // metodo para imprimir las propiedades del objeto
    void printDataCar() {
        // imprimo del conductor
        System.out.println("License: " + license + "Diver: " + driver.name);
    }
}