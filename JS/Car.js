//clase
function Car(license, drive) {
  this.id;
  this.license = license; //ya instancia directamente los datos
  this.driver = drive;
  this.passenger;
}

//metodo contructore
Car.prototype.printDataCar = function () {
  console.log(this.driver);
  console.log(this.driver.name);
  console.log(this.driver.document);
};
