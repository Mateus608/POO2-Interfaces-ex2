class NotificacaoEmail implements Notificacao {
    @Override
    public boolean notificar(Cliente cliente, String mensagem) {
        System.out.println(cliente.email() + ": " + mensagem);
        return true;
    }
}