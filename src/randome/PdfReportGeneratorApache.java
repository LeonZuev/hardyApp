package randome;
/* xml
<dependency>
    <groupId>org.apache.pdfbox</groupId>
    <artifactId>pdfbox</artifactId>
    <version>2.0.29</version>
</dependency>

<dependency>
    <groupId>org.apache.pdfbox</groupId>
    <artifactId>fontbox</artifactId>
    <version>2.0.29</version>
</dependency>
 */

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.common.PDRectangle;
import org.apache.pdfbox.pdmodel.font.PDType1Font;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class PdfReportGeneratorApache {

  public void generateReport(String outputFile, List<String> data) {
    try (PDDocument document = new PDDocument()) {
      PDPage page = new PDPage(PDRectangle.A4);
      document.addPage(page);

      PDPageContentStream contentStream = new PDPageContentStream(document, page);
      contentStream.setFont(PDType1Font.HELVETICA_BOLD, 12);

      float margin = 72;
      float yPosition = page.getMediaBox().getHeight() - margin;
      float fontSize = 12;
      float leading = 1.5f * fontSize;

      for (String item : data) {
        contentStream.beginText();
        contentStream.newLineAtOffset(margin, yPosition);
        contentStream.showText(item);
        contentStream.endText();
        yPosition -= leading;
      }

      contentStream.close();

      document.save(outputFile);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public static void main(String[] args) {
    // пример для списка проектов
    List<String> projectData = new ArrayList<>();
    // Здесь добавьте код для получения списка проектов и добавления данных в projectData

    PdfReportGenerator generator = new PdfReportGenerator();
    generator.generateReport("projects_report.pdf", projectData);
  }
}