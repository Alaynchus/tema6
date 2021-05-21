package ejercicio4y5y6tanda1;

public class Rectangulo {
	private int lado1, lado2;
	Rectangulo(int la1, int la2){
		lado1=la1;
		lado2=la2;
	}
	Rectangulo(){
		lado1=(int)(Math.random()*93)-2;
		lado2=(int)(Math.random()*93)-2;
	}
	double area() {		
		return lado1*lado2;
	}
	public String toString() {
		return "Rectangulo [lado1=" + lado1 + ", lado2=" + lado2 + "]";
	}
	
}
