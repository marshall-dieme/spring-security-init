<%@ include file="/WEB-INF/common/header.jspf" %>
<br><br><br><br><br>
<div class="row">
    <div class="col"></div>
    <div class="col">
        <div class="card text-left">
            <div class="card-body">
                <h4 class="card-title text-center">Login</h4>
                <div class="card-text">
                    <form action="login" method="post">
                        <div class="form-group">
                            <label for="username">Username</label>
                            <input type="text" class="form-control" name="username" id="username" aria-describedby="helpId" placeholder="">
                        </div>
                        <div class="form-group">
                            <label for="password">Password</label>
                            <input type="password" class="form-control" name="password" id="password" aria-describedby="helpId" placeholder="">
                        </div>
                        <input type="submit" class="btn btn-outline-primary btn-lg btn-block" value="Login">
                    </form>
                </div>
            </div>
        </div>
    </div>
    <div class="col"></div>
</div>

<%@ include file="/WEB-INF/common/footer.jspf" %>