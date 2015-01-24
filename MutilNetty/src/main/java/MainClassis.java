import java.util.concurrent.Executor;
import java.util.concurrent.Executors;


public class MainClassis {

	public static void main(String[] args) {
		try {
			Executor executor = Executors.newFixedThreadPool(2);
			executor.execute(new DiscardServer(8088));
			executor.execute(new DiscardServer(8089));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
