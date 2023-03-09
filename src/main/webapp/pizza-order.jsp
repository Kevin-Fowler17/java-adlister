<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Pizza - Order</title>
</head>
<body>
    <form method="POST">
    <h1>Pizza Order</h1>

    <div>
        <ul style="list-style-type: none">
            <li>
                <label for="crust">Crust</label>
                <select name="crust" id="crust">
                    <option value="Thin">Thin</option>
                    <option value="Hand Tossed">Hand Tossed</option>
                    <option value="Pan">Pan</option>
                </select>
            </li>
            <li>
                <label for="sauce">Sauce:</label>
                <select name="sauce" id="sauce">
                    <option value="Light">Light</option>
                    <option value="Regular">Regular</option>
                    <option value="Extra">Extra</option>
                </select>
            </li>
            <li>
                <label for="size">Size</label>
                <select name="size" id="size">
                    <option value="Small">Small</option>
                    <option value="Medium">Medium</option>
                    <option value="Large">Large</option>
                </select>
            </li>
        </ul>
    </div>

    <div>
        <h3>Toppings</h3>
        <input type="checkbox" value="beef" id="Topping1" name="Topping1">
            Beef
        </label>
        <input type="checkbox" value="ham" id="Topping2" name="Topping2">
            Ham
        </label>
        <input type="checkbox" value="philly_steak" id="Topping3" name="Topping3">
            Philly Steak
        </label>
        <input type="checkbox" value="bacon" id="Topping4" name="Topping4">
            Bacon
        </label>
    </div>

    <div>
        <h3>Address</h3>
        <input type="text" id="address" name="address"><br><br>
    </div>

    <p>
        <button type="submit">Submit</button>
    </p>
</form>

</body>
</html>
