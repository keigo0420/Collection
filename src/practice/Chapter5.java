package practice;

import java.time.*;
import java.util.Set;
import java.util.TreeSet;

public class Chapter5 {

	public static void main(String[] args) {

		Set<Task> list = new TreeSet<>();
		list.add(new Task(LocalDate.of(2021, 10, 21), "牛乳を買う"));
		list.add(new Task(LocalDate.of(2021, 9, 15), "○○社面接"));
		list.add(new Task(LocalDate.of(2021, 12, 4), "手帳を買う"));
		list.add(new Task(LocalDate.of(2021, 8, 10), "散髪に行く"));
		list.add(new Task(LocalDate.of(2021, 11, 9), "スクールの課題を解く"));

		for (Task d : list)
			System.out.println(d);

	}
}