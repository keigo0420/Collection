package practice;

import java.util.*;
import java.time.*;

public class Task {
	public static void main(String[]args) {
		
		
		LocalDate l1 = LocalDate.of(2021,10,21);
		LocalDate l2 = LocalDate.of(2021,9,15);
		LocalDate l3 = LocalDate.of(2021,12,14);
		LocalDate l4 = LocalDate.of(2021,8,10);
		LocalDate l5 = LocalDate.of(2021,11,9);
		
		
		
		Set<String>tasks=new TreeSet<String>();
		
		tasks.add(l1+" :�����𔃂��B");
		tasks.add(l2+":�����Жʒk");
		tasks.add(l3+":�蒠�𔃂��B");
		tasks.add(l4+":�U���ɍs���B");
		tasks.add(l5+":�X�N�[���̉ۑ�������B");
		
		for(String t:tasks) { 
		
		System.out.println(t);
	}

}}
