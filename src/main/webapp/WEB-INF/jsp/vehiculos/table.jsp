<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:include page="../header.jsp" />
        <div class="container">
            <div class="row  col 12 center-align">
                <h1>Vehículo</h1>
                <p>
                    <a href="<c:url value="newVehiculo" />" class="btn-floating waves-effect waves-light"><i class="material-icons green">add</i></a>
                </p>
                <table class="highlight bordered table-responsive centered">
                    <thead>
                        <tr>
                            <th>ID</th>
                            <th>PLACA</th>
                            <th>PESO</th>
                            <th>MARCA</th>
                            <th>COLOR</th>
                            <th>TIPO</th>
                            <th>Acciones</th>
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach items="${datos}" var="dato">
                            <tr>
                                <td><c:out value="${dato.ID_VEHICULO}" /></td>
                                <td><c:out value="${dato.PLACA}" /></td>
                                <td><c:out value="${dato.PESO}" /></td>
                                <td><c:out value="${dato.MARCA}" /></td>
                                <td><c:out value="${dato.COLOR}" /></td>
                                <td><c:out value="${dato.TIPO}" /></td>
                                <td>
                                    <a href="<c:url value="editVehiculo?id=${dato.ID_VEHICULO}" />">
                                        <span class="glyphicon glyphicon-pencil" aria-hidden="true"></span><button  type="button" class="btn-floating waves-effect waves-light blue"><i class="material-icons">edit</i></button></a>
                                        <a href="<c:url value="deleteVehiculo?id=${dato.ID_VEHICULO}" />">
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