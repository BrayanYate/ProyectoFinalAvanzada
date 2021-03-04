
<!DOCTYPE html>
<html>
    <head>
        <title>Adivina</title>
        <meta charset="UTF-8">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="Css/estilo.css" rel="stylesheet" type="text/css">
    </head>
    <body>
        <div class="container">
            <form action="ServletFinal" method="POST" >
                <h1>Nomber</h1>
                <input type="text" name="nombre">
                <select class ="select-css" name="plantilla">
                    <option>Adivinanza 1</option>
                    <option>Adivinanza 2</option>
                    <option>Adivinanza 3</option>
                    <option>Adivinanza 4</option>
                </select>
                <input type="submit" value="Jugar">
            </form>
        </div>
    </body>
</html>
