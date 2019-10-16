package com.test
import scala.io.Source

object class1{
  def main(args:Array[String]){
    var fil = "D:/BigData_Recordings/scalafile.txt"
    var read = Source.fromFile(fil)
    for (a<-read.getLines)
    {  print(a)
      
    }
        read.close()
    
   
   
  
  
}}