package dao;

import entities.Departamento;
import entities.Empleado;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;

import java.time.LocalDate;
import java.util.List;

public class EmpleadoDAO {
    private static final EntityManager entityManager =
            Persistence.createEntityManagerFactory("default").createEntityManager();

    public EmpleadoDAO() {
    }

    public List<Empleado> consulta1() {
        return entityManager.createQuery("FROM Empleado", Empleado.class).getResultList();
    }

    public List<Object[]> consulta2() {
        return entityManager.createQuery("SELECT e.nombre, e.apellido FROM Empleado e", Object[].class).getResultList();
    }

    public List<Empleado> consulta4() {
        return entityManager.createQuery("FROM Empleado e WHERE e.salario > 2000", Empleado.class).getResultList();
    }

    public List<Empleado> consulta5() {
        return entityManager.createQuery("FROM Empleado e ORDER BY e.fechaAlt DESC", Empleado.class).getResultList();
    }

    public Object consulta6() {
        return entityManager.createQuery("SELECT AVG(e.salario) FROM Empleado e").getSingleResult();
    }

    public Object consulta7() {
        return entityManager.createQuery("SELECT COUNT(*) FROM Empleado e").getSingleResult();
    }

    public List<Object[]> consulta8() {
        return entityManager.createQuery("SELECT MAX(e.salario), MIN(e.salario) FROM Empleado e", Object[].class).getResultList();
    }

    public List<Object[]> consulta9() {
        return entityManager.createQuery("SELECT COUNT(*) FROM Empleado e GROUP BY e.deptNo.id", Object[].class).getResultList();
    }

    public List<Object[]> consulta10() {
        return entityManager.createQuery("SELECT SUM(e.salario) FROM Empleado e GROUP BY e.deptNo.id", Object[].class).getResultList();
    }

    public List<Empleado> consulta11() {
        return entityManager.createQuery("FROM Empleado e WHERE e.apellido LIKE 'A%'", Empleado.class).getResultList();
    }

    public List<Empleado> consulta13() {
        return entityManager.createQuery("FROM Empleado e WHERE e.salario BETWEEN 1500 AND 3000", Empleado.class).getResultList();
    }

    public List<Empleado> consulta14() {
        return entityManager.createQuery("FROM Empleado e WHERE e.oficio != 'Programador'", Empleado.class).getResultList();
    }

    public List<Empleado> consulta15() {
        TypedQuery<Empleado> query = entityManager.createQuery("FROM Empleado e WHERE e.fechaAlt > :fecha", Empleado.class);
        query.setParameter("fecha", LocalDate.of(2000, 1, 1));

        return query.getResultList();
    }

    public List<Object[]> consulta16() {
        return entityManager.createQuery("SELECT e, e.deptNo.dnombre FROM Empleado e", Object[].class).getResultList();
    }

    public List<Empleado> consulta17() {
        return entityManager.createQuery("FROM Empleado e WHERE e.deptNo.dnombre = 'Ventas'", Empleado.class).getResultList();
    }

    public List<Object[]> consulta18() {
        return entityManager.createQuery("SELECT e.nombre FROM Empleado e WHERE e.salario IN (SELECT MAX(e.salario) FROM Empleado e GROUP BY e.deptNo)", Object[].class).getResultList();
    }
}
