<%@ include file="../../common/navbar.jspf" %>
<br>
<div class="container">
    <div class="float-right">
        <a href="new_order" class="btn btn-outline-success btn-lg">New Order</a>
    </div>
    <br><br><br>
    <table class="table table-striped">
        <thead>
            <tr>
                <th>Order Date</th>
                <th>Cost</th>
                <th>Number of Products</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${ orders }" var="order">
                <tr>
                    <td>${ order.orderDate }</td>
                    <td>${ order.totalCost }</td>
                    <td>${ fn:length(order.products) }</td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</div>

<%@ include file="../../common/footer.jspf" %>

