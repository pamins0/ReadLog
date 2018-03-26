import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadLogs {

	public static void main(String[] args) throws IOException {
		File fileLocation = new File("D:\\AppErrorMonitoringTool\\Input\\IAFLogs");
		File[] files = fileLocation.listFiles();
		for (File file : files) {
			BufferedReader br = new BufferedReader(new FileReader(file));
			String line = null;
			StringBuilder stringBuilder = new StringBuilder();
			while ((line = br.readLine()) != null) {
				stringBuilder.append(line).append("\n");
			}
			if (stringBuilder.toString().contains("PGM_CHNG_LOG logg WHERE PGM_ID =? AND LOG_ID")) {
				System.out.println("\nFile:" + file.getName());
			}
			br.close();
		}
	}

}
