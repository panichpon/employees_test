package app.util;

import java.util.UUID;

import org.apache.commons.codec.digest.DigestUtils;

public class UUIDUtil {
	
	public static void main(String[] args) {
		UUIDUtil z = new UUIDUtil();
		System.out.println("UUID: " + z.generateUUID());
		System.out.println("ZYANID: " + z.generateZyanID());
		System.out.println("NEWZYANID: " + z.generateNewZyanID());
	}
	
	public String generateUUID() {
		UUID uuid = UUID.randomUUID();
		return uuid.toString();
	}
	
	public long generateZyanID() {
		return System.nanoTime();
	}
	
	public long generateZyanIDMilli() {
		return System.currentTimeMillis();
	}
	
	public String generateNewZyanID() {
	    String ts = String.valueOf(System.currentTimeMillis());
	    String rand = UUID.randomUUID().toString();  
	    String reString = "Z001" + DigestUtils.md5Hex(ts + "-" + rand).toUpperCase();
	    return reString;
	}
}
