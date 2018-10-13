<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:include page="../header.jsp" />
        <div class="container">
            <div class="row  col 12 center-align">
                <h1>Tracking</h1>
                <p>
                    <a href="<c:url value="newTracking" />" class="btn-floating waves-effect waves-light"><i class="material-icons green">add</i></a>
                </p>
                <table class="highlight bordered table-responsive centered">
                    <thead>
                        <tr>
                            <th>ID</th>
                            <th>ID_ESTADO</th>
                            <th>ID_PAQUETE</th>
                            <th>ID_FLOTILLA</th>
                            <th>ID_REMITENTE</th>
                            <th>ID_DESTINATARIO</th>
                            <th>FECHA_ENVIO</th>
                            <th>FECHA_ENTREGA</th>
                            <th>Acción</th>
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach items="${datos}" var="dato">
                            <tr>
                                <td><c:out value="${dato.TRACKING_NUMBER}" /></td>
                                <td><c:out value="${dato.ID_ESTADO}" /></td>
                                <td><c:out value="${dato.ID_PAQUETE}" /></td>
                                <td><c:out value="${dato.ID_FLOTILLA}" /></td>
                                <td><c:out value="${dato.ID_REMITENTE}" /></td>
                                <td><c:out value="${dato.ID_DESTINATARIO}" /></td>
                                <td><c:out value="${dato.FECHA_ENVIO}" /></td>
                                <td><c:out value="${dato.FECHA_ENTREGA}" /></td>
                                <td>
                                    <a href="<c:url value="editTracking?id=${dato.TRACKING_NUMBER}" />">
                                        <span class="glyphicon glyphicon-pencil" aria-hidden="true"></span><button  type="button" class="btn-floating waves-effect waves-light blue"><i class="material-icons">edit</i></button></a>
                                        <a href="<c:url value="deleteTracking?id=${dato.TRACKING_NUMBER}" />">
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