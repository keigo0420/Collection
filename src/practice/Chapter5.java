package practice;

import java.time.*;
import java.util.Set;
import java.util.TreeSet;

public class Chapter5 {

	public static void main(String[] args) {

		Set<Task> list = new TreeSet<>();
		list.add(new Task(LocalDate.of(2021, 10, 21), "�����𔃂�"));
		list.add(new Task(LocalDate.of(2021, 9, 15), "�����Жʐ�"));
		list.add(new Task(LocalDate.of(2021, 12, 4), "�蒠�𔃂�"));
		list.add(new Task(LocalDate.of(2021, 8, 10), "�U���ɍs��"));
		list.add(new Task(LocalDate.of(2021, 11, 9), "�X�N�[���̉ۑ������"));

		for (Task d : list)
			System.out.println(d);

	}
}