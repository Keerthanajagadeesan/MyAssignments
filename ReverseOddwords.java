package Week3.day1Activity;

public class ReverseOddwords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "I am a software tester"; 
		
		String S[] = test.split(" ");
		
		for(int i=0; i<S.length; i++)
		{
			System.out.print(S[i] + " ");
		}
		System.out.println();
		
		for(int i=0; i<S.length; i++)
		{
			if(i%2==0)
				System.out.print(S[i] + " ");
			else
			{
				char[] word = S[i].toCharArray();
				
				for(int j=word.length-1; j>=0;j--)
				{
					System.out.print(word[j]);
				}
				System.out.print(" ");
			}
		}
	}

}
