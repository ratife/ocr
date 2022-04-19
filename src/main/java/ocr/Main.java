package ocr;

import java.io.File;

import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

public class Main {
	public static void main(String a[]) {
		File image = new File("src/main/resources/2.png");
		Tesseract tesseract = new Tesseract();
		tesseract.setDatapath("src/main/resources/tessdata");
		tesseract.setLanguage("fra");
		tesseract.setPageSegMode(1);
		tesseract.setOcrEngineMode(1);
		try {
			String result = tesseract.doOCR(image);
			System.out.println(result);
		} catch (TesseractException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
