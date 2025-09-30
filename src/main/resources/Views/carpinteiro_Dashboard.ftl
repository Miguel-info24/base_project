<!DOCTYPE html>
<html lang="pt-BR">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Carpinteiro OsBarqueiros</title>
    <link rel="stylesheet" href="css/style.css">
    <link rel="stylesheet" href="css/carpinteiro_Dashboard.css">
</head>

<body>
    <header>
        <div class="logo-area">
            <img src="img/logo.png" alt="Logo">
            <h1 class="texto-principal">Os Barqueiros</h1>
        </div>
    </header>

    <div class="container">
        <div class="menu">
            <nav class="menu-topo">
                <ul>
                    <li><a href="#">Atualizar</a></li>
                    <li><a href="#">Barcos</a></li>
                    <li><a href="/" id="logout">Logout</a></li>
                </ul>
            </nav>
        </div>

        <div class="content">
            <h2 class="pedidos">Pedidos Recebidos</h2>
            <div class="pedidos-container" id="pedidos-container">
                <!-- Pedidos serão inseridos dinamicamente pelo JS -->
            </div>
        </div>


        <script src="js/carpinteiro_Dashboard.js"></script>
    </div>
</body>

</html>