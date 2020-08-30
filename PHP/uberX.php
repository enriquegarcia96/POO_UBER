<?php 
require_once ('car.php');
    
class UberX extends Car{
          public $brand;
          public $model;


          //constructor
          public function __construct($license, $driver, $brand, $model){
               parent::__construct($license, $driver); //equivale la palabra super en ja, $brand, $modelva

               $this->license = $license;
               $this->dirver = $driver;
               $this->brand = $brand;
               $this->model = $model;
          }
     }


?>