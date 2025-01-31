import dao.DepartamentoDAO;
import dao.EmpleadoDAO;
import entities.Departamento;
import entities.Empleado;

import java.math.BigDecimal;
import java.util.List;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        EmpleadoDAO empleadoDAO = new EmpleadoDAO();
        DepartamentoDAO departamentoDAO = new DepartamentoDAO();

//        // Consulta 1
//        List<Empleado> empleados1 = empleadoDAO.consulta1();
//
//        for (Empleado empleado : empleados1) {
//            System.out.println(empleado);
//        }
//
//        // Consulta 2
//        List<Object[]> empleados2 = empleadoDAO.consulta2();
//
//        for (Object[] empleado : empleados2) {
//            System.out.println(empleado[0] + " " + empleado[1]);
//        }
//
//        // Consulta 3
//        List<Object[]> departamentos3 = departamentoDAO.consulta3();
//
//        for (Object[] departamento : departamentos3) {
//            System.out.println(departamento[0] + " " + departamento[1]);
//        }
//
//        // Consulta 4
//        List<Empleado> empleados4 = empleadoDAO.consulta4();
//
//        for (Empleado empleado : empleados4) {
//            System.out.println(empleado);
//        }
//
//        // Consulta 5
//        List<Empleado> empleados5 = empleadoDAO.consulta5();
//
//        for (Empleado empleado : empleados5) {
//            System.out.println(empleado);
//        }
//
//        // Consulta 6
//        Object salarioPromedio = empleadoDAO.consulta6();
//        System.out.println(salarioPromedio);
//
//        // Consulta 7
//        Object numEmpleados = empleadoDAO.consulta7();
//        System.out.println(numEmpleados);
//
//        // Consulta 8
//        List<Object[]> empleados8 = empleadoDAO.consulta8();
//
//        for (Object[] empleado : empleados8) {
//            System.out.println(empleado[0] + " " + empleado[1]);
//        }
//
//        // Consulta 9
//        List<Object[]> empleados9 = empleadoDAO.consulta9();
//
//        for (Object[] empleado : empleados9) {
//            System.out.println(empleado[0]);
//        }
//
//        // Consulta 10
//        List<Object[]> empleados10 = empleadoDAO.consulta10();
//
//        for (Object[] empleado : empleados10) {
//            System.out.println(empleado[0]);
//        }
//
//        // Consulta 11
//        List<Empleado> empleados11 = empleadoDAO.consulta11();
//
//        for (Empleado empleado : empleados11) {
//            System.out.println(empleado);
//        }
//
//        // Consulta 12
//        List<Departamento> departamentos12 = departamentoDAO.consulta12();
//
//        for (Departamento empleado : departamentos12) {
//            System.out.println(empleado);
//        }
//
//        // Consulta 13
//        List<Empleado> empleados13 = empleadoDAO.consulta13();
//
//        for (Empleado empleado : empleados13) {
//            System.out.println(empleado);
//        }
//
//        // Consulta 14
//        List<Empleado> empleados14 = empleadoDAO.consulta14();
//
//        for (Empleado empleado : empleados14) {
//            System.out.println(empleado);
//        }
//
//        // Consulta 15
//        List<Empleado> empleados15 = empleadoDAO.consulta15();
//
//        for (Empleado empleado : empleados15) {
//            System.out.println(empleado);
//        }
//
//        // Consulta 16
//        List<Object[]> empleados16 = empleadoDAO.consulta16();
//
//        for (Object[] empleado : empleados16) {
//            System.out.println(empleado[0] + " " + empleado[1]);
//        }
//
//        // Consulta 17
//        List<Empleado> empleados17 = empleadoDAO.consulta17();
//
//        for (Empleado empleado : empleados17) {
//            System.out.println(empleado);
//        }
//
//        // Consulta 18
//        List<Object[]> empleados18 = empleadoDAO.consulta18();
//
//        for (Object[] empleado : empleados18) {
//            System.out.println(empleado[0]);
//        }
//
//        // Consulta 19
//        List<Departamento> departamentos19 = departamentoDAO.consulta19();
//
//        for (Departamento departamento : departamentos19) {
//            System.out.println(departamento);
//        }
//
//        // Consulta 20
//        List<Object[]> departamentos20 = departamentoDAO.consulta20();
//
//        for (Object[] departamento : departamentos20) {
//            System.out.println(departamento[0] + " " + departamento[1]);
//        }

        // Consulta 21
        List<Empleado> empleados = departamentoDAO.consulta21();

        for (Empleado empleado : empleados) {
            System.out.println(empleado);
        }
    }
}