<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:useBean id="cart" scope="session" class="com.example.ex4.entity.Cart"/>
<html>
<head>
    <title>Cart</title>
</head>
<body>
<p>
    <a href="ProductListServlet">Product List</a>
</p>

<table width="100%" border="1">
    <tr bgcolor="#cccccc">
        <td>Model Description</td>
        <td>Quantity</td>
        <td>Unit Price</td>
        <td>Total</td>
    </tr>

    <c:if test="${cart.lineItemCount == 0}">
        <td>
            <td colspan="4"> Cart is currently empty </td> <br/>
        </tr>
    </c:if>

    <c:forEach var="cartItem" items="${cart.cartItems}" varStatus="counter">
        <form name="item" method="post" action="CartServlet">
            <tr>
                <td>
                    <c:out value="${cartItem.partNumber}"/> <br/><br/>
                    <c:out value="${cartItem.modelDescription}"/> <br/><br/>
                </td>
                <td>
                    <input type="hidden" name="itemIndex" value="<c:out value="${counter.out}"/>">
                    <input type="hidden" name="quantity" value="<c:out value="${cartItem.quantity}"/>" size="2">
                    <input type="submit" name="action" value="Update">
                    <input type="submit" name="action" value="Delete">
                </td>
                <td>
                    $<c:out value="${cartItem.unitCost}"/>
                </td>
                <td>
                    $<c:out value="${cartItem.totalCost}"/>
                </td>
            </tr>
        </form>
    </c:forEach>

    <tr>
        <td colspan="2"></td>
        <td></td>
        <td>
           Subtotal: $<c:out value="${cart.orderTotal}"/>
        </td>
    </tr>
</table>
</body>
</html>
