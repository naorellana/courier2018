<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:include page="../header.jsp" />
        <div class="container">
            <div class="row  col 12 center-align">
                <h1>Detalle</h1>
                <p>
                    <a href="<c:url value="newDetalle" />" class="btn-floating waves-effect waves-light"><i class="material-icons green">add</i></a>
                </p>
                <table class="highlight bordered table-responsive centered">
                    <thead>
                        <tr>
                            <th>ID</th>
                            <th>ID_FACTURA</th>
                            <th>ID_PAQUETE</th>
                            <th>NUMERO_UNIDADES</th>
                            <th>PRECIO</th>
                            <th>IVA</th>
                            <th>TOTAL</th>
                            <th>GARANTIA</th>
                            <th>Acción</th>
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach items="${datos}" var="dato">
                            <tr>
                                <td><c:out value="${dato.ID_DETALLE}" /></td>
                                <td><c:out value="${dato.ID_FACTURA}" /></td>
                                <td><c:out value="${dato.ID_PAQUETE}" /></td>
                                <td><c:out value="${dato.NUMERO_UNIDADES}" /></td>
                                <td><c:out value="${dato.PRECIO}" /></td>
                                <td><c:out value="${dato.IVA}" /></td>
                                <td><c:out value="${dato.TOTAL}" /></td>
                                <td><c:out value="${dato.GARANTIA}" /></td>
                                <td>
                                    <a href="<c:url value="editDetalle?id=${dato.ID_DETALLE}" />">
                                        <span class="glyphicon glyphicon-pencil" aria-hidden="true"></span><button  type="button" class="btn-floating waves-effect waves-light blue"><i class="material-icons">edit</i></button></a>
                                        <a href="<c:url value="deleteDetalle?id=${dato.ID_DETALLE}" />">
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