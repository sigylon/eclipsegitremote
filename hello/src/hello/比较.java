package hello;

import java.util.Scanner;

public class ±»Ωœ {

	
//123
	//234
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in=new Scanner(System.in);
		int bjt;
		int utc;
		int s,m;
		bjt=in.nextInt();
		s=bjt%10;
		m=bjt%100/10;
		
		if((bjt>=0&&bjt<=2359))
		{
			if((bjt/100)>8) {
				utc=((bjt/100)-8);
				System.out.print(utc);
				System.out.print(m);
				System.out.print(s);
			}
			else if((bjt/100)==8) {
				 if(m>0) {
					System.out.print(m);
					System.out.print(s);
				}else
					System.out.print(s);
				
				   
				}
			
			else if((bjt/100)<8) {
				utc=((bjt/100)+24-8);
				System.out.print(utc);
				System.out.print(m);
				System.out.print(s);
			}
			else if(((bjt/100)==0)&&(m>0)) {
				
				System.out.print(m);
				System.out.print(s);
			}
			
            else if(((bjt/100)==0)&&(m==0)) {
				
				
				System.out.print(s);
			}
			}else {
				System.out.println(" ‰»Î¥ÌŒÛ");
			}
		}
		
	    }  
