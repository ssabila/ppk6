package ppk.perpus.rpc;

public class JsonRpcResponse {
    private String jsonrpc;
    private Object result;
    private Object error;
    private String id;


    public JsonRpcResponse(Object result, String id) {
        this.result = result;
        this.id = id;
    }

}
