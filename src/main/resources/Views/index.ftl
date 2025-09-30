<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="name" content="Miguel Vannucci">
    <link rel="stylesheet" href="/css/Enter_Page.css">
    <link rel="stylesheet" href="/css/style.css">
    <title>OsBarqueiros</title>
</head>
<body>
    <header>
        <div class="logo-area">
            <img src="/img/logo.png" alt="Logo">
            <h1 class="texto-principal">Os Barqueiros</h1>
        </div>
    </header>
    <div class="container">
        <div class="left-login">
            <h2>Escolha qual conta irá utilizar</h2>
            <img src="/img/barco.png" alt="Imagem de barco">
            <h2 class="texto-principal">Cadastre-se <br> e entre para o nosso time</h2>
        </div>
        <div class="right-login">
            <div class="clicar-card">
                <h2 class="texto-principal">Escolha qual conta irá utilizar</h2>
                <button class="btn-clicar" onclick="takeOption('cliente'); window.location.href='/login'">Cliente</button>
                <button class="btn-clicar" onclick="takeOption('carpinteiro'); window.location.href='/login'">Carpinteiro</button>
            </div>
        </div>
    </div>
    <script src="/js/take_option.js"></script>
</body>
</html>
