package Week3.day1Activity;

public class OddIndexUppercase {

	public static void main(String[] args) {
		
		String test = "changeme";
		
		char[] arr1 = test.toCharArray();
		
		for(int i=0; i<arr1.length; i++)
		{
			if(i%2==1)
			{
				arr1[i] = Character.toUpperCase(arr1[i]);
			}
		}
		for(int i=0; i<arr1.length; i++)
			System.out.print(arr1[i]);
	}

}
