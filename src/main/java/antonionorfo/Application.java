package antonionorfo;

import jakarta.persistence.EntityManagerFactory;

public class Application {

    private static final EntityManagerFactory emf = jakarta.persistence.Persistence.createEntityManagerFactory("gestione_eventi");

    public static void main(String[] args) {


    }


}
