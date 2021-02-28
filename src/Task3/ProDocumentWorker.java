package Task3;

public class ProDocumentWorker extends DocumentWorker {
    public void EditDocument ()
    {
        System.out.println("Документ отредактирован");
    }
    public void SaveDocument(){
        System.out.println("Документ сохранен в старом формате. Сохранение в остальных форматах доступно в версии Эксперт");
    }
}
