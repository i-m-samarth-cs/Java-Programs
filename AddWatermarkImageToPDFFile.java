import java.io.FileOutputStream;
import com.lowagie.text.Image;
import com.lowagie.text.pdf.PdfContentByte;
import com.lowagie.text.pdf.PdfReader;
import com.lowagie.text.pdf.PdfStamper;
public class AddWatermarkImageToPDFFile {
    public static void main(String[] args) {
        try {
            PdfReader reader = new PdfReader("input.pdf");
            int n = reader.getNumberOfPages();
            PdfStamper stamp = new PdfStamper(reader, new FileOutputStream(
                    "PDFWithWatermarkImage.pdf"));
            int i = 0;
            PdfContentByte under;
            Image img = Image.getInstance("images.png");
            img.setAbsolutePosition(50, 300);
            while (i < n) {
                i++;
                under = stamp.getUnderContent(i);
                under.addImage(img);
            }
            stamp.close();
        } catch (Exception de) {
            de.printStackTrace();
        }
    }
}