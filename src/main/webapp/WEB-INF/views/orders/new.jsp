<%@ include file="../../common/navbar.jspf" %>
<br>
<div class="container">
    <form action="add_product" method="post">
        <div class="row">
            <div class="col-6">
                <div class="form-group">
                    <select class="form-control" name="product" id="product">
                        <option value="" selected disabled>Products</option>
                        <c:forEach items="${products}" var="product">
                            <option value="${product.id}">${product.name}</option>
                        </c:forEach>
                    </select>
                </div>
            </div>
            <div class="col-4">
                <div class="form-group">
                    <input type="number" class="form-control" name="quantity" id="quantity" placeholder="Quantity" />
                </div>
            </div>
            <div class="col-2">
                <button type="submit" class="btn btn-primary">Add</button>
            </div>
        </div>
    </form>
    <table class="table">
        <thead>
            <tr class="thead-dark">
                <th>Product</th>
                <th>Quantity</th>
                <th>Total</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${commands}" var="command">
                <tr>
                    <td>${command.name}</td>
                    <td>${command.command}</td>
                    <td>${command.command * command.price }</td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
    <div class="float-right">
        <a href="save_order" class="btn btn-outline-success btn-lg">Save</a>
    </div>
</div>
<%@ include file="../../common/footer.jspf" %>

