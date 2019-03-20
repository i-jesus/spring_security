<form action="login.do" method="post">
    <table>
        <tr>
            <td> 用户名：</td>
            <td><input type="text" name="username"/></td>
        </tr>
        <tr>
            <td> 密码：</td>
            <td><input type="password" name="password"/></td>
        </tr>
        <tr>
            <td> 记住我：</td>
            <!--
               记住我 默认 name 名称
            -->
            <td><input type="checkbox" name="remember-me"/></td>
        </tr>
        <tr>
            <td colspan="2" align="center">
                <input type="submit" value=" 登录 "/>
                <input type="reset" value=" 重置 "/>
            </td>
        </tr>
    </table>
</form>