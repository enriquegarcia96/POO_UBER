class Main {
     public static void main(String[] args) {

          // * llamo a mi constructo de la clase Account para asignarle el nombre y el
          // documento al driver
          UberX uberX = new UberX("AMQ123 ", new Account("Diana Gonzales ", "PINK21"), "Honda", "Civic");
          uberX.setPassenger(4);
          uberX.printDataCar();

          UberVan uberVan = new UberVan("JUW12 ", new Account("Omar Lopez", "OUJ90"));
          uberVan.setPassenger(6);
          uberVan.printDataCar();

     }
}