public class WordDocumentFactory extends DocumentFactory{
    
    @Override
    public Document createDocument(){
        Document d= new WordDocument();
        return d;
    }
}
