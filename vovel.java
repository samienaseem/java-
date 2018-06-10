import java.util.Scanner;
class vovel {
	static void findVovel(String str){
		int len=str.length();
		System.out.println(len);
		char ch[]=str.toCharArray();

		for (int i=0;i<len;i++) {
			if (ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u') {
				System.out.println(ch[i]+"is a vovel");
				
			}
			
		}

	}
	public static void main(String[] args) {
		System.out.println("enter the String");
		Scanner sc=new Scanner(System.in);
		String s=new String(sc.nextLine());
		findVovel(s);
	}
}