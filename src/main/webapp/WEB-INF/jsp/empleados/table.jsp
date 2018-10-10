<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:include page="../header.jsp" />
        <div class="container">
            <div class="row  col 12 center-align">
                <h1>Empleados</h1>
                <p>
                    <a href="<c:url value="newEmpleado" />" class="btn-floating waves-effect waves-light"><i class="material-icons green">add</i></a>
                </p>
                <table class="highlight bordered table-responsive centered">
                    <thead>
                        <tr>
                            <th>ID</th>
                            <th>ID_USUARIO</th>
                            <th>ID_PERSONA</th>
                            <th>AREA_PUESTO</th>
                            <th>SALARIO</th>
                            <th>Accion</th>
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach items="${datos}" var="dato">
                            <tr>
                                <td><c:out value="${dato.ID_EMPLEADO}" /></td>
                                <td><c:out value="${dato.ID_USUARIO}" /></td>
                                <td><c:out value="${dato.ID_PERSONA}" /></td>
                                <td><c:out value="${dato.AREA_PUESTO}" /></td>
                                <td><c:out value="${dato.SALARIO}" /></td>
                                <td>
                                    <a href="<c:url value="editEmpleado?id=${dato.ID_EMPLEADO}" />">
                                        <span class="glyphicon glyphicon-pencil" aria-hidden="true"></span><button  type="button" class="btn-floating waves-effect waves-light blue"><i class="material-icons">edit</i></button></a>
                                        <a href="<c:url value="deleteEmpleado?id=${dato.ID_EMPLEADO}" />">
                                        <span class="glyphicon glyphicon-trash" aria-hidden="true"></span><button  type="button" class="btn-floating waves-effect waves-light red"><i class="material-icons">delete</i></button></a>
                                </td>
                            </tr>
                        </c:forEach>
                    </tbody>
                </table>
            </div>
            
        </div>
    </body>
</html>
<jsp:include page="../footer.jsp" />