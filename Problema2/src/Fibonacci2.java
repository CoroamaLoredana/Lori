
//2222222222222222222222222222222222222222222222222222
//By considering the terms in the Fibonacci sequence whose values
//do not exceed four million, find the sum of the even-valued 
//terms.
public class Fibonacci2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int first=1, second=2;
		
		int sum=0;
		System.out.println(first+" ");//afiseaza primul termen
		while(first<4000000)
		{
			if(second%2==0){
			sum+=second;}
			System.out.println(second);//afiseaza restul termenilor
			int aux;
			aux=first;
			first=second;
			second=second+aux;
			
				
			
		}
		System.out.println(sum);//afiseaza suma termenilor
	}

}

