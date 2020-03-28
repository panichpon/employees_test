package app.util;

import java.math.BigInteger;
import java.security.MessageDigest;

public class SHA2 {
	public String getMD5(String input) {

		String toReturn = null;
		try {
			MessageDigest digest = MessageDigest.getInstance("MD5");
			digest.update(input.getBytes());
	        
	        byte byteData[] = digest.digest();
	        StringBuffer sb = new StringBuffer();
	        for (int i = 0; i < byteData.length; i++) {
	        	sb.append(Integer.toString((byteData[i] & 0xff) + 0x100, 16).substring(1));
	        }
	        return sb.toString();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return toReturn;
	}
	
	public String getSHA1(String input) {

		String toReturn = null;
		try {
			MessageDigest digest = MessageDigest.getInstance("SHA1");
			digest.reset();
			digest.update(input.getBytes("utf8"));
			toReturn = String.format("%040x", new BigInteger(1, digest.digest()));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return toReturn;
	}

	
	public String getSHA256(String input) {

		String toReturn = null;
		try {
			MessageDigest digest = MessageDigest.getInstance("SHA-256");
			digest.reset();
			digest.update(input.getBytes("utf8"));
			toReturn = String.format("%040x", new BigInteger(1, digest.digest()));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return toReturn;
	}

	public String getSHA512(String input) {

		String toReturn = null;
		try {
			MessageDigest digest = MessageDigest.getInstance("SHA-512");
			digest.reset();
			digest.update(input.getBytes("utf8"));
			toReturn = String.format("%040x", new BigInteger(1, digest.digest()));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return toReturn;
	}
}
