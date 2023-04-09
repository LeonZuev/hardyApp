package randome;

import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Paragraph;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class PdfReportGenerator {

  public void generateReport(String outputFile, List<String> data) throws FileNotFoundException {
    PdfWriter writer = new PdfWriter(outputFile);
    PdfDocument pdf = new PdfDocument(writer);
    Document document = new Document(pdf);

    for (String item : data) {
      document.add(new Paragraph(item));
    }

    document.close();
  }


  // пример для списка проектов
  List<String> projectData = new ArrayList<>();
for (Project project : projects) {
    projectData.add(project.toString());
  }

  PdfReportGenerator generator = new PdfReportGenerator();
    try
  {
    try {
      generator.generateReport("projects_report.pdf", projectData);
    } catch (FileNotFoundException ex) {
      throw new RuntimeException(ex);
    }
  } catch (FileNotFoundException e) {
    e.printStackTrace();
  }
}