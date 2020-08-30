class Main {
     public static void main(String[] args) {
          System.out.println("hola mundo perrro");

          // * llamo a mi constructo de la clase Account para asignarle el nombre y el
          // documento al driver
          Car car = new Car("AMQ123", new Account("Diana Gonzales", "PINK21"));
          car.passegenger = 4;
          car.printDataCar();

          Car car2 = new Car("QWE567", new Account("Enrique García ", "RED323"));
          car2.passegenger = 3;
          car2.printDataCar();

     }
}