package com.hms.data;

import java.io.*;
import java.nio.file.*;
import java.util.*;

public class FileStorageService {

    public static String readFile(String filename) throws IOException {
        return Files.readString(Path.of(filename));
    }

    public static void writeFile(String filename, String content) throws IOException {
        Files.writeString(Path.of(filename), content, StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);
    }

    public static boolean fileExists(String filename) {
        return Files.exists(Path.of(filename));
    }
}
