<html>
<body>
    <table border="1px">
        <tr>
            <th>id</th>
            <th>书名</th>
            <th>价格</th>
            <th>作者</th>
            <th>图片</th>
        </tr>
        <#list books as book>
            <tr>
                <td>${book.bid}</td>
                <td>${book.bname}</td>
                <td>${book.price}</td>
                <td>${book.author}</td>
                <td>${book.image}</td>
            </tr>
        </#list>
    </table>
</body>
</html>