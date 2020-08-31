class Main {
     public static void main(String[] args) {

          // * llamo a mi constructo de la clase Account para asignarle el nombre y el
          // documento al driver
          UberX uberX = new UberX("AMQ123", new Account("Diana Gonzales ", "PINK21"), "Honda", "Civic");
          uberX.setPassenger(2);
          uberX.printDataCar();

          Car car2 = new Car("QWE567", new Account("Enrique García ", "RED323"));
          // car2.passegenger = 3;
          car2.printDataCar();

     }
}