public interface NetworkAdapter {
    public String send(String msg, String host, int port) throws Exception;

    public MessageModel send(MessageModel msg, String host, int port) throws Exception;
}
