package session7;

import java.util.*;

class persons{
	public String name;
	public String born_date;
	public persons(String name, String born_date) {
		this.name = name;
		this.born_date = born_date;
	}
	
	public void sleep() {
		System.out.println("\n" + name + " is currently sleeping, unable to do any action anymore\n");
	}
}

class mahasiswa extends persons{
	public int student_id;
	public int points;
	public mahasiswa(String name, String born_date, int student_id, int points) {
		super(name, born_date);
		this.student_id = student_id;
		this.points = points;
	}
	
	public void helpingdosen() {
		System.out.println(name + " is helping his/her lecturer, gaining 10 points!");
		points += 10;
	}
	
	public String toString() {
		return ("name : " + name + "\nborn date : " + born_date + "\nstudent id : " + student_id + "\npoints : " + points);
	}
}

class dosen extends persons{
	public int code_dosen;
	public int points;
	public dosen(String name, String born_date, int code_dosen, int points) {
		super(name, born_date);
		this.code_dosen = code_dosen;
		this.points = points;
	}
	
	public void selfdev() {
		System.out.println(name + " is joining a self developement program, gaining 10 points!");
		points += 10;
	}
	
	public void teach() {
		System.out.println(name + " is teaching a student, gaining 10 points!");
		points += 10;
	}
	
	public void p2m() {
		System.out.println(name + " is making a business program, gaining 10 points!");
		points += 10;
	}
	
	public void research() {
		System.out.println(name + " is doing some research, gaining 10 points!");
		points += 10;
	}
	
	public void otherworks() {
		System.out.println(name + " is busy at the moment");
	}
	
	public String toString() {
		return ("name : " + name + "\nborn date : " + born_date + "\ncode dosen : " + code_dosen + "\npoints : " + points);
	}
}

public class quiz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		mahasiswa m = new mahasiswa("kelvin", "4 may", 12345, 3);
//		System.out.println(m.toString());
//		m.helpingdosen();
//		System.out.println(m.toString());
		
		int choice;
		Scanner sc = new Scanner(System.in);
		System.out.println("choose a role:\n1. Mahasiswa\n2. Dosen\n");
		choice = sc.nextInt();
		
		if(choice == 1) {
			String name, borndate;
			
			System.out.println("enter your name");
			name = sc.next();
			System.out.println("enter your born date");
			borndate = sc.next();
			System.out.println("enter your student id");
			int stuid = sc.nextInt();
			System.out.println("enter your current points");
			int point = sc.nextInt();

			mahasiswa m = new mahasiswa(name, borndate, stuid, point);
			System.out.println(m.toString()); 
			
			int action = 1;
			while(action != 2) {	
				System.out.println("select an action\n1. helping dosen\n2. sleep");
				action = sc.nextInt();
				if(action == 1) {
					m.helpingdosen();
					System.out.println(m.toString());
				}
				else if(action == 2) {
					System.out.println(m.toString());
					m.sleep();
				}
			}
		}
		if(choice == 2) {
			String name, borndate;
			
			System.out.println("enter your name");
			name = sc.next();
			System.out.println("enter your born date");
			borndate = sc.next();
			System.out.println("enter your code dosen");
			int cd = sc.nextInt();
			System.out.println("enter your current points");
			int point = sc.nextInt();

			dosen d = new dosen(name, borndate, cd, point);
			System.out.println(d.toString()); 
			
			int action = 1;
			while(action != 6) {	
				System.out.println("select an action\n1. self developement\n2. teaching\n3. p2m\n4. research\n5. other works\n6. sleep");
				action = sc.nextInt();
				if(action == 1) {
					d.selfdev();
					System.out.println(d.toString());
				}
				else if(action == 2) {
					d.teach();
					System.out.println(d.toString());
				}
				else if(action == 3) {
					d.p2m();
					System.out.println(d.toString());
				}
				else if(action == 4) {
					d.research();
					System.out.println(d.toString());
				}
				else if(action == 5) {
					d.otherworks();
					System.out.println(d.toString());
				}
				else if(action == 6) {
					System.out.println(d.toString());
					d.sleep();
				}
			}
		}
		sc.close(); 
	}

}
