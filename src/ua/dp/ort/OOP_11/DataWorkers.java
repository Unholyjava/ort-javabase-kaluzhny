package ua.dp.ort.OOP_11;

import java.util.ArrayList;

/**
 * Interface as a database of workers
 * is use the list ArrayList 
 * @author Admin
 *
 */
public interface DataWorkers {
	public static ArrayList<Worker> setAllWorkers() {
		ArrayList<Worker> allWorkers = new ArrayList<Worker>();
		allWorkers.add(new TimeWorker(1, "Василий Иванов"));
		allWorkers.add(new TimeWorker(2, "Виталий Петров"));
		allWorkers.add(new TimeWorker(3, "Николай Сидоров"));
		allWorkers.add(new ConstWorker(4, "Андрей Смирнов"));
		allWorkers.add(new ConstWorker(5, "Федор Андреев"));
		allWorkers.add(new ConstWorker(6, "Андрей Андреев"));
		return allWorkers;
	}
}
