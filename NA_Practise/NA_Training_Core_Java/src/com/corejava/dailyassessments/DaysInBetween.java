package com.corejava.dailyassessments;

import java.util.*;

public class DaysInBetween {

	static int daysInMonth(int n,int i) {
			int d=0;
			if((n/4==0&&n/100!=0)||n/400==0) {
			switch(i) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				d=31;
				break;
			case 2:
				d=29;
				break;
			default :
				d=30;			
			}
		}

		else {
			switch(i) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				d=31;
				break;
			case 2:
				d=28;
				break;
			default :
				d=30;			
			}
		}
		return d;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int dd1,mm1,yy1,dd2,mm2,yy2,days=0;
		int dm;
		System.out.println("dd1 :");
		dd1=sc.nextInt();
		System.out.println("mm1 :");
		mm1=sc.nextInt();
		System.out.println("yy1 :");
		yy1=sc.nextInt();
		System.out.println("dd2 :");
		dd2=sc.nextInt();
		System.out.println("mm2 :");
		mm2=sc.nextInt();
		System.out.println("yy2 :");
		yy2=sc.nextInt();
		
		//if yy1==yy2
		if(yy1==yy2) {
				if(mm1<mm2) {
					for(int i=mm1;i<=mm2;i++) {
						dm = daysInMonth(yy1,i);
						if(i==mm1) {
							days+=(dm-dd1);
						}
						else if(i==mm2) {
							days+=dd2;
						}
						else
							days+=dm;
					}
				}
				if(mm1>mm2) {
					for(int i=mm2;i<=mm1;i++) {
						dm = daysInMonth(yy1,i);
						if(i==mm2) {
							days+=(dm-dd2);
						}
						else if(i==mm1) {
							days+=dd1;
						}
						else
							days+=dm;
					}
				}
				if(mm1==mm2)
					days=dd1-dd2;
					days=Math.abs(days);
		}
		
		
		//if yy1<yy2
		if(yy1<yy2) {
			
		for(int i=yy1;i<=yy2;i++) {
					if(i==yy1) {
						for(int j = mm1;j<=12;j++) {
							dm = daysInMonth(i,j);
							if(i==yy1&&j==mm1)
								days+=(dm-dd1);
							else 
								days+=dm;
					}
					
				}
				else if(i==yy2) {
					for(int j = 1;j<=mm2;j++) {
						dm = daysInMonth(i,j);
						if(i==yy2&&j==mm2)
							days+=dd2;
						else 
							days+=dm;
					}
				}
				else {
					for(int j = 1;j<=12;j++) {
						dm = daysInMonth(i,j);
						days+=dm;
					}
				}
			}
		}
		
		//if yy1>yy2
				if(yy1>yy2) {	
				for(int i=yy2;i<=yy1;i++) {
						if(i==yy2) {
							for(int j = mm2;j<=12;j++) {
								dm = daysInMonth(i,j);
								if(i==yy2&&j==mm2)
									days+=(dm-dd2);
								else 
									days+=dm;
							}
							
						}
						else if(i==yy1) {
							for(int j = 1;j<=mm1;j++) {
								dm = daysInMonth(i,j);
								if(i==yy1&&j==mm1)
									days+=dd1;
								else 
									days+=dm;
							}
						}
						else {
							for(int j = 1;j<=12;j++) {
								dm = daysInMonth(i,j);
								days+=dm;
							}
						}
					}
			}
		System.out.println("Days in between : "+days);
	}
}
