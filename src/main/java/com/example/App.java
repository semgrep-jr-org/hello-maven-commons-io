package com.example;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

import org.apache.commons.io.IOUtils;

public class App {
    public static void main(String[] args) throws IOException {
        try (InputStream in = IOUtils.toInputStream("Hello, World!", StandardCharsets.UTF_8)) {
            System.out.println(IOUtils.toString(in, StandardCharsets.UTF_8));
        }
    }
}
