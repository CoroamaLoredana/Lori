//3333333333333333333333333333333333333333333333333333



import java.util.Scanner;

public class Palindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//System.out.println("Introdu un numar:");
//Scanner palindrome=new Scanner(System.in);
int palindrom;
//palindrom=palindrome.nextInt();
//if(conditie(palindrom))

	

int value = 0;
for(int i = 100;i <=999;i++)
{
    for(int j = i;j <=999;j++)
    {
        int value1 = i * j;
        
        if(conditie(value1) && value<value1)
        {
            value = value1;

        }

    }
    
}
System.out.println(value);
  }

public static boolean   conditie(int nr)
{
	int aux=nr, oglindit=0;
	while(aux!=0)
	{
		oglindit=oglindit*10+aux%10;
		aux=aux/10;
		
		
	}
	if(nr==oglindit){
		return true;}
	return false;
}
	

}