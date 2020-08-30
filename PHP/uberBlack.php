<?php 
require_once('car.php');
class UberBlack extends Car{
     public $typeCarAccept;
     public $seatsMaterial;

     
     public function __construct($license, $drive, $typeCarAccept, $seatsMaterial){
          //paso los datos al metodo constructor de la clase padre
          parent::__construct($license, $drive);
          $this->typeCarAccept = $typeCarAccept;
          $this->seatsMaterial = $seatsMaterial;
     }
}


?>