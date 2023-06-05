public class Main
{
	public static void main(String[] args) {
		String s="NAYAN";
		String rev="";
		
		for(int i=s.length()-1;i>=0;i--)
		{
		    rev+=s.substring(i,i+1);
		}
		System.out.println(s);
		System.out.println(rev);
		System.out.println(s.compareTo(rev));
		if(s.equals(rev))
		{
		    System.out.println("Palindrome");
		}
		else{
		    System.out.println("not palindrome");
		}
	}
}
