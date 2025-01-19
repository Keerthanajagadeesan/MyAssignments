package Week3.day1Activity;

public class RemoveDuplicates {

	public static void main(String[] args) {
		
		String text = "We learn Java basics as part of java sessions in java week1"; 
		
		String splitString[] = text.split(" ");
		
		for(int i=0; i<splitString.length; i++)
		{
			System.out.print(splitString[i] + " ");
		}
		System.out.println();
		
		String newString[] = new String[10];
		int k=0;
		
		for(int i=0; i<splitString.length; i++)
		{
			int count = 0;
			for(int j=0; j<splitString.length; j++)
			{
				if(splitString[i].equalsIgnoreCase(splitString[j]))
					count++;
			}
			if(count==1)
			{
				newString[k] = splitString[i];
				k++;
			}
		}
		
		for(int i=0; i<newString.length; i++)
		{
			System.out.print(newString[i] + " ");
		}
	}

}
