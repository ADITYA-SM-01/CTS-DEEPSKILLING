public class Test {
    public static void main(String[] args) {
        DocumentFactory documentFactory = new WordDocumentFactory();
        documentFactory.createDocument().open();
    }
}
