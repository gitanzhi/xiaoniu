package cn.edu360.day10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Util {

	public static String runJar(String comd) {
		Runtime runtime = Runtime.getRuntime();
		try {
			Process exec = runtime.exec(comd);
			BufferedReader br = new BufferedReader(new InputStreamReader(exec.getInputStream()));
			StringBuilder sb = new StringBuilder();
			String line = null;
			while((line=br.readLine())!=null){
				sb.append(line+"\n");
			}
			return sb.toString();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

}
