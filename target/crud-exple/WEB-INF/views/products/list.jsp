<%@ include file="../../common/navbar.jspf"%>
<br>
<div class="container">
    <table class="table">
        <thead class="thead-dark">
            <tr>
                <th>Product</th>
                <th>Price</th>
                <th>Quantity</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${ products }" var="product">
                <tr>
                    <td>${ product.name }</td>
                    <td>${ product.price }</td>
                    <td>${ product.quantity }</td>
                </tr>
            </c:forEach>
        </tbody>
</table>
</div>
<%@ include file="../../common/footer.jspf"%>
