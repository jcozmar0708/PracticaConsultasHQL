package dao;

import entities.Departamento;
import entities.Empleado;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;

import java.util.List;

public class DepartamentoDAO {
    private static final EntityManager entityManager =
            Persistence.createEntityManagerFactory("default").createEntityManager();

    public DepartamentoDAO() {
    }

    public List<Object[]> consulta3() {
        return entityManager.createQuery("SELECT dnombre, loc FROM Departamento", Object[].class).getResultList();
    }

    public List<Departamento> consulta12() {
        TypedQuery<Departamento> query = entityManager.createQuery("FROM Departamento d WHERE d.id NOT IN (SELECT e.deptNo.id FROM Empleado e)", Departamento.class);
        return query.getResultList();
    }

    public List<Departamento> consulta19() {
        TypedQuery<Departamento> query = entityManager.createQuery("FROM Departamento d JOIN Empleado e ON d.id = e.deptNo.id GROUP BY d.id HAVING COUNT(e.id) >= 5", Departamento.class);
        return query.getResultList();
    }

    public List<Object[]> consulta20() {
        TypedQuery<Object[]> query = entityManager.createQuery("SELECT d.dnombre, COUNT(e.id) FROM Departamento d RIGHT JOIN Empleado e ON d.id = e.deptNo.id GROUP BY d.id", Object[].class);
        return query.getResultList();
    }

    public List<Empleado> consulta21() {
        return entityManager.createQuery("SELECT d.empleados FROM Departamento d WHERE d.id = 1", Empleado.class).getResultList();
    }
}
