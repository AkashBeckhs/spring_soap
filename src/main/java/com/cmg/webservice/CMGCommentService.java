package com.cmg.webservice;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class CMGCommentService {

    @PayloadRoot(namespace = "urn:CMGCommentService/types", localPart = "addCMGComment")
    public @ResponsePayload AddCmgCommentResponse addCMGComment(@RequestPayload AddCmgCommentRequest request) {
        return new AddCmgCommentResponse(request.getComment());
    }

}
