public class NotificacaoWhatsApp implements Notificacao {

    @Override
    public boolean notificar(Cliente cliente, String mensagem) {
        System.out.println(cliente.whatsApp() + ": " + mensagem);
        return true;
    }
}
