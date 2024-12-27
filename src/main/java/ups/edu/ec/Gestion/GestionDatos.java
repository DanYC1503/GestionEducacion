package ups.edu.ec.Gestion;

import java.time.LocalDate;

import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Stateless
public class GestionDatos {
    @PersistenceContext
    private EntityManager entityManager;

 
}


