import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MultipleAnyCallableRunner {

	public static void main(String[] args) throws InterruptedException, ExecutionException {

		
		ExecutorService executorService = Executors.newFixedThreadPool(1);
		
		List<CallableTask> tasks = List.of(new CallableTask("Hendrix"), new CallableTask("Bobby"),
				new CallableTask("in28Minutes"));

		String results = executorService.invokeAny(tasks);

		
		System.out.println(results);

		executorService.shutdown();
	}

}
