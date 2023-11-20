package string;

public class Birds {

	public static void main(String[] args) {
		String string = " the birds are flying in the sky";
		String newString=" ";
		for(int i=0;i<string.length();i++)
		{
			if(string.charAt(i)!=' ')
			{
				newString+=string.charAt(i);
			}
			else
			{
				if(i+1<string.length()&&string.charAt(i+1)!=' ')
			{
					newString+= string.charAt(i);
					}
			}
		}
	
	System.out.println(newString);


}
}