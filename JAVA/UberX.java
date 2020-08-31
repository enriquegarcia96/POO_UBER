class UberX extends Car {
     String brand;
     String model;

     // constructor que debe councidir con la clase padre
     public UberX(String license, Account driver, String brand, String model) {
          // para referirme al metodo controstructor de la clase padre(Car)
          super(license, driver);

          this.brand = brand;

          this.model = model;
     }

     @Override
     void printDataCar() {
          super.printDataCar();
          System.out.println("Modelo: " + model + "Brand: " + brand);

     }

}