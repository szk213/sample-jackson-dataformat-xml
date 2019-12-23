package com.szk213.sample.jackson_dataformat;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;

public class Sample {

	public static void main(String[] args) throws IOException {
		BufferedReader br = Files.newBufferedReader(Paths.get("data/test.xml"), StandardCharsets.UTF_8);

		XmlMapper mapper = new XmlMapper();
		OpenCredentials openCredentials = mapper.readValue(br, OpenCredentials.class);
		System.out.println(openCredentials);
	}

}
