package app.util;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Path;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;

public class QRCodeGenerator {

	//private static final String QR_CODE_IMAGE_PATH = "/var/home/zyan/dairy-resource/cow-qrcode/";
	private static final String QR_CODE_IMAGE_PATH = "D:\\test";

	public void generateQRCodeImage(String text, int width, int height, String filePath)
			throws WriterException, IOException {
		QRCodeWriter qrCodeWriter = new QRCodeWriter();
		BitMatrix bitMatrix = qrCodeWriter.encode(text, BarcodeFormat.QR_CODE, width, height);

		Path path = FileSystems.getDefault().getPath(filePath);
		MatrixToImageWriter.writeToPath(bitMatrix, "PNG", path);
	}

	public static void main(String[] args) {
		try {
			String zyanCode = "Z000350989C68E6579E550FF7ECA37CB5A8C";
			QRCodeGenerator qr = new QRCodeGenerator();
			qr.generateQRCodeImage("https://beef.zyanwoa.com/global/cow?qr=" + zyanCode, 1000, 1000, QR_CODE_IMAGE_PATH + zyanCode + ".png");
			System.out.println("OK");
		} catch (WriterException e) {
			System.out.println("Could not generate QR Code, WriterException :: " + e.getMessage());
		} catch (IOException e) {
			System.out.println("Could not generate QR Code, IOException :: " + e.getMessage());
		}
	}
}
