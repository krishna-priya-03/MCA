<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>hello world</title>
</head>
<body>
    <?php
    $cricket=array("Sachin Tendulkar", "Virat Kohli", "M S Dhoni", "Adam Gilchrist", "Brian Lara");
    echo"<br>Displaying names in the table format<br/>";
    echo"<br>================================<br/>";
    echo"<br>Name of cricket players are stored in an array<br/>";
    print_r($cricket);
    echo"<br>Name of cricket players are stored in a table:<br/>";
    echo"<br><table border='2'><tr><th>Player Names</th></tr>";
    echo"<tr><td>$cricket[0]</td></tr>";
    echo"<tr><td>$cricket[1]</td></tr>";    
    echo"<tr><td>$cricket[2]</td></tr>";
    echo"<tr><td>$cricket[3]</td></tr>";
    echo"</table>";
    ?>
</body>
</html>