
public class javaAPIPractice
	{

		public static void main(String[] args)
			{
				
				String phrase = "Hello everyone!";
				String phrase2 = "That's all Folks!";
				String phrase3 = "Alright GoodBye";
		
				System.out.println(phrase.substring(0,3));
				
				System.out.println(phrase2.substring(7,10));
				
				System.out.println(phrase3.length());
				
				System.out.println(phrase.codePointCount(0, 1));
				
				System.out.println(phrase3.codePointCount(0, 14));
				
				System.out.println(phrase3.concat(phrase));
				
				System.out.println(phrase.replace("e", "x"));
				
				System.out.println(phrase2.toUpperCase());
				
				System.out.println(phrase3.replaceAll(" ", ""));
				
				System.out.println(phrase2.compareTo(phrase3));
					
			}

	}
