
package Clase02;


public class Recursividad {

 /**
El metodo recursivo debe tener 
Minimo una condicion de parada/base, que nos permita devolver un valor
Una llamada a si misma        
*/
 
public static int factorial(int n){
if (n==0){
return 1;
}
else{
return n*factorial(n-1);

}
}

public static int encontrarMax(int[] numeros,int indice, int max){
//Mi condicion de parada es cuando indice == numeros.length
if(indice!=numeros.length){

if (numeros[indice]>max){
    max = encontrarMax(numeros,indice +1,numeros[indice]);
}    
else{
    max = encontrarMax(numeros,indice +1,max);
    
}  
}

return max;


}

}