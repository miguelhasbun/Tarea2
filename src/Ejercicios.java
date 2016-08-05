
public class Ejercicios
{
	//devuelve la suma de x y y
	static int sumar(int x, int y)
	{
		int u=x+y;
		return u;
	}
	
	//devuelve la resta de x y y
	static int restar(int x, int y)
	{
		int l= x-y;
		return l;
	}
	//devuelve la multiplicacion de x y y
	static int multiplicar(int x, int y)
	{
		int g= x*y;
		return g;
	}
	
	//devuelve el residuo de x y y
	static int residuo(int x, int y)
	{
		int ma= x % y;
		return ma;
	}
	
	//devuelve true si x es par, de lo cotrario devuelve false
	static boolean esPar(int x)
	{
		
		int qw= x;
		
		if (qw%2==0){
			return true;
		}
		else
			return false;
		}
	
	//devuelve true si x es multiplo de 3, de lo cotrario devuelve false
	static boolean esMultiploDe3(int x)
	{
		int km= x;
		if (km%3==0){
			return true;
		}else{
			return false;
		}
		
	}
	
	//devuelve el numero mayor (x o y)
	static int getMayor(int x,int y)
	{
		int po= x, pi=y;
		
		if (po>pi){
			return po;
		}else{
			return pi;
		}
	}
	
	//devuelve true si la edad es mayor o igual a 18
	static boolean esMayorDeEdad(int edad)
	{
		int at= edad;
		
		if (at>=18){
			return true;
		}else{
			return false;
		}
				
	}
	
	//devuelve true si x, y y z son pares
	static boolean sonPares(int x, int y, int z)
	{
		int popi=x, pipo= y, pipa= z;
			if (popi%2==0 & pipo%2==0 & pipa%2==0){
				return true;
			}else{
				return false;
			}
		
	}
	
	//devuelve el numero mayor entre x, y y z
	static int getMayorDe3(int x, int y, int z)
	{
		if (x >y && x>z){
			return x;
		}
		
		if (y>x && y>z){
			return y;
		}else{
			return z;
		}
			
	}
	
	public static void main(String[] args)
	{
		
	}

}
