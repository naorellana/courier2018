<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:include page="../header.jsp" />
        <div class="container">
            <div class="row  col 12 center-align">
                <h1>Cliente</h1>
                <p>
                    <a href="<c:url value="newCliente" />" class="btn-floating waves-effect waves-light"><i class="material-icons green">add</i></a>
                </p>
                <table class="highlight bordered table-responsive centered">
                    <thead>
                        <tr>
                            <th>ID</th>
                            <th>NIT</th>
                            <th>DIRECCION</th>
                            <th>PERSONA</th>
                            <th>SERVICIO</th>
                            <th>TELEFONO</th>
                            <th>Accion</th>
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach items="${datos}" var="dato">
                            <tr>
                                <td><c:out value="${dato.ID_CLIENTE}" /></td>
                                <td><c:out value="${dato.NIT}" /></td>
                                <td><c:out value="${dato.ID_DIRECCION}" /></td>
                                <td><c:out value="${dato.ID_PERSONA}" /></td>
                                <td><c:out value="${dato.ID_SERVICIO}" /></td>
                                <td><a href="tel:<c:out value="${dato.TELEFONO}" />" class="btn green col s6"> <i class="material-icons green">phone</i><c:out value="${dato.TELEFONO}" /></a></td>
                                <td>
                                    <a href="<c:url value="editCliente?id=${dato.ID_CLIENTE}" />">
                                        <span class="glyphicon glyphicon-pencil" aria-hidden="true"></span><button  type="button" class="btn-floating waves-effect waves-light blue"><i class="material-icons">edit</i></button></a>
                                        <a href="<c:url value="deleteCliente?id=${dato.ID_CLIENTE}" />">
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