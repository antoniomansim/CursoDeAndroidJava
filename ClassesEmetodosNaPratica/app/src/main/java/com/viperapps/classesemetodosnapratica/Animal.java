package com.viperapps.classesemetodosnapratica;

 class Animal {
     int tamanho;

     public int getTamanho() {
         return tamanho;
     }

     public void setTamanho(int tamanho) {
         this.tamanho = tamanho;
     }

     public double getPeso() {
         return Peso;
     }

     public void setPeso(double peso) {
         Peso = peso;
     }

     String cor;
     double Peso;

     void  setCor(String cor){
         this.cor = cor;
     }
     String getCor(){
         return this.cor;
     }

     void dormir(){
         System.out.println("Dormir como um animal");}

     void correr(){
         System.out.println("Correr como um animal");}
}
