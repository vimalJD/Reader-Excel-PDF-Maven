package pdfreaderproject;

import java.io.FileWriter;
import java.io.IOException;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.util.PDFTextStripper;

public class SimplePDFReader {

	private static void readPDFDocument(String name) throws IOException {

		try {

			PDDocument pdf = PDDocument.load(name);
			PDFTextStripper stripper = new PDFTextStripper();
			String pdfTest = stripper.getText(pdf);
			System.out.println("text from the file is : " + pdfTest);

			FileWriter writer = new FileWriter("C:\\writefrompdf.txt", true);
			writer.write(pdfTest);
			writer.write("\r\n");
			writer.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {

		try {

			readPDFDocument("C:\\java_tutorial.pdf");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
