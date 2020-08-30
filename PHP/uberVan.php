<?php 
require_once('car.php');

class UberVan extends Car{
     public $typeCarAccept;
     public $seatsMaterial;

     public function __construct($license, $driver, $typeCarAccept, $seatsMaterial ){
          parent::__construct($license, $driver);
          $this->typeCarAccept = $brand;
          $this->seatsMaterial = $seatsMaterial;
     }




}



?>