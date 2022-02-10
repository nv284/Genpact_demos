package com.org.gen.day1;

public class LadderDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int exammarks = 75; 
char grade ;
if(exammarks >= 90 )
{
	grade = 'A';
}
else if(exammarks >= 80 ) {
	grade ='B';
}else if(exammarks >=70) {
	grade ='C';
	
}else if(exammarks >= 60) {
	grade ='D';
}else {
	grade ='F';
	
}
System.out.println(" Grade is :  "+ grade);
	}

}
