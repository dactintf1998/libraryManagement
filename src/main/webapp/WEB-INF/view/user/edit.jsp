<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
        <%@ page contentType="text/html;charset=UTF-8" language="java" %>
            <html>

            <head>
                <title>My First Page</title>
                <link rel="stylesheet" th:href="@{/css/style.css}">
                <script th:src="@{/js/script.js}"></script>
                <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css" rel="stylesheet"
                    integrity="sha384-sRIl4kxILFvY47J16cr9ZwB07vP4J8+LH7qKQnuqkuIAvNWLzeN8tE5YBujZqJLB"
                    crossorigin="anonymous">

            </head>

            <body>
                <h3 value="id">Hello user ${id}</h3>
                <div class="container mt-5">
                    <c:url var="add_user_url" value="/user/edit/${id}" />
                    <form:form action="${add_user_url}" method="post" modelAttribute="user">
                        <div class="mb-3">
                            <form:hidden path="id" value="${id}" />
                        </div>
                        <div class="mb-3">
                            <label path="email" class="form-label">Email address</label>
                            <form:input type="text" class="form-control" path="email" />
                        </div>
                        <div class="mb-3">
                            <label path="password" class="form-label">Password</label>
                            <form:input type="password" class="form-control" path="password" />
                        </div>
                        <button type="submit" value="submit" class="btn btn-primary">Submit</button>
                    </form:form>
                </div>
                <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/js/bootstrap.bundle.min.js"
                    integrity="sha384-FKyoEForCGlyvwx9Hj09JcYn3nv7wiPVlz7YYwJrWVcXK/BmnVDxM+D2scQbITxI"
                    crossorigin="anonymous"></script>
                <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.8/dist/umd/popper.min.js"
                    integrity="sha384-I7E8VVD/ismYTF4hNIPjVp/Zjvgyol6VFvRkX/vR+Vc4jQkC+hVqc2pM8ODewa9r"
                    crossorigin="anonymous"></script>
                <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/js/bootstrap.min.js"
                    integrity="sha384-G/EV+4j2dNv+tEPo3++6LCgdCROaejBqfUeNjuKAiuXbjrxilcCdDz6ZAVfHWe1Y"
                    crossorigin="anonymous"></script>
            </body>

            </html>