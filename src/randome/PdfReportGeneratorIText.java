package randome;

import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Paragraph;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class PdfReportGeneratorIText {

  public void generateReport(String outputFile, List<String> data) throws FileNotFoundException {
    PdfWriter writer = new PdfWriter(outputFile);
    PdfDocument pdf = new PdfDocument(writer);
    Document document = new Document(pdf);

    for (String item : data) {
      document.add(new Paragraph(item));
    }

    document.close();
  }

  public static void main(String[] args) {
    // пример для списка проектов
    List<String> projectData = new ArrayList<>();
    // Здесь добавьте код для получения списка проектов и добавления данных в projectData

    PdfReportGeneratorIText generator = new PdfReportGeneratorIText();
    try {
      generator.generateReport("projects_report.pdf", projectData);
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }
  }
}