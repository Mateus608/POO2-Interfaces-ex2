public class NotificacaoSms implements Notificacao {
    @Override
    public boolean notificar(Cliente cliente, String mensagem) {
        System.out.println(cliente.sms() + ": " + mensagem);
        return true;
    }
}
