class NotificadorService{
    boolean notificaClient(Cliente cliente, Notificacao notificacao){
            return notificacao.notificar(cliente, "Movimentação realizada em sua conta corrente.");
    }
}