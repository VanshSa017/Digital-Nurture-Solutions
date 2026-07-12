public class ExcelDocumentFactory extends DocumentFactory{
    
    @Override
    public Document createDocument(){
        Document d= new WordDocument();
        return d;
    }
}
