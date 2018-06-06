class student1 {
	String name;
	int a;
	student(String n,int roll) {
		this.name=n;
		this.a=roll;
			}

	 public static void main(String args[]) {
	 	student s1=new student("samar",3);
	 	student s2=new student("amna",5);
	 	student s3=new student("nseem",7);

	 	System.out.println(s1==s2);
	 	System.out.println((String)s1.equals((String)s3));

			
		}
}
