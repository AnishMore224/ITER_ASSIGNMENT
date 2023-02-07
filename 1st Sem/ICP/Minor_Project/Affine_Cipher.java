/*Name: ANISH MORE
  Registration number: 2241013365
  Section: 2241037
  Branch: CSE 
  Name of the program : To design a Affine chiper.
 */
import java.util.Scanner;
public class Affinecipher
{
	static int k1;
	static int k2;
	public static void getKeyValue()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the value of first key(k1) : ");
		k1=sc.nextInt();
		System.out.print("Enter the value of second key(k2) : ");
		k2=sc.nextInt();
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the message : ");
		String plaintext=sc.nextLine();
		getKeyValue();
		String ciphertext=encrypt(plaintext);
		System.out.println("After encryption, the ciphertext is : "+ciphertext);
		String plaintext_after_decryption=decrypt(ciphertext);
		System.out.println("After decryption, the plaintext is : "+plaintext_after_decryption);
		

	}	
	public static String encrypt(String plaintext) 
	{ 
		String ciphertext="";
		for(int i=0;i<plaintext.length();i++)
		{
			char character=plaintext.charAt(i);
			if(character!=' ') 
			{
				int value=0;
				for(int j=0;j<26;j++)
				{
					if(((char)(97+j))==character)
					{
					value=j;
					break;
					}
				}
			
			int C=(value*k1+k2)%26;
			ciphertext=ciphertext+((char)(65+C));
			}
		
			else 
			{
				ciphertext=ciphertext+character;
			}
		}
		return ciphertext;
	}

	public static String decrypt(String ciphertext) 
	{ 
		String plaintext_After_Decryption="";
		for(int i=0;i<ciphertext.length();i++)
		{
			char character=ciphertext.charAt(i);
			int value=-1;
			if(character!=' ') 
			{
				for(int j=0;j<26;j++)
				{
				
					if((char)(65+j)==character)
					{
						value=j;
						break;
					}
			
				}
				int additive_inverse=Math.abs(26-k2)%26;
				int multiplicative_Inverse=multiplicative_inverse(k1);
				if (multiplicative_Inverse==-1)
				{
				    System.out.println("No multiplicative inverse found for k1 as k1 is even number so decryption cannot be done and it will return null. " );
				    return null;
				}
				int P=((((value+additive_inverse)%26)*multiplicative_Inverse)%26)%26;
				plaintext_After_Decryption=plaintext_After_Decryption+(char)(97+P);
			}
			else
			{
				plaintext_After_Decryption=plaintext_After_Decryption+character;
			}
		}
		return plaintext_After_Decryption;
	}
	public static int multiplicative_inverse(int k1)
	{    
		 k1= k1%26; 
		    for (int i = 1; i < 26;i++) 
		    if ((k1 * i) % 26 == 1) 
		      return i; 
		    return -1;
	}
}
