package study;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ExcutorService {
	public static void main(String[] args) {

		ScheduledThreadPoolExecutor excutor = new ScheduledThreadPoolExecutor(3);
		System.out.println(DateTimeFormatter.ofPattern("HH:mm:ss.SSS").format(LocalDateTime.now()));
		
		Runnable task1 = () -> {
			System.out.println(DateTimeFormatter.ofPattern("HH:mm:ss.SSS").format(LocalDateTime.now())+ "  start1");
		};
		Runnable task2 = () -> {
			System.out.println(DateTimeFormatter.ofPattern("HH:mm:ss.SSS").format(LocalDateTime.now()) + "  start2");
		};
		
		excutor.schedule(task1, 10, TimeUnit.SECONDS);
		
		excutor.schedule(task1, 20, TimeUnit.SECONDS);
	}
}
