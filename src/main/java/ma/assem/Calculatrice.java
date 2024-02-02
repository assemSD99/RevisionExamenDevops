package ma.assem;

public class Calculatrice {
	public int multi(int a,int b){
		return a*b;
	}
	public int div(int a,int b)throws ArithmeticException{
		if(b==0){
			throw new ArithmeticException("la div sur 0 est impo");}
                return a/b;
        }

	
}
