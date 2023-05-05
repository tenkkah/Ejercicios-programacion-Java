package EjerciciosTeoria;


public class Fecha {
    int dia, mes, anio;
   
    //Constructor por defecto por los parentesis
    public Fecha(){    
        this.dia=1;
        this.mes=1;
        this.anio=1900;
    }
   
    //Constructor con sus parametros
    public Fecha(int dia, int mes, int anio){
        this.dia=dia; //El this indica que pertenece a esa clase.
        this.mes=mes;
        this.anio=anio;
    }
    //METODOS
    boolean bisiesto() {
     boolean respuesta=false;      
     if(this.anio%4==0) { //Es bisiesto cuando sea divisible entre 100 y entre 400 SIEMPRE ES ASI
       if(this.anio%100==0) {
           if(this.anio%400==0) {
            System.out.println("El año "+this.anio+" es bisiesto");
              respuesta=true;
    }else{
            System.out.println("El año "+this.anio+" no es bisiesto");
           }
    }else {
            System.out.println("El año "+this.anio+ " es bisiesto");
           respuesta=true;
       }
    }else{
            System.out.println("El año "+this.anio+" no es bisiesto");
     }
         return respuesta;
}
    int diasMes(int mes){ //devolverá el número de días del mes que se le indique(para el año de la fecha).
       int dias=0;
       switch(mes){
           case 1:          
           case 3:
           case 5:
           case 7:
           case 8:
           case 10:
           case 12:dias=31;
                    break;
           case 4:
           case 6:
           case 9:
           case 11:dias=30;
                    break;
           case 2:if(bisiesto())
               dias=29;
           else
               dias=28;
       }  
        return dias;
    }
    void valida(){
        if(anio<1900 || anio>2050)
            this.anio=1900;
       
        if(this.mes<1 || this.mes>12)
            this.mes=1;
       
        if(this.dia<1 || this.dia>diasMes(this.mes)) //Si es mayor de 31 sera error, si es febreo y es menor que 1 y el dia es mayor de 28 era error, dependera del mes
            this.dia=1;
    }
    void corta(){
        String dia="0"; //Sirve para escribir el 0 delante de cualquier dia que sea < 10
        String mes="0"; // Sirve para escribir el 0 delante de cualquier mes que sea < 10
        if(this.dia<10) //Si es menor de 10 le escribo el 0 por delante.
            dia=dia+this.dia;
        else
            dia=""+this.dia;
         if(this.mes<10)
            mes=mes+this.mes;
         else
            mes=""+this.mes;  
        System.out.println(dia+"-"+mes+"-"+this.anio);
    }
   
    int diasTranscurridos(){
        int dias=0;
        for(int i=1900;i<this.anio;i++);
         if(bisiesto()) //Si es bisiesto le suma 366
             dias=dias+366;
         else
             dias=dias+365;
         for(int i=1;i<this.mes;i++) //Si no es bisiesto se suma 365
             dias=dias+diasMes(i);
         dias=dias+this.dia;
        return 0;
    }
    
  String diaSemana(){
      String[] dia={"Domingo","Lunes","Martes","Miercoles","Jueves","Viernes","Sabado"};
      return dia[diasTranscurridos()%7-1];
  }
  
  int diasEntre(Fecha f){
      int dias=0;
      dias=diasTranscurridos()-f.diasTranscurridos();
      if (dias<0)
          dias=dias-(-1);
      return dias;
  }
  
  void siguiente(){
      if(this.dia<diasMes(this.mes))
          this.dia++;
      else
          this.dia=1;
      if(this.mes<12)
          this.mes++;
      else{
          this.mes=1;
          this.anio++;
      }
      
  }
}
