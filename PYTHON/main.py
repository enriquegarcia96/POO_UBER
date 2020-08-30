# importo el elemento y el nombre de la clase
from car import Car

if __name__ == "__main__":
    print("Hola mundo")
    car = Car()
    car.license = "HSJ79"
    car.driver = "Diana herrera"
    print(vars(car))

    car2 = Car()
    car2.license = "JDI281"
    car2.driver = "Derick Garcia"
    print(vars(car2))
