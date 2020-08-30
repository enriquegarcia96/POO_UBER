<?php 
     require_once("car.php");
     require_once("./uberX.php");
     require_once("./uberPool.php");
     require_once("./account.php");

     //creo objetos
     $uberX = new UberX("CBS321", new Account("Diana Gonzales","AND672"),"TOYOTA","3.0");
     $uberX->printDataCar();

     $uberPool = new UberPool("CS369", new Account("Enrique Garcia","AKI72"),"Honda","civic");
     $uberPool->printDataCar();

?>