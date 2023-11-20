package string;

public class Reversestring {

	public static void main(String[] args) {
		String p="chimakurhty ongole";
		String[]sp=p.split(" ");
		
		String rev=" ";
		for(String W:sp)
		{
			String reverse=" ";
			for(int i=W.length()-1;i>0;i--)
			{
				reverse=reverse+W.charAt(i);
			}
			rev=rev+reverse+" ";
		}
		System.out.println(rev);
		
			}
		
	}



