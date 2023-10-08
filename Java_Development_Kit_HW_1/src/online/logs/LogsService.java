package online.logs;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class LogsService {

    public void logsOut(String chatLogs) throws IOException {
        File file = new File("Logs.txt");
        Path logsAbsPath = Paths.get(file.getAbsolutePath());
        List<String> lines = List.of(chatLogs.split("\n"));
        if (file.exists()) {
            Files.write(logsAbsPath, lines, StandardCharsets.UTF_8);
        } else {
            Files.createFile(logsAbsPath);
            Files.write(logsAbsPath, lines, StandardCharsets.UTF_8);
        }
    }

    public String logsIn() throws IOException {
        File file = new File("Logs.txt");
        Path logsAbsPath = Paths.get(file.getAbsolutePath());
        List<String> lines = new ArrayList<>();
        if (file.exists()) {
            lines = Files.readAllLines(logsAbsPath, StandardCharsets.UTF_8);
            String chatLogs = String.join("\n",lines);
            return chatLogs+"\n";
        }
        return "";
    }
}
