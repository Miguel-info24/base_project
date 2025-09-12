const form = document.getElementById('pedidoForm');

form.addEventListener('submit', function (e) {
    e.preventDefault();

    
    const descricao = document.getElementById('descricao').value;
    const tipo = document.getElementById('tipo').value;
    const barco = document.getElementById('barco').value;

    if (!descricao || !tipo || !barco || tipo === "Selecione...") {
        alert('Por favor, preencha todos os campos!');
        return;
    }

   
    alert('Pedido enviado com sucesso!');

    
    window.location.href = "cliente_dashBoard.html";
});