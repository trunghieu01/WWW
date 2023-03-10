<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Product</title>
    <style>
        .a{
            width: 160px;
            height: 200px;
            border: 1px solid black;
            padding: 5px;
            margin: 10px;
            float: left;            
            text-align: center;
        }
        .image{
            width: 80px;
            height: 100px;
        }
    </style>
</head>
<body>
<p>
    <a href="ShoppingCart.jsp">View Cart</a>
</p>

<c:forEach items="${ds}" var="sp">
    <div class="a">
        <form name="modelListDetail" method="post" action="CartServlet">
                ${sp.model} <br/>
            <img src="/${sp.imgUrl}" class="image"> <br/>
            Price: ${sp.price} <br/>
            <input type="text" size="2" value="1" name="quantity">
            <input type="hidden" value="${sp.id}" name="modelNo">
            <input type="hidden" value="${sp.price}" name="price">
            <input type="hidden" value="${sp.model}" name="description">
            <input type="hidden" value="action" name="Add">
            <input type="submit" value="Add to Cart" name="addToCart">
        </form>
    </div>
</c:forEach>
</body>
</html>
