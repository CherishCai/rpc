package io.opc.rpc.core.request;

import io.opc.rpc.api.request.ServerRequest;

/**
 * ClientDetectionServerRequest. Detection request from Server.
 *
 * @author caihongwen
 * @version Id: ClientDetectionServerRequest.java, v 0.1 2022年06月05日 21:07 caihongwen Exp $
 */
public class ClientDetectionServerRequest extends ServerRequest {

    @Override
    public String toString() {
        return "ClientDetectionServerRequest{" +
                "requestId='" + requestId + '\'' +
                '}';
    }

}
