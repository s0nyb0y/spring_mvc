<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html>

<body>

<h2>Dear Employee, You are Welcome!!!</h2>
<br><br>
You name: ${employee.name}
<br><br>
You surname: ${employee.surname}
<br><br>
Department: ${employee.department}
<br><br>
You salary: ${employee.salary}
<br><br>
Phone number: ${employee.phoneNumber}
<br><br>
Email: ${employee.email}
<br><br>
Language(s):
<ul>
    <c:forEach var="lang" items="${employee.languages}">
        <li>${lang}</li>
    </c:forEach>
</ul>
<br><br>
Your car: ${employee.carBrand}

</body>

</html>