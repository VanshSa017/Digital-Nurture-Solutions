public class PdfDocumentFactory extends DocumentFactory{
    
    @Override
    public Document createDocument(){
        Document d= new WordDocument();
        return d;
    }
}
