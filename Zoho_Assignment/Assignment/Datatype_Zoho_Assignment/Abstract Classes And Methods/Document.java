abstract class Document {
    abstract String fileType();
    String fileContent="is Empty";
    String getFileContent(){
        if(fileContent.equals("is Empty"))
        return this.getClass() +" "+ fileContent;
        return fileContent;
    }
    void setContent(String fileContent){
        this.fileContent=fileContent;
    }
}

class PDFDocument extends Document {
    String fileType() {
        return "PDF Document";
    }
}

class TextDocument extends Document {
    String fileType() {
        return "Text Document";
    }
}

class ImageDocument extends Document {
    String fileType() {
        return "Image Document";
    }
}
class AbstractDocumentMain{
    public static void main(String[] args) {
        Document document=new ImageDocument();
        System.out.println(document.getFileContent());
        document.setContent("This is the Image Document");
        System.out.println(document.fileType());
        System.out.println(document.getFileContent());
        document=new TextDocument();
        System.out.println(document.getFileContent());
        document.setContent("This is the Text Document");
        System.out.println(document.fileType());
        System.out.println(document.getFileContent());
        document=new PDFDocument();
        System.out.println(document.getFileContent());
        document.setContent("This is the PDF Document");
        System.out.println(document.fileType());
        System.out.println(document.getFileContent());
    }
}
